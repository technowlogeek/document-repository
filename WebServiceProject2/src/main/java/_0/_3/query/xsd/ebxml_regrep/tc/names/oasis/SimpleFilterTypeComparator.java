/**
 * SimpleFilterTypeComparator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class SimpleFilterTypeComparator implements java.io.Serializable {
    private org.apache.axis.types.NCName _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SimpleFilterTypeComparator(org.apache.axis.types.NCName value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NCName _LE = new org.apache.axis.types.NCName("LE");
    public static final org.apache.axis.types.NCName _LT = new org.apache.axis.types.NCName("LT");
    public static final org.apache.axis.types.NCName _GE = new org.apache.axis.types.NCName("GE");
    public static final org.apache.axis.types.NCName _GT = new org.apache.axis.types.NCName("GT");
    public static final org.apache.axis.types.NCName _EQ = new org.apache.axis.types.NCName("EQ");
    public static final org.apache.axis.types.NCName _NE = new org.apache.axis.types.NCName("NE");
    public static final org.apache.axis.types.NCName _Like = new org.apache.axis.types.NCName("Like");
    public static final org.apache.axis.types.NCName _NotLike = new org.apache.axis.types.NCName("NotLike");
    public static final SimpleFilterTypeComparator LE = new SimpleFilterTypeComparator(_LE);
    public static final SimpleFilterTypeComparator LT = new SimpleFilterTypeComparator(_LT);
    public static final SimpleFilterTypeComparator GE = new SimpleFilterTypeComparator(_GE);
    public static final SimpleFilterTypeComparator GT = new SimpleFilterTypeComparator(_GT);
    public static final SimpleFilterTypeComparator EQ = new SimpleFilterTypeComparator(_EQ);
    public static final SimpleFilterTypeComparator NE = new SimpleFilterTypeComparator(_NE);
    public static final SimpleFilterTypeComparator Like = new SimpleFilterTypeComparator(_Like);
    public static final SimpleFilterTypeComparator NotLike = new SimpleFilterTypeComparator(_NotLike);
    public org.apache.axis.types.NCName getValue() { return _value_;}
    public static SimpleFilterTypeComparator fromValue(org.apache.axis.types.NCName value)
          throws java.lang.IllegalArgumentException {
        SimpleFilterTypeComparator enumeration = (SimpleFilterTypeComparator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SimpleFilterTypeComparator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SimpleFilterTypeComparator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">SimpleFilterType>comparator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
