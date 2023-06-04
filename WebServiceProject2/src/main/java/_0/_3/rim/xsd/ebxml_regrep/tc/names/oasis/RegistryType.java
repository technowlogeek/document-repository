/**
 * RegistryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Mapping of the same named interface in ebRIM.
 */
public class RegistryType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private org.apache.axis.types.URI operator;  // attribute

    private java.lang.String specificationVersion;  // attribute

    private org.apache.axis.types.Duration replicationSyncLatency;  // attribute

    private org.apache.axis.types.Duration catalogingLatency;  // attribute

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryTypeConformanceProfile conformanceProfile;  // attribute

    public RegistryType() {
    }

    public RegistryType(
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
           org.apache.axis.types.URI operator,
           java.lang.String specificationVersion,
           org.apache.axis.types.Duration replicationSyncLatency,
           org.apache.axis.types.Duration catalogingLatency,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryTypeConformanceProfile conformanceProfile) {
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
        this.operator = operator;
        this.specificationVersion = specificationVersion;
        this.replicationSyncLatency = replicationSyncLatency;
        this.catalogingLatency = catalogingLatency;
        this.conformanceProfile = conformanceProfile;
    }


    /**
     * Gets the operator value for this RegistryType.
     * 
     * @return operator
     */
    public org.apache.axis.types.URI getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this RegistryType.
     * 
     * @param operator
     */
    public void setOperator(org.apache.axis.types.URI operator) {
        this.operator = operator;
    }


    /**
     * Gets the specificationVersion value for this RegistryType.
     * 
     * @return specificationVersion
     */
    public java.lang.String getSpecificationVersion() {
        return specificationVersion;
    }


    /**
     * Sets the specificationVersion value for this RegistryType.
     * 
     * @param specificationVersion
     */
    public void setSpecificationVersion(java.lang.String specificationVersion) {
        this.specificationVersion = specificationVersion;
    }


    /**
     * Gets the replicationSyncLatency value for this RegistryType.
     * 
     * @return replicationSyncLatency
     */
    public org.apache.axis.types.Duration getReplicationSyncLatency() {
        return replicationSyncLatency;
    }


    /**
     * Sets the replicationSyncLatency value for this RegistryType.
     * 
     * @param replicationSyncLatency
     */
    public void setReplicationSyncLatency(org.apache.axis.types.Duration replicationSyncLatency) {
        this.replicationSyncLatency = replicationSyncLatency;
    }


    /**
     * Gets the catalogingLatency value for this RegistryType.
     * 
     * @return catalogingLatency
     */
    public org.apache.axis.types.Duration getCatalogingLatency() {
        return catalogingLatency;
    }


    /**
     * Sets the catalogingLatency value for this RegistryType.
     * 
     * @param catalogingLatency
     */
    public void setCatalogingLatency(org.apache.axis.types.Duration catalogingLatency) {
        this.catalogingLatency = catalogingLatency;
    }


    /**
     * Gets the conformanceProfile value for this RegistryType.
     * 
     * @return conformanceProfile
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryTypeConformanceProfile getConformanceProfile() {
        return conformanceProfile;
    }


    /**
     * Sets the conformanceProfile value for this RegistryType.
     * 
     * @param conformanceProfile
     */
    public void setConformanceProfile(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryTypeConformanceProfile conformanceProfile) {
        this.conformanceProfile = conformanceProfile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistryType)) return false;
        RegistryType other = (RegistryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.specificationVersion==null && other.getSpecificationVersion()==null) || 
             (this.specificationVersion!=null &&
              this.specificationVersion.equals(other.getSpecificationVersion()))) &&
            ((this.replicationSyncLatency==null && other.getReplicationSyncLatency()==null) || 
             (this.replicationSyncLatency!=null &&
              this.replicationSyncLatency.equals(other.getReplicationSyncLatency()))) &&
            ((this.catalogingLatency==null && other.getCatalogingLatency()==null) || 
             (this.catalogingLatency!=null &&
              this.catalogingLatency.equals(other.getCatalogingLatency()))) &&
            ((this.conformanceProfile==null && other.getConformanceProfile()==null) || 
             (this.conformanceProfile!=null &&
              this.conformanceProfile.equals(other.getConformanceProfile())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getSpecificationVersion() != null) {
            _hashCode += getSpecificationVersion().hashCode();
        }
        if (getReplicationSyncLatency() != null) {
            _hashCode += getReplicationSyncLatency().hashCode();
        }
        if (getCatalogingLatency() != null) {
            _hashCode += getCatalogingLatency().hashCode();
        }
        if (getConformanceProfile() != null) {
            _hashCode += getConformanceProfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("specificationVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "specificationVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replicationSyncLatency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replicationSyncLatency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogingLatency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "catalogingLatency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conformanceProfile");
        attrField.setXmlName(new javax.xml.namespace.QName("", "conformanceProfile"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", ">RegistryType>conformanceProfile"));
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
