/**
 * PersonQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class PersonQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] addressFilter;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType personNameFilter;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] telephoneNumberFilter;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] emailAddressFilter;

    public PersonQueryType() {
    }

    public PersonQueryType(
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType primaryFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType[] slotBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType nameBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType descriptionBranch,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType versionInfoFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType[] classificationQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType[] externalIdentifierQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType objectTypeQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType statusQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] sourceAssociationQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] targetAssociationQuery,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] addressFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType personNameFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] telephoneNumberFilter,
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] emailAddressFilter) {
        super(
            primaryFilter,
            slotBranch,
            nameBranch,
            descriptionBranch,
            versionInfoFilter,
            classificationQuery,
            externalIdentifierQuery,
            objectTypeQuery,
            statusQuery,
            sourceAssociationQuery,
            targetAssociationQuery);
        this.addressFilter = addressFilter;
        this.personNameFilter = personNameFilter;
        this.telephoneNumberFilter = telephoneNumberFilter;
        this.emailAddressFilter = emailAddressFilter;
    }


    /**
     * Gets the addressFilter value for this PersonQueryType.
     * 
     * @return addressFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] getAddressFilter() {
        return addressFilter;
    }


    /**
     * Sets the addressFilter value for this PersonQueryType.
     * 
     * @param addressFilter
     */
    public void setAddressFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] addressFilter) {
        this.addressFilter = addressFilter;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getAddressFilter(int i) {
        return this.addressFilter[i];
    }

    public void setAddressFilter(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType _value) {
        this.addressFilter[i] = _value;
    }


    /**
     * Gets the personNameFilter value for this PersonQueryType.
     * 
     * @return personNameFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getPersonNameFilter() {
        return personNameFilter;
    }


    /**
     * Sets the personNameFilter value for this PersonQueryType.
     * 
     * @param personNameFilter
     */
    public void setPersonNameFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType personNameFilter) {
        this.personNameFilter = personNameFilter;
    }


    /**
     * Gets the telephoneNumberFilter value for this PersonQueryType.
     * 
     * @return telephoneNumberFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] getTelephoneNumberFilter() {
        return telephoneNumberFilter;
    }


    /**
     * Sets the telephoneNumberFilter value for this PersonQueryType.
     * 
     * @param telephoneNumberFilter
     */
    public void setTelephoneNumberFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] telephoneNumberFilter) {
        this.telephoneNumberFilter = telephoneNumberFilter;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getTelephoneNumberFilter(int i) {
        return this.telephoneNumberFilter[i];
    }

    public void setTelephoneNumberFilter(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType _value) {
        this.telephoneNumberFilter[i] = _value;
    }


    /**
     * Gets the emailAddressFilter value for this PersonQueryType.
     * 
     * @return emailAddressFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] getEmailAddressFilter() {
        return emailAddressFilter;
    }


    /**
     * Sets the emailAddressFilter value for this PersonQueryType.
     * 
     * @param emailAddressFilter
     */
    public void setEmailAddressFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType[] emailAddressFilter) {
        this.emailAddressFilter = emailAddressFilter;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getEmailAddressFilter(int i) {
        return this.emailAddressFilter[i];
    }

    public void setEmailAddressFilter(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType _value) {
        this.emailAddressFilter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonQueryType)) return false;
        PersonQueryType other = (PersonQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressFilter==null && other.getAddressFilter()==null) || 
             (this.addressFilter!=null &&
              java.util.Arrays.equals(this.addressFilter, other.getAddressFilter()))) &&
            ((this.personNameFilter==null && other.getPersonNameFilter()==null) || 
             (this.personNameFilter!=null &&
              this.personNameFilter.equals(other.getPersonNameFilter()))) &&
            ((this.telephoneNumberFilter==null && other.getTelephoneNumberFilter()==null) || 
             (this.telephoneNumberFilter!=null &&
              java.util.Arrays.equals(this.telephoneNumberFilter, other.getTelephoneNumberFilter()))) &&
            ((this.emailAddressFilter==null && other.getEmailAddressFilter()==null) || 
             (this.emailAddressFilter!=null &&
              java.util.Arrays.equals(this.emailAddressFilter, other.getEmailAddressFilter())));
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
        if (getAddressFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonNameFilter() != null) {
            _hashCode += getPersonNameFilter().hashCode();
        }
        if (getTelephoneNumberFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephoneNumberFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephoneNumberFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailAddressFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailAddressFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailAddressFilter(), i);
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
        new org.apache.axis.description.TypeDesc(PersonQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "PersonQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AddressFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "PersonNameFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneNumberFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "TelephoneNumberFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddressFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "EmailAddressFilter"));
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
