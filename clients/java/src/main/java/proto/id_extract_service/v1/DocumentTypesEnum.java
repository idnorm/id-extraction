// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/id_extract_service/v1/document_types_enum.proto
// Protobuf Java Version: 4.28.2

package proto.id_extract_service.v1;

public final class DocumentTypesEnum {
  private DocumentTypesEnum() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      DocumentTypesEnum.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   *
   * DocumentType - an enum of supported document types.
   * There are many countries and many document types. To see the full list of
   * supported document types in each country and/or region for our latest release please see
   * the [documentation](https://github.com/idnorm/id-extraction/blob/master/docs/document_types_by_country_and_region.md).
   * </pre>
   *
   * Protobuf enum {@code proto.id_extract_service.v1.DocumentType}
   */
  public enum DocumentType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>DOCUMENT_TYPE_UNKNOWN = 0;</code>
     */
    DOCUMENT_TYPE_UNKNOWN(0),
    /**
     * <pre>
     * REFUGEE_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_REFUGEE_ID = 1;</code>
     */
    DOCUMENT_TYPE_REFUGEE_ID(1),
    /**
     * <pre>
     * MyPolis
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYPOLIS = 2;</code>
     */
    DOCUMENT_TYPE_MYPOLIS(2),
    /**
     * <pre>
     * iKAD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_IKAD = 3;</code>
     */
    DOCUMENT_TYPE_IKAD(3),
    /**
     * <pre>
     * WORK_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_WORK_PERMIT = 4;</code>
     */
    DOCUMENT_TYPE_WORK_PERMIT(4),
    /**
     * <pre>
     * UNIFORMED_SERVICES_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_UNIFORMED_SERVICES_ID = 5;</code>
     */
    DOCUMENT_TYPE_UNIFORMED_SERVICES_ID(5),
    /**
     * <pre>
     * GREEN_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_GREEN_CARD = 6;</code>
     */
    DOCUMENT_TYPE_GREEN_CARD(6),
    /**
     * <pre>
     * DL
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DL = 7;</code>
     */
    DOCUMENT_TYPE_DL(7),
    /**
     * <pre>
     * RESIDENCE_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RESIDENCE_PERMIT = 8;</code>
     */
    DOCUMENT_TYPE_RESIDENCE_PERMIT(8),
    /**
     * <pre>
     * TEMPORARY_RESIDENCE_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TEMPORARY_RESIDENCE_PERMIT = 9;</code>
     */
    DOCUMENT_TYPE_TEMPORARY_RESIDENCE_PERMIT(9),
    /**
     * <pre>
     * SOCIAL_SECURITY_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_SOCIAL_SECURITY_CARD = 10;</code>
     */
    DOCUMENT_TYPE_SOCIAL_SECURITY_CARD(10),
    /**
     * <pre>
     * EXIT_ENTRY_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_EXIT_ENTRY_PERMIT = 11;</code>
     */
    DOCUMENT_TYPE_EXIT_ENTRY_PERMIT(11),
    /**
     * <pre>
     * RIGID_REFUGEE_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RIGID_REFUGEE_PASSPORT = 12;</code>
     */
    DOCUMENT_TYPE_RIGID_REFUGEE_PASSPORT(12),
    /**
     * <pre>
     * EMPLOYMENT_PASS
     * </pre>
     *
     * <code>DOCUMENT_TYPE_EMPLOYMENT_PASS = 13;</code>
     */
    DOCUMENT_TYPE_EMPLOYMENT_PASS(13),
    /**
     * <pre>
     * TEMPORARY_PROTECTION_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TEMPORARY_PROTECTION_PERMIT = 14;</code>
     */
    DOCUMENT_TYPE_TEMPORARY_PROTECTION_PERMIT(14),
    /**
     * <pre>
     * RIGID_ALIEN_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RIGID_ALIEN_PASSPORT = 15;</code>
     */
    DOCUMENT_TYPE_RIGID_ALIEN_PASSPORT(15),
    /**
     * <pre>
     * PAN_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PAN_CARD = 16;</code>
     */
    DOCUMENT_TYPE_PAN_CARD(16),
    /**
     * <pre>
     * MyKid
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYKID = 17;</code>
     */
    DOCUMENT_TYPE_MYKID(17),
    /**
     * <pre>
     * WEAPON_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_WEAPON_PERMIT = 18;</code>
     */
    DOCUMENT_TYPE_WEAPON_PERMIT(18),
    /**
     * <pre>
     * RIGID_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RIGID_PASSPORT = 19;</code>
     */
    DOCUMENT_TYPE_RIGID_PASSPORT(19),
    /**
     * <pre>
     * CONSULAR_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CONSULAR_ID = 20;</code>
     */
    DOCUMENT_TYPE_CONSULAR_ID(20),
    /**
     * <pre>
     * MAINLAND_TRAVEL_PERMIT_TAIWAN
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MAINLAND_TRAVEL_PERMIT_TAIWAN = 21;</code>
     */
    DOCUMENT_TYPE_MAINLAND_TRAVEL_PERMIT_TAIWAN(21),
    /**
     * <pre>
     * FIN_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_FIN_CARD = 22;</code>
     */
    DOCUMENT_TYPE_FIN_CARD(22),
    /**
     * <pre>
     * BORDER_CROSSING_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_BORDER_CROSSING_CARD = 23;</code>
     */
    DOCUMENT_TYPE_BORDER_CROSSING_CARD(23),
    /**
     * <pre>
     * ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ID = 24;</code>
     */
    DOCUMENT_TYPE_ID(24),
    /**
     * <pre>
     * VISA
     * </pre>
     *
     * <code>DOCUMENT_TYPE_VISA = 25;</code>
     */
    DOCUMENT_TYPE_VISA(25),
    /**
     * <pre>
     * CONSULAR_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CONSULAR_PASSPORT = 26;</code>
     */
    DOCUMENT_TYPE_CONSULAR_PASSPORT(26),
    /**
     * <pre>
     * MINORS_PUBLIC_SERVICES_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MINORS_PUBLIC_SERVICES_CARD = 27;</code>
     */
    DOCUMENT_TYPE_MINORS_PUBLIC_SERVICES_CARD(27),
    /**
     * <pre>
     * VETERAN_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_VETERAN_ID = 28;</code>
     */
    DOCUMENT_TYPE_VETERAN_ID(28),
    /**
     * <pre>
     * PROOF_OF_AGE_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROOF_OF_AGE_CARD = 29;</code>
     */
    DOCUMENT_TYPE_PROOF_OF_AGE_CARD(29),
    /**
     * <pre>
     * MyPR
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYPR = 30;</code>
     */
    DOCUMENT_TYPE_MYPR(30),
    /**
     * <pre>
     * PUBLIC_SERVICES_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PUBLIC_SERVICES_CARD = 31;</code>
     */
    DOCUMENT_TYPE_PUBLIC_SERVICES_CARD(31),
    /**
     * <pre>
     * TRIBAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TRIBAL_ID = 32;</code>
     */
    DOCUMENT_TYPE_TRIBAL_ID(32),
    /**
     * <pre>
     * TWIC_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TWIC_CARD = 33;</code>
     */
    DOCUMENT_TYPE_TWIC_CARD(33),
    /**
     * <pre>
     * PROFESSIONAL_DL
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROFESSIONAL_DL = 34;</code>
     */
    DOCUMENT_TYPE_PROFESSIONAL_DL(34),
    /**
     * <pre>
     * VOTER_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_VOTER_ID = 35;</code>
     */
    DOCUMENT_TYPE_VOTER_ID(35),
    /**
     * <pre>
     * PROOF_OF_REGISTRATION
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROOF_OF_REGISTRATION = 36;</code>
     */
    DOCUMENT_TYPE_PROOF_OF_REGISTRATION(36),
    /**
     * <pre>
     * DL_PUBLIC_SERVICES_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DL_PUBLIC_SERVICES_CARD = 37;</code>
     */
    DOCUMENT_TYPE_DL_PUBLIC_SERVICES_CARD(37),
    /**
     * <pre>
     * ADDRESS_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ADDRESS_CARD = 38;</code>
     */
    DOCUMENT_TYPE_ADDRESS_CARD(38),
    /**
     * <pre>
     * CONSULAR_VOTER_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CONSULAR_VOTER_ID = 39;</code>
     */
    DOCUMENT_TYPE_CONSULAR_VOTER_ID(39),
    /**
     * <pre>
     * TAX_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TAX_ID = 40;</code>
     */
    DOCUMENT_TYPE_TAX_ID(40),
    /**
     * <pre>
     * PROFESSIONAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROFESSIONAL_ID = 41;</code>
     */
    DOCUMENT_TYPE_PROFESSIONAL_ID(41),
    /**
     * <pre>
     * HEALTH_INSURANCE_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_HEALTH_INSURANCE_CARD = 42;</code>
     */
    DOCUMENT_TYPE_HEALTH_INSURANCE_CARD(42),
    /**
     * <pre>
     * ALIEN_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ALIEN_ID = 43;</code>
     */
    DOCUMENT_TYPE_ALIEN_ID(43),
    /**
     * <pre>
     * MyKAS
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYKAS = 44;</code>
     */
    DOCUMENT_TYPE_MYKAS(44),
    /**
     * <pre>
     * MINORS_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MINORS_ID = 45;</code>
     */
    DOCUMENT_TYPE_MINORS_ID(45),
    /**
     * <pre>
     * CITIZENSHIP_CERTIFICATE
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CITIZENSHIP_CERTIFICATE = 46;</code>
     */
    DOCUMENT_TYPE_CITIZENSHIP_CERTIFICATE(46),
    /**
     * <pre>
     * DRIVER_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DRIVER_CARD = 47;</code>
     */
    DOCUMENT_TYPE_DRIVER_CARD(47),
    /**
     * <pre>
     * PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PASSPORT = 48;</code>
     */
    DOCUMENT_TYPE_PASSPORT(48),
    /**
     * <pre>
     * RESIDENT_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RESIDENT_ID = 49;</code>
     */
    DOCUMENT_TYPE_RESIDENT_ID(49),
    /**
     * <pre>
     * MYKAD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYKAD = 50;</code>
     */
    DOCUMENT_TYPE_MYKAD(50),
    /**
     * <pre>
     * INTERNAL_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_INTERNAL_PASSPORT = 51;</code>
     */
    DOCUMENT_TYPE_INTERNAL_PASSPORT(51),
    /**
     * <pre>
     * POSTAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_POSTAL_ID = 52;</code>
     */
    DOCUMENT_TYPE_POSTAL_ID(52),
    /**
     * <pre>
     * MULTIPURPOSE_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MULTIPURPOSE_ID = 53;</code>
     */
    DOCUMENT_TYPE_MULTIPURPOSE_ID(53),
    /**
     * <pre>
     * PASSPORT_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PASSPORT_CARD = 54;</code>
     */
    DOCUMENT_TYPE_PASSPORT_CARD(54),
    /**
     * <pre>
     * PROVISIONAL_DL
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROVISIONAL_DL = 55;</code>
     */
    DOCUMENT_TYPE_PROVISIONAL_DL(55),
    /**
     * <pre>
     * MyTentera
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYTENTERA = 56;</code>
     */
    DOCUMENT_TYPE_MYTENTERA(56),
    /**
     * <pre>
     * DRIVER_QUALIFICATION_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DRIVER_QUALIFICATION_CARD = 57;</code>
     */
    DOCUMENT_TYPE_DRIVER_QUALIFICATION_CARD(57),
    /**
     * <pre>
     * MINORS_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MINORS_PASSPORT = 58;</code>
     */
    DOCUMENT_TYPE_MINORS_PASSPORT(58),
    /**
     * <pre>
     * IMMIGRANT_VISA
     * </pre>
     *
     * <code>DOCUMENT_TYPE_IMMIGRANT_VISA = 59;</code>
     */
    DOCUMENT_TYPE_IMMIGRANT_VISA(59),
    /**
     * <pre>
     * ASYLUM_REQUEST
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ASYLUM_REQUEST = 60;</code>
     */
    DOCUMENT_TYPE_ASYLUM_REQUEST(60),
    /**
     * <pre>
     * NBI_CLEARANCE
     * </pre>
     *
     * <code>DOCUMENT_TYPE_NBI_CLEARANCE = 61;</code>
     */
    DOCUMENT_TYPE_NBI_CLEARANCE(61),
    /**
     * <pre>
     * MILITARY_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MILITARY_ID = 62;</code>
     */
    DOCUMENT_TYPE_MILITARY_ID(62),
    /**
     * <pre>
     * S_PASS
     * </pre>
     *
     * <code>DOCUMENT_TYPE_S_PASS = 63;</code>
     */
    DOCUMENT_TYPE_S_PASS(63),
    /**
     * <pre>
     * GLOBAL_ENTRY_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_GLOBAL_ENTRY_CARD = 64;</code>
     */
    DOCUMENT_TYPE_GLOBAL_ENTRY_CARD(64),
    /**
     * <pre>
     * MY_NUMBER_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MY_NUMBER_CARD = 65;</code>
     */
    DOCUMENT_TYPE_MY_NUMBER_CARD(65),
    /**
     * <pre>
     * SPECIAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_SPECIAL_ID = 66;</code>
     */
    DOCUMENT_TYPE_SPECIAL_ID(66),
    /**
     * <pre>
     * NEXUS_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_NEXUS_CARD = 67;</code>
     */
    DOCUMENT_TYPE_NEXUS_CARD(67),
    /**
     * <pre>
     * DRIVING_PRIVILEGE_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DRIVING_PRIVILEGE_CARD = 68;</code>
     */
    DOCUMENT_TYPE_DRIVING_PRIVILEGE_CARD(68),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 2,
        /* suffix= */ "",
        DocumentType.class.getName());
    }
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>DOCUMENT_TYPE_UNKNOWN = 0;</code>
     */
    public static final int DOCUMENT_TYPE_UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * REFUGEE_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_REFUGEE_ID = 1;</code>
     */
    public static final int DOCUMENT_TYPE_REFUGEE_ID_VALUE = 1;
    /**
     * <pre>
     * MyPolis
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYPOLIS = 2;</code>
     */
    public static final int DOCUMENT_TYPE_MYPOLIS_VALUE = 2;
    /**
     * <pre>
     * iKAD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_IKAD = 3;</code>
     */
    public static final int DOCUMENT_TYPE_IKAD_VALUE = 3;
    /**
     * <pre>
     * WORK_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_WORK_PERMIT = 4;</code>
     */
    public static final int DOCUMENT_TYPE_WORK_PERMIT_VALUE = 4;
    /**
     * <pre>
     * UNIFORMED_SERVICES_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_UNIFORMED_SERVICES_ID = 5;</code>
     */
    public static final int DOCUMENT_TYPE_UNIFORMED_SERVICES_ID_VALUE = 5;
    /**
     * <pre>
     * GREEN_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_GREEN_CARD = 6;</code>
     */
    public static final int DOCUMENT_TYPE_GREEN_CARD_VALUE = 6;
    /**
     * <pre>
     * DL
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DL = 7;</code>
     */
    public static final int DOCUMENT_TYPE_DL_VALUE = 7;
    /**
     * <pre>
     * RESIDENCE_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RESIDENCE_PERMIT = 8;</code>
     */
    public static final int DOCUMENT_TYPE_RESIDENCE_PERMIT_VALUE = 8;
    /**
     * <pre>
     * TEMPORARY_RESIDENCE_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TEMPORARY_RESIDENCE_PERMIT = 9;</code>
     */
    public static final int DOCUMENT_TYPE_TEMPORARY_RESIDENCE_PERMIT_VALUE = 9;
    /**
     * <pre>
     * SOCIAL_SECURITY_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_SOCIAL_SECURITY_CARD = 10;</code>
     */
    public static final int DOCUMENT_TYPE_SOCIAL_SECURITY_CARD_VALUE = 10;
    /**
     * <pre>
     * EXIT_ENTRY_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_EXIT_ENTRY_PERMIT = 11;</code>
     */
    public static final int DOCUMENT_TYPE_EXIT_ENTRY_PERMIT_VALUE = 11;
    /**
     * <pre>
     * RIGID_REFUGEE_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RIGID_REFUGEE_PASSPORT = 12;</code>
     */
    public static final int DOCUMENT_TYPE_RIGID_REFUGEE_PASSPORT_VALUE = 12;
    /**
     * <pre>
     * EMPLOYMENT_PASS
     * </pre>
     *
     * <code>DOCUMENT_TYPE_EMPLOYMENT_PASS = 13;</code>
     */
    public static final int DOCUMENT_TYPE_EMPLOYMENT_PASS_VALUE = 13;
    /**
     * <pre>
     * TEMPORARY_PROTECTION_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TEMPORARY_PROTECTION_PERMIT = 14;</code>
     */
    public static final int DOCUMENT_TYPE_TEMPORARY_PROTECTION_PERMIT_VALUE = 14;
    /**
     * <pre>
     * RIGID_ALIEN_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RIGID_ALIEN_PASSPORT = 15;</code>
     */
    public static final int DOCUMENT_TYPE_RIGID_ALIEN_PASSPORT_VALUE = 15;
    /**
     * <pre>
     * PAN_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PAN_CARD = 16;</code>
     */
    public static final int DOCUMENT_TYPE_PAN_CARD_VALUE = 16;
    /**
     * <pre>
     * MyKid
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYKID = 17;</code>
     */
    public static final int DOCUMENT_TYPE_MYKID_VALUE = 17;
    /**
     * <pre>
     * WEAPON_PERMIT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_WEAPON_PERMIT = 18;</code>
     */
    public static final int DOCUMENT_TYPE_WEAPON_PERMIT_VALUE = 18;
    /**
     * <pre>
     * RIGID_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RIGID_PASSPORT = 19;</code>
     */
    public static final int DOCUMENT_TYPE_RIGID_PASSPORT_VALUE = 19;
    /**
     * <pre>
     * CONSULAR_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CONSULAR_ID = 20;</code>
     */
    public static final int DOCUMENT_TYPE_CONSULAR_ID_VALUE = 20;
    /**
     * <pre>
     * MAINLAND_TRAVEL_PERMIT_TAIWAN
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MAINLAND_TRAVEL_PERMIT_TAIWAN = 21;</code>
     */
    public static final int DOCUMENT_TYPE_MAINLAND_TRAVEL_PERMIT_TAIWAN_VALUE = 21;
    /**
     * <pre>
     * FIN_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_FIN_CARD = 22;</code>
     */
    public static final int DOCUMENT_TYPE_FIN_CARD_VALUE = 22;
    /**
     * <pre>
     * BORDER_CROSSING_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_BORDER_CROSSING_CARD = 23;</code>
     */
    public static final int DOCUMENT_TYPE_BORDER_CROSSING_CARD_VALUE = 23;
    /**
     * <pre>
     * ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ID = 24;</code>
     */
    public static final int DOCUMENT_TYPE_ID_VALUE = 24;
    /**
     * <pre>
     * VISA
     * </pre>
     *
     * <code>DOCUMENT_TYPE_VISA = 25;</code>
     */
    public static final int DOCUMENT_TYPE_VISA_VALUE = 25;
    /**
     * <pre>
     * CONSULAR_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CONSULAR_PASSPORT = 26;</code>
     */
    public static final int DOCUMENT_TYPE_CONSULAR_PASSPORT_VALUE = 26;
    /**
     * <pre>
     * MINORS_PUBLIC_SERVICES_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MINORS_PUBLIC_SERVICES_CARD = 27;</code>
     */
    public static final int DOCUMENT_TYPE_MINORS_PUBLIC_SERVICES_CARD_VALUE = 27;
    /**
     * <pre>
     * VETERAN_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_VETERAN_ID = 28;</code>
     */
    public static final int DOCUMENT_TYPE_VETERAN_ID_VALUE = 28;
    /**
     * <pre>
     * PROOF_OF_AGE_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROOF_OF_AGE_CARD = 29;</code>
     */
    public static final int DOCUMENT_TYPE_PROOF_OF_AGE_CARD_VALUE = 29;
    /**
     * <pre>
     * MyPR
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYPR = 30;</code>
     */
    public static final int DOCUMENT_TYPE_MYPR_VALUE = 30;
    /**
     * <pre>
     * PUBLIC_SERVICES_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PUBLIC_SERVICES_CARD = 31;</code>
     */
    public static final int DOCUMENT_TYPE_PUBLIC_SERVICES_CARD_VALUE = 31;
    /**
     * <pre>
     * TRIBAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TRIBAL_ID = 32;</code>
     */
    public static final int DOCUMENT_TYPE_TRIBAL_ID_VALUE = 32;
    /**
     * <pre>
     * TWIC_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TWIC_CARD = 33;</code>
     */
    public static final int DOCUMENT_TYPE_TWIC_CARD_VALUE = 33;
    /**
     * <pre>
     * PROFESSIONAL_DL
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROFESSIONAL_DL = 34;</code>
     */
    public static final int DOCUMENT_TYPE_PROFESSIONAL_DL_VALUE = 34;
    /**
     * <pre>
     * VOTER_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_VOTER_ID = 35;</code>
     */
    public static final int DOCUMENT_TYPE_VOTER_ID_VALUE = 35;
    /**
     * <pre>
     * PROOF_OF_REGISTRATION
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROOF_OF_REGISTRATION = 36;</code>
     */
    public static final int DOCUMENT_TYPE_PROOF_OF_REGISTRATION_VALUE = 36;
    /**
     * <pre>
     * DL_PUBLIC_SERVICES_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DL_PUBLIC_SERVICES_CARD = 37;</code>
     */
    public static final int DOCUMENT_TYPE_DL_PUBLIC_SERVICES_CARD_VALUE = 37;
    /**
     * <pre>
     * ADDRESS_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ADDRESS_CARD = 38;</code>
     */
    public static final int DOCUMENT_TYPE_ADDRESS_CARD_VALUE = 38;
    /**
     * <pre>
     * CONSULAR_VOTER_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CONSULAR_VOTER_ID = 39;</code>
     */
    public static final int DOCUMENT_TYPE_CONSULAR_VOTER_ID_VALUE = 39;
    /**
     * <pre>
     * TAX_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_TAX_ID = 40;</code>
     */
    public static final int DOCUMENT_TYPE_TAX_ID_VALUE = 40;
    /**
     * <pre>
     * PROFESSIONAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROFESSIONAL_ID = 41;</code>
     */
    public static final int DOCUMENT_TYPE_PROFESSIONAL_ID_VALUE = 41;
    /**
     * <pre>
     * HEALTH_INSURANCE_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_HEALTH_INSURANCE_CARD = 42;</code>
     */
    public static final int DOCUMENT_TYPE_HEALTH_INSURANCE_CARD_VALUE = 42;
    /**
     * <pre>
     * ALIEN_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ALIEN_ID = 43;</code>
     */
    public static final int DOCUMENT_TYPE_ALIEN_ID_VALUE = 43;
    /**
     * <pre>
     * MyKAS
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYKAS = 44;</code>
     */
    public static final int DOCUMENT_TYPE_MYKAS_VALUE = 44;
    /**
     * <pre>
     * MINORS_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MINORS_ID = 45;</code>
     */
    public static final int DOCUMENT_TYPE_MINORS_ID_VALUE = 45;
    /**
     * <pre>
     * CITIZENSHIP_CERTIFICATE
     * </pre>
     *
     * <code>DOCUMENT_TYPE_CITIZENSHIP_CERTIFICATE = 46;</code>
     */
    public static final int DOCUMENT_TYPE_CITIZENSHIP_CERTIFICATE_VALUE = 46;
    /**
     * <pre>
     * DRIVER_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DRIVER_CARD = 47;</code>
     */
    public static final int DOCUMENT_TYPE_DRIVER_CARD_VALUE = 47;
    /**
     * <pre>
     * PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PASSPORT = 48;</code>
     */
    public static final int DOCUMENT_TYPE_PASSPORT_VALUE = 48;
    /**
     * <pre>
     * RESIDENT_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_RESIDENT_ID = 49;</code>
     */
    public static final int DOCUMENT_TYPE_RESIDENT_ID_VALUE = 49;
    /**
     * <pre>
     * MYKAD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYKAD = 50;</code>
     */
    public static final int DOCUMENT_TYPE_MYKAD_VALUE = 50;
    /**
     * <pre>
     * INTERNAL_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_INTERNAL_PASSPORT = 51;</code>
     */
    public static final int DOCUMENT_TYPE_INTERNAL_PASSPORT_VALUE = 51;
    /**
     * <pre>
     * POSTAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_POSTAL_ID = 52;</code>
     */
    public static final int DOCUMENT_TYPE_POSTAL_ID_VALUE = 52;
    /**
     * <pre>
     * MULTIPURPOSE_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MULTIPURPOSE_ID = 53;</code>
     */
    public static final int DOCUMENT_TYPE_MULTIPURPOSE_ID_VALUE = 53;
    /**
     * <pre>
     * PASSPORT_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PASSPORT_CARD = 54;</code>
     */
    public static final int DOCUMENT_TYPE_PASSPORT_CARD_VALUE = 54;
    /**
     * <pre>
     * PROVISIONAL_DL
     * </pre>
     *
     * <code>DOCUMENT_TYPE_PROVISIONAL_DL = 55;</code>
     */
    public static final int DOCUMENT_TYPE_PROVISIONAL_DL_VALUE = 55;
    /**
     * <pre>
     * MyTentera
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MYTENTERA = 56;</code>
     */
    public static final int DOCUMENT_TYPE_MYTENTERA_VALUE = 56;
    /**
     * <pre>
     * DRIVER_QUALIFICATION_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DRIVER_QUALIFICATION_CARD = 57;</code>
     */
    public static final int DOCUMENT_TYPE_DRIVER_QUALIFICATION_CARD_VALUE = 57;
    /**
     * <pre>
     * MINORS_PASSPORT
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MINORS_PASSPORT = 58;</code>
     */
    public static final int DOCUMENT_TYPE_MINORS_PASSPORT_VALUE = 58;
    /**
     * <pre>
     * IMMIGRANT_VISA
     * </pre>
     *
     * <code>DOCUMENT_TYPE_IMMIGRANT_VISA = 59;</code>
     */
    public static final int DOCUMENT_TYPE_IMMIGRANT_VISA_VALUE = 59;
    /**
     * <pre>
     * ASYLUM_REQUEST
     * </pre>
     *
     * <code>DOCUMENT_TYPE_ASYLUM_REQUEST = 60;</code>
     */
    public static final int DOCUMENT_TYPE_ASYLUM_REQUEST_VALUE = 60;
    /**
     * <pre>
     * NBI_CLEARANCE
     * </pre>
     *
     * <code>DOCUMENT_TYPE_NBI_CLEARANCE = 61;</code>
     */
    public static final int DOCUMENT_TYPE_NBI_CLEARANCE_VALUE = 61;
    /**
     * <pre>
     * MILITARY_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MILITARY_ID = 62;</code>
     */
    public static final int DOCUMENT_TYPE_MILITARY_ID_VALUE = 62;
    /**
     * <pre>
     * S_PASS
     * </pre>
     *
     * <code>DOCUMENT_TYPE_S_PASS = 63;</code>
     */
    public static final int DOCUMENT_TYPE_S_PASS_VALUE = 63;
    /**
     * <pre>
     * GLOBAL_ENTRY_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_GLOBAL_ENTRY_CARD = 64;</code>
     */
    public static final int DOCUMENT_TYPE_GLOBAL_ENTRY_CARD_VALUE = 64;
    /**
     * <pre>
     * MY_NUMBER_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_MY_NUMBER_CARD = 65;</code>
     */
    public static final int DOCUMENT_TYPE_MY_NUMBER_CARD_VALUE = 65;
    /**
     * <pre>
     * SPECIAL_ID
     * </pre>
     *
     * <code>DOCUMENT_TYPE_SPECIAL_ID = 66;</code>
     */
    public static final int DOCUMENT_TYPE_SPECIAL_ID_VALUE = 66;
    /**
     * <pre>
     * NEXUS_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_NEXUS_CARD = 67;</code>
     */
    public static final int DOCUMENT_TYPE_NEXUS_CARD_VALUE = 67;
    /**
     * <pre>
     * DRIVING_PRIVILEGE_CARD
     * </pre>
     *
     * <code>DOCUMENT_TYPE_DRIVING_PRIVILEGE_CARD = 68;</code>
     */
    public static final int DOCUMENT_TYPE_DRIVING_PRIVILEGE_CARD_VALUE = 68;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DocumentType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DocumentType forNumber(int value) {
      switch (value) {
        case 0: return DOCUMENT_TYPE_UNKNOWN;
        case 1: return DOCUMENT_TYPE_REFUGEE_ID;
        case 2: return DOCUMENT_TYPE_MYPOLIS;
        case 3: return DOCUMENT_TYPE_IKAD;
        case 4: return DOCUMENT_TYPE_WORK_PERMIT;
        case 5: return DOCUMENT_TYPE_UNIFORMED_SERVICES_ID;
        case 6: return DOCUMENT_TYPE_GREEN_CARD;
        case 7: return DOCUMENT_TYPE_DL;
        case 8: return DOCUMENT_TYPE_RESIDENCE_PERMIT;
        case 9: return DOCUMENT_TYPE_TEMPORARY_RESIDENCE_PERMIT;
        case 10: return DOCUMENT_TYPE_SOCIAL_SECURITY_CARD;
        case 11: return DOCUMENT_TYPE_EXIT_ENTRY_PERMIT;
        case 12: return DOCUMENT_TYPE_RIGID_REFUGEE_PASSPORT;
        case 13: return DOCUMENT_TYPE_EMPLOYMENT_PASS;
        case 14: return DOCUMENT_TYPE_TEMPORARY_PROTECTION_PERMIT;
        case 15: return DOCUMENT_TYPE_RIGID_ALIEN_PASSPORT;
        case 16: return DOCUMENT_TYPE_PAN_CARD;
        case 17: return DOCUMENT_TYPE_MYKID;
        case 18: return DOCUMENT_TYPE_WEAPON_PERMIT;
        case 19: return DOCUMENT_TYPE_RIGID_PASSPORT;
        case 20: return DOCUMENT_TYPE_CONSULAR_ID;
        case 21: return DOCUMENT_TYPE_MAINLAND_TRAVEL_PERMIT_TAIWAN;
        case 22: return DOCUMENT_TYPE_FIN_CARD;
        case 23: return DOCUMENT_TYPE_BORDER_CROSSING_CARD;
        case 24: return DOCUMENT_TYPE_ID;
        case 25: return DOCUMENT_TYPE_VISA;
        case 26: return DOCUMENT_TYPE_CONSULAR_PASSPORT;
        case 27: return DOCUMENT_TYPE_MINORS_PUBLIC_SERVICES_CARD;
        case 28: return DOCUMENT_TYPE_VETERAN_ID;
        case 29: return DOCUMENT_TYPE_PROOF_OF_AGE_CARD;
        case 30: return DOCUMENT_TYPE_MYPR;
        case 31: return DOCUMENT_TYPE_PUBLIC_SERVICES_CARD;
        case 32: return DOCUMENT_TYPE_TRIBAL_ID;
        case 33: return DOCUMENT_TYPE_TWIC_CARD;
        case 34: return DOCUMENT_TYPE_PROFESSIONAL_DL;
        case 35: return DOCUMENT_TYPE_VOTER_ID;
        case 36: return DOCUMENT_TYPE_PROOF_OF_REGISTRATION;
        case 37: return DOCUMENT_TYPE_DL_PUBLIC_SERVICES_CARD;
        case 38: return DOCUMENT_TYPE_ADDRESS_CARD;
        case 39: return DOCUMENT_TYPE_CONSULAR_VOTER_ID;
        case 40: return DOCUMENT_TYPE_TAX_ID;
        case 41: return DOCUMENT_TYPE_PROFESSIONAL_ID;
        case 42: return DOCUMENT_TYPE_HEALTH_INSURANCE_CARD;
        case 43: return DOCUMENT_TYPE_ALIEN_ID;
        case 44: return DOCUMENT_TYPE_MYKAS;
        case 45: return DOCUMENT_TYPE_MINORS_ID;
        case 46: return DOCUMENT_TYPE_CITIZENSHIP_CERTIFICATE;
        case 47: return DOCUMENT_TYPE_DRIVER_CARD;
        case 48: return DOCUMENT_TYPE_PASSPORT;
        case 49: return DOCUMENT_TYPE_RESIDENT_ID;
        case 50: return DOCUMENT_TYPE_MYKAD;
        case 51: return DOCUMENT_TYPE_INTERNAL_PASSPORT;
        case 52: return DOCUMENT_TYPE_POSTAL_ID;
        case 53: return DOCUMENT_TYPE_MULTIPURPOSE_ID;
        case 54: return DOCUMENT_TYPE_PASSPORT_CARD;
        case 55: return DOCUMENT_TYPE_PROVISIONAL_DL;
        case 56: return DOCUMENT_TYPE_MYTENTERA;
        case 57: return DOCUMENT_TYPE_DRIVER_QUALIFICATION_CARD;
        case 58: return DOCUMENT_TYPE_MINORS_PASSPORT;
        case 59: return DOCUMENT_TYPE_IMMIGRANT_VISA;
        case 60: return DOCUMENT_TYPE_ASYLUM_REQUEST;
        case 61: return DOCUMENT_TYPE_NBI_CLEARANCE;
        case 62: return DOCUMENT_TYPE_MILITARY_ID;
        case 63: return DOCUMENT_TYPE_S_PASS;
        case 64: return DOCUMENT_TYPE_GLOBAL_ENTRY_CARD;
        case 65: return DOCUMENT_TYPE_MY_NUMBER_CARD;
        case 66: return DOCUMENT_TYPE_SPECIAL_ID;
        case 67: return DOCUMENT_TYPE_NEXUS_CARD;
        case 68: return DOCUMENT_TYPE_DRIVING_PRIVILEGE_CARD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DocumentType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DocumentType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DocumentType>() {
            public DocumentType findValueByNumber(int number) {
              return DocumentType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return proto.id_extract_service.v1.DocumentTypesEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final DocumentType[] VALUES = values();

    public static DocumentType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DocumentType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.id_extract_service.v1.DocumentType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5proto/id_extract_service/v1/document_t" +
      "ypes_enum.proto\022\033proto.id_extract_servic" +
      "e.v1*\222\022\n\014DocumentType\022\031\n\025DOCUMENT_TYPE_U" +
      "NKNOWN\020\000\022\034\n\030DOCUMENT_TYPE_REFUGEE_ID\020\001\022\031" +
      "\n\025DOCUMENT_TYPE_MYPOLIS\020\002\022\026\n\022DOCUMENT_TY" +
      "PE_IKAD\020\003\022\035\n\031DOCUMENT_TYPE_WORK_PERMIT\020\004" +
      "\022\'\n#DOCUMENT_TYPE_UNIFORMED_SERVICES_ID\020" +
      "\005\022\034\n\030DOCUMENT_TYPE_GREEN_CARD\020\006\022\024\n\020DOCUM" +
      "ENT_TYPE_DL\020\007\022\"\n\036DOCUMENT_TYPE_RESIDENCE" +
      "_PERMIT\020\010\022,\n(DOCUMENT_TYPE_TEMPORARY_RES" +
      "IDENCE_PERMIT\020\t\022&\n\"DOCUMENT_TYPE_SOCIAL_" +
      "SECURITY_CARD\020\n\022#\n\037DOCUMENT_TYPE_EXIT_EN" +
      "TRY_PERMIT\020\013\022(\n$DOCUMENT_TYPE_RIGID_REFU" +
      "GEE_PASSPORT\020\014\022!\n\035DOCUMENT_TYPE_EMPLOYME" +
      "NT_PASS\020\r\022-\n)DOCUMENT_TYPE_TEMPORARY_PRO" +
      "TECTION_PERMIT\020\016\022&\n\"DOCUMENT_TYPE_RIGID_" +
      "ALIEN_PASSPORT\020\017\022\032\n\026DOCUMENT_TYPE_PAN_CA" +
      "RD\020\020\022\027\n\023DOCUMENT_TYPE_MYKID\020\021\022\037\n\033DOCUMEN" +
      "T_TYPE_WEAPON_PERMIT\020\022\022 \n\034DOCUMENT_TYPE_" +
      "RIGID_PASSPORT\020\023\022\035\n\031DOCUMENT_TYPE_CONSUL" +
      "AR_ID\020\024\022/\n+DOCUMENT_TYPE_MAINLAND_TRAVEL" +
      "_PERMIT_TAIWAN\020\025\022\032\n\026DOCUMENT_TYPE_FIN_CA" +
      "RD\020\026\022&\n\"DOCUMENT_TYPE_BORDER_CROSSING_CA" +
      "RD\020\027\022\024\n\020DOCUMENT_TYPE_ID\020\030\022\026\n\022DOCUMENT_T" +
      "YPE_VISA\020\031\022#\n\037DOCUMENT_TYPE_CONSULAR_PAS" +
      "SPORT\020\032\022-\n)DOCUMENT_TYPE_MINORS_PUBLIC_S" +
      "ERVICES_CARD\020\033\022\034\n\030DOCUMENT_TYPE_VETERAN_" +
      "ID\020\034\022#\n\037DOCUMENT_TYPE_PROOF_OF_AGE_CARD\020" +
      "\035\022\026\n\022DOCUMENT_TYPE_MYPR\020\036\022&\n\"DOCUMENT_TY" +
      "PE_PUBLIC_SERVICES_CARD\020\037\022\033\n\027DOCUMENT_TY" +
      "PE_TRIBAL_ID\020 \022\033\n\027DOCUMENT_TYPE_TWIC_CAR" +
      "D\020!\022!\n\035DOCUMENT_TYPE_PROFESSIONAL_DL\020\"\022\032" +
      "\n\026DOCUMENT_TYPE_VOTER_ID\020#\022\'\n#DOCUMENT_T" +
      "YPE_PROOF_OF_REGISTRATION\020$\022)\n%DOCUMENT_" +
      "TYPE_DL_PUBLIC_SERVICES_CARD\020%\022\036\n\032DOCUME" +
      "NT_TYPE_ADDRESS_CARD\020&\022#\n\037DOCUMENT_TYPE_" +
      "CONSULAR_VOTER_ID\020\'\022\030\n\024DOCUMENT_TYPE_TAX" +
      "_ID\020(\022!\n\035DOCUMENT_TYPE_PROFESSIONAL_ID\020)" +
      "\022\'\n#DOCUMENT_TYPE_HEALTH_INSURANCE_CARD\020" +
      "*\022\032\n\026DOCUMENT_TYPE_ALIEN_ID\020+\022\027\n\023DOCUMEN" +
      "T_TYPE_MYKAS\020,\022\033\n\027DOCUMENT_TYPE_MINORS_I" +
      "D\020-\022)\n%DOCUMENT_TYPE_CITIZENSHIP_CERTIFI" +
      "CATE\020.\022\035\n\031DOCUMENT_TYPE_DRIVER_CARD\020/\022\032\n" +
      "\026DOCUMENT_TYPE_PASSPORT\0200\022\035\n\031DOCUMENT_TY" +
      "PE_RESIDENT_ID\0201\022\027\n\023DOCUMENT_TYPE_MYKAD\020" +
      "2\022#\n\037DOCUMENT_TYPE_INTERNAL_PASSPORT\0203\022\033" +
      "\n\027DOCUMENT_TYPE_POSTAL_ID\0204\022!\n\035DOCUMENT_" +
      "TYPE_MULTIPURPOSE_ID\0205\022\037\n\033DOCUMENT_TYPE_" +
      "PASSPORT_CARD\0206\022 \n\034DOCUMENT_TYPE_PROVISI" +
      "ONAL_DL\0207\022\033\n\027DOCUMENT_TYPE_MYTENTERA\0208\022+" +
      "\n\'DOCUMENT_TYPE_DRIVER_QUALIFICATION_CAR" +
      "D\0209\022!\n\035DOCUMENT_TYPE_MINORS_PASSPORT\020:\022 " +
      "\n\034DOCUMENT_TYPE_IMMIGRANT_VISA\020;\022 \n\034DOCU" +
      "MENT_TYPE_ASYLUM_REQUEST\020<\022\037\n\033DOCUMENT_T" +
      "YPE_NBI_CLEARANCE\020=\022\035\n\031DOCUMENT_TYPE_MIL" +
      "ITARY_ID\020>\022\030\n\024DOCUMENT_TYPE_S_PASS\020?\022#\n\037" +
      "DOCUMENT_TYPE_GLOBAL_ENTRY_CARD\020@\022 \n\034DOC" +
      "UMENT_TYPE_MY_NUMBER_CARD\020A\022\034\n\030DOCUMENT_" +
      "TYPE_SPECIAL_ID\020B\022\034\n\030DOCUMENT_TYPE_NEXUS" +
      "_CARD\020C\022(\n$DOCUMENT_TYPE_DRIVING_PRIVILE" +
      "GE_CARD\020DBCZAgithub.com/veridil/id-extra" +
      "ct-service/proto/id_extract_service/v1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
