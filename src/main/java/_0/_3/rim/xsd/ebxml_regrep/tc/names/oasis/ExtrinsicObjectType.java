/**
 * ExtrinsicObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * ExtrinsicObject is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 */
public class ExtrinsicObjectType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType contentVersionInfo;

    private java.lang.String mimeType;  // attribute

    private boolean isOpaque;  // attribute

    public ExtrinsicObjectType() {
    }

    public ExtrinsicObjectType(
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
           java.lang.String mimeType,
           boolean isOpaque,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType contentVersionInfo) {
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
        this.mimeType = mimeType;
        this.isOpaque = isOpaque;
        this.contentVersionInfo = contentVersionInfo;
    }


    /**
     * Gets the contentVersionInfo value for this ExtrinsicObjectType.
     * 
     * @return contentVersionInfo
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType getContentVersionInfo() {
        return contentVersionInfo;
    }


    /**
     * Sets the contentVersionInfo value for this ExtrinsicObjectType.
     * 
     * @param contentVersionInfo
     */
    public void setContentVersionInfo(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType contentVersionInfo) {
        this.contentVersionInfo = contentVersionInfo;
    }


    /**
     * Gets the mimeType value for this ExtrinsicObjectType.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this ExtrinsicObjectType.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the isOpaque value for this ExtrinsicObjectType.
     * 
     * @return isOpaque
     */
    public boolean isIsOpaque() {
        return isOpaque;
    }


    /**
     * Sets the isOpaque value for this ExtrinsicObjectType.
     * 
     * @param isOpaque
     */
    public void setIsOpaque(boolean isOpaque) {
        this.isOpaque = isOpaque;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtrinsicObjectType)) return false;
        ExtrinsicObjectType other = (ExtrinsicObjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentVersionInfo==null && other.getContentVersionInfo()==null) || 
             (this.contentVersionInfo!=null &&
              this.contentVersionInfo.equals(other.getContentVersionInfo()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            this.isOpaque == other.isIsOpaque();
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
        if (getContentVersionInfo() != null) {
            _hashCode += getContentVersionInfo().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        _hashCode += (isIsOpaque() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtrinsicObjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExtrinsicObjectType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mimeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LongName"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isOpaque");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isOpaque"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentVersionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ContentVersionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "VersionInfoType"));
        elemField.setMinOccurs(0);
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
