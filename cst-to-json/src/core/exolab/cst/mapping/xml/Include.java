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
 * Class Include.
 * 
 * @version $Revision$ $Date: 2006-01-07 15:48:31 -0700 (Sat, 07 Jan 2006) $
 */
public class Include implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _href
     */
    private java.lang.String _href;


      //----------------/
     //- Constructors -/
    //----------------/

    public Include() 
     {
        super();
    } //-- org.exolab.castor.mapping.xml.Include()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'href'.
     * 
     * @return String
     * @return the value of field 'href'.
     */
    public java.lang.String getHref()
    {
        return this._href;
    } //-- java.lang.String getHref() 

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
     * Sets the value of field 'href'.
     * 
     * @param href the value of field 'href'.
     */
    public void setHref(java.lang.String href)
    {
        this._href = href;
    } //-- void setHref(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Include
     */
    public static core.exolab.cst.mapping.xml.Include unmarshal(java.io.Reader reader)
        throws core.exolab.cst.xml.MarshalException, core.exolab.cst.xml.ValidationException
    {
        return (core.exolab.cst.mapping.xml.Include) Unmarshaller.unmarshal(core.exolab.cst.mapping.xml.Include.class, reader);
    } //-- org.exolab.castor.mapping.xml.Include unmarshal(java.io.Reader) 

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
