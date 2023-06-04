/**
 * DocumentRepository_BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;
import _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.*;
import _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.*;
import java.util.*;

public class DocumentRepository_BindingImpl implements _2007.xds_b.iti.ihe.DocumentRepository_PortType{
	
	private static java.util.Map<String, String> documentStore = new java.util.HashMap<String, String>();
	
    public RegistryResponseType documentRepository_ProvideAndRegisterDocumentSetB(_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType body) throws java.rmi.RemoteException {
    	ProvideAndRegisterDocumentSetRequestTypeDocument[] document = body.getDocument();
    	org.apache.axis.types.URI id;
    	if(null == document || document.length < 1) {
    		throw new RuntimeException("Document not supplied");
    	} else {
    		id = document[0].getId();
    	}
    	
    	if(null == id) {
    		throw new RuntimeException("Document id not supplied");
    	}
    	
    	System.out.println("Storing the document with ID="+id.getPath());
    	System.out.println("Document content="+document[0].toString());
    	DocumentRepository_BindingImpl.documentStore.put(id.getPath(), document[0].toString());
    	
    	RegistryResponseType response = new RegistryResponseType();
    	response.setStatus(id);
    	
    	return response;
    }

    public RetrieveDocumentSetResponseType documentRepository_RetrieveDocumentSet(_2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[] body) throws java.rmi.RemoteException {
    	
    	RetrieveDocumentSetResponseType response = new RetrieveDocumentSetResponseType();
    	
    	
    	
    	
    	String documentId = null;
    	if(null != body && body.length > 0) {
    		documentId = body[0].getDocumentUniqueId();
    	}
    	
    	System.out.println("Requested document ID="+documentId);
    	    	
    	if(null == documentId || !documentId.equals("?")) {
    		
    		String documentString = DocumentRepository_BindingImpl.documentStore.get(documentId);
    		if(null == documentString) {
    			throw new RuntimeException("Document with id " + documentId + " not found");
    		}
    		RetrieveDocumentSetResponseTypeDocumentResponse resType =  new RetrieveDocumentSetResponseTypeDocumentResponse();
    		resType.setDocument(documentString.getBytes());
    		resType.setRepositoryUniqueId("localInMemoryRepository");
    		resType.setDocumentUniqueId(documentId);
    		resType.setMimeType("text/xml");
    		RetrieveDocumentSetResponseTypeDocumentResponse[] responseType = new RetrieveDocumentSetResponseTypeDocumentResponse[]{resType};
    		response.setDocumentResponse(responseType);
    	} else if (DocumentRepository_BindingImpl.documentStore.size() > 0){
    		List<RetrieveDocumentSetResponseTypeDocumentResponse> responseType = new ArrayList<RetrieveDocumentSetResponseTypeDocumentResponse>();
    		
    		final String dId = documentId;
    		DocumentRepository_BindingImpl.documentStore.entrySet().stream().forEach( e -> {
    			RetrieveDocumentSetResponseTypeDocumentResponse resType =  new RetrieveDocumentSetResponseTypeDocumentResponse();
    			System.out.println("Document String="+e.getValue());
    			System.out.println();
    			System.out.print("Document String bytes=");
    			
    			byte[] decodedBytes = Base64.getDecoder().decode(e.getValue());
    			String decodedString = new String(decodedBytes);
    			
    			System.out.println("Decoded string="+decodedString);
	    		resType.setDocument(decodedBytes);
	    		resType.setRepositoryUniqueId("localInMemoryRepository");
	    		resType.setDocumentUniqueId(dId);
	    		resType.setMimeType("text/xml");
	    		responseType.add(resType);
    		});
    		
    		RetrieveDocumentSetResponseTypeDocumentResponse[] responseTypeArr = new RetrieveDocumentSetResponseTypeDocumentResponse[responseType.size()];
    		for(int i=0; i<responseType.size(); i++) {
    			responseTypeArr[i] = responseType.get(i);
    		}

    		response.setDocumentResponse(responseTypeArr);
    		
    	} else {
    		throw new RuntimeException("Currently no document registered");
    	}
    	
    	RegistryResponseType registryResponse = new RegistryResponseType();
		registryResponse.setStatus(null);
		response.setRegistryResponse(registryResponse);
    	return response;
    }

}
