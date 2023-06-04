/**
 * ResponseOptionTypeReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class ResponseOptionTypeReturnType implements java.io.Serializable {
    private org.apache.axis.types.NCName _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResponseOptionTypeReturnType(org.apache.axis.types.NCName value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NCName _ObjectRef = new org.apache.axis.types.NCName("ObjectRef");
    public static final org.apache.axis.types.NCName _RegistryObject = new org.apache.axis.types.NCName("RegistryObject");
    public static final org.apache.axis.types.NCName _LeafClass = new org.apache.axis.types.NCName("LeafClass");
    public static final org.apache.axis.types.NCName _LeafClassWithRepositoryItem = new org.apache.axis.types.NCName("LeafClassWithRepositoryItem");
    public static final ResponseOptionTypeReturnType ObjectRef = new ResponseOptionTypeReturnType(_ObjectRef);
    public static final ResponseOptionTypeReturnType RegistryObject = new ResponseOptionTypeReturnType(_RegistryObject);
    public static final ResponseOptionTypeReturnType LeafClass = new ResponseOptionTypeReturnType(_LeafClass);
    public static final ResponseOptionTypeReturnType LeafClassWithRepositoryItem = new ResponseOptionTypeReturnType(_LeafClassWithRepositoryItem);
    public org.apache.axis.types.NCName getValue() { return _value_;}
    public static ResponseOptionTypeReturnType fromValue(org.apache.axis.types.NCName value)
          throws java.lang.IllegalArgumentException {
        ResponseOptionTypeReturnType enumeration = (ResponseOptionTypeReturnType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResponseOptionTypeReturnType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NCName(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseOptionTypeReturnType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">ResponseOptionType>returnType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
