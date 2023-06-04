/**
 * AdhocQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class AdhocQueryRequest  extends _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryRequestType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionType responseOption;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery;

    private java.lang.Boolean federated;  // attribute

    private org.apache.axis.types.URI federation;  // attribute

    private java.math.BigInteger startIndex;  // attribute

    private java.math.BigInteger maxResults;  // attribute

    public AdhocQueryRequest() {
    }

    public AdhocQueryRequest(
           org.apache.axis.types.URI id,
           java.lang.String comment,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList,
           java.lang.Boolean federated,
           org.apache.axis.types.URI federation,
           java.math.BigInteger startIndex,
           java.math.BigInteger maxResults,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionType responseOption,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery) {
        super(requestSlotList,
            id,
            comment);
        this.federated = federated;
        this.federation = federation;
        this.startIndex = startIndex;
        this.maxResults = maxResults;
        this.responseOption = responseOption;
        this.adhocQuery = adhocQuery;
    }


    /**
     * Gets the responseOption value for this AdhocQueryRequest.
     * 
     * @return responseOption
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionType getResponseOption() {
        return responseOption;
    }


    /**
     * Sets the responseOption value for this AdhocQueryRequest.
     * 
     * @param responseOption
     */
    public void setResponseOption(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionType responseOption) {
        this.responseOption = responseOption;
    }


    /**
     * Gets the adhocQuery value for this AdhocQueryRequest.
     * 
     * @return adhocQuery
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }


    /**
     * Sets the adhocQuery value for this AdhocQueryRequest.
     * 
     * @param adhocQuery
     */
    public void setAdhocQuery(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery) {
        this.adhocQuery = adhocQuery;
    }


    /**
     * Gets the federated value for this AdhocQueryRequest.
     * 
     * @return federated
     */
    public java.lang.Boolean getFederated() {
        return federated;
    }


    /**
     * Sets the federated value for this AdhocQueryRequest.
     * 
     * @param federated
     */
    public void setFederated(java.lang.Boolean federated) {
        this.federated = federated;
    }


    /**
     * Gets the federation value for this AdhocQueryRequest.
     * 
     * @return federation
     */
    public org.apache.axis.types.URI getFederation() {
        return federation;
    }


    /**
     * Sets the federation value for this AdhocQueryRequest.
     * 
     * @param federation
     */
    public void setFederation(org.apache.axis.types.URI federation) {
        this.federation = federation;
    }


    /**
     * Gets the startIndex value for this AdhocQueryRequest.
     * 
     * @return startIndex
     */
    public java.math.BigInteger getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this AdhocQueryRequest.
     * 
     * @param startIndex
     */
    public void setStartIndex(java.math.BigInteger startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the maxResults value for this AdhocQueryRequest.
     * 
     * @return maxResults
     */
    public java.math.BigInteger getMaxResults() {
        return maxResults;
    }


    /**
     * Sets the maxResults value for this AdhocQueryRequest.
     * 
     * @param maxResults
     */
    public void setMaxResults(java.math.BigInteger maxResults) {
        this.maxResults = maxResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdhocQueryRequest)) return false;
        AdhocQueryRequest other = (AdhocQueryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.responseOption==null && other.getResponseOption()==null) || 
             (this.responseOption!=null &&
              this.responseOption.equals(other.getResponseOption()))) &&
            ((this.adhocQuery==null && other.getAdhocQuery()==null) || 
             (this.adhocQuery!=null &&
              this.adhocQuery.equals(other.getAdhocQuery()))) &&
            ((this.federated==null && other.getFederated()==null) || 
             (this.federated!=null &&
              this.federated.equals(other.getFederated()))) &&
            ((this.federation==null && other.getFederation()==null) || 
             (this.federation!=null &&
              this.federation.equals(other.getFederation()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.maxResults==null && other.getMaxResults()==null) || 
             (this.maxResults!=null &&
              this.maxResults.equals(other.getMaxResults())));
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
        if (getResponseOption() != null) {
            _hashCode += getResponseOption().hashCode();
        }
        if (getAdhocQuery() != null) {
            _hashCode += getAdhocQuery().hashCode();
        }
        if (getFederated() != null) {
            _hashCode += getFederated().hashCode();
        }
        if (getFederation() != null) {
            _hashCode += getFederation().hashCode();
        }
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getMaxResults() != null) {
            _hashCode += getMaxResults().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdhocQueryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">AdhocQueryRequest"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("federated");
        attrField.setXmlName(new javax.xml.namespace.QName("", "federated"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("federation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "federation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startIndex");
        attrField.setXmlName(new javax.xml.namespace.QName("", "startIndex"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxResults");
        attrField.setXmlName(new javax.xml.namespace.QName("", "maxResults"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ResponseOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ResponseOptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adhocQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQueryType"));
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
