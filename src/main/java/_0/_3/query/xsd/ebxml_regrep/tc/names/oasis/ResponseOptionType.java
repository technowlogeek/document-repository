/**
 * ResponseOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class ResponseOptionType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionTypeReturnType returnType;  // attribute

    private boolean returnComposedObjects;  // attribute

    public ResponseOptionType() {
    }

    public ResponseOptionType(
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionTypeReturnType returnType,
           boolean returnComposedObjects) {
           this.returnType = returnType;
           this.returnComposedObjects = returnComposedObjects;
    }


    /**
     * Gets the returnType value for this ResponseOptionType.
     * 
     * @return returnType
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionTypeReturnType getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this ResponseOptionType.
     * 
     * @param returnType
     */
    public void setReturnType(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionTypeReturnType returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the returnComposedObjects value for this ResponseOptionType.
     * 
     * @return returnComposedObjects
     */
    public boolean isReturnComposedObjects() {
        return returnComposedObjects;
    }


    /**
     * Sets the returnComposedObjects value for this ResponseOptionType.
     * 
     * @param returnComposedObjects
     */
    public void setReturnComposedObjects(boolean returnComposedObjects) {
        this.returnComposedObjects = returnComposedObjects;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseOptionType)) return false;
        ResponseOptionType other = (ResponseOptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnType==null && other.getReturnType()==null) || 
             (this.returnType!=null &&
              this.returnType.equals(other.getReturnType()))) &&
            this.returnComposedObjects == other.isReturnComposedObjects();
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
        if (getReturnType() != null) {
            _hashCode += getReturnType().hashCode();
        }
        _hashCode += (isReturnComposedObjects() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseOptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ResponseOptionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "returnType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">ResponseOptionType>returnType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnComposedObjects");
        attrField.setXmlName(new javax.xml.namespace.QName("", "returnComposedObjects"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
