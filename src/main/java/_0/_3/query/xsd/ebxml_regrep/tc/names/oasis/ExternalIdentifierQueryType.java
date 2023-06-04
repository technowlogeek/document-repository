/**
 * ExternalIdentifierQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class ExternalIdentifierQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType registryObjectQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType identificationSchemeQuery;

    public ExternalIdentifierQueryType() {
    }

    public ExternalIdentifierQueryType(
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType primaryFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType[] slotBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType nameBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType descriptionBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType versionInfoFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType[] classificationQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType[] externalIdentifierQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType objectTypeQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType statusQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] sourceAssociationQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] targetAssociationQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType registryObjectQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType identificationSchemeQuery) {
        super(
            primaryFilter,
            slotBranch,
            nameBranch,
            descriptionBranch,
            versionInfoFilter,
            classificationQuery,
            externalIdentifierQuery,
            objectTypeQuery,
            statusQuery,
            sourceAssociationQuery,
            targetAssociationQuery);
        this.registryObjectQuery = registryObjectQuery;
        this.identificationSchemeQuery = identificationSchemeQuery;
    }


    /**
     * Gets the registryObjectQuery value for this ExternalIdentifierQueryType.
     * 
     * @return registryObjectQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType getRegistryObjectQuery() {
        return registryObjectQuery;
    }


    /**
     * Sets the registryObjectQuery value for this ExternalIdentifierQueryType.
     * 
     * @param registryObjectQuery
     */
    public void setRegistryObjectQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType registryObjectQuery) {
        this.registryObjectQuery = registryObjectQuery;
    }


    /**
     * Gets the identificationSchemeQuery value for this ExternalIdentifierQueryType.
     * 
     * @return identificationSchemeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType getIdentificationSchemeQuery() {
        return identificationSchemeQuery;
    }


    /**
     * Sets the identificationSchemeQuery value for this ExternalIdentifierQueryType.
     * 
     * @param identificationSchemeQuery
     */
    public void setIdentificationSchemeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType identificationSchemeQuery) {
        this.identificationSchemeQuery = identificationSchemeQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalIdentifierQueryType)) return false;
        ExternalIdentifierQueryType other = (ExternalIdentifierQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registryObjectQuery==null && other.getRegistryObjectQuery()==null) || 
             (this.registryObjectQuery!=null &&
              this.registryObjectQuery.equals(other.getRegistryObjectQuery()))) &&
            ((this.identificationSchemeQuery==null && other.getIdentificationSchemeQuery()==null) || 
             (this.identificationSchemeQuery!=null &&
              this.identificationSchemeQuery.equals(other.getIdentificationSchemeQuery())));
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
        if (getRegistryObjectQuery() != null) {
            _hashCode += getRegistryObjectQuery().hashCode();
        }
        if (getIdentificationSchemeQuery() != null) {
            _hashCode += getIdentificationSchemeQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalIdentifierQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalIdentifierQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryObjectQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationSchemeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "IdentificationSchemeQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationSchemeQueryType"));
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
