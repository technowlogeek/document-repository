/**
 * DocumentRepository_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class DocumentRepository_ServiceLocator extends org.apache.axis.client.Service implements _2007.xds_b.iti.ihe.DocumentRepository_Service {

    public DocumentRepository_ServiceLocator() {
    }


    public DocumentRepository_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DocumentRepository_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DocumentRepository_Port_soap
    private java.lang.String DocumentRepository_Port_soap_address = "http://localhost:8080/DocumentRepository_Service";

    public java.lang.String getDocumentRepository_Port_soapAddress() {
        return DocumentRepository_Port_soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DocumentRepository_Port_soapWSDDServiceName = "DocumentRepository_Port_soap";

    public java.lang.String getDocumentRepository_Port_soapWSDDServiceName() {
        return DocumentRepository_Port_soapWSDDServiceName;
    }

    public void setDocumentRepository_Port_soapWSDDServiceName(java.lang.String name) {
        DocumentRepository_Port_soapWSDDServiceName = name;
    }

    public _2007.xds_b.iti.ihe.DocumentRepository_PortType getDocumentRepository_Port_soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DocumentRepository_Port_soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDocumentRepository_Port_soap(endpoint);
    }

    public _2007.xds_b.iti.ihe.DocumentRepository_PortType getDocumentRepository_Port_soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            _2007.xds_b.iti.ihe.DocumentRepository_BindingStub _stub = new _2007.xds_b.iti.ihe.DocumentRepository_BindingStub(portAddress, this);
            _stub.setPortName(getDocumentRepository_Port_soapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDocumentRepository_Port_soapEndpointAddress(java.lang.String address) {
        DocumentRepository_Port_soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (_2007.xds_b.iti.ihe.DocumentRepository_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                _2007.xds_b.iti.ihe.DocumentRepository_BindingStub _stub = new _2007.xds_b.iti.ihe.DocumentRepository_BindingStub(new java.net.URL(DocumentRepository_Port_soap_address), this);
                _stub.setPortName(getDocumentRepository_Port_soapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DocumentRepository_Port_soap".equals(inputPortName)) {
            return getDocumentRepository_Port_soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "DocumentRepository_Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "DocumentRepository_Port_soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DocumentRepository_Port_soap".equals(portName)) {
            setDocumentRepository_Port_soapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
