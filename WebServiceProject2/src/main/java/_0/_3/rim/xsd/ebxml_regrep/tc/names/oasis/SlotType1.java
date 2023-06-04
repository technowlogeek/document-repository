/**
 * SlotType1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;

public class SlotType1  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ValueListType valueList;

    private java.lang.String name;  // attribute

    private org.apache.axis.types.URI slotType;  // attribute

    public SlotType1() {
    }

    public SlotType1(
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ValueListType valueList,
           java.lang.String name,
           org.apache.axis.types.URI slotType) {
           this.valueList = valueList;
           this.name = name;
           this.slotType = slotType;
    }


    /**
     * Gets the valueList value for this SlotType1.
     * 
     * @return valueList
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ValueListType getValueList() {
        return valueList;
    }


    /**
     * Sets the valueList value for this SlotType1.
     * 
     * @param valueList
     */
    public void setValueList(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ValueListType valueList) {
        this.valueList = valueList;
    }


    /**
     * Gets the name value for this SlotType1.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SlotType1.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the slotType value for this SlotType1.
     * 
     * @return slotType
     */
    public org.apache.axis.types.URI getSlotType() {
        return slotType;
    }


    /**
     * Sets the slotType value for this SlotType1.
     * 
     * @param slotType
     */
    public void setSlotType(org.apache.axis.types.URI slotType) {
        this.slotType = slotType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SlotType1)) return false;
        SlotType1 other = (SlotType1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valueList==null && other.getValueList()==null) || 
             (this.valueList!=null &&
              this.valueList.equals(other.getValueList()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.slotType==null && other.getSlotType()==null) || 
             (this.slotType!=null &&
              this.slotType.equals(other.getSlotType())));
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
        if (getValueList() != null) {
            _hashCode += getValueList().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSlotType() != null) {
            _hashCode += getSlotType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SlotType1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SlotType1"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LongName"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("slotType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "slotType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ValueListType"));
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
