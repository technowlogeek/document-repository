/**
 * AdhocQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class AdhocQueryResponse  extends _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] registryObjectList;

    private java.math.BigInteger startIndex;  // attribute

    private java.math.BigInteger totalResultCount;  // attribute

    public AdhocQueryResponse() {
    }

    public AdhocQueryResponse(
           org.apache.axis.types.URI status,
           org.apache.axis.types.URI requestId,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] responseSlotList,
           _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError[] registryErrorList,
           java.math.BigInteger startIndex,
           java.math.BigInteger totalResultCount,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] registryObjectList) {
        super(
        		responseSlotList,
                registryErrorList,
            status,
            requestId);
        this.startIndex = startIndex;
        this.totalResultCount = totalResultCount;
        this.registryObjectList = registryObjectList;
    }


    /**
     * Gets the registryObjectList value for this AdhocQueryResponse.
     * 
     * @return registryObjectList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] getRegistryObjectList() {
        return registryObjectList;
    }


    /**
     * Sets the registryObjectList value for this AdhocQueryResponse.
     * 
     * @param registryObjectList
     */
    public void setRegistryObjectList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][] registryObjectList) {
        this.registryObjectList = registryObjectList;
    }


    /**
     * Gets the startIndex value for this AdhocQueryResponse.
     * 
     * @return startIndex
     */
    public java.math.BigInteger getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this AdhocQueryResponse.
     * 
     * @param startIndex
     */
    public void setStartIndex(java.math.BigInteger startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the totalResultCount value for this AdhocQueryResponse.
     * 
     * @return totalResultCount
     */
    public java.math.BigInteger getTotalResultCount() {
        return totalResultCount;
    }


    /**
     * Sets the totalResultCount value for this AdhocQueryResponse.
     * 
     * @param totalResultCount
     */
    public void setTotalResultCount(java.math.BigInteger totalResultCount) {
        this.totalResultCount = totalResultCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdhocQueryResponse)) return false;
        AdhocQueryResponse other = (AdhocQueryResponse) obj;
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
              java.util.Arrays.equals(this.registryObjectList, other.getRegistryObjectList()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.totalResultCount==null && other.getTotalResultCount()==null) || 
             (this.totalResultCount!=null &&
              this.totalResultCount.equals(other.getTotalResultCount())));
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
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getTotalResultCount() != null) {
            _hashCode += getTotalResultCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdhocQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">AdhocQueryResponse"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startIndex");
        attrField.setXmlName(new javax.xml.namespace.QName("", "startIndex"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("totalResultCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "totalResultCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
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
