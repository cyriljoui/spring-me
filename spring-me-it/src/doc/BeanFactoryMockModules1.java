package com.tomtom.di.maven.its.itsample;

/**
 * An object factory, providing access to a network of wired objects, 
 * some of them lazily instantiated. You can refer to some objects by 
 * name. The named objects managed by this class are:
 *
 * <ul>
 * <li>bean1 : {@link me.springframework.di.module.mock.bean1.Bean1}</li>
 * <li>bean2 : {@link me.springframework.di.module.mock.bean2.Bean2}</li>
 * <li>bean3 : {@link me.springframework.di.module.mock.bean3.Bean3}</li>
 * <li>_factoryMethodBean : {@link me.springframework.di.module.mock.factorymethod.BeanFactoryMethod}</li>
 * <li>bean4 : {@link java.lang.Object}</li>
 * <li>bean5 : {@link java.lang.Object}</li>
 * <li>rootObjectBean : {@link java.lang.Object}</li> 
 * </ul>
 * 
 */
public class BeanFactoryMockModules  {

    /**
     * A cached reference to the bean named "bean1".
     */
    private me.springframework.di.module.mock.bean1.Bean1 bean1;

    /**
     * A cached reference to the bean named "bean2".
     */
    private me.springframework.di.module.mock.bean2.Bean2 bean2;

    /**
     * A cached reference to the bean named "bean3".
     */
    private me.springframework.di.module.mock.bean3.Bean3 bean3;

    /**
     * A cached reference to the bean named "_factoryMethodBean".
     */
    private me.springframework.di.module.mock.factorymethod.BeanFactoryMethod _factoryMethodBean;





    /**
     * A cached reference to the bean named "rootObjectBean".
     */
    private java.lang.Object rootObjectBean;
  
    /**
     * Constructs an instance of this bean factory.
     */
    public BeanFactoryMockModules() {
        start();
    }
  
    /**
     * Returns an object by looking it up by its name.
     *
     * @return The object with the given name, constructed by the BeanFactoryMockModules.
     * @see BeanFactoryMockModules
     * @throws java.lang.RuntimeException In case of problems creating the bean.
     */
    public synchronized Object getBean(String name) throws java.lang.RuntimeException {
        if ("bean1".equals(name)) return getBean1();
        if ("bean2".equals(name)) return getBean2();
        if ("bean3".equals(name)) return getBean3();
        if ("_factoryMethodBean".equals(name)) return getFactoryMethodBean();
        if ("bean4".equals(name)) return getBean4();
        if ("bean5".equals(name)) return getBean5();
        if ("rootObjectBean".equals(name)) return getRootObjectBean();
        return null; // Keep the compiler happy
    }

    /**
     * Creates bean bean1.
     */
    private final me.springframework.di.module.mock.bean1.Bean1 getBean1() {
        if (bean1 == null) {
            try {
                bean1 = new me.springframework.di.module.mock.bean1.Bean1();
                // No init method 
            } catch(Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
        return bean1;    
    }

    /**
     * Creates bean bean2.
     */
    private final me.springframework.di.module.mock.bean2.Bean2 getBean2() {
        if (bean2 == null) {
            try {
                bean2 = new me.springframework.di.module.mock.bean2.Bean2();
                bean2.setBean1(getBean1());
                bean2.initialize(); 
            } catch(Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
        return bean2;    
    }

    /**
     * Creates bean bean3.
     */
    private final me.springframework.di.module.mock.bean3.Bean3 getBean3() {
        if (bean3 == null) {
            try {
                bean3 = new me.springframework.di.module.mock.bean3.Bean3();
                // No init method 
            } catch(Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
        return bean3;    
    }

    /**
     * Creates bean _factoryMethodBean.
     */
    private final me.springframework.di.module.mock.factorymethod.BeanFactoryMethod getFactoryMethodBean() {
        if (_factoryMethodBean == null) {
            try {
                _factoryMethodBean = new me.springframework.di.module.mock.factorymethod.BeanFactoryMethod();
                // No init method 
            } catch(Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
        return _factoryMethodBean;    
    }

    /**
     * Creates bean bean4.
     */
    private final java.lang.Object getBean4() {
        java.lang.Object bean4 = null;
        try {
            bean4 = getFactoryMethodBean().createBean4();
            // No init method 
            return bean4;
        } catch(Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }    
    }

    /**
     * Creates bean bean5.
     */
    private final java.lang.Object getBean5() {
        java.lang.Object bean5 = null;
        try {
            bean5 = me.springframework.di.module.mock.factorymethod.BeanFactoryMethod.createStaticBean5();
            // No init method 
            return bean5;
        } catch(Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }    
    }

    /**
     * Creates bean rootObjectBean.
     */
    private final java.lang.Object getRootObjectBean() {
        if (rootObjectBean == null) {
            try {
                rootObjectBean = new java.lang.Object();
                // No init method 
            } catch(Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
        return rootObjectBean;    
    }


    /**
     * "Starts" the BeanFactoryMockModules; instances that have been 
     * configured to be loaded eagerly will be loaded, and their init-methods
     * will be called. 
     */
    private final void start() {
        getBean1();
        getBean2();
        getBean3();
        getFactoryMethodBean();
        getBean4();
        getBean5();
        // Skipping rootObjectBean
    }
    
    /**
     * "Stops" the BeanFactoryMockModules; instances that have an 
     * destroy-method defined will get that method invoked.
     */
    public final void stop() {
        try {
            // Skipping bean1
            bean2.destroy();
            // Skipping bean3
            // Skipping _factoryMethodBean
            // Skipping bean4
            // Skipping bean5
            // Skipping rootObjectBean
        } catch (Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }
    
    	    
}