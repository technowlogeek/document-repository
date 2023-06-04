/**
 * AuditableEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * An Event that forms an audit trail in ebXML Registry.
 */
public class AuditableEventType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType affectedObjects;

    private org.apache.axis.types.URI eventType;  // attribute

    private java.util.Calendar timestamp;  // attribute

    private org.apache.axis.types.URI user;  // attribute

    private org.apache.axis.types.URI requestId;  // attribute

    public AuditableEventType() {
    }

    public AuditableEventType(
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
           org.apache.axis.types.URI eventType,
           java.util.Calendar timestamp,
           org.apache.axis.types.URI user,
           org.apache.axis.types.URI requestId,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType affectedObjects) {
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
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.user = user;
        this.requestId = requestId;
        this.affectedObjects = affectedObjects;
    }


    /**
     * Gets the affectedObjects value for this AuditableEventType.
     * 
     * @return affectedObjects
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType getAffectedObjects() {
        return affectedObjects;
    }


    /**
     * Sets the affectedObjects value for this AuditableEventType.
     * 
     * @param affectedObjects
     */
    public void setAffectedObjects(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType affectedObjects) {
        this.affectedObjects = affectedObjects;
    }


    /**
     * Gets the eventType value for this AuditableEventType.
     * 
     * @return eventType
     */
    public org.apache.axis.types.URI getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this AuditableEventType.
     * 
     * @param eventType
     */
    public void setEventType(org.apache.axis.types.URI eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the timestamp value for this AuditableEventType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this AuditableEventType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the user value for this AuditableEventType.
     * 
     * @return user
     */
    public org.apache.axis.types.URI getUser() {
        return user;
    }


    /**
     * Sets the user value for this AuditableEventType.
     * 
     * @param user
     */
    public void setUser(org.apache.axis.types.URI user) {
        this.user = user;
    }


    /**
     * Gets the requestId value for this AuditableEventType.
     * 
     * @return requestId
     */
    public org.apache.axis.types.URI getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this AuditableEventType.
     * 
     * @param requestId
     */
    public void setRequestId(org.apache.axis.types.URI requestId) {
        this.requestId = requestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditableEventType)) return false;
        AuditableEventType other = (AuditableEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.affectedObjects==null && other.getAffectedObjects()==null) || 
             (this.affectedObjects!=null &&
              this.affectedObjects.equals(other.getAffectedObjects()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId())));
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
        if (getAffectedObjects() != null) {
            _hashCode += getAffectedObjects().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditableEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AuditableEventType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timestamp");
        attrField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("user");
        attrField.setXmlName(new javax.xml.namespace.QName("", "user"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "requestId"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "affectedObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefListType"));
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
