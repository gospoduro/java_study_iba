/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package core.exolab.cst.mapping.xml;

import core.exolab.cst.xml.Marshaller;
import core.exolab.cst.xml.Unmarshaller;

/**
 * Class Property.
 * 
 * @version $Revision$ $Date: 2006-01-07 15:48:31 -0700 (Sat, 07 Jan 2006) $
 */
public class Property extends PropertyType 
implements java.io.Serializable
{


      //----------------/
     //- Constructors -/
    //----------------/

    public Property() 
     {
        super();
    } //-- org.exolab.castor.mapping.xml.Property()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (core.exolab.cst.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws core.exolab.cst.xml.MarshalException, core.exolab.cst.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, core.exolab.cst.xml.MarshalException, core.exolab.cst.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return PropertyType
     */
    public static core.exolab.cst.mapping.xml.PropertyType unmarshal(java.io.Reader reader)
        throws core.exolab.cst.xml.MarshalException, core.exolab.cst.xml.ValidationException
    {
        return (core.exolab.cst.mapping.xml.PropertyType) Unmarshaller.unmarshal(core.exolab.cst.mapping.xml.Property.class, reader);
    } //-- org.exolab.castor.mapping.xml.PropertyType unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws core.exolab.cst.xml.ValidationException
    {
        core.exolab.cst.xml.Validator validator = new core.exolab.cst.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
