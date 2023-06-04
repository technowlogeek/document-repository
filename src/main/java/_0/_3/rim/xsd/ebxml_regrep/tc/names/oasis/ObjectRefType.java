/**
 * ObjectRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Use to reference an Object by its id.
 *         Specifies the id attribute of the object as its id attribute.
 * id attribute in ObjectAttributes is exactly the same syntax and semantics
 * as
 *         id attribute in RegistryObject.
 */
public class ObjectRefType  implements java.io.Serializable {
    private boolean createReplica;  // attribute

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] identifiableType;  // attribute

    public ObjectRefType() {
    }

    public ObjectRefType(
           org.apache.axis.types.URI id,
           org.apache.axis.types.URI home,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] param1,
           boolean createReplica) {

        this.identifiableType = param1;
        this.createReplica = createReplica;
    }


    /**
     * Gets the createReplica value for this ObjectRefType.
     * 
     * @return createReplica
     */
    public boolean isCreateReplica() {
        return createReplica;
    }


    /**
     * Sets the createReplica value for this ObjectRefType.
     * 
     * @param createReplica
     */
    public void setCreateReplica(boolean createReplica) {
        this.createReplica = createReplica;
    }


    /**
     * Gets the identifiableType value for this ObjectRefType.
     * 
     * @return identifiableType
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] getIdentifiableType() {
        return identifiableType;
    }


    /**
     * Sets the identifiableType value for this ObjectRefType.
     * 
     * @param identifiableType
     */
    public void setIdentifiableType(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] identifiableType) {
        this.identifiableType = identifiableType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectRefType)) return false;
        ObjectRefType other = (ObjectRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.createReplica == other.isCreateReplica() &&
            ((this.identifiableType==null && other.getIdentifiableType()==null) || 
             (this.identifiableType!=null &&
              java.util.Arrays.equals(this.identifiableType, other.getIdentifiableType())));
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
        _hashCode += (isCreateReplica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdentifiableType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifiableType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifiableType(), i);
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
        new org.apache.axis.description.TypeDesc(ObjectRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("createReplica");
        attrField.setXmlName(new javax.xml.namespace.QName("", "createReplica"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
