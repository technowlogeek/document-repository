/**
 * ClassificationSchemeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * ClassificationScheme is the mapping of the same named interface
 * in ebRIM.
 *         It extends RegistryObject.
 */
public class ClassificationSchemeType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType[] classificationNode;

    private boolean isInternal;  // attribute

    private org.apache.axis.types.URI nodeType;  // attribute

    public ClassificationSchemeType() {
    }

    public ClassificationSchemeType(
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
           boolean isInternal,
           org.apache.axis.types.URI nodeType,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType[] classificationNode) {
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
        this.isInternal = isInternal;
        this.nodeType = nodeType;
        this.classificationNode = classificationNode;
    }


    /**
     * Gets the classificationNode value for this ClassificationSchemeType.
     * 
     * @return classificationNode
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType[] getClassificationNode() {
        return classificationNode;
    }


    /**
     * Sets the classificationNode value for this ClassificationSchemeType.
     * 
     * @param classificationNode
     */
    public void setClassificationNode(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType[] classificationNode) {
        this.classificationNode = classificationNode;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType getClassificationNode(int i) {
        return this.classificationNode[i];
    }

    public void setClassificationNode(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType _value) {
        this.classificationNode[i] = _value;
    }


    /**
     * Gets the isInternal value for this ClassificationSchemeType.
     * 
     * @return isInternal
     */
    public boolean isIsInternal() {
        return isInternal;
    }


    /**
     * Sets the isInternal value for this ClassificationSchemeType.
     * 
     * @param isInternal
     */
    public void setIsInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }


    /**
     * Gets the nodeType value for this ClassificationSchemeType.
     * 
     * @return nodeType
     */
    public org.apache.axis.types.URI getNodeType() {
        return nodeType;
    }


    /**
     * Sets the nodeType value for this ClassificationSchemeType.
     * 
     * @param nodeType
     */
    public void setNodeType(org.apache.axis.types.URI nodeType) {
        this.nodeType = nodeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassificationSchemeType)) return false;
        ClassificationSchemeType other = (ClassificationSchemeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.classificationNode==null && other.getClassificationNode()==null) || 
             (this.classificationNode!=null &&
              java.util.Arrays.equals(this.classificationNode, other.getClassificationNode()))) &&
            this.isInternal == other.isIsInternal() &&
            ((this.nodeType==null && other.getNodeType()==null) || 
             (this.nodeType!=null &&
              this.nodeType.equals(other.getNodeType())));
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
        if (getClassificationNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassificationNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassificationNode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsInternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNodeType() != null) {
            _hashCode += getNodeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassificationSchemeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationSchemeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isInternal");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isInternal"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nodeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "nodeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationNode"));
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
