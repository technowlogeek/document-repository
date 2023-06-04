/**
 * SimpleFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public abstract class SimpleFilterType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType  implements java.io.Serializable {
    private java.lang.String domainAttribute;  // attribute

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SimpleFilterTypeComparator comparator;  // attribute

    public SimpleFilterType() {
    }

    public SimpleFilterType(
           boolean negate,
           java.lang.String domainAttribute,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SimpleFilterTypeComparator comparator) {
        super(
            negate);
        this.domainAttribute = domainAttribute;
        this.comparator = comparator;
    }


    /**
     * Gets the domainAttribute value for this SimpleFilterType.
     * 
     * @return domainAttribute
     */
    public java.lang.String getDomainAttribute() {
        return domainAttribute;
    }


    /**
     * Sets the domainAttribute value for this SimpleFilterType.
     * 
     * @param domainAttribute
     */
    public void setDomainAttribute(java.lang.String domainAttribute) {
        this.domainAttribute = domainAttribute;
    }


    /**
     * Gets the comparator value for this SimpleFilterType.
     * 
     * @return comparator
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SimpleFilterTypeComparator getComparator() {
        return comparator;
    }


    /**
     * Sets the comparator value for this SimpleFilterType.
     * 
     * @param comparator
     */
    public void setComparator(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.SimpleFilterTypeComparator comparator) {
        this.comparator = comparator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleFilterType)) return false;
        SimpleFilterType other = (SimpleFilterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domainAttribute==null && other.getDomainAttribute()==null) || 
             (this.domainAttribute!=null &&
              this.domainAttribute.equals(other.getDomainAttribute()))) &&
            ((this.comparator==null && other.getComparator()==null) || 
             (this.comparator!=null &&
              this.comparator.equals(other.getComparator())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDomainAttribute() != null) {
            _hashCode += getDomainAttribute().hashCode();
        }
        if (getComparator() != null) {
            _hashCode += getComparator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SimpleFilterType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("domainAttribute");
        attrField.setXmlName(new javax.xml.namespace.QName("", "domainAttribute"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("comparator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "comparator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">SimpleFilterType>comparator"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
