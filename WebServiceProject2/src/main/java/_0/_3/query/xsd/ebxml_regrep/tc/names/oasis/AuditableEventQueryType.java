/**
 * AuditableEventQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class AuditableEventQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType[] affectedObjectQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType eventTypeQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.UserQueryType userQuery;

    public AuditableEventQueryType() {
    }

    public AuditableEventQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType[] affectedObjectQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType eventTypeQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.UserQueryType userQuery) {
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
        this.affectedObjectQuery = affectedObjectQuery;
        this.eventTypeQuery = eventTypeQuery;
        this.userQuery = userQuery;
    }


    /**
     * Gets the affectedObjectQuery value for this AuditableEventQueryType.
     * 
     * @return affectedObjectQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType[] getAffectedObjectQuery() {
        return affectedObjectQuery;
    }


    /**
     * Sets the affectedObjectQuery value for this AuditableEventQueryType.
     * 
     * @param affectedObjectQuery
     */
    public void setAffectedObjectQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType[] affectedObjectQuery) {
        this.affectedObjectQuery = affectedObjectQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType getAffectedObjectQuery(int i) {
        return this.affectedObjectQuery[i];
    }

    public void setAffectedObjectQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType _value) {
        this.affectedObjectQuery[i] = _value;
    }


    /**
     * Gets the eventTypeQuery value for this AuditableEventQueryType.
     * 
     * @return eventTypeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getEventTypeQuery() {
        return eventTypeQuery;
    }


    /**
     * Sets the eventTypeQuery value for this AuditableEventQueryType.
     * 
     * @param eventTypeQuery
     */
    public void setEventTypeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType eventTypeQuery) {
        this.eventTypeQuery = eventTypeQuery;
    }


    /**
     * Gets the userQuery value for this AuditableEventQueryType.
     * 
     * @return userQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.UserQueryType getUserQuery() {
        return userQuery;
    }


    /**
     * Sets the userQuery value for this AuditableEventQueryType.
     * 
     * @param userQuery
     */
    public void setUserQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.UserQueryType userQuery) {
        this.userQuery = userQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditableEventQueryType)) return false;
        AuditableEventQueryType other = (AuditableEventQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.affectedObjectQuery==null && other.getAffectedObjectQuery()==null) || 
             (this.affectedObjectQuery!=null &&
              java.util.Arrays.equals(this.affectedObjectQuery, other.getAffectedObjectQuery()))) &&
            ((this.eventTypeQuery==null && other.getEventTypeQuery()==null) || 
             (this.eventTypeQuery!=null &&
              this.eventTypeQuery.equals(other.getEventTypeQuery()))) &&
            ((this.userQuery==null && other.getUserQuery()==null) || 
             (this.userQuery!=null &&
              this.userQuery.equals(other.getUserQuery())));
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
        if (getAffectedObjectQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffectedObjectQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffectedObjectQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventTypeQuery() != null) {
            _hashCode += getEventTypeQuery().hashCode();
        }
        if (getUserQuery() != null) {
            _hashCode += getUserQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditableEventQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AuditableEventQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedObjectQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AffectedObjectQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "EventTypeQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "UserQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "UserQueryType"));
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
