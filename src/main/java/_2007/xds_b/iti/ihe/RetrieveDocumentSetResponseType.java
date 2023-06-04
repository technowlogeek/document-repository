/**
 * RetrieveDocumentSetResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class RetrieveDocumentSetResponseType  implements java.io.Serializable {
    private _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType registryResponse;

    private _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse[] documentResponse;

    public RetrieveDocumentSetResponseType() {
    }

    public RetrieveDocumentSetResponseType(
           _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType registryResponse,
           _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse[] documentResponse) {
           this.registryResponse = registryResponse;
           this.documentResponse = documentResponse;
    }


    /**
     * Gets the registryResponse value for this RetrieveDocumentSetResponseType.
     * 
     * @return registryResponse
     */
    public _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType getRegistryResponse() {
        return registryResponse;
    }


    /**
     * Sets the registryResponse value for this RetrieveDocumentSetResponseType.
     * 
     * @param registryResponse
     */
    public void setRegistryResponse(_0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType registryResponse) {
        this.registryResponse = registryResponse;
    }


    /**
     * Gets the documentResponse value for this RetrieveDocumentSetResponseType.
     * 
     * @return documentResponse
     */
    public _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse[] getDocumentResponse() {
        return documentResponse;
    }


    /**
     * Sets the documentResponse value for this RetrieveDocumentSetResponseType.
     * 
     * @param documentResponse
     */
    public void setDocumentResponse(_2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse[] documentResponse) {
        this.documentResponse = documentResponse;
    }

    public _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse getDocumentResponse(int i) {
        return this.documentResponse[i];
    }

    public void setDocumentResponse(int i, _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse _value) {
        this.documentResponse[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveDocumentSetResponseType)) return false;
        RetrieveDocumentSetResponseType other = (RetrieveDocumentSetResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registryResponse==null && other.getRegistryResponse()==null) || 
             (this.registryResponse!=null &&
              this.registryResponse.equals(other.getRegistryResponse()))) &&
            ((this.documentResponse==null && other.getDocumentResponse()==null) || 
             (this.documentResponse!=null &&
              java.util.Arrays.equals(this.documentResponse, other.getDocumentResponse())));
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
        if (getRegistryResponse() != null) {
            _hashCode += getRegistryResponse().hashCode();
        }
        if (getDocumentResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentResponse(), i);
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
        new org.apache.axis.description.TypeDesc(RetrieveDocumentSetResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "DocumentResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">RetrieveDocumentSetResponseType>DocumentResponse"));
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
