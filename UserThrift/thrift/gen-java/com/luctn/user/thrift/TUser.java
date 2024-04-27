/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.luctn.user.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2024-04-26")
public class TUser implements org.apache.thrift.TBase<TUser, TUser._Fields>, java.io.Serializable, Cloneable, Comparable<TUser> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUser");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STUDENT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("studentName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STUDENTID_FIELD_DESC = new org.apache.thrift.protocol.TField("studentid", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUserStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUserTupleSchemeFactory();

  public int id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String studentName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String studentid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    STUDENT_NAME((short)2, "studentName"),
    STUDENTID((short)3, "studentid");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // STUDENT_NAME
          return STUDENT_NAME;
        case 3: // STUDENTID
          return STUDENTID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STUDENTID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STUDENT_NAME, new org.apache.thrift.meta_data.FieldMetaData("studentName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STUDENTID, new org.apache.thrift.meta_data.FieldMetaData("studentid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUser.class, metaDataMap);
  }

  public TUser() {
  }

  public TUser(
    int id,
    java.lang.String studentName)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.studentName = studentName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUser(TUser other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetStudentName()) {
      this.studentName = other.studentName;
    }
    if (other.isSetStudentid()) {
      this.studentid = other.studentid;
    }
  }

  @Override
  public TUser deepCopy() {
    return new TUser(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.studentName = null;
    this.studentid = null;
  }

  public int getId() {
    return this.id;
  }

  public TUser setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStudentName() {
    return this.studentName;
  }

  public TUser setStudentName(@org.apache.thrift.annotation.Nullable java.lang.String studentName) {
    this.studentName = studentName;
    return this;
  }

  public void unsetStudentName() {
    this.studentName = null;
  }

  /** Returns true if field studentName is set (has been assigned a value) and false otherwise */
  public boolean isSetStudentName() {
    return this.studentName != null;
  }

  public void setStudentNameIsSet(boolean value) {
    if (!value) {
      this.studentName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStudentid() {
    return this.studentid;
  }

  public TUser setStudentid(@org.apache.thrift.annotation.Nullable java.lang.String studentid) {
    this.studentid = studentid;
    return this;
  }

  public void unsetStudentid() {
    this.studentid = null;
  }

  /** Returns true if field studentid is set (has been assigned a value) and false otherwise */
  public boolean isSetStudentid() {
    return this.studentid != null;
  }

  public void setStudentidIsSet(boolean value) {
    if (!value) {
      this.studentid = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case STUDENT_NAME:
      if (value == null) {
        unsetStudentName();
      } else {
        setStudentName((java.lang.String)value);
      }
      break;

    case STUDENTID:
      if (value == null) {
        unsetStudentid();
      } else {
        setStudentid((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case STUDENT_NAME:
      return getStudentName();

    case STUDENTID:
      return getStudentid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case STUDENT_NAME:
      return isSetStudentName();
    case STUDENTID:
      return isSetStudentid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUser)
      return this.equals((TUser)that);
    return false;
  }

  public boolean equals(TUser that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_studentName = true && this.isSetStudentName();
    boolean that_present_studentName = true && that.isSetStudentName();
    if (this_present_studentName || that_present_studentName) {
      if (!(this_present_studentName && that_present_studentName))
        return false;
      if (!this.studentName.equals(that.studentName))
        return false;
    }

    boolean this_present_studentid = true && this.isSetStudentid();
    boolean that_present_studentid = true && that.isSetStudentid();
    if (this_present_studentid || that_present_studentid) {
      if (!(this_present_studentid && that_present_studentid))
        return false;
      if (!this.studentid.equals(that.studentid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetStudentName()) ? 131071 : 524287);
    if (isSetStudentName())
      hashCode = hashCode * 8191 + studentName.hashCode();

    hashCode = hashCode * 8191 + ((isSetStudentid()) ? 131071 : 524287);
    if (isSetStudentid())
      hashCode = hashCode * 8191 + studentid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TUser other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStudentName(), other.isSetStudentName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStudentName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.studentName, other.studentName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStudentid(), other.isSetStudentid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStudentid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.studentid, other.studentid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUser(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("studentName:");
    if (this.studentName == null) {
      sb.append("null");
    } else {
      sb.append(this.studentName);
    }
    first = false;
    if (isSetStudentid()) {
      if (!first) sb.append(", ");
      sb.append("studentid:");
      if (this.studentid == null) {
        sb.append("null");
      } else {
        sb.append(this.studentid);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserStandardScheme getScheme() {
      return new TUserStandardScheme();
    }
  }

  private static class TUserStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUser> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TUser struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STUDENT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.studentName = iprot.readString();
              struct.setStudentNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STUDENTID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.studentid = iprot.readString();
              struct.setStudentidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TUser struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.studentName != null) {
        oprot.writeFieldBegin(STUDENT_NAME_FIELD_DESC);
        oprot.writeString(struct.studentName);
        oprot.writeFieldEnd();
      }
      if (struct.studentid != null) {
        if (struct.isSetStudentid()) {
          oprot.writeFieldBegin(STUDENTID_FIELD_DESC);
          oprot.writeString(struct.studentid);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserTupleScheme getScheme() {
      return new TUserTupleScheme();
    }
  }

  private static class TUserTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUser> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUser struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetStudentName()) {
        optionals.set(1);
      }
      if (struct.isSetStudentid()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetStudentName()) {
        oprot.writeString(struct.studentName);
      }
      if (struct.isSetStudentid()) {
        oprot.writeString(struct.studentid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUser struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.studentName = iprot.readString();
        struct.setStudentNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.studentid = iprot.readString();
        struct.setStudentidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

