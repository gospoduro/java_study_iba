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
 * Class QueryHint.
 * 
 * @version $Revision$ $Date$
 */
public class QueryHint implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _value
     */
    private java.lang.String _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueryHint() 
     {
        super();
    } //-- org.exolab.castor.mapping.xml.QueryHint()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'value'.
     * 
     * @return String
     * @return the value of field 'value'.
     */
    public java.lang.String getValue()
    {
        return this._value;
    } //-- java.lang.String getValue() 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(java.lang.String value)
    {
        this._value = value;
    } //-- void setValue(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return QueryHint
     */
    public static core.exolab.cst.mapping.xml.QueryHint unmarshal(java.io.Reader reader)
        throws core.exolab.cst.xml.MarshalException, core.exolab.cst.xml.ValidationException
    {
        return (core.exolab.cst.mapping.xml.QueryHint) Unmarshaller.unmarshal(core.exolab.cst.mapping.xml.QueryHint.class, reader);
    } //-- org.exolab.castor.mapping.xml.QueryHint unmarshal(java.io.Reader) 

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
