package com.settingsun.code.demo.book.spring3x.three;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by settingsun1225 on 17/4/16.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (!beanName.equals("car")) {
            return bean;
        }
        Car car = (Car)bean;
        if (car.getColor() == null) {
            System.out.println("run beanPostProcess.postProcessBeforeInitialization，color: null->black");
            car.setColor("black");
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!beanName.equals("car")) {
            return bean;
        }
        Car car = (Car)bean;
        if (car.getMaxSpeed()>=150) {
            System.out.println("run beanPostProcess.postProcessAfterInitialization, maxspeed: -> 150");
            car.setMaxSpeed(150);
        }
        return bean;
    }
}
