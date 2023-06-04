/**
 * RelocateObjectsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis;

public class RelocateObjectsRequest  extends _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryRequestType  implements java.io.Serializable {
    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType sourceRegistry;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType destinationRegistry;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType ownerAtSource;

    private _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType ownerAtDestination;

    public RelocateObjectsRequest() {
    }

    public RelocateObjectsRequest(
           org.apache.axis.types.URI id,
           java.lang.String comment,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[] requestSlotList,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType sourceRegistry,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType destinationRegistry,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType ownerAtSource,
           _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType ownerAtDestination) {
        super(requestSlotList,
            id,
            comment);
        this.adhocQuery = adhocQuery;
        this.sourceRegistry = sourceRegistry;
        this.destinationRegistry = destinationRegistry;
        this.ownerAtSource = ownerAtSource;
        this.ownerAtDestination = ownerAtDestination;
    }


    /**
     * Gets the adhocQuery value for this RelocateObjectsRequest.
     * 
     * @return adhocQuery
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }


    /**
     * Sets the adhocQuery value for this RelocateObjectsRequest.
     * 
     * @param adhocQuery
     */
    public void setAdhocQuery(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType adhocQuery) {
        this.adhocQuery = adhocQuery;
    }


    /**
     * Gets the sourceRegistry value for this RelocateObjectsRequest.
     * 
     * @return sourceRegistry
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType getSourceRegistry() {
        return sourceRegistry;
    }


    /**
     * Sets the sourceRegistry value for this RelocateObjectsRequest.
     * 
     * @param sourceRegistry
     */
    public void setSourceRegistry(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType sourceRegistry) {
        this.sourceRegistry = sourceRegistry;
    }


    /**
     * Gets the destinationRegistry value for this RelocateObjectsRequest.
     * 
     * @return destinationRegistry
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType getDestinationRegistry() {
        return destinationRegistry;
    }


    /**
     * Sets the destinationRegistry value for this RelocateObjectsRequest.
     * 
     * @param destinationRegistry
     */
    public void setDestinationRegistry(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType destinationRegistry) {
        this.destinationRegistry = destinationRegistry;
    }


    /**
     * Gets the ownerAtSource value for this RelocateObjectsRequest.
     * 
     * @return ownerAtSource
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType getOwnerAtSource() {
        return ownerAtSource;
    }


    /**
     * Sets the ownerAtSource value for this RelocateObjectsRequest.
     * 
     * @param ownerAtSource
     */
    public void setOwnerAtSource(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType ownerAtSource) {
        this.ownerAtSource = ownerAtSource;
    }


    /**
     * Gets the ownerAtDestination value for this RelocateObjectsRequest.
     * 
     * @return ownerAtDestination
     */
    public _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType getOwnerAtDestination() {
        return ownerAtDestination;
    }


    /**
     * Sets the ownerAtDestination value for this RelocateObjectsRequest.
     * 
     * @param ownerAtDestination
     */
    public void setOwnerAtDestination(_0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType ownerAtDestination) {
        this.ownerAtDestination = ownerAtDestination;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelocateObjectsRequest)) return false;
        RelocateObjectsRequest other = (RelocateObjectsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adhocQuery==null && other.getAdhocQuery()==null) || 
             (this.adhocQuery!=null &&
              this.adhocQuery.equals(other.getAdhocQuery()))) &&
            ((this.sourceRegistry==null && other.getSourceRegistry()==null) || 
             (this.sourceRegistry!=null &&
              this.sourceRegistry.equals(other.getSourceRegistry()))) &&
            ((this.destinationRegistry==null && other.getDestinationRegistry()==null) || 
             (this.destinationRegistry!=null &&
              this.destinationRegistry.equals(other.getDestinationRegistry()))) &&
            ((this.ownerAtSource==null && other.getOwnerAtSource()==null) || 
             (this.ownerAtSource!=null &&
              this.ownerAtSource.equals(other.getOwnerAtSource()))) &&
            ((this.ownerAtDestination==null && other.getOwnerAtDestination()==null) || 
             (this.ownerAtDestination!=null &&
              this.ownerAtDestination.equals(other.getOwnerAtDestination())));
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
        if (getAdhocQuery() != null) {
            _hashCode += getAdhocQuery().hashCode();
        }
        if (getSourceRegistry() != null) {
            _hashCode += getSourceRegistry().hashCode();
        }
        if (getDestinationRegistry() != null) {
            _hashCode += getDestinationRegistry().hashCode();
        }
        if (getOwnerAtSource() != null) {
            _hashCode += getOwnerAtSource().hashCode();
        }
        if (getOwnerAtDestination() != null) {
            _hashCode += getOwnerAtDestination().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelocateObjectsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">RelocateObjectsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adhocQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQueryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRegistry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", "SourceRegistry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationRegistry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", "DestinationRegistry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerAtSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", "OwnerAtSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerAtDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", "OwnerAtDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefType"));
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
