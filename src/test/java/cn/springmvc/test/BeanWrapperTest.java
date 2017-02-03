package cn.springmvc.test;

import cn.springmvc.bean.LoadBeanProperty;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceEditor;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by free on 17-2-1.
 */
public class BeanWrapperTest {


    /**
     模拟 spring BeanWrapper完成值的注入 demo
     这块比较重要 还看的不是很深 有空多加专研专研
     PropertyValues pvs = new ServletConfigPropertyValues(getServletConfig(), this.requiredProperties);
     BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(this);
     ResourceLoader resourceLoader = new ServletContextResourceLoader(getServletContext());
     bw.registerCustomEditor(Resource.class, new ResourceEditor(resourceLoader, this.environment));
     initBeanWrapper(bw);
     bw.setPropertyValues(pvs, true);

     */

    @Test
    public void test1(){
        LoadBeanProperty bean=new LoadBeanProperty();


        MutablePropertyValues propertyValues=new MutablePropertyValues();

        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(bean);

        propertyValues.addPropertyValue(new PropertyValue("contextConfigLocation","classpath:spring-test.xml"));

        ResourceLoader resourceLoader=new DefaultResourceLoader();

        bw.registerCustomEditor(Resource.class,new ResourceEditor(resourceLoader,new StandardEnvironment()));

        bw.setPropertyValues(propertyValues, true);

        System.out.println("赋值情况----   "+bean.getContextConfigLocation());
    }


}
