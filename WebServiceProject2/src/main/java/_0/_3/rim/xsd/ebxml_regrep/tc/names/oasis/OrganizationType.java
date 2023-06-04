/**
 * OrganizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.rim.xsd.ebxml_regrep.tc.names.oasis;


/**
 * Mapping of the same named interface in ebRIM.
 */
public class OrganizationType  extends _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType[] address;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType[] telephoneNumber;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType[] emailAddress;

    private org.apache.axis.types.URI parent;  // attribute

    private org.apache.axis.types.URI primaryContact;  // attribute

    public OrganizationType() {
    }

    public OrganizationType(
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
           org.apache.axis.types.URI primaryContact,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType[] address,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType[] telephoneNumber,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType[] emailAddress) {
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
        this.primaryContact = primaryContact;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the address value for this OrganizationType.
     * 
     * @return address
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this OrganizationType.
     * 
     * @param address
     */
    public void setAddress(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType[] address) {
        this.address = address;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the telephoneNumber value for this OrganizationType.
     * 
     * @return telephoneNumber
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType[] getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this OrganizationType.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType[] telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType getTelephoneNumber(int i) {
        return this.telephoneNumber[i];
    }

    public void setTelephoneNumber(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType _value) {
        this.telephoneNumber[i] = _value;
    }


    /**
     * Gets the emailAddress value for this OrganizationType.
     * 
     * @return emailAddress
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType[] getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this OrganizationType.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType[] emailAddress) {
        this.emailAddress = emailAddress;
    }

    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType getEmailAddress(int i) {
        return this.emailAddress[i];
    }

    public void setEmailAddress(int i, _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType _value) {
        this.emailAddress[i] = _value;
    }


    /**
     * Gets the parent value for this OrganizationType.
     * 
     * @return parent
     */
    public org.apache.axis.types.URI getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this OrganizationType.
     * 
     * @param parent
     */
    public void setParent(org.apache.axis.types.URI parent) {
        this.parent = parent;
    }


    /**
     * Gets the primaryContact value for this OrganizationType.
     * 
     * @return primaryContact
     */
    public org.apache.axis.types.URI getPrimaryContact() {
        return primaryContact;
    }


    /**
     * Sets the primaryContact value for this OrganizationType.
     * 
     * @param primaryContact
     */
    public void setPrimaryContact(org.apache.axis.types.URI primaryContact) {
        this.primaryContact = primaryContact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationType)) return false;
        OrganizationType other = (OrganizationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.telephoneNumber==null && other.getTelephoneNumber()==null) || 
             (this.telephoneNumber!=null &&
              java.util.Arrays.equals(this.telephoneNumber, other.getTelephoneNumber()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              java.util.Arrays.equals(this.emailAddress, other.getEmailAddress()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.primaryContact==null && other.getPrimaryContact()==null) || 
             (this.primaryContact!=null &&
              this.primaryContact.equals(other.getPrimaryContact())));
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
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelephoneNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephoneNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephoneNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPrimaryContact() != null) {
            _hashCode += getPrimaryContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "OrganizationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("parent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "parent"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("primaryContact");
        attrField.setXmlName(new javax.xml.namespace.QName("", "primaryContact"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "TelephoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "TelephoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "EmailAddress"));
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
