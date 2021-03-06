/*
 * Copyright 2007 Werner Guttmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package core.exolab.cst.xml;

import core.cst.mapping.BindingType;
import core.cst.mapping.MappingUnmarshaller;
import core.exolab.cst.mapping.Mapping;
import core.exolab.cst.mapping.MappingException;
import core.exolab.cst.mapping.MappingLoader;

/**
 * Bootstrap class for Castor XML that allows you to load information about the
 * domain objects used with Castor XML (marshallers and unmarshallers) by various means.
 * 
 * @author <a href="mailto:werner DOT guttmann At gmx DOT net">Werner Guttmann</a>
 * @since 1.1.2
 */
public class XMLContext {

    /**
     * {@link XMLClassDescriptorResolver} instance used for caching XML-related
     * class descriptors.
     */
    private XMLClassDescriptorResolver resolver;

    /**
     * Creates an instance of {@link XMLContext}, preconfigured with class descriptors
     * loaded for the given package name.
     */
    public XMLContext() {
        resolver = (XMLClassDescriptorResolver) ClassDescriptorResolverFactory
                .createClassDescriptorResolver(BindingType.XML);
        resolver.setClassLoader(getClass().getClassLoader());
    }
    
    /**
     * Instructs Castor to load class descriptors from the mapping given.
     * @param mapping Castor XML mapping (file), from which the required class
     * descriptors will be derived. 
     * @throws MappingException If the {@link Mapping} cannot be loaded and analyzed successfully.
     */
    public void addMapping(Mapping mapping) throws MappingException {
         MappingUnmarshaller mappingUnmarshaller = new MappingUnmarshaller();
         MappingLoader mappingLoader = mappingUnmarshaller.getMappingLoader(mapping, BindingType.XML);
         resolver.setMappingLoader(mappingLoader);        
    }

//    /**
//     * Instructs Castor to load class descriptors from the mapping given.
//     * @param mapping Castor XML mapping (file), from which the required class
//     * descriptors will be derived. 
//    */
//    public static Mapping loadMapping(InputSource mappingFile) {
//        Mapping mapping = XMLContext.createMapping(); 
//        mapping.loadMapping(mappingFile);
//        return mapping;
//    }
//    
    /**
     * Loads the class descriptor for the class instance specified. The use of this method is useful
     * when no mapping is used, as happens when the domain classes hase been generated
     * using the XML code generator (in which case instead of a mapping file class
     * descriptor files will be generated).
     * 
     * @param className Name of the class for which the associated descriptor should be loaded.
     */ 
    public void addClass(final String className) { 
        resolver.addClass(className);
    }

    /**
     * Loads the class descriptor for the class instance specified. The use of this method is useful
     * when no mapping is used, as happens when the domain classes hase been generated
     * using the XML code generator (in which case instead of a mapping file class
     * descriptor files will be generated).
     * 
     * @param className Name of the class for which the associated descriptor should be loaded.
     */ 
    public void addClasses(final String[] classNames) {
        resolver.addClasses(classNames);
    }

    /**
     * Loads class descriptors from the package specified. The use of this method is useful
     * when no mapping is used, as happens when the domain classes hase been generated
     * using the XML code generator (in which case instead of a mapping file class
     * descriptor files will be generated).
     * <p>
     * Please note that this functionality will work only if you provide the <tt>.castor.cdr</tt>
     * file with your generated classes (as generated by the XML code generator).
     * <p>
     * @param packageName The package name for the (descriptor) classes
     * @throws ResolverException If there's a problem loading class descriptors for the given package. 
     */
    public void addPackage(final String packageName) throws ResolverException { 
        resolver.addPackage(packageName); 
    }

    /**
     * Loads class descriptors from the packages specified. The use of this method is useful
     * when no mapping is used, as happens when the domain classes hase been generated
     * using the XML code generator (in which case instead of a mapping file class
     * descriptor files will be generated).
     * <p>
     * Please note that this functionality will work only if you provide the <tt>.castor.cdr</tt>
     * files with your generated classes (as generated by the XML code generator).
     * <p>
     * @param packageNames The package names for the (descriptor) classes
     * @throws ResolverException If there's a problem loading class descriptors for the given package. 
     */
    public void addPackages(final String[] packageNames) throws ResolverException {
        resolver.addPackages(packageNames);
    }

    /**
     * Creates an instance of a Castor XML specific {@link Mapping} instance.
     * @return a Castor XML specific {@link Mapping} instance.
     */
    public static Mapping createMapping() {
        Mapping mapping = new Mapping();
//        mapping.setBindingType(BindingType.XML);
        return mapping;
    }
    
    /**
     * Creates a new {@link Marshaller} instance to be used for marshalling.
     * @return A new {@link Marshaller} instance.
     */
    public Marshaller createMarshaller() {
        Marshaller marshaller = new Marshaller();
        marshaller.setResolver(resolver);
        return marshaller;
    }
    
    /**
     * Creates a new {@link Unmarshaller} instance to be used for unmarshalling. 
     * @return A new {@link Unmarshaller} instance, preconfigured with 
     *  a {@link XMLClassDescriptorResolver} instance with the class
     *  descriptors cached as loaded above.
     */
    public Unmarshaller createUnmarshaller() {
        Unmarshaller unmarshaller = new Unmarshaller();
        unmarshaller.setResolver(resolver);
        return unmarshaller;
    }

    /**
     * Sets an application-specific {@link XMLClassDescriptorResolver} instance
     * @param resolver
     */
    public void setResolver(XMLClassDescriptorResolver resolver) {
        this.resolver = resolver;
    }

    
}

