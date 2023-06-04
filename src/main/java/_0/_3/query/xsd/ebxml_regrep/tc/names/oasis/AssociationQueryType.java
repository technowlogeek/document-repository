/**
 * AssociationQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class AssociationQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType associationTypeQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType sourceObjectQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType targetObjectQuery;

    public AssociationQueryType() {
    }

    public AssociationQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType associationTypeQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType sourceObjectQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType targetObjectQuery) {
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
        this.associationTypeQuery = associationTypeQuery;
        this.sourceObjectQuery = sourceObjectQuery;
        this.targetObjectQuery = targetObjectQuery;
    }


    /**
     * Gets the associationTypeQuery value for this AssociationQueryType.
     * 
     * @return associationTypeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getAssociationTypeQuery() {
        return associationTypeQuery;
    }


    /**
     * Sets the associationTypeQuery value for this AssociationQueryType.
     * 
     * @param associationTypeQuery
     */
    public void setAssociationTypeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType associationTypeQuery) {
        this.associationTypeQuery = associationTypeQuery;
    }


    /**
     * Gets the sourceObjectQuery value for this AssociationQueryType.
     * 
     * @return sourceObjectQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType getSourceObjectQuery() {
        return sourceObjectQuery;
    }


    /**
     * Sets the sourceObjectQuery value for this AssociationQueryType.
     * 
     * @param sourceObjectQuery
     */
    public void setSourceObjectQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType sourceObjectQuery) {
        this.sourceObjectQuery = sourceObjectQuery;
    }


    /**
     * Gets the targetObjectQuery value for this AssociationQueryType.
     * 
     * @return targetObjectQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType getTargetObjectQuery() {
        return targetObjectQuery;
    }


    /**
     * Sets the targetObjectQuery value for this AssociationQueryType.
     * 
     * @param targetObjectQuery
     */
    public void setTargetObjectQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType targetObjectQuery) {
        this.targetObjectQuery = targetObjectQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationQueryType)) return false;
        AssociationQueryType other = (AssociationQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationTypeQuery==null && other.getAssociationTypeQuery()==null) || 
             (this.associationTypeQuery!=null &&
              this.associationTypeQuery.equals(other.getAssociationTypeQuery()))) &&
            ((this.sourceObjectQuery==null && other.getSourceObjectQuery()==null) || 
             (this.sourceObjectQuery!=null &&
              this.sourceObjectQuery.equals(other.getSourceObjectQuery()))) &&
            ((this.targetObjectQuery==null && other.getTargetObjectQuery()==null) || 
             (this.targetObjectQuery!=null &&
              this.targetObjectQuery.equals(other.getTargetObjectQuery())));
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
        if (getAssociationTypeQuery() != null) {
            _hashCode += getAssociationTypeQuery().hashCode();
        }
        if (getSourceObjectQuery() != null) {
            _hashCode += getSourceObjectQuery().hashCode();
        }
        if (getTargetObjectQuery() != null) {
            _hashCode += getTargetObjectQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AssociationQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationTypeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AssociationTypeQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceObjectQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SourceObjectQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetObjectQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "TargetObjectQuery"));
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
