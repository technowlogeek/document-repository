/**
 * DocumentRepository_BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

import _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.*;
import java.util.*;

public class DocumentRepository_BindingImpl implements _2007.xds_b.iti.ihe.DocumentRepository_PortType {

	private static java.util.Map<String, String> documentStore = new java.util.HashMap<String, String>();
	private RetrieveDocumentSetResponseTypeDocumentResponse[] documentSetArr = null;

	public RegistryResponseType documentRepository_ProvideAndRegisterDocumentSetB(
			_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType body) throws java.rmi.RemoteException {
		ProvideAndRegisterDocumentSetRequestTypeDocument[] document = body.getDocument();
		org.apache.axis.types.URI id;
		if (null == document || document.length < 1) {
			throw new RuntimeException("Document not supplied");
		} else {
			id = document[0].getId();
		}

		if (null == id) {
			throw new RuntimeException("Document id not supplied");
		}

		System.out.println("Storing the document with ID=" + id.getPath());
		System.out.println("Document content=" + document[0].toString());
		DocumentRepository_BindingImpl.documentStore.put(id.getPath().toLowerCase(), document[0].toString());

		RegistryResponseType response = new RegistryResponseType();
		response.setStatus(id);

		return response;
	}

	public RetrieveDocumentSetResponseType documentRepository_RetrieveDocumentSet(
			_2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[] body) throws java.rmi.RemoteException {

		RetrieveDocumentSetResponseType response = new RetrieveDocumentSetResponseType();

		List<String> documentIds = new ArrayList<String>();
		if (null != body && body.length > 0) {
			String documentId = body[0].getDocumentUniqueId();
			if (null != documentId && !documentId.trim().equals("")) {
				String[] tokensByComma = documentId.split(",");
				Arrays.stream(tokensByComma).forEach(e -> {
					if (null != e && !e.trim().equals("")) {
						String[] tokensBySpace = e.split(" ");
						Arrays.stream(tokensBySpace).forEach(e1 -> {
							if (null != e1 && !e1.trim().equals("")) {
								documentIds.add(e1.toLowerCase());
							}
						});
					}
				});
			}
		}

		System.out.println("Requested document IDs=" + documentIds.toString());

		if (documentIds.size() > 0) {
			this.documentSetArr = new RetrieveDocumentSetResponseTypeDocumentResponse[documentIds.size()];
			for (int i = 0; i < documentIds.size(); i++) {
				String documentId = documentIds.get(i);
				String documentString = DocumentRepository_BindingImpl.documentStore.get(documentId);
				if (null == documentString) {
					throw new RuntimeException("Document with id " + documentId + " not found");
				}
				addToDocumentSetArray(documentString, documentId, i);
			}
			response.setDocumentResponse(this.documentSetArr);
		} else if (DocumentRepository_BindingImpl.documentStore.size() > 0) {
			this.documentSetArr = new RetrieveDocumentSetResponseTypeDocumentResponse[DocumentRepository_BindingImpl.documentStore
					.size()];
			DocumentRepository_BindingImpl.documentStore.entrySet().stream().forEach(e -> {

				System.out.println("Document Key=" + e.getKey());
				System.out.println("Document String=" + e.getValue());
				addToDocumentSetArray(e.getValue(), e.getKey(),
						(int) Arrays.stream(this.documentSetArr).filter(el -> el != null).count());

			});
			response.setDocumentResponse(this.documentSetArr);

		} else {
			throw new RuntimeException("Currently no document stored");
		}

		RegistryResponseType registryResponse = new RegistryResponseType();
		registryResponse.setStatus(null);
		response.setRegistryResponse(registryResponse);
		return response;
	}

	private void addToDocumentSetArray(String documentString, String documentId, int index) {
		RetrieveDocumentSetResponseTypeDocumentResponse resType = new RetrieveDocumentSetResponseTypeDocumentResponse();
		resType.setDocument(decodeBase64StringToByteArray(documentString));
		resType.setRepositoryUniqueId("localInMemoryRepository");
		resType.setDocumentUniqueId(documentId);
		resType.setMimeType("text/xml");
		this.documentSetArr[index] = resType;
	}

	private byte[] decodeBase64StringToByteArray(String base64EncStr) {
		byte[] decodedBytes = Base64.getDecoder().decode(base64EncStr);

		System.out.println("Decoded string=" + String.valueOf(decodedBytes));
		return decodedBytes;
	}

}
