/**
 * ProvideAndRegisterDocumentSetRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class ProvideAndRegisterDocumentSetRequestType  implements java.io.Serializable {
    private _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.SubmitObjectsRequest submitObjectsRequest;

    private _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument[] document;

    public ProvideAndRegisterDocumentSetRequestType() {
    }

    public ProvideAndRegisterDocumentSetRequestType(
           _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.SubmitObjectsRequest submitObjectsRequest,
           _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument[] document) {
           this.submitObjectsRequest = submitObjectsRequest;
           this.document = document;
    }


    /**
     * Gets the submitObjectsRequest value for this ProvideAndRegisterDocumentSetRequestType.
     * 
     * @return submitObjectsRequest
     */
    public _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.SubmitObjectsRequest getSubmitObjectsRequest() {
        return submitObjectsRequest;
    }


    /**
     * Sets the submitObjectsRequest value for this ProvideAndRegisterDocumentSetRequestType.
     * 
     * @param submitObjectsRequest
     */
    public void setSubmitObjectsRequest(_0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.SubmitObjectsRequest submitObjectsRequest) {
        this.submitObjectsRequest = submitObjectsRequest;
    }


    /**
     * Gets the document value for this ProvideAndRegisterDocumentSetRequestType.
     * 
     * @return document
     */
    public _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this ProvideAndRegisterDocumentSetRequestType.
     * 
     * @param document
     */
    public void setDocument(_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument[] document) {
        this.document = document;
    }

    public _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument getDocument(int i) {
        return this.document[i];
    }

    public void setDocument(int i, _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument _value) {
        this.document[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvideAndRegisterDocumentSetRequestType)) return false;
        ProvideAndRegisterDocumentSetRequestType other = (ProvideAndRegisterDocumentSetRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.submitObjectsRequest==null && other.getSubmitObjectsRequest()==null) || 
             (this.submitObjectsRequest!=null &&
              this.submitObjectsRequest.equals(other.getSubmitObjectsRequest()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument())));
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
        if (getSubmitObjectsRequest() != null) {
            _hashCode += getSubmitObjectsRequest().hashCode();
        }
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
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
        new org.apache.axis.description.TypeDesc(ProvideAndRegisterDocumentSetRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "ProvideAndRegisterDocumentSetRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitObjectsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", "SubmitObjectsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">SubmitObjectsRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "Document"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">ProvideAndRegisterDocumentSetRequestType>Document"));
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
