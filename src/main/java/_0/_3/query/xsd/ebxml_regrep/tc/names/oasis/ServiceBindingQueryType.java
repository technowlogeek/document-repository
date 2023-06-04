/**
 * ServiceBindingQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class ServiceBindingQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceQueryType serviceQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType[] specificationLinkQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType targetBindingQuery;

    public ServiceBindingQueryType() {
    }

    public ServiceBindingQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceQueryType serviceQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType[] specificationLinkQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType targetBindingQuery) {
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
        this.serviceQuery = serviceQuery;
        this.specificationLinkQuery = specificationLinkQuery;
        this.targetBindingQuery = targetBindingQuery;
    }


    /**
     * Gets the serviceQuery value for this ServiceBindingQueryType.
     * 
     * @return serviceQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceQueryType getServiceQuery() {
        return serviceQuery;
    }


    /**
     * Sets the serviceQuery value for this ServiceBindingQueryType.
     * 
     * @param serviceQuery
     */
    public void setServiceQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceQueryType serviceQuery) {
        this.serviceQuery = serviceQuery;
    }


    /**
     * Gets the specificationLinkQuery value for this ServiceBindingQueryType.
     * 
     * @return specificationLinkQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType[] getSpecificationLinkQuery() {
        return specificationLinkQuery;
    }


    /**
     * Sets the specificationLinkQuery value for this ServiceBindingQueryType.
     * 
     * @param specificationLinkQuery
     */
    public void setSpecificationLinkQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType[] specificationLinkQuery) {
        this.specificationLinkQuery = specificationLinkQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType getSpecificationLinkQuery(int i) {
        return this.specificationLinkQuery[i];
    }

    public void setSpecificationLinkQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType _value) {
        this.specificationLinkQuery[i] = _value;
    }


    /**
     * Gets the targetBindingQuery value for this ServiceBindingQueryType.
     * 
     * @return targetBindingQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType getTargetBindingQuery() {
        return targetBindingQuery;
    }


    /**
     * Sets the targetBindingQuery value for this ServiceBindingQueryType.
     * 
     * @param targetBindingQuery
     */
    public void setTargetBindingQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType targetBindingQuery) {
        this.targetBindingQuery = targetBindingQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceBindingQueryType)) return false;
        ServiceBindingQueryType other = (ServiceBindingQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceQuery==null && other.getServiceQuery()==null) || 
             (this.serviceQuery!=null &&
              this.serviceQuery.equals(other.getServiceQuery()))) &&
            ((this.specificationLinkQuery==null && other.getSpecificationLinkQuery()==null) || 
             (this.specificationLinkQuery!=null &&
              java.util.Arrays.equals(this.specificationLinkQuery, other.getSpecificationLinkQuery()))) &&
            ((this.targetBindingQuery==null && other.getTargetBindingQuery()==null) || 
             (this.targetBindingQuery!=null &&
              this.targetBindingQuery.equals(other.getTargetBindingQuery())));
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
        if (getServiceQuery() != null) {
            _hashCode += getServiceQuery().hashCode();
        }
        if (getSpecificationLinkQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecificationLinkQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecificationLinkQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetBindingQuery() != null) {
            _hashCode += getTargetBindingQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceBindingQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceBindingQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificationLinkQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SpecificationLinkQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SpecificationLinkQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBindingQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "TargetBindingQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceBindingQueryType"));
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
