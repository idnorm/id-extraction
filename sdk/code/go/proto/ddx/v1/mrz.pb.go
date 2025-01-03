// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.35.1
// 	protoc        (unknown)
// source: proto/ddx/v1/mrz.proto

package v1

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// MrzFields - a set of fields extracted from MRZ. Any of the fields can be empty!!
// Depending on what was stored in the MRZ
type MrzFields struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	DocumentType    string `protobuf:"bytes,1,opt,name=document_type,json=documentType,proto3" json:"document_type,omitempty"`
	CountryCode     string `protobuf:"bytes,2,opt,name=country_code,json=countryCode,proto3" json:"country_code,omitempty"`
	DocumentNumber  string `protobuf:"bytes,3,opt,name=document_number,json=documentNumber,proto3" json:"document_number,omitempty"`
	Birthdate       string `protobuf:"bytes,4,opt,name=birthdate,proto3" json:"birthdate,omitempty"`
	Sex             string `protobuf:"bytes,5,opt,name=sex,proto3" json:"sex,omitempty"`
	ExpiryDate      string `protobuf:"bytes,6,opt,name=expiry_date,json=expiryDate,proto3" json:"expiry_date,omitempty"`
	Nationality     string `protobuf:"bytes,7,opt,name=nationality,proto3" json:"nationality,omitempty"`
	FinalCheckDigit string `protobuf:"bytes,8,opt,name=final_check_digit,json=finalCheckDigit,proto3" json:"final_check_digit,omitempty"`
	Name            string `protobuf:"bytes,9,opt,name=name,proto3" json:"name,omitempty"`
	Surname         string `protobuf:"bytes,10,opt,name=surname,proto3" json:"surname,omitempty"`
	GivenName       string `protobuf:"bytes,11,opt,name=given_name,json=givenName,proto3" json:"given_name,omitempty"`
	OptionalData1   string `protobuf:"bytes,12,opt,name=optional_data1,json=optionalData1,proto3" json:"optional_data1,omitempty"`
	OptionalData2   string `protobuf:"bytes,13,opt,name=optional_data2,json=optionalData2,proto3" json:"optional_data2,omitempty"`
	// is_visa - true for VISAs' MRZ
	IsVisa bool `protobuf:"varint,14,opt,name=is_visa,json=isVisa,proto3" json:"is_visa,omitempty"`
}

func (x *MrzFields) Reset() {
	*x = MrzFields{}
	mi := &file_proto_ddx_v1_mrz_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *MrzFields) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MrzFields) ProtoMessage() {}

func (x *MrzFields) ProtoReflect() protoreflect.Message {
	mi := &file_proto_ddx_v1_mrz_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MrzFields.ProtoReflect.Descriptor instead.
func (*MrzFields) Descriptor() ([]byte, []int) {
	return file_proto_ddx_v1_mrz_proto_rawDescGZIP(), []int{0}
}

func (x *MrzFields) GetDocumentType() string {
	if x != nil {
		return x.DocumentType
	}
	return ""
}

func (x *MrzFields) GetCountryCode() string {
	if x != nil {
		return x.CountryCode
	}
	return ""
}

func (x *MrzFields) GetDocumentNumber() string {
	if x != nil {
		return x.DocumentNumber
	}
	return ""
}

func (x *MrzFields) GetBirthdate() string {
	if x != nil {
		return x.Birthdate
	}
	return ""
}

func (x *MrzFields) GetSex() string {
	if x != nil {
		return x.Sex
	}
	return ""
}

func (x *MrzFields) GetExpiryDate() string {
	if x != nil {
		return x.ExpiryDate
	}
	return ""
}

func (x *MrzFields) GetNationality() string {
	if x != nil {
		return x.Nationality
	}
	return ""
}

func (x *MrzFields) GetFinalCheckDigit() string {
	if x != nil {
		return x.FinalCheckDigit
	}
	return ""
}

func (x *MrzFields) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *MrzFields) GetSurname() string {
	if x != nil {
		return x.Surname
	}
	return ""
}

func (x *MrzFields) GetGivenName() string {
	if x != nil {
		return x.GivenName
	}
	return ""
}

func (x *MrzFields) GetOptionalData1() string {
	if x != nil {
		return x.OptionalData1
	}
	return ""
}

func (x *MrzFields) GetOptionalData2() string {
	if x != nil {
		return x.OptionalData2
	}
	return ""
}

func (x *MrzFields) GetIsVisa() bool {
	if x != nil {
		return x.IsVisa
	}
	return false
}

var File_proto_ddx_v1_mrz_proto protoreflect.FileDescriptor

var file_proto_ddx_v1_mrz_proto_rawDesc = []byte{
	0x0a, 0x16, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x64, 0x78, 0x2f, 0x76, 0x31, 0x2f, 0x6d,
	0x72, 0x7a, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x64, 0x64, 0x78, 0x2e, 0x76, 0x31, 0x22, 0xcf, 0x03, 0x0a, 0x09, 0x4d, 0x72, 0x7a, 0x46, 0x69,
	0x65, 0x6c, 0x64, 0x73, 0x12, 0x23, 0x0a, 0x0d, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x64, 0x6f, 0x63,
	0x75, 0x6d, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x72, 0x79, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0b, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x72, 0x79, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x27, 0x0a, 0x0f,
	0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x4e,
	0x75, 0x6d, 0x62, 0x65, 0x72, 0x12, 0x1c, 0x0a, 0x09, 0x62, 0x69, 0x72, 0x74, 0x68, 0x64, 0x61,
	0x74, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x62, 0x69, 0x72, 0x74, 0x68, 0x64,
	0x61, 0x74, 0x65, 0x12, 0x10, 0x0a, 0x03, 0x73, 0x65, 0x78, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x03, 0x73, 0x65, 0x78, 0x12, 0x1f, 0x0a, 0x0b, 0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x5f,
	0x64, 0x61, 0x74, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x65, 0x78, 0x70, 0x69,
	0x72, 0x79, 0x44, 0x61, 0x74, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x61, 0x6c, 0x69, 0x74, 0x79, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x6e, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x2a, 0x0a, 0x11, 0x66, 0x69, 0x6e, 0x61,
	0x6c, 0x5f, 0x63, 0x68, 0x65, 0x63, 0x6b, 0x5f, 0x64, 0x69, 0x67, 0x69, 0x74, 0x18, 0x08, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0f, 0x66, 0x69, 0x6e, 0x61, 0x6c, 0x43, 0x68, 0x65, 0x63, 0x6b, 0x44,
	0x69, 0x67, 0x69, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x09, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x72, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x75, 0x72, 0x6e, 0x61,
	0x6d, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x67, 0x69, 0x76, 0x65, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x67, 0x69, 0x76, 0x65, 0x6e, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x25, 0x0a, 0x0e, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x5f, 0x64, 0x61,
	0x74, 0x61, 0x31, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6f, 0x70, 0x74, 0x69, 0x6f,
	0x6e, 0x61, 0x6c, 0x44, 0x61, 0x74, 0x61, 0x31, 0x12, 0x25, 0x0a, 0x0e, 0x6f, 0x70, 0x74, 0x69,
	0x6f, 0x6e, 0x61, 0x6c, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x32, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0d, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x44, 0x61, 0x74, 0x61, 0x32, 0x12,
	0x17, 0x0a, 0x07, 0x69, 0x73, 0x5f, 0x76, 0x69, 0x73, 0x61, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x06, 0x69, 0x73, 0x56, 0x69, 0x73, 0x61, 0x42, 0x34, 0x5a, 0x32, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x76, 0x65, 0x72, 0x69, 0x64, 0x69, 0x6c, 0x2f, 0x69,
	0x64, 0x2d, 0x65, 0x78, 0x74, 0x72, 0x61, 0x63, 0x74, 0x2d, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x64, 0x78, 0x2f, 0x76, 0x31, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_ddx_v1_mrz_proto_rawDescOnce sync.Once
	file_proto_ddx_v1_mrz_proto_rawDescData = file_proto_ddx_v1_mrz_proto_rawDesc
)

func file_proto_ddx_v1_mrz_proto_rawDescGZIP() []byte {
	file_proto_ddx_v1_mrz_proto_rawDescOnce.Do(func() {
		file_proto_ddx_v1_mrz_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_ddx_v1_mrz_proto_rawDescData)
	})
	return file_proto_ddx_v1_mrz_proto_rawDescData
}

var file_proto_ddx_v1_mrz_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_ddx_v1_mrz_proto_goTypes = []any{
	(*MrzFields)(nil), // 0: proto.ddx.v1.MrzFields
}
var file_proto_ddx_v1_mrz_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_ddx_v1_mrz_proto_init() }
func file_proto_ddx_v1_mrz_proto_init() {
	if File_proto_ddx_v1_mrz_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_ddx_v1_mrz_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_ddx_v1_mrz_proto_goTypes,
		DependencyIndexes: file_proto_ddx_v1_mrz_proto_depIdxs,
		MessageInfos:      file_proto_ddx_v1_mrz_proto_msgTypes,
	}.Build()
	File_proto_ddx_v1_mrz_proto = out.File
	file_proto_ddx_v1_mrz_proto_rawDesc = nil
	file_proto_ddx_v1_mrz_proto_goTypes = nil
	file_proto_ddx_v1_mrz_proto_depIdxs = nil
}
