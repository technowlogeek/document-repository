/**
 * RetrieveDocumentSetRequestTypeDocumentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class RetrieveDocumentSetRequestTypeDocumentRequest  implements java.io.Serializable {
    /* This corresponds to the home attribute of the Identifiable
     * class in regrep RIM (regrep-rim-3.0-os.pdf, page 20) */
    private java.lang.String homeCommunityId;

    /* This is the XDSDocumentEntry.repositoryUniqueId attribute in
     * the XDS metadata */
    private java.lang.String repositoryUniqueId;

    /* This is the XDSDocumentEntry.uniqueId attribute in the XDS
     * metadata */
    private java.lang.String documentUniqueId;

    public RetrieveDocumentSetRequestTypeDocumentRequest() {
    }

    public RetrieveDocumentSetRequestTypeDocumentRequest(
           java.lang.String homeCommunityId,
           java.lang.String repositoryUniqueId,
           java.lang.String documentUniqueId) {
           this.homeCommunityId = homeCommunityId;
           this.repositoryUniqueId = repositoryUniqueId;
           this.documentUniqueId = documentUniqueId;
    }


    /**
     * Gets the homeCommunityId value for this RetrieveDocumentSetRequestTypeDocumentRequest.
     * 
     * @return homeCommunityId   * This corresponds to the home attribute of the Identifiable
     * class in regrep RIM (regrep-rim-3.0-os.pdf, page 20)
     */
    public java.lang.String getHomeCommunityId() {
        return homeCommunityId;
    }


    /**
     * Sets the homeCommunityId value for this RetrieveDocumentSetRequestTypeDocumentRequest.
     * 
     * @param homeCommunityId   * This corresponds to the home attribute of the Identifiable
     * class in regrep RIM (regrep-rim-3.0-os.pdf, page 20)
     */
    public void setHomeCommunityId(java.lang.String homeCommunityId) {
        this.homeCommunityId = homeCommunityId;
    }


    /**
     * Gets the repositoryUniqueId value for this RetrieveDocumentSetRequestTypeDocumentRequest.
     * 
     * @return repositoryUniqueId   * This is the XDSDocumentEntry.repositoryUniqueId attribute in
     * the XDS metadata
     */
    public java.lang.String getRepositoryUniqueId() {
        return repositoryUniqueId;
    }


    /**
     * Sets the repositoryUniqueId value for this RetrieveDocumentSetRequestTypeDocumentRequest.
     * 
     * @param repositoryUniqueId   * This is the XDSDocumentEntry.repositoryUniqueId attribute in
     * the XDS metadata
     */
    public void setRepositoryUniqueId(java.lang.String repositoryUniqueId) {
        this.repositoryUniqueId = repositoryUniqueId;
    }


    /**
     * Gets the documentUniqueId value for this RetrieveDocumentSetRequestTypeDocumentRequest.
     * 
     * @return documentUniqueId   * This is the XDSDocumentEntry.uniqueId attribute in the XDS
     * metadata
     */
    public java.lang.String getDocumentUniqueId() {
        return documentUniqueId;
    }


    /**
     * Sets the documentUniqueId value for this RetrieveDocumentSetRequestTypeDocumentRequest.
     * 
     * @param documentUniqueId   * This is the XDSDocumentEntry.uniqueId attribute in the XDS
     * metadata
     */
    public void setDocumentUniqueId(java.lang.String documentUniqueId) {
        this.documentUniqueId = documentUniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveDocumentSetRequestTypeDocumentRequest)) return false;
        RetrieveDocumentSetRequestTypeDocumentRequest other = (RetrieveDocumentSetRequestTypeDocumentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.homeCommunityId==null && other.getHomeCommunityId()==null) || 
             (this.homeCommunityId!=null &&
              this.homeCommunityId.equals(other.getHomeCommunityId()))) &&
            ((this.repositoryUniqueId==null && other.getRepositoryUniqueId()==null) || 
             (this.repositoryUniqueId!=null &&
              this.repositoryUniqueId.equals(other.getRepositoryUniqueId()))) &&
            ((this.documentUniqueId==null && other.getDocumentUniqueId()==null) || 
             (this.documentUniqueId!=null &&
              this.documentUniqueId.equals(other.getDocumentUniqueId())));
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
        if (getHomeCommunityId() != null) {
            _hashCode += getHomeCommunityId().hashCode();
        }
        if (getRepositoryUniqueId() != null) {
            _hashCode += getRepositoryUniqueId().hashCode();
        }
        if (getDocumentUniqueId() != null) {
            _hashCode += getDocumentUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveDocumentSetRequestTypeDocumentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">RetrieveDocumentSetRequestType>DocumentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeCommunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "HomeCommunityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RepositoryUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "DocumentUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
