/**
 * DocumentRepository_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public interface DocumentRepository_PortType extends java.rmi.Remote {
    public _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType documentRepository_RetrieveDocumentSet(_2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[] body) throws java.rmi.RemoteException;
    public _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType documentRepository_ProvideAndRegisterDocumentSetB(_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType body) throws java.rmi.RemoteException;
}
