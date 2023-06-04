/**
 * DocumentRepository_BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class DocumentRepository_BindingSkeleton implements _2007.xds_b.iti.ihe.DocumentRepository_PortType, org.apache.axis.wsdl.Skeleton {
    private _2007.xds_b.iti.ihe.DocumentRepository_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "ProvideAndRegisterDocumentSetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "ProvideAndRegisterDocumentSetRequestType"), _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("documentRepository_ProvideAndRegisterDocumentSetB", _params, new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponseType"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DocumentRepository_ProvideAndRegisterDocumentSet-b"));
        _oper.setSoapAction("urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b");
        _myOperationsList.add(_oper);
        if (_myOperations.get("documentRepository_ProvideAndRegisterDocumentSetB") == null) {
            _myOperations.put("documentRepository_ProvideAndRegisterDocumentSetB", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("documentRepository_ProvideAndRegisterDocumentSetB")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetRequestType"), _2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("documentRepository_RetrieveDocumentSet", _params, new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetResponseType"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DocumentRepository_RetrieveDocumentSet"));
        _oper.setSoapAction("urn:ihe:iti:2007:RetrieveDocumentSet");
        _myOperationsList.add(_oper);
        if (_myOperations.get("documentRepository_RetrieveDocumentSet") == null) {
            _myOperations.put("documentRepository_RetrieveDocumentSet", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("documentRepository_RetrieveDocumentSet")).add(_oper);
    }

    public DocumentRepository_BindingSkeleton() {
        this.impl = new _2007.xds_b.iti.ihe.DocumentRepository_BindingImpl();
    }

    public DocumentRepository_BindingSkeleton(_2007.xds_b.iti.ihe.DocumentRepository_PortType impl) {
        this.impl = impl;
    }
    public _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType documentRepository_ProvideAndRegisterDocumentSetB(_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType body) throws java.rmi.RemoteException
    {
    	System.out.println("provide and register document set invoked");
        _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType ret = impl.documentRepository_ProvideAndRegisterDocumentSetB(body);
        return ret;
    }

    public _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType documentRepository_RetrieveDocumentSet(_2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[] body) throws java.rmi.RemoteException
    {
    	System.out.println("Retrieve document set invoked");
        _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType ret = impl.documentRepository_RetrieveDocumentSet(body);
        return ret;
    }

}
