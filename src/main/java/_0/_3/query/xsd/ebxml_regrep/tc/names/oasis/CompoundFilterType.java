/**
 * CompoundFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class CompoundFilterType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType leftFilter;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType rightFilter;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.CompoundFilterTypeLogicalOperator logicalOperator;  // attribute

    public CompoundFilterType() {
    }

    public CompoundFilterType(
           boolean negate,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.CompoundFilterTypeLogicalOperator logicalOperator,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType leftFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType rightFilter) {
        super(
            negate);
        this.logicalOperator = logicalOperator;
        this.leftFilter = leftFilter;
        this.rightFilter = rightFilter;
    }


    /**
     * Gets the leftFilter value for this CompoundFilterType.
     * 
     * @return leftFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getLeftFilter() {
        return leftFilter;
    }


    /**
     * Sets the leftFilter value for this CompoundFilterType.
     * 
     * @param leftFilter
     */
    public void setLeftFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType leftFilter) {
        this.leftFilter = leftFilter;
    }


    /**
     * Gets the rightFilter value for this CompoundFilterType.
     * 
     * @return rightFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getRightFilter() {
        return rightFilter;
    }


    /**
     * Sets the rightFilter value for this CompoundFilterType.
     * 
     * @param rightFilter
     */
    public void setRightFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType rightFilter) {
        this.rightFilter = rightFilter;
    }


    /**
     * Gets the logicalOperator value for this CompoundFilterType.
     * 
     * @return logicalOperator
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.CompoundFilterTypeLogicalOperator getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this CompoundFilterType.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.CompoundFilterTypeLogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompoundFilterType)) return false;
        CompoundFilterType other = (CompoundFilterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.leftFilter==null && other.getLeftFilter()==null) || 
             (this.leftFilter!=null &&
              this.leftFilter.equals(other.getLeftFilter()))) &&
            ((this.rightFilter==null && other.getRightFilter()==null) || 
             (this.rightFilter!=null &&
              this.rightFilter.equals(other.getRightFilter()))) &&
            ((this.logicalOperator==null && other.getLogicalOperator()==null) || 
             (this.logicalOperator!=null &&
              this.logicalOperator.equals(other.getLogicalOperator())));
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
        if (getLeftFilter() != null) {
            _hashCode += getLeftFilter().hashCode();
        }
        if (getRightFilter() != null) {
            _hashCode += getRightFilter().hashCode();
        }
        if (getLogicalOperator() != null) {
            _hashCode += getLogicalOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompoundFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "CompoundFilterType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("logicalOperator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "logicalOperator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">CompoundFilterType>logicalOperator"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "LeftFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RightFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
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
