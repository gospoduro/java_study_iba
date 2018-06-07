/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package core.exolab.cst.mapping.xml;

/**
 * Class ClassMappingDescriptor.
 * 
 * @version $Revision$ $Date: 2006-04-13 07:37:49 -0600 (Thu, 13 Apr 2006) $
 */
public class ClassMappingDescriptor extends core.exolab.cst.xml.util.XMLClassDescriptorImpl {


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

    public ClassMappingDescriptor() 
     {
        super();
        nsURI = "http://castor.exolab.org/";
        xmlName = "class";
        elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        core.exolab.cst.xml.util.XMLFieldDescriptorImpl  desc           = null;
        core.exolab.cst.mapping.FieldHandler             handler        = null;
        core.exolab.cst.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- _name
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_name", "name", core.exolab.cst.xml.NodeType.Attribute);
        this.identity = desc;
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getName();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setName( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new java.lang.String();
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
        }
        desc.setValidator(fieldValidator);
        //-- _extends
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Object.class, "_extends", "extends", core.exolab.cst.xml.NodeType.Attribute);
        desc.setReference(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getExtends();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setExtends( (java.lang.Object) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new java.lang.Object();
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _extends
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _depends
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Object.class, "_depends", "depends", core.exolab.cst.xml.NodeType.Attribute);
        desc.setReference(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getDepends();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setDepends( (java.lang.Object) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new java.lang.Object();
            }
        };
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _depends
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _identity
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_identity", "identity", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getIdentity();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.addIdentity( (java.lang.String) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new java.lang.String();
            }
        };
        handler = new core.exolab.cst.xml.handlers.CollectionFieldHandler(handler, new core.exolab.cst.xml.validators.NameValidator(core.exolab.cst.xml.validators.NameValidator.NMTOKEN));
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        
        //-- validation code for: _identity
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        //-- _access
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.types.ClassMappingAccessType.class, "_access", "access", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getAccess();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setAccess( (core.exolab.cst.mapping.xml.types.ClassMappingAccessType) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        handler = new core.exolab.cst.xml.handlers.EnumFieldHandler(core.exolab.cst.mapping.xml.types.ClassMappingAccessType.class, handler);
        desc.setImmutable(true);
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _access
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _keyGenerator
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_keyGenerator", "key-generator", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getKeyGenerator();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setKeyGenerator( (java.lang.String) value);
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
        
        //-- validation code for: _keyGenerator
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.StringValidator typeValidator = new core.exolab.cst.xml.validators.StringValidator();
            typeValidator.setWhiteSpace("preserve");
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _autoComplete
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_autoComplete", "auto-complete", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                if(!target.hasAutoComplete())
                    return null;
                return (target.getAutoComplete() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteAutoComplete();
                        return;
                    }
                    target.setAutoComplete( ((java.lang.Boolean)value).booleanValue());
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
        
        //-- validation code for: _autoComplete
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.BooleanValidator typeValidator = new core.exolab.cst.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _verifyConstructable
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_verifyConstructable", "verify-constructable", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                if(!target.hasVerifyConstructable())
                    return null;
                return (target.getVerifyConstructable() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteVerifyConstructable();
                        return;
                    }
                    target.setVerifyConstructable( ((java.lang.Boolean)value).booleanValue());
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
        
        //-- validation code for: _verifyConstructable
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
                ClassMapping target = (ClassMapping) object;
                return target.getDescription();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
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
        //-- _cacheTypeMapping
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.CacheTypeMapping.class, "_cacheTypeMapping", "cache-type", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getCacheTypeMapping();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setCacheTypeMapping( (core.exolab.cst.mapping.xml.CacheTypeMapping) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.CacheTypeMapping();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _cacheTypeMapping
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _mapTo
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.MapTo.class, "_mapTo", "map-to", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getMapTo();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setMapTo( (core.exolab.cst.mapping.xml.MapTo) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.MapTo();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _mapTo
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _namedQueryList
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.NamedQuery.class, "_namedQueryList", "named-query", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getNamedQuery();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.addNamedQuery( (core.exolab.cst.mapping.xml.NamedQuery) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.NamedQuery();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        
        //-- validation code for: _namedQueryList
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _classChoice
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.ClassChoice.class, "_classChoice", "-error-if-this-is-used-", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ClassMapping target = (ClassMapping) object;
                return target.getClassChoice();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ClassMapping target = (ClassMapping) object;
                    target.setClassChoice( (core.exolab.cst.mapping.xml.ClassChoice) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.ClassChoice();
            }
        };
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new core.exolab.cst.mapping.xml.ClassChoiceDescriptor());
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _classChoice
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- org.exolab.castor.mapping.xml.ClassMappingDescriptor()


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
        return core.exolab.cst.mapping.xml.ClassMapping.class;
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
