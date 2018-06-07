/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package core.exolab.cst.mapping.xml;

import java.util.Collections;

import core.exolab.cst.xml.Marshaller;
import core.exolab.cst.xml.Unmarshaller;

/**
 * Class ClassChoice.
 * 
 * @version $Revision$ $Date$
 */
public class ClassChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fieldMappingList
     */
    private java.util.ArrayList _fieldMappingList;

    /**
     * Field _containerList
     */
    private java.util.ArrayList _containerList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ClassChoice() 
     {
        super();
        _fieldMappingList = new java.util.ArrayList();
        _containerList = new java.util.ArrayList();
    } //-- org.exolab.castor.mapping.xml.ClassChoice()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addContainer
     * 
     * 
     * 
     * @param vContainer
     */
    public void addContainer(core.exolab.cst.mapping.xml.Container vContainer)
        throws java.lang.IndexOutOfBoundsException
    {
        _containerList.add(vContainer);
    } //-- void addContainer(org.exolab.castor.mapping.xml.Container) 

    /**
     * Method addContainer
     * 
     * 
     * 
     * @param index
     * @param vContainer
     */
    public void addContainer(int index, core.exolab.cst.mapping.xml.Container vContainer)
        throws java.lang.IndexOutOfBoundsException
    {
        _containerList.add(index, vContainer);
    } //-- void addContainer(int, org.exolab.castor.mapping.xml.Container) 

    /**
     * Method addFieldMapping
     * 
     * 
     * 
     * @param vFieldMapping
     */
    public void addFieldMapping(core.exolab.cst.mapping.xml.FieldMapping vFieldMapping)
        throws java.lang.IndexOutOfBoundsException
    {
        _fieldMappingList.add(vFieldMapping);
    } //-- void addFieldMapping(org.exolab.castor.mapping.xml.FieldMapping) 

    /**
     * Method addFieldMapping
     * 
     * 
     * 
     * @param index
     * @param vFieldMapping
     */
    public void addFieldMapping(int index, core.exolab.cst.mapping.xml.FieldMapping vFieldMapping)
        throws java.lang.IndexOutOfBoundsException
    {
        _fieldMappingList.add(index, vFieldMapping);
    } //-- void addFieldMapping(int, org.exolab.castor.mapping.xml.FieldMapping) 

    /**
     * Method clearContainer
     * 
     */
    public void clearContainer()
    {
        _containerList.clear();
    } //-- void clearContainer() 

    /**
     * Method clearFieldMapping
     * 
     */
    public void clearFieldMapping()
    {
        _fieldMappingList.clear();
    } //-- void clearFieldMapping() 

    /**
     * Method enumerateContainer
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateContainer()
    {
        return Collections.enumeration(_containerList);
    } //-- java.util.Enumeration enumerateContainer() 

    /**
     * Method enumerateFieldMapping
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateFieldMapping()
    {
        return Collections.enumeration(_fieldMappingList);
    } //-- java.util.Enumeration enumerateFieldMapping() 

    /**
     * Method getContainer
     * 
     * 
     * 
     * @param index
     * @return Container
     */
    public core.exolab.cst.mapping.xml.Container getContainer(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _containerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (core.exolab.cst.mapping.xml.Container) _containerList.get(index);
    } //-- org.exolab.castor.mapping.xml.Container getContainer(int) 

    /**
     * Method getContainer
     * 
     * 
     * 
     * @return Container
     */
    public core.exolab.cst.mapping.xml.Container[] getContainer()
    {
        int size = _containerList.size();
        core.exolab.cst.mapping.xml.Container[] mArray = new core.exolab.cst.mapping.xml.Container[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (core.exolab.cst.mapping.xml.Container) _containerList.get(index);
        }
        return mArray;
    } //-- org.exolab.castor.mapping.xml.Container[] getContainer() 

    /**
     * Method getContainerCount
     * 
     * 
     * 
     * @return int
     */
    public int getContainerCount()
    {
        return _containerList.size();
    } //-- int getContainerCount() 

    /**
     * Method getFieldMapping
     * 
     * 
     * 
     * @param index
     * @return FieldMapping
     */
    public core.exolab.cst.mapping.xml.FieldMapping getFieldMapping(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _fieldMappingList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (core.exolab.cst.mapping.xml.FieldMapping) _fieldMappingList.get(index);
    } //-- org.exolab.castor.mapping.xml.FieldMapping getFieldMapping(int) 

    /**
     * Method getFieldMapping
     * 
     * 
     * 
     * @return FieldMapping
     */
    public core.exolab.cst.mapping.xml.FieldMapping[] getFieldMapping()
    {
        int size = _fieldMappingList.size();
        core.exolab.cst.mapping.xml.FieldMapping[] mArray = new core.exolab.cst.mapping.xml.FieldMapping[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (core.exolab.cst.mapping.xml.FieldMapping) _fieldMappingList.get(index);
        }
        return mArray;
    } //-- org.exolab.castor.mapping.xml.FieldMapping[] getFieldMapping() 

    /**
     * Method getFieldMappingCount
     * 
     * 
     * 
     * @return int
     */
    public int getFieldMappingCount()
    {
        return _fieldMappingList.size();
    } //-- int getFieldMappingCount() 

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
     * Method removeContainer
     * 
     * 
     * 
     * @param vContainer
     * @return boolean
     */
    public boolean removeContainer(core.exolab.cst.mapping.xml.Container vContainer)
    {
        boolean removed = _containerList.remove(vContainer);
        return removed;
    } //-- boolean removeContainer(org.exolab.castor.mapping.xml.Container) 

    /**
     * Method removeFieldMapping
     * 
     * 
     * 
     * @param vFieldMapping
     * @return boolean
     */
    public boolean removeFieldMapping(core.exolab.cst.mapping.xml.FieldMapping vFieldMapping)
    {
        boolean removed = _fieldMappingList.remove(vFieldMapping);
        return removed;
    } //-- boolean removeFieldMapping(org.exolab.castor.mapping.xml.FieldMapping) 

    /**
     * Method setContainer
     * 
     * 
     * 
     * @param index
     * @param vContainer
     */
    public void setContainer(int index, core.exolab.cst.mapping.xml.Container vContainer)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _containerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _containerList.set(index, vContainer);
    } //-- void setContainer(int, org.exolab.castor.mapping.xml.Container) 

    /**
     * Method setContainer
     * 
     * 
     * 
     * @param containerArray
     */
    public void setContainer(core.exolab.cst.mapping.xml.Container[] containerArray)
    {
        //-- copy array
        _containerList.clear();
        for (int i = 0; i < containerArray.length; i++) {
            _containerList.add(containerArray[i]);
        }
    } //-- void setContainer(org.exolab.castor.mapping.xml.Container) 

    /**
     * Method setFieldMapping
     * 
     * 
     * 
     * @param index
     * @param vFieldMapping
     */
    public void setFieldMapping(int index, core.exolab.cst.mapping.xml.FieldMapping vFieldMapping)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _fieldMappingList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _fieldMappingList.set(index, vFieldMapping);
    } //-- void setFieldMapping(int, org.exolab.castor.mapping.xml.FieldMapping) 

    /**
     * Method setFieldMapping
     * 
     * 
     * 
     * @param fieldMappingArray
     */
    public void setFieldMapping(core.exolab.cst.mapping.xml.FieldMapping[] fieldMappingArray)
    {
        //-- copy array
        _fieldMappingList.clear();
        for (int i = 0; i < fieldMappingArray.length; i++) {
            _fieldMappingList.add(fieldMappingArray[i]);
        }
    } //-- void setFieldMapping(org.exolab.castor.mapping.xml.FieldMapping) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ClassChoice
     */
    public static core.exolab.cst.mapping.xml.ClassChoice unmarshal(java.io.Reader reader)
        throws core.exolab.cst.xml.MarshalException, core.exolab.cst.xml.ValidationException
    {
        return (core.exolab.cst.mapping.xml.ClassChoice) Unmarshaller.unmarshal(core.exolab.cst.mapping.xml.ClassChoice.class, reader);
    } //-- org.exolab.castor.mapping.xml.ClassChoice unmarshal(java.io.Reader) 

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
