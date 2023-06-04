/**
 * DocumentRepository_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _2007.xds_b.iti.ihe;

public class DocumentRepository_BindingStub extends org.apache.axis.client.Stub implements _2007.xds_b.iti.ihe.DocumentRepository_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DocumentRepository_ProvideAndRegisterDocumentSet-b");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "ProvideAndRegisterDocumentSetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "ProvideAndRegisterDocumentSetRequestType"), _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponseType"));
        oper.setReturnClass(_0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DocumentRepository_RetrieveDocumentSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetRequestType"), _2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "DocumentRequest"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetResponseType"));
        oper.setReturnClass(_2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public DocumentRepository_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DocumentRepository_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DocumentRepository_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">ProvideAndRegisterDocumentSetRequestType>Document");
            cachedSerQNames.add(qName);
            cls = _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestTypeDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">RetrieveDocumentSetRequestType>DocumentRequest");
            cachedSerQNames.add(qName);
            cls = _2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">RetrieveDocumentSetResponseType>DocumentResponse");
            cachedSerQNames.add(qName);
            cls = _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseTypeDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "ProvideAndRegisterDocumentSetRequestType");
            cachedSerQNames.add(qName);
            cls = _2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetRequestType");
            cachedSerQNames.add(qName);
            cls = _2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", ">RetrieveDocumentSetRequestType>DocumentRequest");
            qName2 = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "DocumentRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ihe:iti:xds-b:2007", "RetrieveDocumentSetResponseType");
            cachedSerQNames.add(qName);
            cls = _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">AcceptObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.AcceptObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">ApproveObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.ApproveObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">DeprecateObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.DeprecateObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">RelocateObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.RelocateObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">RemoveObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.RemoveObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">SubmitObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.SubmitObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">UndeprecateObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.UndeprecateObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", ">UpdateObjectsRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.lcm.xsd.ebxml_regrep.tc.names.oasis.UpdateObjectsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">AdhocQueryRequest");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">AdhocQueryResponse");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">CompoundFilterType>logicalOperator");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.CompoundFilterTypeLogicalOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">ResponseOptionType>returnType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionTypeReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", ">SimpleFilterType>comparator");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SimpleFilterTypeComparator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AdhocQueryQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AssociationQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AssociationQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AuditableEventQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.AuditableEventQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "BooleanFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.BooleanFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "BranchType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.BranchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationSchemeQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "CompoundFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.CompoundFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "DateTimeFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.DateTimeFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalIdentifierQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalLinkQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExternalLinkQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExtrinsicObjectQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ExtrinsicObjectQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FederationQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FederationQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FloatFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.FloatFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "IntegerFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.IntegerFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "InternationalStringBranchType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.InternationalStringBranchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "NotificationQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.NotificationQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "OrganizationQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.OrganizationQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "PersonQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.PersonQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "QueryExpressionBranchType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.QueryExpressionBranchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryPackageQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryPackageQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.RegistryQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ResponseOptionType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ResponseOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceBindingQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.ServiceQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SimpleFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SimpleFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SlotBranchType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SlotBranchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SpecificationLinkQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "StringFilterType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.StringFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SubscriptionQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.SubscriptionQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "UserQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.query.xsd.ebxml_regrep.tc.names.oasis.UserQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", ">RegistryType>conformanceProfile");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryTypeConformanceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ActionType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AdhocQueryType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AdhocQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AssociationType1");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AssociationType1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "AuditableEventType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.AuditableEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationNodeType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationNodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationSchemeType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationSchemeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ClassificationType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "EmailAddressType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.EmailAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExternalIdentifierType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExternalLinkType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExternalLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ExtrinsicObjectType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ExtrinsicObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "FederationType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.FederationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "FreeFormText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "IdentifiableType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Slot");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "InternationalStringType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.InternationalStringType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LocalizedStringType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.LocalizedStringType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "LongName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "NotificationType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "NotifyActionType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.NotifyActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefListType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ObjectRefType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ObjectRefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "OrganizationType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.OrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "PersonNameType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PersonNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "PersonType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PersonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "PostalAddressType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.PostalAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "QueryExpressionType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.QueryExpressionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "referenceURI");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryObjectListType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Identifiable");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryObjectType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryPackageType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryPackageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "RegistryType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.RegistryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ServiceBindingType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ServiceBindingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ServiceType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ShortName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SlotListType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "Slot");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SlotType1");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SlotType1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SpecificationLinkType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SpecificationLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "String16");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "String32");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "String4");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "String8");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "SubscriptionType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.SubscriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "TelephoneNumberListType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "TelephoneNumber");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "TelephoneNumberType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.TelephoneNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "UserType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "ValueListType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.ValueListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", "VersionInfoType");
            cachedSerQNames.add(qName);
            cls = _0._3.rim.xsd.ebxml_regrep.tc.names.oasis.VersionInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", ">RegistryError");
            cachedSerQNames.add(qName);
            cls = _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", ">RegistryErrorList");
            cachedSerQNames.add(qName);
            cls = _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryError");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryRequestType");
            cachedSerQNames.add(qName);
            cls = _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponseType");
            cachedSerQNames.add(qName);
            cls = _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType documentRepository_ProvideAndRegisterDocumentSetB(_2007.xds_b.iti.ihe.ProvideAndRegisterDocumentSetRequestType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DocumentRepository_ProvideAndRegisterDocumentSet-b"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (_0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, _0._3.rs.xsd.ebxml_regrep.tc.names.oasis.RegistryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType documentRepository_RetrieveDocumentSet(_2007.xds_b.iti.ihe.RetrieveDocumentSetRequestTypeDocumentRequest[] body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ihe:iti:2007:RetrieveDocumentSet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DocumentRepository_RetrieveDocumentSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (_2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, _2007.xds_b.iti.ihe.RetrieveDocumentSetResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
