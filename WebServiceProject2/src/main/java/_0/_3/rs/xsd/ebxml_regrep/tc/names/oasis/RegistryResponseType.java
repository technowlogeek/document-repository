/**
 * RegistryResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rs.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Base type for all ebXML Registry responses
 */
public class RegistryResponseType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] responseSlotList;

    private _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError[] registryErrorList;

    private org.apache.axis.types.URI status;  // attribute

    private org.apache.axis.types.URI requestId;  // attribute

    public RegistryResponseType() {
    }

    public RegistryResponseType(
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] responseSlotList,
           _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError[] registryErrorList,
           org.apache.axis.types.URI status,
           org.apache.axis.types.URI requestId) {
           this.responseSlotList = responseSlotList;
           this.registryErrorList = registryErrorList;
           this.status = status;
           this.requestId = requestId;
    }


    /**
     * Gets the responseSlotList value for this RegistryResponseType.
     * 
     * @return responseSlotList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] getResponseSlotList() {
        return responseSlotList;
    }


    /**
     * Sets the responseSlotList value for this RegistryResponseType.
     * 
     * @param responseSlotList
     */
    public void setResponseSlotList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] responseSlotList) {
        this.responseSlotList = responseSlotList;
    }


    /**
     * Gets the registryErrorList value for this RegistryResponseType.
     * 
     * @return registryErrorList
     */
    public _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError[] getRegistryErrorList() {
        return registryErrorList;
    }


    /**
     * Sets the registryErrorList value for this RegistryResponseType.
     * 
     * @param registryErrorList
     */
    public void setRegistryErrorList(_0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError[] registryErrorList) {
        this.registryErrorList = registryErrorList;
    }


    /**
     * Gets the status value for this RegistryResponseType.
     * 
     * @return status
     */
    public org.apache.axis.types.URI getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RegistryResponseType.
     * 
     * @param status
     */
    public void setStatus(org.apache.axis.types.URI status) {
        this.status = status;
    }


    /**
     * Gets the requestId value for this RegistryResponseType.
     * 
     * @return requestId
     */
    public org.apache.axis.types.URI getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this RegistryResponseType.
     * 
     * @param requestId
     */
    public void setRequestId(org.apache.axis.types.URI requestId) {
        this.requestId = requestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistryResponseType)) return false;
        RegistryResponseType other = (RegistryResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseSlotList==null && other.getResponseSlotList()==null) || 
             (this.responseSlotList!=null &&
              java.util.Arrays.equals(this.responseSlotList, other.getResponseSlotList()))) &&
            ((this.registryErrorList==null && other.getRegistryErrorList()==null) || 
             (this.registryErrorList!=null &&
              java.util.Arrays.equals(this.registryErrorList, other.getRegistryErrorList()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        int _hashCode = 1;
        if (getResponseSlotList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseSlotList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseSlotList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistryErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistryErrorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistryErrorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistryResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponseType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "requestId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSlotList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "ResponseSlotList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Slot"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", ">RegistryErrorList"));
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
