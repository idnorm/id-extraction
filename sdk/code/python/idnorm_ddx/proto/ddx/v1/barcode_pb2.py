# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: proto/ddx/v1/barcode.proto
# Protobuf Python Version: 5.28.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    28,
    3,
    '',
    'proto/ddx/v1/barcode.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1aproto/ddx/v1/barcode.proto\x12\x0cproto.ddx.v1\"\x84\x15\n\rPdf417Barcode\x12O\n$jurisdiction_specified_vehicle_class\x18\x01 \x01(\tR!jurisdictionSpecifiedVehicleClass\x12W\n(jurisdiction_specified_restriction_codes\x18\x02 \x01(\tR%jurisdictionSpecifiedRestrictionCodes\x12W\n(jurisdiction_specified_endorsement_codes\x18\x03 \x01(\tR%jurisdictionSpecifiedEndorsementCodes\x12\x38\n\x18\x64ocument_expiration_date\x18\x04 \x01(\tR\x16\x64ocumentExpirationDate\x12\x30\n\x14\x63ustomer_family_name\x18\x05 \x01(\tR\x12\x63ustomerFamilyName\x12.\n\x13\x63ustomer_first_name\x18\x06 \x01(\tR\x11\x63ustomerFirstName\x12\x32\n\x15\x63ustomer_middle_names\x18\x07 \x01(\tR\x13\x63ustomerMiddleNames\x12.\n\x13\x64ocument_issue_date\x18\x08 \x01(\tR\x11\x64ocumentIssueDate\x12\"\n\rdate_of_birth\x18\t \x01(\tR\x0b\x64\x61teOfBirth\x12\x16\n\x06gender\x18\n \x01(\x05R\x06gender\x12\x1b\n\teye_color\x18\x0b \x01(\tR\x08\x65yeColor\x12\x16\n\x06height\x18\x0c \x01(\tR\x06height\x12\'\n\x0f\x61\x64\x64ress_street1\x18\r \x01(\tR\x0e\x61\x64\x64ressStreet1\x12!\n\x0c\x61\x64\x64ress_city\x18\x0e \x01(\tR\x0b\x61\x64\x64ressCity\x12+\n\x11jurisdiction_code\x18\x0f \x01(\tR\x10jurisdictionCode\x12\x1f\n\x0bpostal_code\x18\x10 \x01(\tR\npostalCode\x12\x1f\n\x0b\x63ustomer_id\x18\x11 \x01(\tR\ncustomerId\x12\x35\n\x16\x64ocument_discriminator\x18\x12 \x01(\tR\x15\x64ocumentDiscriminator\x12\x35\n\x16\x63ountry_identification\x18\x13 \x01(\tR\x15\x63ountryIdentification\x12\x34\n\x16\x66\x61mily_name_truncation\x18\x14 \x01(\tR\x14\x66\x61milyNameTruncation\x12\x32\n\x15\x66irst_name_truncation\x18\x15 \x01(\tR\x13\x66irstNameTruncation\x12\x34\n\x16middle_name_truncation\x18\x16 \x01(\tR\x14middleNameTruncation\x12R\n\x0foptional_fields\x18\x17 \x03(\x0b\x32).proto.ddx.v1.Pdf417Barcode.OptionalFieldR\x0eoptionalFields\x1ah\n\rOptionalField\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32-.proto.ddx.v1.Pdf417Barcode.OptionalFieldTypeR\x04type\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value\"\xf7\n\n\x11OptionalFieldType\x12(\n$OPTIONAL_FIELD_TYPE_ADDRESS_STREET_2\x10\x00\x12\"\n\x1eOPTIONAL_FIELD_TYPE_HAIR_COLOR\x10\x01\x12&\n\"OPTIONAL_FIELD_TYPE_PLACE_OF_BIRTH\x10\x02\x12)\n%OPTIONAL_FIELD_TYPE_AUDIT_INFORMATION\x10\x03\x12\x30\n,OPTIONAL_FIELD_TYPE_INVENTORY_CONTROL_NUMBER\x10\x04\x12)\n%OPTIONAL_FIELD_TYPE_ALIAS_FAMILY_NAME\x10\x05\x12(\n$OPTIONAL_FIELD_TYPE_ALIAS_GIVEN_NAME\x10\x06\x12)\n%OPTIONAL_FIELD_TYPE_ALIAS_SUFFIX_NAME\x10\x07\x12#\n\x1fOPTIONAL_FIELD_TYPE_NAME_SUFFIX\x10\x08\x12\x39\n5OPTIONAL_FIELD_TYPE_PHYSICAL_DESCRIPTION_WEIGHT_RANGE\x10\t\x12&\n\"OPTIONAL_FIELD_TYPE_RACE_ETHNICITY\x10\n\x12\x37\n3OPTIONAL_FIELD_TYPE_STANDARD_VEHICLE_CLASSIFICATION\x10\x0b\x12\x31\n-OPTIONAL_FIELD_TYPE_STANDARD_ENDORSEMENT_CODE\x10\x0c\x12\x31\n-OPTIONAL_FIELD_TYPE_STANDARD_RESTRICTION_CODE\x10\r\x12P\nLOPTIONAL_FIELD_TYPE_JURISDICTION_SPECIFIC_VEHICLE_CLASSIFICATION_DESCRIPTION\x10\x0e\x12J\nFOPTIONAL_FIELD_TYPE_JURISDICTION_SPECIFIC_ENDORSEMENT_CODE_DESCRIPTION\x10\x0f\x12J\nFOPTIONAL_FIELD_TYPE_JURISDICTION_SPECIFIC_RESTRICTION_CODE_DESCRIPTION\x10\x10\x12\'\n#OPTIONAL_FIELD_TYPE_COMPLIANCE_TYPE\x10\x11\x12*\n&OPTIONAL_FIELD_TYPE_CARD_REVISION_DATE\x10\x12\x12:\n6OPTIONAL_FIELD_TYPE_HAZMAT_ENDORSEMENT_EXPIRATION_DATE\x10\x13\x12;\n7OPTIONAL_FIELD_TYPE_LIMITED_DURATION_DOCUMENT_INDICATOR\x10\x14\x12%\n!OPTIONAL_FIELD_TYPE_WEIGHT_POUNDS\x10\x15\x12(\n$OPTIONAL_FIELD_TYPE_WEIGHT_KILOGRAMS\x10\x16\x12+\n\'OPTIONAL_FIELD_TYPE_UNDER_18_UNTIL_DATE\x10\x17\x12+\n\'OPTIONAL_FIELD_TYPE_UNDER_19_UNTIL_DATE\x10\x18\x12+\n\'OPTIONAL_FIELD_TYPE_UNDER_21_UNTIL_DATE\x10\x19\x12-\n)OPTIONAL_FIELD_TYPE_ORGAN_DONOR_INDICATOR\x10\x1a\x12)\n%OPTIONAL_FIELD_TYPE_VETERAN_INDICATOR\x10\x1b\x42\x34Z2github.com/veridil/id-extract-service/proto/ddx/v1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'proto.ddx.v1.barcode_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'Z2github.com/veridil/id-extract-service/proto/ddx/v1'
  _globals['_PDF417BARCODE']._serialized_start=45
  _globals['_PDF417BARCODE']._serialized_end=2737
  _globals['_PDF417BARCODE_OPTIONALFIELD']._serialized_start=1231
  _globals['_PDF417BARCODE_OPTIONALFIELD']._serialized_end=1335
  _globals['_PDF417BARCODE_OPTIONALFIELDTYPE']._serialized_start=1338
  _globals['_PDF417BARCODE_OPTIONALFIELDTYPE']._serialized_end=2737
# @@protoc_insertion_point(module_scope)
