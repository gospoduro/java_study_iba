package core.exolab.cst.xml;

import core.cst.mapping.BindingType;
import core.exolab.cst.xml.util.JDOClassDescriptorResolverImpl;
import core.exolab.cst.xml.util.XMLClassDescriptorResolverImpl;

public class ClassDescriptorResolverFactory {

    public static ClassDescriptorResolver createClassDescriptorResolver(BindingType type) {
        
        ClassDescriptorResolver resolver = null;
        
        if (type == BindingType.JDO) {
            resolver = new JDOClassDescriptorResolverImpl();
        } else if (type == BindingType.XML) {
            resolver = new XMLClassDescriptorResolverImpl();
        }
        return resolver;
    }
}
