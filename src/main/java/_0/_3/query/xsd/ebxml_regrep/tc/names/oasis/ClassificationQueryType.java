/**
 * ClassificationQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class ClassificationQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType classificationSchemeQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType classifiedObjectQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType classificationNodeQuery;

    public ClassificationQueryType() {
    }

    public ClassificationQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType classificationSchemeQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType classifiedObjectQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType classificationNodeQuery) {
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
        this.classificationSchemeQuery = classificationSchemeQuery;
        this.classifiedObjectQuery = classifiedObjectQuery;
        this.classificationNodeQuery = classificationNodeQuery;
    }


    /**
     * Gets the classificationSchemeQuery value for this ClassificationQueryType.
     * 
     * @return classificationSchemeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }


    /**
     * Sets the classificationSchemeQuery value for this ClassificationQueryType.
     * 
     * @param classificationSchemeQuery
     */
    public void setClassificationSchemeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType classificationSchemeQuery) {
        this.classificationSchemeQuery = classificationSchemeQuery;
    }


    /**
     * Gets the classifiedObjectQuery value for this ClassificationQueryType.
     * 
     * @return classifiedObjectQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType getClassifiedObjectQuery() {
        return classifiedObjectQuery;
    }


    /**
     * Sets the classifiedObjectQuery value for this ClassificationQueryType.
     * 
     * @param classifiedObjectQuery
     */
    public void setClassifiedObjectQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType classifiedObjectQuery) {
        this.classifiedObjectQuery = classifiedObjectQuery;
    }


    /**
     * Gets the classificationNodeQuery value for this ClassificationQueryType.
     * 
     * @return classificationNodeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getClassificationNodeQuery() {
        return classificationNodeQuery;
    }


    /**
     * Sets the classificationNodeQuery value for this ClassificationQueryType.
     * 
     * @param classificationNodeQuery
     */
    public void setClassificationNodeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType classificationNodeQuery) {
        this.classificationNodeQuery = classificationNodeQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassificationQueryType)) return false;
        ClassificationQueryType other = (ClassificationQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.classificationSchemeQuery==null && other.getClassificationSchemeQuery()==null) || 
             (this.classificationSchemeQuery!=null &&
              this.classificationSchemeQuery.equals(other.getClassificationSchemeQuery()))) &&
            ((this.classifiedObjectQuery==null && other.getClassifiedObjectQuery()==null) || 
             (this.classifiedObjectQuery!=null &&
              this.classifiedObjectQuery.equals(other.getClassifiedObjectQuery()))) &&
            ((this.classificationNodeQuery==null && other.getClassificationNodeQuery()==null) || 
             (this.classificationNodeQuery!=null &&
              this.classificationNodeQuery.equals(other.getClassificationNodeQuery())));
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
        if (getClassificationSchemeQuery() != null) {
            _hashCode += getClassificationSchemeQuery().hashCode();
        }
        if (getClassifiedObjectQuery() != null) {
            _hashCode += getClassifiedObjectQuery().hashCode();
        }
        if (getClassificationNodeQuery() != null) {
            _hashCode += getClassificationNodeQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassificationQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationSchemeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationSchemeQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationSchemeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classifiedObjectQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassifiedObjectQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationNodeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQuery"));
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
