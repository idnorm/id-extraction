# Java package

We release our java client on publicaly available google artifact registry [https://console.cloud.google.com/artifacts/maven/idnorm/us-central1/mvn/com.idnorm:id-extraction]().

There you can see all package information. 

To add it to your project you can use either maven or gradle dependecy.

Maven
```xml
<dependency>
    <groupId>com.idnorm</groupId>
    <artifactId>id-extraction</artifactId>
    <version>1.0.0</version>
</dependency>
```

Grade
```groovy
compile group: 'com.idnorm', name: 'id-extraction', version: '1.0.0'
```

Depending on your codebase needs we expose 

- `ExtractionBlockingClient`
- `ExtractionAsnycClient`
- `ExtractionFutureClient`

to offer out-of-the-box options to use in "blocking" or "async" codebase.

Here is an example of using `ExtractionBlockingClient` to send and receive a request.

```java
// An example of usage of the extraction client
public class Example {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: <license_key> <image_path>");
            System.exit(1);
        }
        var licenseKey = args[0];
        if (licenseKey.trim().isEmpty()) {
            System.err.println("License key can't be empty");
            System.exit(1);
        }
        var imagePath = args[1];
        if (imagePath.trim().isEmpty()) {
            System.err.println("Image path can't be empty");
            System.exit(1);
        }

        var builder = ExtractionBlockingClient.builder();
        var cli = builder.setLicenseKey(licenseKey).build();

        ByteString imgData;
        try {
            imgData = ByteString.readFrom(new FileInputStream(imagePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sending request...");

        var result = cli.scanDocument(imgData);

        if (result.hasDetection()) {
            // Prints detected card quad
            System.out.println("Detected card quad:");
            System.out.println(result.getDetection());

            // Prints all detected text fields
            for (var field : result.getTextFieldList()) {
                System.out.println(field.getType() + ": " + field.getValue());
            }

            // Stores all detected visual field images to current working dir
            for (var field : result.getVisualFieldList()) {
                var img = field.getImage();
                var filename = field.getType() + ".jpg";
                try {
                    img.writeTo(new java.io.FileOutputStream(filename));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {

            // Prints status
            System.out.println(result.getStatus());
        }

        if (result.hasMrz()) {
            // Prints detected MRZ
            System.out.println("Detected MRZ:");
            System.out.println(result.getMrz());
        }

        if (result.hasPdf417Barcode()) {
            // Prints detected PDF417 barcode
            System.out.println("Detected PDF417 barcode:");
            System.out.println(result.getPdf417Barcode());
        }

    }
}
```