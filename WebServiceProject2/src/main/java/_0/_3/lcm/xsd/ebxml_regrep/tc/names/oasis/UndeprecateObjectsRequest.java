/**
 * UndeprecateObjectsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis;

public class UndeprecateObjectsRequest  extends _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryRequestType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType objectRefList;

    public UndeprecateObjectsRequest() {
    }

    public UndeprecateObjectsRequest(
           org.apache.axis.types.URI id,
           java.lang.String comment,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType objectRefList) {
        super(requestSlotList,
            id,
            comment);
        this.adhocQuery = adhocQuery;
        this.objectRefList = objectRefList;
    }


    /**
     * Gets the adhocQuery value for this UndeprecateObjectsRequest.
     * 
     * @return adhocQuery
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }


    /**
     * Sets the adhocQuery value for this UndeprecateObjectsRequest.
     * 
     * @param adhocQuery
     */
    public void setAdhocQuery(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery) {
        this.adhocQuery = adhocQuery;
    }


    /**
     * Gets the objectRefList value for this UndeprecateObjectsRequest.
     * 
     * @return objectRefList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType getObjectRefList() {
        return objectRefList;
    }


    /**
     * Sets the objectRefList value for this UndeprecateObjectsRequest.
     * 
     * @param objectRefList
     */
    public void setObjectRefList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType objectRefList) {
        this.objectRefList = objectRefList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UndeprecateObjectsRequest)) return false;
        UndeprecateObjectsRequest other = (UndeprecateObjectsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adhocQuery==null && other.getAdhocQuery()==null) || 
             (this.adhocQuery!=null &&
              this.adhocQuery.equals(other.getAdhocQuery()))) &&
            ((this.objectRefList==null && other.getObjectRefList()==null) || 
             (this.objectRefList!=null &&
              this.objectRefList.equals(other.getObjectRefList())));
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
        if (getAdhocQuery() != null) {
            _hashCode += getAdhocQuery().hashCode();
        }
        if (getObjectRefList() != null) {
            _hashCode += getObjectRefList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UndeprecateObjectsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">UndeprecateObjectsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adhocQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectRefList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefListType"));
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
