/**
 * ProvideAndRegisterDocumentSetRequestTypeDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class ProvideAndRegisterDocumentSetRequestTypeDocument  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private byte[] _value;

    private org.apache.axis.types.URI id;  // attribute

    public ProvideAndRegisterDocumentSetRequestTypeDocument() {
    }

    // Simple Types must have a String constructor
    public ProvideAndRegisterDocumentSetRequestTypeDocument(byte[] _value) {
        this._value = _value;
    }
    public ProvideAndRegisterDocumentSetRequestTypeDocument(java.lang.String _value) {
        this._value = org.apache.axis.encoding.Base64.decode(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : org.apache.axis.encoding.Base64.encode(_value);
    }


    /**
     * Gets the _value value for this ProvideAndRegisterDocumentSetRequestTypeDocument.
     * 
     * @return _value
     */
    public byte[] get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this ProvideAndRegisterDocumentSetRequestTypeDocument.
     * 
     * @param _value
     */
    public void set_value(byte[] _value) {
        this._value = _value;
    }


    /**
     * Gets the id value for this ProvideAndRegisterDocumentSetRequestTypeDocument.
     * 
     * @return id
     */
    public org.apache.axis.types.URI getId() {
        return id;
    }


    /**
     * Sets the id value for this ProvideAndRegisterDocumentSetRequestTypeDocument.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.URI id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvideAndRegisterDocumentSetRequestTypeDocument)) return false;
        ProvideAndRegisterDocumentSetRequestTypeDocument other = (ProvideAndRegisterDocumentSetRequestTypeDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              java.util.Arrays.equals(this._value, other.get_value()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_value() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_value());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_value(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProvideAndRegisterDocumentSetRequestTypeDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">ProvideAndRegisterDocumentSetRequestType>Document"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
