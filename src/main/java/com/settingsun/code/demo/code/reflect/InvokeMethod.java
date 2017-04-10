package com.settingsun.code.demo.code.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by settingsun1225 on 17/4/10.
 */
public class InvokeMethod {
    public static void main(String[] args) {
        MethodObject obj = new MethodObject();
        Class c = obj.getClass();
        try {
            Method method = c.getMethod("getR", Integer.class);
            try {
                Object result = method.invoke(obj, Integer.valueOf(3));
                System.out.println(result);
            } catch (IllegalAccessException e) {
                System.out.println("IllegalAccessException " + e.getMessage());
            } catch (InvocationTargetException e) {
                System.out.println("InvocationTargetException " + e.getMessage());
            }

        } catch (NoSuchMethodException e) {
            System.out.println("No such method:"+e.getMessage());
        }
    }
}
