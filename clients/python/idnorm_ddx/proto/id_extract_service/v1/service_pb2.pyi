from google.api import annotations_pb2 as _annotations_pb2
from validate import validate_pb2 as _validate_pb2
from proto.id_extract_service.v1 import countries_enum_pb2 as _countries_enum_pb2
from proto.id_extract_service.v1 import document_types_enum_pb2 as _document_types_enum_pb2
from proto.id_extract_service.v1 import regions_enum_pb2 as _regions_enum_pb2
from proto.id_extract_service.v1 import mrz_pb2 as _mrz_pb2
from proto.id_extract_service.v1 import barcode_pb2 as _barcode_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class TextFieldType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    TEXT_FIELD_TYPE_FIRST_NAME: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_LAST_NAME: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_NATIONALITY: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_DOCUMENT_IDENTITY_NUMBER: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXTENDED_DOCUMENT_IDENTITY_NUMBER: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_DATA_OF_BIRTH: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXPIRY_DATE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_SEX: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ISSUING_AUTHORITY: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ISSUING_DATE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ADDRESS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_PERSONAL_IDENTITY_NUMBER: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXTENDED_PERSONAL_IDENTITY_NUMBER: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_MARITAL_STATUS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXTENDED_ADDRESS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXTENDED_ADDRESS_SPECIFICS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ADDITIONAL_CONDITIONS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_CLASS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_CLASS_ISSUE_DATE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_CLASS_EXPIRY_DATE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_CONDITIONS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ENDORSEMENTS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_LICENCE_TYPE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_FULL_NAME: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_DATE_OF_BIRTH: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_PLACE_OF_BIRTH: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_PROFESSION: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EMPLOYER: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXTENDED_NAME: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_FATHERS_NAME: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_MOTHERS_NAME: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ADDITIONAL_LICENCE_TYPE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ANONYMIZED_LINE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ANONYMIZED_VERTICAL_LINE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_RACE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_RELIGION: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_RESIDENTIAL_STATUS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_RESTRICTIONS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_EXTENDED_DOCUMENT_IDENTITY_NUMBER_SPECIFICS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_ISSUE_DATE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_SPONSOR: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_BLOOD_TYPE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_REMARKS: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_RESIDENCE_PERMIT_TYPE: _ClassVar[TextFieldType]
    TEXT_FIELD_TYPE_USDL_DOCUMENT_TYPE: _ClassVar[TextFieldType]

class VisualFieldType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    VISUAL_FIELD_TYPE_FACE_PHOTO: _ClassVar[VisualFieldType]
    VISUAL_FIELD_TYPE_SIGNATURE: _ClassVar[VisualFieldType]
TEXT_FIELD_TYPE_FIRST_NAME: TextFieldType
TEXT_FIELD_TYPE_LAST_NAME: TextFieldType
TEXT_FIELD_TYPE_NATIONALITY: TextFieldType
TEXT_FIELD_TYPE_DOCUMENT_IDENTITY_NUMBER: TextFieldType
TEXT_FIELD_TYPE_EXTENDED_DOCUMENT_IDENTITY_NUMBER: TextFieldType
TEXT_FIELD_TYPE_DATA_OF_BIRTH: TextFieldType
TEXT_FIELD_TYPE_EXPIRY_DATE: TextFieldType
TEXT_FIELD_TYPE_SEX: TextFieldType
TEXT_FIELD_TYPE_ISSUING_AUTHORITY: TextFieldType
TEXT_FIELD_TYPE_ISSUING_DATE: TextFieldType
TEXT_FIELD_TYPE_ADDRESS: TextFieldType
TEXT_FIELD_TYPE_PERSONAL_IDENTITY_NUMBER: TextFieldType
TEXT_FIELD_TYPE_EXTENDED_PERSONAL_IDENTITY_NUMBER: TextFieldType
TEXT_FIELD_TYPE_MARITAL_STATUS: TextFieldType
TEXT_FIELD_TYPE_EXTENDED_ADDRESS: TextFieldType
TEXT_FIELD_TYPE_EXTENDED_ADDRESS_SPECIFICS: TextFieldType
TEXT_FIELD_TYPE_ADDITIONAL_CONDITIONS: TextFieldType
TEXT_FIELD_TYPE_CLASS: TextFieldType
TEXT_FIELD_TYPE_CLASS_ISSUE_DATE: TextFieldType
TEXT_FIELD_TYPE_CLASS_EXPIRY_DATE: TextFieldType
TEXT_FIELD_TYPE_CONDITIONS: TextFieldType
TEXT_FIELD_TYPE_ENDORSEMENTS: TextFieldType
TEXT_FIELD_TYPE_LICENCE_TYPE: TextFieldType
TEXT_FIELD_TYPE_FULL_NAME: TextFieldType
TEXT_FIELD_TYPE_DATE_OF_BIRTH: TextFieldType
TEXT_FIELD_TYPE_PLACE_OF_BIRTH: TextFieldType
TEXT_FIELD_TYPE_PROFESSION: TextFieldType
TEXT_FIELD_TYPE_EMPLOYER: TextFieldType
TEXT_FIELD_TYPE_EXTENDED_NAME: TextFieldType
TEXT_FIELD_TYPE_FATHERS_NAME: TextFieldType
TEXT_FIELD_TYPE_MOTHERS_NAME: TextFieldType
TEXT_FIELD_TYPE_ADDITIONAL_LICENCE_TYPE: TextFieldType
TEXT_FIELD_TYPE_ANONYMIZED_LINE: TextFieldType
TEXT_FIELD_TYPE_ANONYMIZED_VERTICAL_LINE: TextFieldType
TEXT_FIELD_TYPE_RACE: TextFieldType
TEXT_FIELD_TYPE_RELIGION: TextFieldType
TEXT_FIELD_TYPE_RESIDENTIAL_STATUS: TextFieldType
TEXT_FIELD_TYPE_RESTRICTIONS: TextFieldType
TEXT_FIELD_TYPE_EXTENDED_DOCUMENT_IDENTITY_NUMBER_SPECIFICS: TextFieldType
TEXT_FIELD_TYPE_ISSUE_DATE: TextFieldType
TEXT_FIELD_TYPE_SPONSOR: TextFieldType
TEXT_FIELD_TYPE_BLOOD_TYPE: TextFieldType
TEXT_FIELD_TYPE_REMARKS: TextFieldType
TEXT_FIELD_TYPE_RESIDENCE_PERMIT_TYPE: TextFieldType
TEXT_FIELD_TYPE_USDL_DOCUMENT_TYPE: TextFieldType
VISUAL_FIELD_TYPE_FACE_PHOTO: VisualFieldType
VISUAL_FIELD_TYPE_SIGNATURE: VisualFieldType

class Polygon(_message.Message):
    __slots__ = ("x", "y")
    X_FIELD_NUMBER: _ClassVar[int]
    Y_FIELD_NUMBER: _ClassVar[int]
    x: _containers.RepeatedScalarFieldContainer[int]
    y: _containers.RepeatedScalarFieldContainer[int]
    def __init__(self, x: _Optional[_Iterable[int]] = ..., y: _Optional[_Iterable[int]] = ...) -> None: ...

class VisualField(_message.Message):
    __slots__ = ("type", "image", "detection")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    DETECTION_FIELD_NUMBER: _ClassVar[int]
    type: VisualFieldType
    image: bytes
    detection: Polygon
    def __init__(self, type: _Optional[_Union[VisualFieldType, str]] = ..., image: _Optional[bytes] = ..., detection: _Optional[_Union[Polygon, _Mapping]] = ...) -> None: ...

class TextField(_message.Message):
    __slots__ = ("type", "value", "detection", "image")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    DETECTION_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    type: TextFieldType
    value: str
    detection: Polygon
    image: bytes
    def __init__(self, type: _Optional[_Union[TextFieldType, str]] = ..., value: _Optional[str] = ..., detection: _Optional[_Union[Polygon, _Mapping]] = ..., image: _Optional[bytes] = ...) -> None: ...

class DocumentClass(_message.Message):
    __slots__ = ("is_front", "year", "type", "country", "region")
    IS_FRONT_FIELD_NUMBER: _ClassVar[int]
    YEAR_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_FIELD_NUMBER: _ClassVar[int]
    REGION_FIELD_NUMBER: _ClassVar[int]
    is_front: bool
    year: int
    type: _document_types_enum_pb2.DocumentType
    country: _countries_enum_pb2.Country
    region: _regions_enum_pb2.Region
    def __init__(self, is_front: bool = ..., year: _Optional[int] = ..., type: _Optional[_Union[_document_types_enum_pb2.DocumentType, str]] = ..., country: _Optional[_Union[_countries_enum_pb2.Country, str]] = ..., region: _Optional[_Union[_regions_enum_pb2.Region, str]] = ...) -> None: ...

class ScanConfig(_message.Message):
    __slots__ = ("returnDocumentImage", "returnTextFieldImages", "returnVisualFields", "skipDocumentDetection")
    class ImgResolution(_message.Message):
        __slots__ = ("width", "height")
        WIDTH_FIELD_NUMBER: _ClassVar[int]
        HEIGHT_FIELD_NUMBER: _ClassVar[int]
        width: int
        height: int
        def __init__(self, width: _Optional[int] = ..., height: _Optional[int] = ...) -> None: ...
    class ReturnImage(_message.Message):
        __slots__ = ("targetResolution", "jpegImageQuality")
        TARGETRESOLUTION_FIELD_NUMBER: _ClassVar[int]
        JPEGIMAGEQUALITY_FIELD_NUMBER: _ClassVar[int]
        targetResolution: ScanConfig.ImgResolution
        jpegImageQuality: int
        def __init__(self, targetResolution: _Optional[_Union[ScanConfig.ImgResolution, _Mapping]] = ..., jpegImageQuality: _Optional[int] = ...) -> None: ...
    class ReturnTextFieldImages(_message.Message):
        __slots__ = ("typeFilter", "jpegImageQuality")
        TYPEFILTER_FIELD_NUMBER: _ClassVar[int]
        JPEGIMAGEQUALITY_FIELD_NUMBER: _ClassVar[int]
        typeFilter: _containers.RepeatedScalarFieldContainer[TextFieldType]
        jpegImageQuality: int
        def __init__(self, typeFilter: _Optional[_Iterable[_Union[TextFieldType, str]]] = ..., jpegImageQuality: _Optional[int] = ...) -> None: ...
    class ReturnVisualFields(_message.Message):
        __slots__ = ("typeFilter", "jpegImageQuality")
        TYPEFILTER_FIELD_NUMBER: _ClassVar[int]
        JPEGIMAGEQUALITY_FIELD_NUMBER: _ClassVar[int]
        typeFilter: _containers.RepeatedScalarFieldContainer[VisualFieldType]
        jpegImageQuality: int
        def __init__(self, typeFilter: _Optional[_Iterable[_Union[VisualFieldType, str]]] = ..., jpegImageQuality: _Optional[int] = ...) -> None: ...
    RETURNDOCUMENTIMAGE_FIELD_NUMBER: _ClassVar[int]
    RETURNTEXTFIELDIMAGES_FIELD_NUMBER: _ClassVar[int]
    RETURNVISUALFIELDS_FIELD_NUMBER: _ClassVar[int]
    SKIPDOCUMENTDETECTION_FIELD_NUMBER: _ClassVar[int]
    returnDocumentImage: ScanConfig.ReturnImage
    returnTextFieldImages: ScanConfig.ReturnTextFieldImages
    returnVisualFields: ScanConfig.ReturnVisualFields
    skipDocumentDetection: bool
    def __init__(self, returnDocumentImage: _Optional[_Union[ScanConfig.ReturnImage, _Mapping]] = ..., returnTextFieldImages: _Optional[_Union[ScanConfig.ReturnTextFieldImages, _Mapping]] = ..., returnVisualFields: _Optional[_Union[ScanConfig.ReturnVisualFields, _Mapping]] = ..., skipDocumentDetection: bool = ...) -> None: ...

class ScanDocumentRequest(_message.Message):
    __slots__ = ("imageJpeg", "config")
    IMAGEJPEG_FIELD_NUMBER: _ClassVar[int]
    CONFIG_FIELD_NUMBER: _ClassVar[int]
    imageJpeg: bytes
    config: ScanConfig
    def __init__(self, imageJpeg: _Optional[bytes] = ..., config: _Optional[_Union[ScanConfig, _Mapping]] = ...) -> None: ...

class Quad(_message.Message):
    __slots__ = ("x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4")
    X1_FIELD_NUMBER: _ClassVar[int]
    Y1_FIELD_NUMBER: _ClassVar[int]
    X2_FIELD_NUMBER: _ClassVar[int]
    Y2_FIELD_NUMBER: _ClassVar[int]
    X3_FIELD_NUMBER: _ClassVar[int]
    Y3_FIELD_NUMBER: _ClassVar[int]
    X4_FIELD_NUMBER: _ClassVar[int]
    Y4_FIELD_NUMBER: _ClassVar[int]
    x1: int
    y1: int
    x2: int
    y2: int
    x3: int
    y3: int
    x4: int
    y4: int
    def __init__(self, x1: _Optional[int] = ..., y1: _Optional[int] = ..., x2: _Optional[int] = ..., y2: _Optional[int] = ..., x3: _Optional[int] = ..., y3: _Optional[int] = ..., x4: _Optional[int] = ..., y4: _Optional[int] = ...) -> None: ...

class Mrz(_message.Message):
    __slots__ = ("status", "fields", "mrz_code")
    class Status(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        STATUS_OK: _ClassVar[Mrz.Status]
        STATUS_INVALID_FORMAT: _ClassVar[Mrz.Status]
        STATUS_CHECK_DIGIT_INVALID: _ClassVar[Mrz.Status]
    STATUS_OK: Mrz.Status
    STATUS_INVALID_FORMAT: Mrz.Status
    STATUS_CHECK_DIGIT_INVALID: Mrz.Status
    STATUS_FIELD_NUMBER: _ClassVar[int]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    MRZ_CODE_FIELD_NUMBER: _ClassVar[int]
    status: Mrz.Status
    fields: _mrz_pb2.MrzFields
    mrz_code: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, status: _Optional[_Union[Mrz.Status, str]] = ..., fields: _Optional[_Union[_mrz_pb2.MrzFields, _Mapping]] = ..., mrz_code: _Optional[_Iterable[str]] = ...) -> None: ...

class ScanDocumentResponse(_message.Message):
    __slots__ = ("status", "detection", "classification", "textField", "visualField", "mrz", "pdf417Barcode", "documentImage")
    class Status(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        STATUS_OK: _ClassVar[ScanDocumentResponse.Status]
        STATUS_DOCUMENT_NOT_FOUND: _ClassVar[ScanDocumentResponse.Status]
        STATUS_DOCUMENT_NOT_SUPPORTED: _ClassVar[ScanDocumentResponse.Status]
        STATUS_DOCUMENT_BACK_SIZE: _ClassVar[ScanDocumentResponse.Status]
    STATUS_OK: ScanDocumentResponse.Status
    STATUS_DOCUMENT_NOT_FOUND: ScanDocumentResponse.Status
    STATUS_DOCUMENT_NOT_SUPPORTED: ScanDocumentResponse.Status
    STATUS_DOCUMENT_BACK_SIZE: ScanDocumentResponse.Status
    STATUS_FIELD_NUMBER: _ClassVar[int]
    DETECTION_FIELD_NUMBER: _ClassVar[int]
    CLASSIFICATION_FIELD_NUMBER: _ClassVar[int]
    TEXTFIELD_FIELD_NUMBER: _ClassVar[int]
    VISUALFIELD_FIELD_NUMBER: _ClassVar[int]
    MRZ_FIELD_NUMBER: _ClassVar[int]
    PDF417BARCODE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENTIMAGE_FIELD_NUMBER: _ClassVar[int]
    status: ScanDocumentResponse.Status
    detection: Quad
    classification: DocumentClass
    textField: _containers.RepeatedCompositeFieldContainer[TextField]
    visualField: _containers.RepeatedCompositeFieldContainer[VisualField]
    mrz: Mrz
    pdf417Barcode: _barcode_pb2.Pdf417Barcode
    documentImage: bytes
    def __init__(self, status: _Optional[_Union[ScanDocumentResponse.Status, str]] = ..., detection: _Optional[_Union[Quad, _Mapping]] = ..., classification: _Optional[_Union[DocumentClass, _Mapping]] = ..., textField: _Optional[_Iterable[_Union[TextField, _Mapping]]] = ..., visualField: _Optional[_Iterable[_Union[VisualField, _Mapping]]] = ..., mrz: _Optional[_Union[Mrz, _Mapping]] = ..., pdf417Barcode: _Optional[_Union[_barcode_pb2.Pdf417Barcode, _Mapping]] = ..., documentImage: _Optional[bytes] = ...) -> None: ...
