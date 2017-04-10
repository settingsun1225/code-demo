package com.settingsun.code.demo.code.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by settingsun1225 on 17/4/10.
 */
public class InvokeMethod {

    public static Object run(Object client, String method, Object... params) {
        Class c = client.getClass();
        Class[] ptypes = new Class[params.length];
        int i = 0;
        for (Object param : params) {
            ptypes[i++] = param.getClass();
            System.out.println(ptypes[i-1]);
        }
        Method m;
        try {
            m = c.getMethod(method, ptypes);
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
            return null;
        }
        try {
            return m.invoke(client, params);
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        MethodObject client = new MethodObject();
        Object ret = InvokeMethod.run(client, "getRR", Integer.valueOf(3), String.valueOf("hello"));
        MethodObject.Result result = (MethodObject.Result) ret;
        System.out.println(result);
    }


    public static void main1(String[] args) {
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

//        MethodObject obj = new MethodObject();
//        Class c = obj.getClass();
        Method[] methods = c.getMethods();
        List<Object> params = new ArrayList<>();
        params.add(Integer.valueOf(1));
        params.add(String.valueOf("hello"));
        Class[] paramsType = new Class[params.size()];
        int i = 0;
        for (Object param : params) {
            paramsType[i++] = param.getClass();
            System.out.println(paramsType[i-1]);
        }
        System.out.println(paramsType);

        for (Method m : methods) {
            if (m.getName() != "getR") {
                continue;
            }
            System.out.println("function: " + m.getName());
            System.out.println("    paramTypes: " + m.getGenericParameterTypes());
            System.out.println("    resultTypes: " + m.getReturnType());
        }
        System.out.println(Integer.class);
    }
}
