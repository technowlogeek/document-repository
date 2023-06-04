/**
 * AdhocQueryQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class AdhocQueryQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.QueryExpressionBranchType queryExpressionBranch;

    public AdhocQueryQueryType() {
    }

    public AdhocQueryQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.QueryExpressionBranchType queryExpressionBranch) {
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
        this.queryExpressionBranch = queryExpressionBranch;
    }


    /**
     * Gets the queryExpressionBranch value for this AdhocQueryQueryType.
     * 
     * @return queryExpressionBranch
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.QueryExpressionBranchType getQueryExpressionBranch() {
        return queryExpressionBranch;
    }


    /**
     * Sets the queryExpressionBranch value for this AdhocQueryQueryType.
     * 
     * @param queryExpressionBranch
     */
    public void setQueryExpressionBranch(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.QueryExpressionBranchType queryExpressionBranch) {
        this.queryExpressionBranch = queryExpressionBranch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdhocQueryQueryType)) return false;
        AdhocQueryQueryType other = (AdhocQueryQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.queryExpressionBranch==null && other.getQueryExpressionBranch()==null) || 
             (this.queryExpressionBranch!=null &&
              this.queryExpressionBranch.equals(other.getQueryExpressionBranch())));
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
        if (getQueryExpressionBranch() != null) {
            _hashCode += getQueryExpressionBranch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdhocQueryQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AdhocQueryQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryExpressionBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "QueryExpressionBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "QueryExpressionBranchType"));
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
