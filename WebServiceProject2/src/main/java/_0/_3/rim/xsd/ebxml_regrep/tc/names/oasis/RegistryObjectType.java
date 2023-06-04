/**
 * RegistryObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;

public class RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType name;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType description;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType versionInfo;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType[] classification;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType[] externalIdentifier;

    private org.apache.axis.types.URI lid;  // attribute

    private org.apache.axis.types.URI objectType;  // attribute

    private org.apache.axis.types.URI status;  // attribute

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] identifiableType;  // attribute

    public RegistryObjectType() {
    }

    public RegistryObjectType(
           org.apache.axis.types.URI id,
           org.apache.axis.types.URI home,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] param1,
           org.apache.axis.types.URI lid,
           org.apache.axis.types.URI objectType,
           org.apache.axis.types.URI status,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType name,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType description,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType versionInfo,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType[] classification,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType[] externalIdentifier) {

        this.identifiableType = param1;
        this.lid = lid;
        this.objectType = objectType;
        this.status = status;
        this.name = name;
        this.description = description;
        this.versionInfo = versionInfo;
        this.classification = classification;
        this.externalIdentifier = externalIdentifier;
    }


    /**
     * Gets the name value for this RegistryObjectType.
     * 
     * @return name
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType getName() {
        return name;
    }


    /**
     * Sets the name value for this RegistryObjectType.
     * 
     * @param name
     */
    public void setName(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType name) {
        this.name = name;
    }


    /**
     * Gets the description value for this RegistryObjectType.
     * 
     * @return description
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RegistryObjectType.
     * 
     * @param description
     */
    public void setDescription(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType description) {
        this.description = description;
    }


    /**
     * Gets the versionInfo value for this RegistryObjectType.
     * 
     * @return versionInfo
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType getVersionInfo() {
        return versionInfo;
    }


    /**
     * Sets the versionInfo value for this RegistryObjectType.
     * 
     * @param versionInfo
     */
    public void setVersionInfo(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType versionInfo) {
        this.versionInfo = versionInfo;
    }


    /**
     * Gets the classification value for this RegistryObjectType.
     * 
     * @return classification
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType[] getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this RegistryObjectType.
     * 
     * @param classification
     */
    public void setClassification(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType[] classification) {
        this.classification = classification;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType getClassification(int i) {
        return this.classification[i];
    }

    public void setClassification(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType _value) {
        this.classification[i] = _value;
    }


    /**
     * Gets the externalIdentifier value for this RegistryObjectType.
     * 
     * @return externalIdentifier
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType[] getExternalIdentifier() {
        return externalIdentifier;
    }


    /**
     * Sets the externalIdentifier value for this RegistryObjectType.
     * 
     * @param externalIdentifier
     */
    public void setExternalIdentifier(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType[] externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType getExternalIdentifier(int i) {
        return this.externalIdentifier[i];
    }

    public void setExternalIdentifier(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType _value) {
        this.externalIdentifier[i] = _value;
    }


    /**
     * Gets the lid value for this RegistryObjectType.
     * 
     * @return lid
     */
    public org.apache.axis.types.URI getLid() {
        return lid;
    }


    /**
     * Sets the lid value for this RegistryObjectType.
     * 
     * @param lid
     */
    public void setLid(org.apache.axis.types.URI lid) {
        this.lid = lid;
    }


    /**
     * Gets the objectType value for this RegistryObjectType.
     * 
     * @return objectType
     */
    public org.apache.axis.types.URI getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this RegistryObjectType.
     * 
     * @param objectType
     */
    public void setObjectType(org.apache.axis.types.URI objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the status value for this RegistryObjectType.
     * 
     * @return status
     */
    public org.apache.axis.types.URI getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RegistryObjectType.
     * 
     * @param status
     */
    public void setStatus(org.apache.axis.types.URI status) {
        this.status = status;
    }


    /**
     * Gets the identifiableType value for this RegistryObjectType.
     * 
     * @return identifiableType
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] getIdentifiableType() {
        return identifiableType;
    }


    /**
     * Sets the identifiableType value for this RegistryObjectType.
     * 
     * @param identifiableType
     */
    public void setIdentifiableType(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] identifiableType) {
        this.identifiableType = identifiableType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistryObjectType)) return false;
        RegistryObjectType other = (RegistryObjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.versionInfo==null && other.getVersionInfo()==null) || 
             (this.versionInfo!=null &&
              this.versionInfo.equals(other.getVersionInfo()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              java.util.Arrays.equals(this.classification, other.getClassification()))) &&
            ((this.externalIdentifier==null && other.getExternalIdentifier()==null) || 
             (this.externalIdentifier!=null &&
              java.util.Arrays.equals(this.externalIdentifier, other.getExternalIdentifier()))) &&
            ((this.lid==null && other.getLid()==null) || 
             (this.lid!=null &&
              this.lid.equals(other.getLid()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.identifiableType==null && other.getIdentifiableType()==null) || 
             (this.identifiableType!=null &&
              java.util.Arrays.equals(this.identifiableType, other.getIdentifiableType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getVersionInfo() != null) {
            _hashCode += getVersionInfo().hashCode();
        }
        if (getClassification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalIdentifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLid() != null) {
            _hashCode += getLid().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIdentifiableType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifiableType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifiableType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistryObjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryObjectType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "lid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objectType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "objectType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "InternationalStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "InternationalStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "VersionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "VersionInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Classification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExternalIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExternalIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
