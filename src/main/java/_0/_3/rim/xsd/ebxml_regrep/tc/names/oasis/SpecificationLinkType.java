/**
 * SpecificationLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;

public class SpecificationLinkType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType usageDescription;

    private java.lang.String[] usageParameter;

    private org.apache.axis.types.URI serviceBinding;  // attribute

    private org.apache.axis.types.URI specificationObject;  // attribute

    public SpecificationLinkType() {
    }

    public SpecificationLinkType(
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
           org.apache.axis.types.URI serviceBinding,
           org.apache.axis.types.URI specificationObject,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType usageDescription,
           java.lang.String[] usageParameter) {
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
        this.serviceBinding = serviceBinding;
        this.specificationObject = specificationObject;
        this.usageDescription = usageDescription;
        this.usageParameter = usageParameter;
    }


    /**
     * Gets the usageDescription value for this SpecificationLinkType.
     * 
     * @return usageDescription
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType getUsageDescription() {
        return usageDescription;
    }


    /**
     * Sets the usageDescription value for this SpecificationLinkType.
     * 
     * @param usageDescription
     */
    public void setUsageDescription(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType usageDescription) {
        this.usageDescription = usageDescription;
    }


    /**
     * Gets the usageParameter value for this SpecificationLinkType.
     * 
     * @return usageParameter
     */
    public java.lang.String[] getUsageParameter() {
        return usageParameter;
    }


    /**
     * Sets the usageParameter value for this SpecificationLinkType.
     * 
     * @param usageParameter
     */
    public void setUsageParameter(java.lang.String[] usageParameter) {
        this.usageParameter = usageParameter;
    }

    public java.lang.String getUsageParameter(int i) {
        return this.usageParameter[i];
    }

    public void setUsageParameter(int i, java.lang.String _value) {
        this.usageParameter[i] = _value;
    }


    /**
     * Gets the serviceBinding value for this SpecificationLinkType.
     * 
     * @return serviceBinding
     */
    public org.apache.axis.types.URI getServiceBinding() {
        return serviceBinding;
    }


    /**
     * Sets the serviceBinding value for this SpecificationLinkType.
     * 
     * @param serviceBinding
     */
    public void setServiceBinding(org.apache.axis.types.URI serviceBinding) {
        this.serviceBinding = serviceBinding;
    }


    /**
     * Gets the specificationObject value for this SpecificationLinkType.
     * 
     * @return specificationObject
     */
    public org.apache.axis.types.URI getSpecificationObject() {
        return specificationObject;
    }


    /**
     * Sets the specificationObject value for this SpecificationLinkType.
     * 
     * @param specificationObject
     */
    public void setSpecificationObject(org.apache.axis.types.URI specificationObject) {
        this.specificationObject = specificationObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecificationLinkType)) return false;
        SpecificationLinkType other = (SpecificationLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.usageDescription==null && other.getUsageDescription()==null) || 
             (this.usageDescription!=null &&
              this.usageDescription.equals(other.getUsageDescription()))) &&
            ((this.usageParameter==null && other.getUsageParameter()==null) || 
             (this.usageParameter!=null &&
              java.util.Arrays.equals(this.usageParameter, other.getUsageParameter()))) &&
            ((this.serviceBinding==null && other.getServiceBinding()==null) || 
             (this.serviceBinding!=null &&
              this.serviceBinding.equals(other.getServiceBinding()))) &&
            ((this.specificationObject==null && other.getSpecificationObject()==null) || 
             (this.specificationObject!=null &&
              this.specificationObject.equals(other.getSpecificationObject())));
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
        if (getUsageDescription() != null) {
            _hashCode += getUsageDescription().hashCode();
        }
        if (getUsageParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageParameter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceBinding() != null) {
            _hashCode += getServiceBinding().hashCode();
        }
        if (getSpecificationObject() != null) {
            _hashCode += getSpecificationObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecificationLinkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SpecificationLinkType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("serviceBinding");
        attrField.setXmlName(new javax.xml.namespace.QName("", "serviceBinding"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("specificationObject");
        attrField.setXmlName(new javax.xml.namespace.QName("", "specificationObject"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "UsageDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "InternationalStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "UsageParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "UsageParameter"));
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
