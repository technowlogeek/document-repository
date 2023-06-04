/**
 * ServiceBindingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;

public class ServiceBindingType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType[] specificationLink;

    private org.apache.axis.types.URI service;  // attribute

    private org.apache.axis.types.URI accessURI;  // attribute

    private org.apache.axis.types.URI targetBinding;  // attribute

    public ServiceBindingType() {
    }

    public ServiceBindingType(
           org.apache.axis.types.URI id,
           org.apache.axis.types.URI home,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] param2,
           org.apache.axis.types.URI lid,
           org.apache.axis.types.URI objectType,
           org.apache.axis.types.URI status,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType name,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType description,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType versionInfo,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType[] classification,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType[] externalIdentifier,
           org.apache.axis.types.URI service,
           org.apache.axis.types.URI accessURI,
           org.apache.axis.types.URI targetBinding,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType[] specificationLink) {
        super(
            id,
            home,
            param2,
            lid,
            objectType,
            status,
            name,
            description,
            versionInfo,
            classification,
            externalIdentifier);
        this.service = service;
        this.accessURI = accessURI;
        this.targetBinding = targetBinding;
        this.specificationLink = specificationLink;
    }


    /**
     * Gets the specificationLink value for this ServiceBindingType.
     * 
     * @return specificationLink
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType[] getSpecificationLink() {
        return specificationLink;
    }


    /**
     * Sets the specificationLink value for this ServiceBindingType.
     * 
     * @param specificationLink
     */
    public void setSpecificationLink(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType[] specificationLink) {
        this.specificationLink = specificationLink;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType getSpecificationLink(int i) {
        return this.specificationLink[i];
    }

    public void setSpecificationLink(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType _value) {
        this.specificationLink[i] = _value;
    }


    /**
     * Gets the service value for this ServiceBindingType.
     * 
     * @return service
     */
    public org.apache.axis.types.URI getService() {
        return service;
    }


    /**
     * Sets the service value for this ServiceBindingType.
     * 
     * @param service
     */
    public void setService(org.apache.axis.types.URI service) {
        this.service = service;
    }


    /**
     * Gets the accessURI value for this ServiceBindingType.
     * 
     * @return accessURI
     */
    public org.apache.axis.types.URI getAccessURI() {
        return accessURI;
    }


    /**
     * Sets the accessURI value for this ServiceBindingType.
     * 
     * @param accessURI
     */
    public void setAccessURI(org.apache.axis.types.URI accessURI) {
        this.accessURI = accessURI;
    }


    /**
     * Gets the targetBinding value for this ServiceBindingType.
     * 
     * @return targetBinding
     */
    public org.apache.axis.types.URI getTargetBinding() {
        return targetBinding;
    }


    /**
     * Sets the targetBinding value for this ServiceBindingType.
     * 
     * @param targetBinding
     */
    public void setTargetBinding(org.apache.axis.types.URI targetBinding) {
        this.targetBinding = targetBinding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceBindingType)) return false;
        ServiceBindingType other = (ServiceBindingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.specificationLink==null && other.getSpecificationLink()==null) || 
             (this.specificationLink!=null &&
              java.util.Arrays.equals(this.specificationLink, other.getSpecificationLink()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.accessURI==null && other.getAccessURI()==null) || 
             (this.accessURI!=null &&
              this.accessURI.equals(other.getAccessURI()))) &&
            ((this.targetBinding==null && other.getTargetBinding()==null) || 
             (this.targetBinding!=null &&
              this.targetBinding.equals(other.getTargetBinding())));
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
        if (getSpecificationLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecificationLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecificationLink(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getAccessURI() != null) {
            _hashCode += getAccessURI().hashCode();
        }
        if (getTargetBinding() != null) {
            _hashCode += getTargetBinding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceBindingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ServiceBindingType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("service");
        attrField.setXmlName(new javax.xml.namespace.QName("", "service"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("accessURI");
        attrField.setXmlName(new javax.xml.namespace.QName("", "accessURI"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("targetBinding");
        attrField.setXmlName(new javax.xml.namespace.QName("", "targetBinding"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificationLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SpecificationLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SpecificationLink"));
        elemField.setMinOccurs(0);
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
