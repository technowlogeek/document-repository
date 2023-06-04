/**
 * UpdateObjectsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis;

public class UpdateObjectsRequest  extends _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryRequestType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] registryObjectList;

    public UpdateObjectsRequest() {
    }

    public UpdateObjectsRequest(
           org.apache.axis.types.URI id,
           java.lang.String comment,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] registryObjectList) {
        super(requestSlotList,
            id,
            comment);
        this.registryObjectList = registryObjectList;
    }


    /**
     * Gets the registryObjectList value for this UpdateObjectsRequest.
     * 
     * @return registryObjectList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] getRegistryObjectList() {
        return registryObjectList;
    }


    /**
     * Sets the registryObjectList value for this UpdateObjectsRequest.
     * 
     * @param registryObjectList
     */
    public void setRegistryObjectList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] registryObjectList) {
        this.registryObjectList = registryObjectList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateObjectsRequest)) return false;
        UpdateObjectsRequest other = (UpdateObjectsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registryObjectList==null && other.getRegistryObjectList()==null) || 
             (this.registryObjectList!=null &&
              java.util.Arrays.equals(this.registryObjectList, other.getRegistryObjectList())));
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
        if (getRegistryObjectList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistryObjectList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistryObjectList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateObjectsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">UpdateObjectsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryObjectList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryObjectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryObjectListType"));
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
