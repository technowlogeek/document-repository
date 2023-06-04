/**
 * RegistryObjectQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.query.xsd.ebxml_regrep.tc.names.oasis;

public class RegistryObjectQueryType  extends _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterQueryType  implements java.io.Serializable {
    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType[] slotBranch;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType nameBranch;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType descriptionBranch;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType versionInfoFilter;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType[] classificationQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType[] externalIdentifierQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType objectTypeQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType statusQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] sourceAssociationQuery;

    private _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] targetAssociationQuery;

    public RegistryObjectQueryType() {
    }

    public RegistryObjectQueryType(
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
           _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] targetAssociationQuery) {
        super(
            primaryFilter);
        this.slotBranch = slotBranch;
        this.nameBranch = nameBranch;
        this.descriptionBranch = descriptionBranch;
        this.versionInfoFilter = versionInfoFilter;
        this.classificationQuery = classificationQuery;
        this.externalIdentifierQuery = externalIdentifierQuery;
        this.objectTypeQuery = objectTypeQuery;
        this.statusQuery = statusQuery;
        this.sourceAssociationQuery = sourceAssociationQuery;
        this.targetAssociationQuery = targetAssociationQuery;
    }


    /**
     * Gets the slotBranch value for this RegistryObjectQueryType.
     * 
     * @return slotBranch
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType[] getSlotBranch() {
        return slotBranch;
    }


    /**
     * Sets the slotBranch value for this RegistryObjectQueryType.
     * 
     * @param slotBranch
     */
    public void setSlotBranch(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType[] slotBranch) {
        this.slotBranch = slotBranch;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType getSlotBranch(int i) {
        return this.slotBranch[i];
    }

    public void setSlotBranch(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType _value) {
        this.slotBranch[i] = _value;
    }


    /**
     * Gets the nameBranch value for this RegistryObjectQueryType.
     * 
     * @return nameBranch
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType getNameBranch() {
        return nameBranch;
    }


    /**
     * Sets the nameBranch value for this RegistryObjectQueryType.
     * 
     * @param nameBranch
     */
    public void setNameBranch(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType nameBranch) {
        this.nameBranch = nameBranch;
    }


    /**
     * Gets the descriptionBranch value for this RegistryObjectQueryType.
     * 
     * @return descriptionBranch
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType getDescriptionBranch() {
        return descriptionBranch;
    }


    /**
     * Sets the descriptionBranch value for this RegistryObjectQueryType.
     * 
     * @param descriptionBranch
     */
    public void setDescriptionBranch(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType descriptionBranch) {
        this.descriptionBranch = descriptionBranch;
    }


    /**
     * Gets the versionInfoFilter value for this RegistryObjectQueryType.
     * 
     * @return versionInfoFilter
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType getVersionInfoFilter() {
        return versionInfoFilter;
    }


    /**
     * Sets the versionInfoFilter value for this RegistryObjectQueryType.
     * 
     * @param versionInfoFilter
     */
    public void setVersionInfoFilter(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType versionInfoFilter) {
        this.versionInfoFilter = versionInfoFilter;
    }


    /**
     * Gets the classificationQuery value for this RegistryObjectQueryType.
     * 
     * @return classificationQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType[] getClassificationQuery() {
        return classificationQuery;
    }


    /**
     * Sets the classificationQuery value for this RegistryObjectQueryType.
     * 
     * @param classificationQuery
     */
    public void setClassificationQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType[] classificationQuery) {
        this.classificationQuery = classificationQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType getClassificationQuery(int i) {
        return this.classificationQuery[i];
    }

    public void setClassificationQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType _value) {
        this.classificationQuery[i] = _value;
    }


    /**
     * Gets the externalIdentifierQuery value for this RegistryObjectQueryType.
     * 
     * @return externalIdentifierQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType[] getExternalIdentifierQuery() {
        return externalIdentifierQuery;
    }


    /**
     * Sets the externalIdentifierQuery value for this RegistryObjectQueryType.
     * 
     * @param externalIdentifierQuery
     */
    public void setExternalIdentifierQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType[] externalIdentifierQuery) {
        this.externalIdentifierQuery = externalIdentifierQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType getExternalIdentifierQuery(int i) {
        return this.externalIdentifierQuery[i];
    }

    public void setExternalIdentifierQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType _value) {
        this.externalIdentifierQuery[i] = _value;
    }


    /**
     * Gets the objectTypeQuery value for this RegistryObjectQueryType.
     * 
     * @return objectTypeQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getObjectTypeQuery() {
        return objectTypeQuery;
    }


    /**
     * Sets the objectTypeQuery value for this RegistryObjectQueryType.
     * 
     * @param objectTypeQuery
     */
    public void setObjectTypeQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType objectTypeQuery) {
        this.objectTypeQuery = objectTypeQuery;
    }


    /**
     * Gets the statusQuery value for this RegistryObjectQueryType.
     * 
     * @return statusQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType getStatusQuery() {
        return statusQuery;
    }


    /**
     * Sets the statusQuery value for this RegistryObjectQueryType.
     * 
     * @param statusQuery
     */
    public void setStatusQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType statusQuery) {
        this.statusQuery = statusQuery;
    }


    /**
     * Gets the sourceAssociationQuery value for this RegistryObjectQueryType.
     * 
     * @return sourceAssociationQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] getSourceAssociationQuery() {
        return sourceAssociationQuery;
    }


    /**
     * Sets the sourceAssociationQuery value for this RegistryObjectQueryType.
     * 
     * @param sourceAssociationQuery
     */
    public void setSourceAssociationQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] sourceAssociationQuery) {
        this.sourceAssociationQuery = sourceAssociationQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType getSourceAssociationQuery(int i) {
        return this.sourceAssociationQuery[i];
    }

    public void setSourceAssociationQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType _value) {
        this.sourceAssociationQuery[i] = _value;
    }


    /**
     * Gets the targetAssociationQuery value for this RegistryObjectQueryType.
     * 
     * @return targetAssociationQuery
     */
    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] getTargetAssociationQuery() {
        return targetAssociationQuery;
    }


    /**
     * Sets the targetAssociationQuery value for this RegistryObjectQueryType.
     * 
     * @param targetAssociationQuery
     */
    public void setTargetAssociationQuery(_0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType[] targetAssociationQuery) {
        this.targetAssociationQuery = targetAssociationQuery;
    }

    public _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType getTargetAssociationQuery(int i) {
        return this.targetAssociationQuery[i];
    }

    public void setTargetAssociationQuery(int i, _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType _value) {
        this.targetAssociationQuery[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistryObjectQueryType)) return false;
        RegistryObjectQueryType other = (RegistryObjectQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.slotBranch==null && other.getSlotBranch()==null) || 
             (this.slotBranch!=null &&
              java.util.Arrays.equals(this.slotBranch, other.getSlotBranch()))) &&
            ((this.nameBranch==null && other.getNameBranch()==null) || 
             (this.nameBranch!=null &&
              this.nameBranch.equals(other.getNameBranch()))) &&
            ((this.descriptionBranch==null && other.getDescriptionBranch()==null) || 
             (this.descriptionBranch!=null &&
              this.descriptionBranch.equals(other.getDescriptionBranch()))) &&
            ((this.versionInfoFilter==null && other.getVersionInfoFilter()==null) || 
             (this.versionInfoFilter!=null &&
              this.versionInfoFilter.equals(other.getVersionInfoFilter()))) &&
            ((this.classificationQuery==null && other.getClassificationQuery()==null) || 
             (this.classificationQuery!=null &&
              java.util.Arrays.equals(this.classificationQuery, other.getClassificationQuery()))) &&
            ((this.externalIdentifierQuery==null && other.getExternalIdentifierQuery()==null) || 
             (this.externalIdentifierQuery!=null &&
              java.util.Arrays.equals(this.externalIdentifierQuery, other.getExternalIdentifierQuery()))) &&
            ((this.objectTypeQuery==null && other.getObjectTypeQuery()==null) || 
             (this.objectTypeQuery!=null &&
              this.objectTypeQuery.equals(other.getObjectTypeQuery()))) &&
            ((this.statusQuery==null && other.getStatusQuery()==null) || 
             (this.statusQuery!=null &&
              this.statusQuery.equals(other.getStatusQuery()))) &&
            ((this.sourceAssociationQuery==null && other.getSourceAssociationQuery()==null) || 
             (this.sourceAssociationQuery!=null &&
              java.util.Arrays.equals(this.sourceAssociationQuery, other.getSourceAssociationQuery()))) &&
            ((this.targetAssociationQuery==null && other.getTargetAssociationQuery()==null) || 
             (this.targetAssociationQuery!=null &&
              java.util.Arrays.equals(this.targetAssociationQuery, other.getTargetAssociationQuery())));
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
        if (getSlotBranch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSlotBranch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSlotBranch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameBranch() != null) {
            _hashCode += getNameBranch().hashCode();
        }
        if (getDescriptionBranch() != null) {
            _hashCode += getDescriptionBranch().hashCode();
        }
        if (getVersionInfoFilter() != null) {
            _hashCode += getVersionInfoFilter().hashCode();
        }
        if (getClassificationQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassificationQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassificationQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalIdentifierQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalIdentifierQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalIdentifierQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjectTypeQuery() != null) {
            _hashCode += getObjectTypeQuery().hashCode();
        }
        if (getStatusQuery() != null) {
            _hashCode += getStatusQuery().hashCode();
        }
        if (getSourceAssociationQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceAssociationQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceAssociationQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetAssociationQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetAssociationQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetAssociationQuery(), i);
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
        new org.apache.axis.description.TypeDesc(RegistryObjectQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SlotBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SlotBranchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "NameBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "InternationalStringBranchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "DescriptionBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "InternationalStringBranchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionInfoFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "VersionInfoFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdentifierQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalIdentifierQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalIdentifierQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectTypeQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ObjectTypeQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "StatusQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAssociationQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SourceAssociationQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AssociationQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAssociationQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "TargetAssociationQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AssociationQueryType"));
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
