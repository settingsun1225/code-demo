package com.settingsun.code.demo.book.spring3x.three;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * Created by settingsun1225 on 17/4/16.
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("Instantiation beanPostProcessor.postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("Instantiation beanPostProcessor.postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("Instantiation beanPostProessor.postProcessPropertyValues");
        }
        return pvs;
    }
}
