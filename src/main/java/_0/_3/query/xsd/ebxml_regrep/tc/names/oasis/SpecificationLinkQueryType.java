/**
 * SpecificationLinkQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class SpecificationLinkQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType usageDescriptionBranch;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType serviceBindingQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType specificationObjectQuery;

    public SpecificationLinkQueryType() {
    }

    public SpecificationLinkQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType usageDescriptionBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType serviceBindingQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType specificationObjectQuery) {
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
        this.usageDescriptionBranch = usageDescriptionBranch;
        this.serviceBindingQuery = serviceBindingQuery;
        this.specificationObjectQuery = specificationObjectQuery;
    }


    /**
     * Gets the usageDescriptionBranch value for this SpecificationLinkQueryType.
     * 
     * @return usageDescriptionBranch
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType getUsageDescriptionBranch() {
        return usageDescriptionBranch;
    }


    /**
     * Sets the usageDescriptionBranch value for this SpecificationLinkQueryType.
     * 
     * @param usageDescriptionBranch
     */
    public void setUsageDescriptionBranch(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType usageDescriptionBranch) {
        this.usageDescriptionBranch = usageDescriptionBranch;
    }


    /**
     * Gets the serviceBindingQuery value for this SpecificationLinkQueryType.
     * 
     * @return serviceBindingQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType getServiceBindingQuery() {
        return serviceBindingQuery;
    }


    /**
     * Sets the serviceBindingQuery value for this SpecificationLinkQueryType.
     * 
     * @param serviceBindingQuery
     */
    public void setServiceBindingQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType serviceBindingQuery) {
        this.serviceBindingQuery = serviceBindingQuery;
    }


    /**
     * Gets the specificationObjectQuery value for this SpecificationLinkQueryType.
     * 
     * @return specificationObjectQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType getSpecificationObjectQuery() {
        return specificationObjectQuery;
    }


    /**
     * Sets the specificationObjectQuery value for this SpecificationLinkQueryType.
     * 
     * @param specificationObjectQuery
     */
    public void setSpecificationObjectQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType specificationObjectQuery) {
        this.specificationObjectQuery = specificationObjectQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecificationLinkQueryType)) return false;
        SpecificationLinkQueryType other = (SpecificationLinkQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.usageDescriptionBranch==null && other.getUsageDescriptionBranch()==null) || 
             (this.usageDescriptionBranch!=null &&
              this.usageDescriptionBranch.equals(other.getUsageDescriptionBranch()))) &&
            ((this.serviceBindingQuery==null && other.getServiceBindingQuery()==null) || 
             (this.serviceBindingQuery!=null &&
              this.serviceBindingQuery.equals(other.getServiceBindingQuery()))) &&
            ((this.specificationObjectQuery==null && other.getSpecificationObjectQuery()==null) || 
             (this.specificationObjectQuery!=null &&
              this.specificationObjectQuery.equals(other.getSpecificationObjectQuery())));
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
        if (getUsageDescriptionBranch() != null) {
            _hashCode += getUsageDescriptionBranch().hashCode();
        }
        if (getServiceBindingQuery() != null) {
            _hashCode += getServiceBindingQuery().hashCode();
        }
        if (getSpecificationObjectQuery() != null) {
            _hashCode += getSpecificationObjectQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecificationLinkQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SpecificationLinkQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageDescriptionBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "UsageDescriptionBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "InternationalStringBranchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceBindingQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceBindingQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceBindingQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificationObjectQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SpecificationObjectQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType"));
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
