/**
 * AssociationType1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Association is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 *         An Association specifies references to two previously submitted
 * registry entrys.
 *         The sourceObject is id of the sourceObject in association
 *         The targetObject is id of the targetObject in association
 */
public class AssociationType1  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private org.apache.axis.types.URI associationType;  // attribute

    private org.apache.axis.types.URI sourceObject;  // attribute

    private org.apache.axis.types.URI targetObject;  // attribute

    public AssociationType1() {
    }

    public AssociationType1(
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
           org.apache.axis.types.URI associationType,
           org.apache.axis.types.URI sourceObject,
           org.apache.axis.types.URI targetObject) {
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
        this.associationType = associationType;
        this.sourceObject = sourceObject;
        this.targetObject = targetObject;
    }


    /**
     * Gets the associationType value for this AssociationType1.
     * 
     * @return associationType
     */
    public org.apache.axis.types.URI getAssociationType() {
        return associationType;
    }


    /**
     * Sets the associationType value for this AssociationType1.
     * 
     * @param associationType
     */
    public void setAssociationType(org.apache.axis.types.URI associationType) {
        this.associationType = associationType;
    }


    /**
     * Gets the sourceObject value for this AssociationType1.
     * 
     * @return sourceObject
     */
    public org.apache.axis.types.URI getSourceObject() {
        return sourceObject;
    }


    /**
     * Sets the sourceObject value for this AssociationType1.
     * 
     * @param sourceObject
     */
    public void setSourceObject(org.apache.axis.types.URI sourceObject) {
        this.sourceObject = sourceObject;
    }


    /**
     * Gets the targetObject value for this AssociationType1.
     * 
     * @return targetObject
     */
    public org.apache.axis.types.URI getTargetObject() {
        return targetObject;
    }


    /**
     * Sets the targetObject value for this AssociationType1.
     * 
     * @param targetObject
     */
    public void setTargetObject(org.apache.axis.types.URI targetObject) {
        this.targetObject = targetObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationType1)) return false;
        AssociationType1 other = (AssociationType1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationType==null && other.getAssociationType()==null) || 
             (this.associationType!=null &&
              this.associationType.equals(other.getAssociationType()))) &&
            ((this.sourceObject==null && other.getSourceObject()==null) || 
             (this.sourceObject!=null &&
              this.sourceObject.equals(other.getSourceObject()))) &&
            ((this.targetObject==null && other.getTargetObject()==null) || 
             (this.targetObject!=null &&
              this.targetObject.equals(other.getTargetObject())));
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
        if (getAssociationType() != null) {
            _hashCode += getAssociationType().hashCode();
        }
        if (getSourceObject() != null) {
            _hashCode += getSourceObject().hashCode();
        }
        if (getTargetObject() != null) {
            _hashCode += getTargetObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationType1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AssociationType1"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("associationType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "associationType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sourceObject");
        attrField.setXmlName(new javax.xml.namespace.QName("", "sourceObject"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("targetObject");
        attrField.setXmlName(new javax.xml.namespace.QName("", "targetObject"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
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
