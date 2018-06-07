/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package core.exolab.cst.mapping.xml;

/**
 * Class MappingRootDescriptor.
 * 
 * @version $Revision$ $Date: 2006-01-07 15:48:31 -0700 (Sat, 07 Jan 2006) $
 */
public class MappingRootDescriptor extends core.exolab.cst.xml.util.XMLClassDescriptorImpl {


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

    public MappingRootDescriptor() 
     {
        super();
        nsURI = "http://castor.exolab.org/";
        xmlName = "mapping";
        elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        core.exolab.cst.xml.util.XMLFieldDescriptorImpl  desc           = null;
        core.exolab.cst.mapping.FieldHandler             handler        = null;
        core.exolab.cst.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _description
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_description", "description", core.exolab.cst.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MappingRoot target = (MappingRoot) object;
                return target.getDescription();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MappingRoot target = (MappingRoot) object;
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
        //-- _includeList
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.Include.class, "_includeList", "include", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MappingRoot target = (MappingRoot) object;
                return target.getInclude();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MappingRoot target = (MappingRoot) object;
                    target.addInclude( (core.exolab.cst.mapping.xml.Include) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.Include();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        
        //-- validation code for: _includeList
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _classMappingList
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.ClassMapping.class, "_classMappingList", "class", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MappingRoot target = (MappingRoot) object;
                return target.getClassMapping();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MappingRoot target = (MappingRoot) object;
                    target.addClassMapping( (core.exolab.cst.mapping.xml.ClassMapping) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.ClassMapping();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        
        //-- validation code for: _classMappingList
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _keyGeneratorDefList
        desc = new core.exolab.cst.xml.util.XMLFieldDescriptorImpl(core.exolab.cst.mapping.xml.KeyGeneratorDef.class, "_keyGeneratorDefList", "key-generator", core.exolab.cst.xml.NodeType.Element);
        handler = new core.exolab.cst.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MappingRoot target = (MappingRoot) object;
                return target.getKeyGeneratorDef();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MappingRoot target = (MappingRoot) object;
                    target.addKeyGeneratorDef( (core.exolab.cst.mapping.xml.KeyGeneratorDef) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new core.exolab.cst.mapping.xml.KeyGeneratorDef();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        
        //-- validation code for: _keyGeneratorDefList
        fieldValidator = new core.exolab.cst.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- org.exolab.castor.mapping.xml.MappingRootDescriptor()


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
        return core.exolab.cst.mapping.xml.MappingRoot.class;
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
