/**
 * ExternalIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * ExternalIdentifier is the mapping of the same named interface in
 * ebRIM.
 *         It extends RegistryObject.
 */
public class ExternalIdentifierType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private org.apache.axis.types.URI registryObject;  // attribute

    private org.apache.axis.types.URI identificationScheme;  // attribute

    private java.lang.String value;  // attribute

    public ExternalIdentifierType() {
    }

    public ExternalIdentifierType(
           org.apache.axis.types.URI id,
           org.apache.axis.types.URI home,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] param2,
           org.apache.axis.types.URI lid,
           org.apache.axis.types.URI objectType,
           org.apache.axis.types.URI status,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType name,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType description,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType versionInfo,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType[] classification,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType[] externalIdentifier,
           org.apache.axis.types.URI registryObject,
           org.apache.axis.types.URI identificationScheme,
           java.lang.String value) {
        super(
            id,
            home,
            param2,
            lid,
            objectType,
            status,
            name,
            description,
            versionInfo,
            classification,
            externalIdentifier);
        this.registryObject = registryObject;
        this.identificationScheme = identificationScheme;
        this.value = value;
    }


    /**
     * Gets the registryObject value for this ExternalIdentifierType.
     * 
     * @return registryObject
     */
    public org.apache.axis.types.URI getRegistryObject() {
        return registryObject;
    }


    /**
     * Sets the registryObject value for this ExternalIdentifierType.
     * 
     * @param registryObject
     */
    public void setRegistryObject(org.apache.axis.types.URI registryObject) {
        this.registryObject = registryObject;
    }


    /**
     * Gets the identificationScheme value for this ExternalIdentifierType.
     * 
     * @return identificationScheme
     */
    public org.apache.axis.types.URI getIdentificationScheme() {
        return identificationScheme;
    }


    /**
     * Sets the identificationScheme value for this ExternalIdentifierType.
     * 
     * @param identificationScheme
     */
    public void setIdentificationScheme(org.apache.axis.types.URI identificationScheme) {
        this.identificationScheme = identificationScheme;
    }


    /**
     * Gets the value value for this ExternalIdentifierType.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ExternalIdentifierType.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalIdentifierType)) return false;
        ExternalIdentifierType other = (ExternalIdentifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registryObject==null && other.getRegistryObject()==null) || 
             (this.registryObject!=null &&
              this.registryObject.equals(other.getRegistryObject()))) &&
            ((this.identificationScheme==null && other.getIdentificationScheme()==null) || 
             (this.identificationScheme!=null &&
              this.identificationScheme.equals(other.getIdentificationScheme()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getRegistryObject() != null) {
            _hashCode += getRegistryObject().hashCode();
        }
        if (getIdentificationScheme() != null) {
            _hashCode += getIdentificationScheme().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalIdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExternalIdentifierType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("registryObject");
        attrField.setXmlName(new javax.xml.namespace.QName("", "registryObject"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("identificationScheme");
        attrField.setXmlName(new javax.xml.namespace.QName("", "identificationScheme"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "value"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LongName"));
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
