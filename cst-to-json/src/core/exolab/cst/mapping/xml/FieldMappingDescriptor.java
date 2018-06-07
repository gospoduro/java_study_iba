/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package core.exolab.cst.mapping.xml;

/**
 * Class FieldMappingDescriptor.
 * 
 * @version $Revision$ $Date: 2006-02-14 07:53:50 -0700 (Tue, 14 Feb 2006) $
 */
public class FieldMappingDescriptor extends core.exolab.cst.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field elementDefinition
     */
    private boolean elementDefinition;

    /**
     * Field nsPrefix
     */
    private java.lang.String nsPrefix;

    /**
     * Field nsURI
     */
    private java.lang.String nsURI;

    /**
     * Field xmlName
     */
    private java.lang.String xmlName;

    /**
     * Field identity
     */
    private core.exolab.cst.xml.XMLFieldDescriptor identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public FieldMappingDescriptor() 
     {
        super();
        nsURI = "http://castor.exolab.org/";
        xmlName = "field";
        elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        core.exolab.cst.xml.util.XMLFieldDescriptorImpl  desc           = null;
        core.exolab.cst.mapping.FieldHandler             handler        = null;
        core.exolab.cst.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- _name
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_name", "name", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getName();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setName( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _name
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _type
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_type", "type", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getType();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setType( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _type
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _required
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_required", "required", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                if(!target.hasRequired())
                    return null;
                return (target.getRequired() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteRequired();
                        return;
                    }
                    target.setRequired( ((java.lang.Boolean)value).booleanValue());
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _required
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _transient
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_transient", "transient", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                if(!target.hasTransient())
                    return null;
                return (target.getTransient() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteTransient();
                        return;
                    }
                    target.setTransient( ((java.lang.Boolean)value).booleanValue());
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _transient
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _direct
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_direct", "direct", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                if(!target.hasDirect())
                    return null;
                return (target.getDirect() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteDirect();
                        return;
                    }
                    target.setDirect( ((java.lang.Boolean)value).booleanValue());
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _direct
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _lazy
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_lazy", "lazy", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                if(!target.hasLazy())
                    return null;
                return (target.getLazy() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteLazy();
                        return;
                    }
                    target.setLazy( ((java.lang.Boolean)value).booleanValue());
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _lazy
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _container
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_container", "container", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                if(!target.hasContainer())
                    return null;
                return (target.getContainer() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteContainer();
                        return;
                    }
                    target.setContainer( ((java.lang.Boolean)value).booleanValue());
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _container
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _getMethod
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_getMethod", "get-method", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getGetMethod();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setGetMethod( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _getMethod
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _hasMethod
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_hasMethod", "has-method", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getHasMethod();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setHasMethod( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _hasMethod
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _setMethod
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_setMethod", "set-method", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getSetMethod();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setSetMethod( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _setMethod
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _createMethod
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_createMethod", "create-method", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getCreateMethod();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setCreateMethod( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _createMethod
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _handler
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_handler", "handler", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getHandler();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setHandler( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _handler
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _collection
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.types.FieldMappingCollectionType.class, "_collection", "collection", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getCollection();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setCollection( (core.exolab.cst.mapping.xml.types.FieldMappingCollectionType) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        handler = new core.exolab.cst.xml.handlers.EnumFieldHandler(core.exolab.cst.mapping.xml.types.FieldMappingCollectionType.class, handler);
        desc.setImmutable(true);
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _collection
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _comparator
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_comparator", "comparator", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getComparator();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setComparator( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _comparator
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _identity
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_identity", "identity", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                if(!target.hasIdentity())
                    return null;
                return (target.getIdentity() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteIdentity();
                        return;
                    }
                    target.setIdentity( ((java.lang.Boolean)value).booleanValue());
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _identity
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors
        
        //-- _description
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_description", "description", core.exolab.cst.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getDescription();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setDescription( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _description
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _sql
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.Sql.class, "_sql", "sql", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getSql();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setSql( (core.exolab.cst.mapping.xml.Sql) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.Sql();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _sql
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _bindXml
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.BindXml.class, "_bindXml", "bind-xml", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getBindXml();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setBindXml( (core.exolab.cst.mapping.xml.BindXml) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.BindXml();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _bindXml
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _ldap
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.Ldap.class, "_ldap", "ldap", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                FieldMapping target = (FieldMapping) object;
                return target.getLdap();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    FieldMapping target = (FieldMapping) object;
                    target.setLdap( (core.exolab.cst.mapping.xml.Ldap) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.Ldap();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _ldap
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- org.exolab.castor.mapping.xml.FieldMappingDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode
     * 
     * 
     * 
     * @return AccessMode
     */
    public core.exolab.cst.mapping.AccessMode getAccessMode()
    {
        return null;
    } //-- org.exolab.castor.mapping.AccessMode getAccessMode() 

    /**
     * Method getExtends
     * 
     * 
     * 
     * @return ClassDescriptor
     */
    public core.exolab.cst.mapping.ClassDescriptor getExtends()
    {
        return null;
    } //-- org.exolab.castor.mapping.ClassDescriptor getExtends() 

    /**
     * Method getIdentity
     * 
     * 
     * 
     * @return FieldDescriptor
     */
    public core.exolab.cst.mapping.FieldDescriptor getIdentity()
    {
        return identity;
    } //-- org.exolab.castor.mapping.FieldDescriptor getIdentity() 

    /**
     * Method getJavaClass
     * 
     * 
     * 
     * @return Class
     */
    public java.lang.Class getJavaClass()
    {
        return core.exolab.cst.mapping.xml.FieldMapping.class;
    } //-- java.lang.Class getJavaClass() 

    /**
     * Method getNameSpacePrefix
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String getNameSpacePrefix()
    {
        return nsPrefix;
    } //-- java.lang.String getNameSpacePrefix() 

    /**
     * Method getNameSpaceURI
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String getNameSpaceURI()
    {
        return nsURI;
    } //-- java.lang.String getNameSpaceURI() 

    /**
     * Method getValidator
     * 
     * 
     * 
     * @return TypeValidator
     */
    public core.exolab.cst.xml.TypeValidator getValidator()
    {
        return this;
    } //-- org.exolab.castor.xml.TypeValidator getValidator() 

    /**
     * Method getXMLName
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String getXMLName()
    {
        return xmlName;
    } //-- java.lang.String getXMLName() 

    /**
     * Method isElementDefinition
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isElementDefinition()
    {
        return elementDefinition;
    } //-- boolean isElementDefinition() 

}
