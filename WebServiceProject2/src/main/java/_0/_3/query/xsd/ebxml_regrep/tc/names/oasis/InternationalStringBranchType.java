/**
 * InternationalStringBranchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class InternationalStringBranchType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.BranchType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] localizedStringFilter;

    public InternationalStringBranchType() {
    }

    public InternationalStringBranchType(
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType primaryFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] localizedStringFilter) {
        super(
            primaryFilter);
        this.localizedStringFilter = localizedStringFilter;
    }


    /**
     * Gets the localizedStringFilter value for this InternationalStringBranchType.
     * 
     * @return localizedStringFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] getLocalizedStringFilter() {
        return localizedStringFilter;
    }


    /**
     * Sets the localizedStringFilter value for this InternationalStringBranchType.
     * 
     * @param localizedStringFilter
     */
    public void setLocalizedStringFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] localizedStringFilter) {
        this.localizedStringFilter = localizedStringFilter;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getLocalizedStringFilter(int i) {
        return this.localizedStringFilter[i];
    }

    public void setLocalizedStringFilter(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType _value) {
        this.localizedStringFilter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalStringBranchType)) return false;
        InternationalStringBranchType other = (InternationalStringBranchType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.localizedStringFilter==null && other.getLocalizedStringFilter()==null) || 
             (this.localizedStringFilter!=null &&
              java.util.Arrays.equals(this.localizedStringFilter, other.getLocalizedStringFilter())));
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
        if (getLocalizedStringFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedStringFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedStringFilter(), i);
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
        new org.apache.axis.description.TypeDesc(InternationalStringBranchType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "InternationalStringBranchType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedStringFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "LocalizedStringFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
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
