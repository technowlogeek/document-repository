/**
 * ClassificationSchemeQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class ClassificationSchemeQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType[] childrenQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType nodeTypeQuery;

    public ClassificationSchemeQueryType() {
    }

    public ClassificationSchemeQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType[] childrenQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType nodeTypeQuery) {
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
        this.childrenQuery = childrenQuery;
        this.nodeTypeQuery = nodeTypeQuery;
    }


    /**
     * Gets the childrenQuery value for this ClassificationSchemeQueryType.
     * 
     * @return childrenQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType[] getChildrenQuery() {
        return childrenQuery;
    }


    /**
     * Sets the childrenQuery value for this ClassificationSchemeQueryType.
     * 
     * @param childrenQuery
     */
    public void setChildrenQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType[] childrenQuery) {
        this.childrenQuery = childrenQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getChildrenQuery(int i) {
        return this.childrenQuery[i];
    }

    public void setChildrenQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType _value) {
        this.childrenQuery[i] = _value;
    }


    /**
     * Gets the nodeTypeQuery value for this ClassificationSchemeQueryType.
     * 
     * @return nodeTypeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getNodeTypeQuery() {
        return nodeTypeQuery;
    }


    /**
     * Sets the nodeTypeQuery value for this ClassificationSchemeQueryType.
     * 
     * @param nodeTypeQuery
     */
    public void setNodeTypeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType nodeTypeQuery) {
        this.nodeTypeQuery = nodeTypeQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassificationSchemeQueryType)) return false;
        ClassificationSchemeQueryType other = (ClassificationSchemeQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.childrenQuery==null && other.getChildrenQuery()==null) || 
             (this.childrenQuery!=null &&
              java.util.Arrays.equals(this.childrenQuery, other.getChildrenQuery()))) &&
            ((this.nodeTypeQuery==null && other.getNodeTypeQuery()==null) || 
             (this.nodeTypeQuery!=null &&
              this.nodeTypeQuery.equals(other.getNodeTypeQuery())));
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
        if (getChildrenQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildrenQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildrenQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNodeTypeQuery() != null) {
            _hashCode += getNodeTypeQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassificationSchemeQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationSchemeQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childrenQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ChildrenQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeTypeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "NodeTypeQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType"));
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
