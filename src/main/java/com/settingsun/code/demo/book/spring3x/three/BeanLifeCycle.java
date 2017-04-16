package com.settingsun.code.demo.book.spring3x.three;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



/**
 * Created by settingsun1225 on 17/4/16.
 */
public class BeanLifeCycle {
    private static void LifeCycleInBeanFactory() {
        Resource res = new ClassPathResource("classpath:spring3x-three-bean.xml");
        System.out.println(((ClassPathResource)res).getPath());
        BeanFactory bf = new XmlBeanFactory(res);

        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
        Car car1 = (Car)bf.getBean("car");
        car1.introduce();
        car1.setColor("ret");
        Car car2 = (Car)bf.getBean("car");
        System.out.println("car1==car2:" + (car1 == car2));
        ((XmlBeanFactory)bf).destroySingletons();

    }

    public static void main(String[] args) {
        LifeCycleInBeanFactory();
    }
}
