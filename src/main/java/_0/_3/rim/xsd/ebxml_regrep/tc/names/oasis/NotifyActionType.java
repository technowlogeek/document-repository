/**
 * NotifyActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Abstract Base type for all types of Notify Actions
 */
public class NotifyActionType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType  implements java.io.Serializable {
    private org.apache.axis.types.URI notificationOption;  // attribute

    private org.apache.axis.types.URI endPoint;  // attribute

    public NotifyActionType() {
    }

    public NotifyActionType(
           org.apache.axis.types.URI notificationOption,
           org.apache.axis.types.URI endPoint) {
        this.notificationOption = notificationOption;
        this.endPoint = endPoint;
    }


    /**
     * Gets the notificationOption value for this NotifyActionType.
     * 
     * @return notificationOption
     */
    public org.apache.axis.types.URI getNotificationOption() {
        return notificationOption;
    }


    /**
     * Sets the notificationOption value for this NotifyActionType.
     * 
     * @param notificationOption
     */
    public void setNotificationOption(org.apache.axis.types.URI notificationOption) {
        this.notificationOption = notificationOption;
    }


    /**
     * Gets the endPoint value for this NotifyActionType.
     * 
     * @return endPoint
     */
    public org.apache.axis.types.URI getEndPoint() {
        return endPoint;
    }


    /**
     * Sets the endPoint value for this NotifyActionType.
     * 
     * @param endPoint
     */
    public void setEndPoint(org.apache.axis.types.URI endPoint) {
        this.endPoint = endPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyActionType)) return false;
        NotifyActionType other = (NotifyActionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationOption==null && other.getNotificationOption()==null) || 
             (this.notificationOption!=null &&
              this.notificationOption.equals(other.getNotificationOption()))) &&
            ((this.endPoint==null && other.getEndPoint()==null) || 
             (this.endPoint!=null &&
              this.endPoint.equals(other.getEndPoint())));
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
        if (getNotificationOption() != null) {
            _hashCode += getNotificationOption().hashCode();
        }
        if (getEndPoint() != null) {
            _hashCode += getEndPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyActionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "NotifyActionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationOption");
        attrField.setXmlName(new javax.xml.namespace.QName("", "notificationOption"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("endPoint");
        attrField.setXmlName(new javax.xml.namespace.QName("", "endPoint"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
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
