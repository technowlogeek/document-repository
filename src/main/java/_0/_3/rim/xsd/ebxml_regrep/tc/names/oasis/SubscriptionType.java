/**
 * SubscriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * A Subscription for specified Events in an ebXML V3+ registry.
 */
public class SubscriptionType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType[] action;

    private org.apache.axis.types.URI selector;  // attribute

    private java.util.Calendar startTime;  // attribute

    private java.util.Calendar endTime;  // attribute

    private org.apache.axis.types.Duration notificationInterval;  // attribute

    public SubscriptionType() {
    }

    public SubscriptionType(
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
           org.apache.axis.types.URI selector,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           org.apache.axis.types.Duration notificationInterval,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType[] action) {
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
        this.selector = selector;
        this.startTime = startTime;
        this.endTime = endTime;
        this.notificationInterval = notificationInterval;
        this.action = action;
    }


    /**
     * Gets the action value for this SubscriptionType.
     * 
     * @return action
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType[] getAction() {
        return action;
    }


    /**
     * Sets the action value for this SubscriptionType.
     * 
     * @param action
     */
    public void setAction(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType[] action) {
        this.action = action;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType getAction(int i) {
        return this.action[i];
    }

    public void setAction(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType _value) {
        this.action[i] = _value;
    }


    /**
     * Gets the selector value for this SubscriptionType.
     * 
     * @return selector
     */
    public org.apache.axis.types.URI getSelector() {
        return selector;
    }


    /**
     * Sets the selector value for this SubscriptionType.
     * 
     * @param selector
     */
    public void setSelector(org.apache.axis.types.URI selector) {
        this.selector = selector;
    }


    /**
     * Gets the startTime value for this SubscriptionType.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SubscriptionType.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this SubscriptionType.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this SubscriptionType.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the notificationInterval value for this SubscriptionType.
     * 
     * @return notificationInterval
     */
    public org.apache.axis.types.Duration getNotificationInterval() {
        return notificationInterval;
    }


    /**
     * Sets the notificationInterval value for this SubscriptionType.
     * 
     * @param notificationInterval
     */
    public void setNotificationInterval(org.apache.axis.types.Duration notificationInterval) {
        this.notificationInterval = notificationInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionType)) return false;
        SubscriptionType other = (SubscriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              java.util.Arrays.equals(this.action, other.getAction()))) &&
            ((this.selector==null && other.getSelector()==null) || 
             (this.selector!=null &&
              this.selector.equals(other.getSelector()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.notificationInterval==null && other.getNotificationInterval()==null) || 
             (this.notificationInterval!=null &&
              this.notificationInterval.equals(other.getNotificationInterval())));
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
        if (getAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelector() != null) {
            _hashCode += getSelector().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getNotificationInterval() != null) {
            _hashCode += getNotificationInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SubscriptionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("selector");
        attrField.setXmlName(new javax.xml.namespace.QName("", "selector"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("endTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationInterval");
        attrField.setXmlName(new javax.xml.namespace.QName("", "notificationInterval"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Action"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
