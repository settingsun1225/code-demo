package com.settingsun.code.demo.book.spring3x.three;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by settingsun1225 on 17/4/16.
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("run constructor");
    }

    public String getColor() {
        return this.color;
    }

    public int getMaxSpeed() {return this.maxSpeed;}
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed;}

    public void setBrand(String brand) {
        System.out.println("set brand");
        this.brand = brand;
    }

    public void introduce() {
        System.out.println("brand=" + brand + ",color=" + color + ",maxspeed=" + maxSpeed);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("run BeanFActoryAware.setBeanFactory");
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {
        System.out.println("setBeanNAme");
        this.beanName = s;
    }

    public void destroy() throws Exception {
        System.out.println("run DisposableBean.destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("run initializingBean.afterproperties");
    }

    public void myInit() {
        System.out.println("run my-init");
        this.maxSpeed = 200;
    }

    public void myDestroy() {
        System.out.println("run my-destroy");
    }

    public void setColor(String color) {
        this.color = color;
    }
}
