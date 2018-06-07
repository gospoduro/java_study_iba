/*
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "Exolab" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Intalio, Inc.  For written permission,
 *    please contact info@exolab.org.
 *
 * 4. Products derived from this Software may not be called "Exolab"
 *    nor may "Exolab" appear in their names without prior written
 *    permission of Intalio, Inc. Exolab is a registered
 *    trademark of Intalio, Inc.
 *
 * 5. Due credit should be given to the Exolab Project
 *    (http://www.exolab.org/).
 *
 * THIS SOFTWARE IS PROVIDED BY INTALIO, INC. AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * INTALIO, INC. OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 2000-2003 (C) Intalio, Inc. All Rights Reserved.
 *
 * $Id$
 */
package core.exolab.cst.types;

import core.exolab.cst.mapping.FieldDescriptor;
import core.exolab.cst.mapping.ValidityException;
import core.exolab.cst.xml.NodeType;
import core.exolab.cst.xml.XMLFieldDescriptor;
import core.exolab.cst.xml.XMLFieldHandler;
import core.exolab.cst.xml.util.XMLFieldDescriptorImpl;

/**
 * The Month Descriptor
 *
 * @author <a href="mailto:blandin@intalio.com">Arnaud Blandin</a>
 * @author <a href="mailto:kvisco@intalio.com">Keith Visco</a>
 * @version $Revision$ $Date: 2005-03-05 06:42:06 -0700 (Sat, 05 Mar 2005) $
 * @deprecated since Castor 1.0.6 since this type is not in any recommendation.
 */
public class MonthDescriptor extends BaseDescriptor {

    /** The name of the XML element. */
    private static final String                 _xmlName = "month";
    /** Our field descriptor. */
    private static final XMLFieldDescriptorImpl _contentDescriptor;
    /** Our field descriptor array.  Lists the fields we describe. */
    private static final FieldDescriptor[]      _fields;

    static {
        _contentDescriptor = new XMLFieldDescriptorImpl(String.class, "content",
                                                        "content", NodeType.Text);
        _contentDescriptor.setHandler(new MonthDescriptor().new MonthFieldHandler());
        _fields = new FieldDescriptor[1];
        _fields[0] = _contentDescriptor;
    }

    //----------------/
    //- Constructors -/
    //----------------/

    public MonthDescriptor() {
        super(_xmlName, Month.class);
    } //--MonthDescriptor

    //------------------/
    //- Public Methods -/
    //------------------/

    /**
     * Returns the XMLFieldDescriptor for the member that should be marshalled
     * as text content.
     *
     * @return the XMLFieldDescriptor for the member that should be marshalled
     *         as text content.
     */
    public XMLFieldDescriptor getContentDescriptor() {
        return _contentDescriptor;
    } // getContentDescriptor

    /**
     * Returns a list of fields represented by this descriptor.
     *
     * @return A list of fields
     */
    public FieldDescriptor[] getFields() {
        return _fields;
    } //-- getFields

    /**
     * A specialized FieldHandler for the XML Schema Month related types
     *
     * @author <a href="blandin@intalio.com">Arnaud Blandin</a>
     * @version $Revision$ $Date: 2005-03-05 06:42:06 -0700 (Sat, 05 Mar 2005) $
     */
    class MonthFieldHandler extends XMLFieldHandler {

        //----------------/
        //- Constructors -/
        //----------------/

        /**
         * Creates a new TimeFieldHandler
         */
        public MonthFieldHandler() {
            super();
        } //-- MonthFieldHandler

        //------------------/
        //- Public Methods -/
        //------------------/

        /**
         * Returns the value of the field associated with this descriptor from
         * the given target object.
         *
         * @param target
         *            the object to get the value from
         * @return the value of the field associated with this descriptor from
         *         the given target object.
         */
        public Object getValue(Object target) throws java.lang.IllegalStateException {
            //-- check for Month class  -- add later
            Month month = (Month) target;
            return month.toString();
        } //-- getValue

        /**
         * Sets the value of the field associated with this descriptor.
         *
         * @param target
         *            the object in which to set the value
         * @param value
         *            the value of the field
         */
        public void setValue(Object target, Object value) throws java.lang.IllegalStateException {
            if (! (target instanceof Month) ) {
               //-- throw exception
            }

            Month monthTarget = (Month) target;

            if (value == null) {
               /// do something
            }

            //-- update current instance of time with new month
            try {
                Month temp = Month.parseMonth(value.toString()) ;
                monthTarget.setCentury(temp.getCentury());
                monthTarget.setYear(temp.getYear());
                monthTarget.setMonth(temp.getMonth());
            } catch (Exception ex) {
                //-- ignore for now
            }
        } //-- setValue

        public void resetValue(Object target) throws java.lang.IllegalStateException {
            // Nothing to do?
        }

        /**
         * Checks the field validity. Returns successfully if the field can be
         * stored, is valid, etc, throws an exception otherwise.
         *
         * @param object
         *            The object
         * @throws ValidityException
         *             The field is invalid, is required and null, or any other
         *             validity violation
         * @throws IllegalStateException
         *             The Java object has changed and is no longer supported by
         *             this handler, or the handler is not compatiable with the
         *             Java object
         */
        public void checkValidity(Object object) throws ValidityException, IllegalStateException {
            // nothing to do?
        } // -- checkValidity

        /**
         * Creates a new instance of the object described by this field.
         *
         * @param parent
         *            The object for which the field is created
         * @return A new instance of the field's value
         * @throws IllegalStateException
         *             This field is a simple type and cannot be instantiated
         */
        public Object newInstance(Object parent) throws IllegalStateException {
            return new Month();
        } //-- newInstance

    } //-- MonthFieldHandler

} //-- MonthDescriptor
