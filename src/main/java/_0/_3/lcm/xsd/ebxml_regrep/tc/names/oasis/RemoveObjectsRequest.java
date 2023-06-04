/**
 * RemoveObjectsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis;

public class RemoveObjectsRequest  extends _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryRequestType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType objectRefList;

    private org.apache.axis.types.URI deletionScope;  // attribute

    public RemoveObjectsRequest() {
    }

    public RemoveObjectsRequest(
           org.apache.axis.types.URI id,
           java.lang.String comment,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList,
           org.apache.axis.types.URI deletionScope,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType objectRefList) {
        super(requestSlotList,
            id,
            comment);
        this.deletionScope = deletionScope;
        this.adhocQuery = adhocQuery;
        this.objectRefList = objectRefList;
    }


    /**
     * Gets the adhocQuery value for this RemoveObjectsRequest.
     * 
     * @return adhocQuery
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }


    /**
     * Sets the adhocQuery value for this RemoveObjectsRequest.
     * 
     * @param adhocQuery
     */
    public void setAdhocQuery(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery) {
        this.adhocQuery = adhocQuery;
    }


    /**
     * Gets the objectRefList value for this RemoveObjectsRequest.
     * 
     * @return objectRefList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType getObjectRefList() {
        return objectRefList;
    }


    /**
     * Sets the objectRefList value for this RemoveObjectsRequest.
     * 
     * @param objectRefList
     */
    public void setObjectRefList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType objectRefList) {
        this.objectRefList = objectRefList;
    }


    /**
     * Gets the deletionScope value for this RemoveObjectsRequest.
     * 
     * @return deletionScope
     */
    public org.apache.axis.types.URI getDeletionScope() {
        return deletionScope;
    }


    /**
     * Sets the deletionScope value for this RemoveObjectsRequest.
     * 
     * @param deletionScope
     */
    public void setDeletionScope(org.apache.axis.types.URI deletionScope) {
        this.deletionScope = deletionScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveObjectsRequest)) return false;
        RemoveObjectsRequest other = (RemoveObjectsRequest) obj;
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
              this.objectRefList.equals(other.getObjectRefList()))) &&
            ((this.deletionScope==null && other.getDeletionScope()==null) || 
             (this.deletionScope!=null &&
              this.deletionScope.equals(other.getDeletionScope())));
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
        if (getDeletionScope() != null) {
            _hashCode += getDeletionScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveObjectsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">RemoveObjectsRequest"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deletionScope");
        attrField.setXmlName(new javax.xml.namespace.QName("", "deletionScope"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
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
