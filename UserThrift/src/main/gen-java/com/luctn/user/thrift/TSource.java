/**
 * Autogenerated by Thrift Compiler (0.20.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.luctn.user.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.20.0)", date = "2024-04-27")
public class TSource implements org.apache.thrift.TBase<TSource, TSource._Fields>, java.io.Serializable, Cloneable, Comparable<TSource> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSource");

  private static final org.apache.thrift.protocol.TField APP_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("appName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IP_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("ipAddress", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSourceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSourceTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String appName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String ipAddress; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APP_NAME((short)1, "appName"),
    IP_ADDRESS((short)2, "ipAddress");

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
        case 1: // APP_NAME
          return APP_NAME;
        case 2: // IP_ADDRESS
          return IP_ADDRESS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APP_NAME, new org.apache.thrift.meta_data.FieldMetaData("appName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("ipAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSource.class, metaDataMap);
  }

  public TSource() {
  }

  public TSource(
    java.lang.String appName,
    java.lang.String ipAddress)
  {
    this();
    this.appName = appName;
    this.ipAddress = ipAddress;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSource(TSource other) {
    if (other.isSetAppName()) {
      this.appName = other.appName;
    }
    if (other.isSetIpAddress()) {
      this.ipAddress = other.ipAddress;
    }
  }

  @Override
  public TSource deepCopy() {
    return new TSource(this);
  }

  @Override
  public void clear() {
    this.appName = null;
    this.ipAddress = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAppName() {
    return this.appName;
  }

  public TSource setAppName(@org.apache.thrift.annotation.Nullable java.lang.String appName) {
    this.appName = appName;
    return this;
  }

  public void unsetAppName() {
    this.appName = null;
  }

  /** Returns true if field appName is set (has been assigned a value) and false otherwise */
  public boolean isSetAppName() {
    return this.appName != null;
  }

  public void setAppNameIsSet(boolean value) {
    if (!value) {
      this.appName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIpAddress() {
    return this.ipAddress;
  }

  public TSource setIpAddress(@org.apache.thrift.annotation.Nullable java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public void unsetIpAddress() {
    this.ipAddress = null;
  }

  /** Returns true if field ipAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetIpAddress() {
    return this.ipAddress != null;
  }

  public void setIpAddressIsSet(boolean value) {
    if (!value) {
      this.ipAddress = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case APP_NAME:
      if (value == null) {
        unsetAppName();
      } else {
        setAppName((java.lang.String)value);
      }
      break;

    case IP_ADDRESS:
      if (value == null) {
        unsetIpAddress();
      } else {
        setIpAddress((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case APP_NAME:
      return getAppName();

    case IP_ADDRESS:
      return getIpAddress();

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
    case APP_NAME:
      return isSetAppName();
    case IP_ADDRESS:
      return isSetIpAddress();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSource)
      return this.equals((TSource)that);
    return false;
  }

  public boolean equals(TSource that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_appName = true && this.isSetAppName();
    boolean that_present_appName = true && that.isSetAppName();
    if (this_present_appName || that_present_appName) {
      if (!(this_present_appName && that_present_appName))
        return false;
      if (!this.appName.equals(that.appName))
        return false;
    }

    boolean this_present_ipAddress = true && this.isSetIpAddress();
    boolean that_present_ipAddress = true && that.isSetIpAddress();
    if (this_present_ipAddress || that_present_ipAddress) {
      if (!(this_present_ipAddress && that_present_ipAddress))
        return false;
      if (!this.ipAddress.equals(that.ipAddress))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAppName()) ? 131071 : 524287);
    if (isSetAppName())
      hashCode = hashCode * 8191 + appName.hashCode();

    hashCode = hashCode * 8191 + ((isSetIpAddress()) ? 131071 : 524287);
    if (isSetIpAddress())
      hashCode = hashCode * 8191 + ipAddress.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAppName(), other.isSetAppName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appName, other.appName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIpAddress(), other.isSetIpAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIpAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipAddress, other.ipAddress);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSource(");
    boolean first = true;

    sb.append("appName:");
    if (this.appName == null) {
      sb.append("null");
    } else {
      sb.append(this.appName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ipAddress:");
    if (this.ipAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.ipAddress);
    }
    first = false;
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSourceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSourceStandardScheme getScheme() {
      return new TSourceStandardScheme();
    }
  }

  private static class TSourceStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSource> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APP_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appName = iprot.readString();
              struct.setAppNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IP_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ipAddress = iprot.readString();
              struct.setIpAddressIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.appName != null) {
        oprot.writeFieldBegin(APP_NAME_FIELD_DESC);
        oprot.writeString(struct.appName);
        oprot.writeFieldEnd();
      }
      if (struct.ipAddress != null) {
        oprot.writeFieldBegin(IP_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.ipAddress);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSourceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSourceTupleScheme getScheme() {
      return new TSourceTupleScheme();
    }
  }

  private static class TSourceTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAppName()) {
        optionals.set(0);
      }
      if (struct.isSetIpAddress()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAppName()) {
        oprot.writeString(struct.appName);
      }
      if (struct.isSetIpAddress()) {
        oprot.writeString(struct.ipAddress);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.appName = iprot.readString();
        struct.setAppNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ipAddress = iprot.readString();
        struct.setIpAddressIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

