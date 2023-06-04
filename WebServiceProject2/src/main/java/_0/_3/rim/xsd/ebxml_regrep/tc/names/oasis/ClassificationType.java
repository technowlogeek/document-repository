/**
 * ClassificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Classification is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 *         A Classification specifies references to two registry entrys.
 * The classifiedObject is id of the Object being classified.
 *         The classificationNode is id of the ClassificationNode classying
 * the object
 */
public class ClassificationType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private org.apache.axis.types.URI classificationScheme;  // attribute

    private org.apache.axis.types.URI classifiedObject;  // attribute

    private org.apache.axis.types.URI classificationNode;  // attribute

    private java.lang.String nodeRepresentation;  // attribute

    public ClassificationType() {
    }

    public ClassificationType(
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
           org.apache.axis.types.URI classificationScheme,
           org.apache.axis.types.URI classifiedObject,
           org.apache.axis.types.URI classificationNode,
           java.lang.String nodeRepresentation) {
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
        this.classificationScheme = classificationScheme;
        this.classifiedObject = classifiedObject;
        this.classificationNode = classificationNode;
        this.nodeRepresentation = nodeRepresentation;
    }


    /**
     * Gets the classificationScheme value for this ClassificationType.
     * 
     * @return classificationScheme
     */
    public org.apache.axis.types.URI getClassificationScheme() {
        return classificationScheme;
    }


    /**
     * Sets the classificationScheme value for this ClassificationType.
     * 
     * @param classificationScheme
     */
    public void setClassificationScheme(org.apache.axis.types.URI classificationScheme) {
        this.classificationScheme = classificationScheme;
    }


    /**
     * Gets the classifiedObject value for this ClassificationType.
     * 
     * @return classifiedObject
     */
    public org.apache.axis.types.URI getClassifiedObject() {
        return classifiedObject;
    }


    /**
     * Sets the classifiedObject value for this ClassificationType.
     * 
     * @param classifiedObject
     */
    public void setClassifiedObject(org.apache.axis.types.URI classifiedObject) {
        this.classifiedObject = classifiedObject;
    }


    /**
     * Gets the classificationNode value for this ClassificationType.
     * 
     * @return classificationNode
     */
    public org.apache.axis.types.URI getClassificationNode() {
        return classificationNode;
    }


    /**
     * Sets the classificationNode value for this ClassificationType.
     * 
     * @param classificationNode
     */
    public void setClassificationNode(org.apache.axis.types.URI classificationNode) {
        this.classificationNode = classificationNode;
    }


    /**
     * Gets the nodeRepresentation value for this ClassificationType.
     * 
     * @return nodeRepresentation
     */
    public java.lang.String getNodeRepresentation() {
        return nodeRepresentation;
    }


    /**
     * Sets the nodeRepresentation value for this ClassificationType.
     * 
     * @param nodeRepresentation
     */
    public void setNodeRepresentation(java.lang.String nodeRepresentation) {
        this.nodeRepresentation = nodeRepresentation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassificationType)) return false;
        ClassificationType other = (ClassificationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.classificationScheme==null && other.getClassificationScheme()==null) || 
             (this.classificationScheme!=null &&
              this.classificationScheme.equals(other.getClassificationScheme()))) &&
            ((this.classifiedObject==null && other.getClassifiedObject()==null) || 
             (this.classifiedObject!=null &&
              this.classifiedObject.equals(other.getClassifiedObject()))) &&
            ((this.classificationNode==null && other.getClassificationNode()==null) || 
             (this.classificationNode!=null &&
              this.classificationNode.equals(other.getClassificationNode()))) &&
            ((this.nodeRepresentation==null && other.getNodeRepresentation()==null) || 
             (this.nodeRepresentation!=null &&
              this.nodeRepresentation.equals(other.getNodeRepresentation())));
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
        if (getClassificationScheme() != null) {
            _hashCode += getClassificationScheme().hashCode();
        }
        if (getClassifiedObject() != null) {
            _hashCode += getClassifiedObject().hashCode();
        }
        if (getClassificationNode() != null) {
            _hashCode += getClassificationNode().hashCode();
        }
        if (getNodeRepresentation() != null) {
            _hashCode += getNodeRepresentation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassificationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classificationScheme");
        attrField.setXmlName(new javax.xml.namespace.QName("", "classificationScheme"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classifiedObject");
        attrField.setXmlName(new javax.xml.namespace.QName("", "classifiedObject"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classificationNode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "classificationNode"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nodeRepresentation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "nodeRepresentation"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LongName"));
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
