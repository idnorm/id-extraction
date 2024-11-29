# Idnorms document data extraction client

This is a client package to be used with the gRPC API of our document data extraction service.

## Getting started

To install out client python package you can use the following command:
`python3 -m pip install idnorm-ddx --extra-index-url https://us-central1-python.pkg.dev/idnorm/pyrepo/simple/`

Or simply add `idnorm-ddx` to your `requirements.txt`.

To make your install commands simpler you can update your `pip.conf` file
with the following content:
```toml
[global]
extra-index-url = https://us-central1-python.pkg.dev/idnorm/pyrepo/simple/
```

`pip.conf` file is usually located at `~/.pip/pip.conf` or `~/.config/pip/pip.conf`
for user specific configurations and at `/etc/pip.conf` for system wide configuration.

## Documentation

This is a simple package that serves as a wrapper to remove the need for
our clients to generate the gRPC client code on their own and setting
the right grpc client version.

We expose simple abstractions as `ExtractionClient` and `ExtractionClientAsync`
to easily integrate with your python codebase.

You can see what is the expected usage in the snippet bellow.

```python
import asyncio
from typing import Tuple

from idnorm_ddx.client import ExtractionClient, ExtractionClientConfig, ExtractionClientAsync, ScanDocumentResponse
import sys

def parse_args() -> Tuple[str, str]:
    if len(sys.argv) != 3:
        print(f"Usage: python {sys.argv[0]} <image_path> <license_key>", file=sys.stderr)
        sys.exit(-1)
    return sys.argv[1], sys.argv[2]

def main():
    img_path, license_key = parse_args()
    with open(img_path, 'rb') as f:
        image_bytes = f.read()

    with ExtractionClient(cfg=ExtractionClientConfig(
        license_key=license_key,
    )) as cli:
        resp = cli.scan_document(img_bytes=image_bytes)
        print_results(resp)


async def async_main():

    img_path, license_key = parse_args()
    with open(img_path, 'rb') as f:
        image_bytes = f.read()

    async with ExtractionClientAsync(cfg=ExtractionClientConfig(
        license_key=license_key,
    )) as async_cli:
        result = await async_cli.scan_document(img_bytes=image_bytes)
        print_results(result)

def print_results(result: ScanDocumentResponse):
    if result.status == ScanDocumentResponse.Status.STATUS_OK:
        print("Detected document quad: ")
        print(result.detection)

        print("Detected document class: ")
        print(result.classification)

        print("Detected text fields: ")
        for field in result.textField:
            print(field)

        # Stores all detected visual fields into current working dir
        print("Detected visual fields: ")
        for field in result.visualField:
            img = field.image
            with open(f"{field.type}.jpg", 'wb') as f:
                f.write(img)
    else:
        print(result.status)

    if result.mrz:
        print("Detected MRZ: ")
        print(result.mrz)

    if result.pdf417Barcode:
        print("Detected PDF417 barcode: ")
        print(result.pdf417Barcode)

if __name__ == '__main__':
    main()
    asyncio.run(async_main())
```