/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package core.exolab.cst.mapping.xml;

/**
 * Class SqlDescriptor.
 * 
 * @version $Revision$ $Date: 2006-01-07 15:48:31 -0700 (Sat, 07 Jan 2006) $
 */
public class SqlDescriptor extends core.exolab.cst.xml.util.XMLClassDescriptorImpl {


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

    public SqlDescriptor() 
     {
        super();
        nsURI = "http://castor.exolab.org/";
        xmlName = "sql";
        elementDefinition = true;
        core.exolab.cst.xml.util.XMLFieldDescriptorImpl  desc           = null;
        core.exolab.cst.mapping.FieldHandler             handler        = null;
        core.exolab.cst.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- _name
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_name", "name", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Sql target = (Sql) object;
                return target.getName();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
                    target.addName( (java.lang.String) value);
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
        
        //-- validation code for: _name
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        //-- _type
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_type", "type", core.exolab.cst.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Sql target = (Sql) object;
                return target.getType();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
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
        //-- _manyTable
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_manyTable", "many-table", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Sql target = (Sql) object;
                return target.getManyTable();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
                    target.setManyTable( (java.lang.String) value);
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
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _manyTable
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
            core.exolab.cst.xml.validators.NameValidator typeValidator = new core.exolab.cst.xml.validators.NameValidator(core.exolab.cst.xml.validators.NameValidator.NMTOKEN);
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _manyKey
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_manyKey", "many-key", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Sql target = (Sql) object;
                return target.getManyKey();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
                    target.addManyKey( (java.lang.String) value);
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
        
        //-- validation code for: _manyKey
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        //-- _readOnly
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_readOnly", "read-only", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Sql target = (Sql) object;
                if(!target.hasReadOnly())
                    return null;
                return (target.getReadOnly() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteReadOnly();
                        return;
                    }
                    target.setReadOnly( ((java.lang.Boolean)value).booleanValue());
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
        
        //-- validation code for: _readOnly
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
                Sql target = (Sql) object;
                if(!target.hasTransient())
                    return null;
                return (target.getTransient() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
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
        //-- _dirty
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.types.SqlDirtyType.class, "_dirty", "dirty", core.exolab.cst.xml.NodeType.Attribute);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Sql target = (Sql) object;
                return target.getDirty();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Sql target = (Sql) object;
                    target.setDirty( (core.exolab.cst.mapping.xml.types.SqlDirtyType) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        };
        handler = new core.exolab.cst.xml.handlers.EnumFieldHandler(core.exolab.cst.mapping.xml.types.SqlDirtyType.class, handler);
        desc.setImmutable(true);
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _dirty
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors
        
    } //-- org.exolab.castor.mapping.xml.SqlDescriptor()


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
        return core.exolab.cst.mapping.xml.Sql.class;
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
