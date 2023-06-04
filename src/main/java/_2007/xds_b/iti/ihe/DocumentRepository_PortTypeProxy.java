package _2007.xds_b.iti.ihe;

public class DocumentRepository_PortTypeProxy implements _2007.xds_b.iti.ihe.DocumentRepository_PortType {
  private String _endpoint = null;
  private _2007.xds_b.iti.ihe.DocumentRepository_PortType documentRepository_PortType = null;
  
  public DocumentRepository_PortTypeProxy() {
    _initDocumentRepository_PortTypeProxy();
  }
  
  public DocumentRepository_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocumentRepository_PortTypeProxy();
  }
  
  private void _initDocumentRepository_PortTypeProxy() {
    try {
      documentRepository_PortType = (new _2007.xds_b.iti.ihe.DocumentRepository_ServiceLocator()).getDocumentRepository_Port_soap();
      if (documentRepository_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)documentRepository_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)documentRepository_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (documentRepository_PortType != null)
      ((javax.xml.rpc.Stub)documentRepository_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _2007.xds_b.iti.ihe.DocumentRepository_PortType getDocumentRepository_PortType() {
    if (documentRepository_PortType == null)
      _initDocumentRepository_PortTypeProxy();
    return documentRepository_PortType;
  }
  
  public _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType documentRepository_RetrieveDocumentSet(_2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[] body) throws java.rmi.RemoteException{
    if (documentRepository_PortType == null)
      _initDocumentRepository_PortTypeProxy();
    return documentRepository_PortType.documentRepository_RetrieveDocumentSet(body);
  }
  
  public _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType documentRepository_ProvideAndRegisterDocumentSetB(_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType body) throws java.rmi.RemoteException{
    if (documentRepository_PortType == null)
      _initDocumentRepository_PortTypeProxy();
    return documentRepository_PortType.documentRepository_ProvideAndRegisterDocumentSetB(body);
  }
  
  
}