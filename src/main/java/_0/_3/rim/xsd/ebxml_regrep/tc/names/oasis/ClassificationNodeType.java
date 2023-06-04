/**
 * ClassificationNodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * ClassificationNode is the mapping of the same named interface in
 * ebRIM.
 *         It extends RegistryObject.
 *         ClassificationNode is used to submit a Classification tree
 * to the Registry.
 *         The parent attribute is the id to the parent node. code is
 * an optional code value for a ClassificationNode
 *         often defined by an external taxonomy (e.g. NAICS)
 */
public class ClassificationNodeType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType[] classificationNode;

    private org.apache.axis.types.URI parent;  // attribute

    private java.lang.String code;  // attribute

    private java.lang.String path;  // attribute

    public ClassificationNodeType() {
    }

    public ClassificationNodeType(
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
           org.apache.axis.types.URI parent,
           java.lang.String code,
           java.lang.String path,
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
        this.parent = parent;
        this.code = code;
        this.path = path;
        this.classificationNode = classificationNode;
    }


    /**
     * Gets the classificationNode value for this ClassificationNodeType.
     * 
     * @return classificationNode
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType[] getClassificationNode() {
        return classificationNode;
    }


    /**
     * Sets the classificationNode value for this ClassificationNodeType.
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
     * Gets the parent value for this ClassificationNodeType.
     * 
     * @return parent
     */
    public org.apache.axis.types.URI getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ClassificationNodeType.
     * 
     * @param parent
     */
    public void setParent(org.apache.axis.types.URI parent) {
        this.parent = parent;
    }


    /**
     * Gets the code value for this ClassificationNodeType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ClassificationNodeType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the path value for this ClassificationNodeType.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this ClassificationNodeType.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassificationNodeType)) return false;
        ClassificationNodeType other = (ClassificationNodeType) obj;
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
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath())));
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
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassificationNodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationNodeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("parent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "parent"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "code"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LongName"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("path");
        attrField.setXmlName(new javax.xml.namespace.QName("", "path"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
