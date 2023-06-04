/**
 * RegistryRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rs.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Base type for all ebXML Registry requests
 */
public class RegistryRequestType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList;

    private org.apache.axis.types.URI id;  // attribute

    private java.lang.String comment;  // attribute

    public RegistryRequestType() {
    }

    public RegistryRequestType(
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList,
           org.apache.axis.types.URI id,
           java.lang.String comment) {
           this.requestSlotList = requestSlotList;
           this.id = id;
           this.comment = comment;
    }


    /**
     * Gets the requestSlotList value for this RegistryRequestType.
     * 
     * @return requestSlotList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] getRequestSlotList() {
        return requestSlotList;
    }


    /**
     * Sets the requestSlotList value for this RegistryRequestType.
     * 
     * @param requestSlotList
     */
    public void setRequestSlotList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList) {
        this.requestSlotList = requestSlotList;
    }


    /**
     * Gets the id value for this RegistryRequestType.
     * 
     * @return id
     */
    public org.apache.axis.types.URI getId() {
        return id;
    }


    /**
     * Sets the id value for this RegistryRequestType.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.URI id) {
        this.id = id;
    }


    /**
     * Gets the comment value for this RegistryRequestType.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RegistryRequestType.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistryRequestType)) return false;
        RegistryRequestType other = (RegistryRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestSlotList==null && other.getRequestSlotList()==null) || 
             (this.requestSlotList!=null &&
              java.util.Arrays.equals(this.requestSlotList, other.getRequestSlotList()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getRequestSlotList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestSlotList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestSlotList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryRequestType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("comment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestSlotList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RequestSlotList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Slot"));
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
