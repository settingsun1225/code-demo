package com.settingsun.code.demo.jdk.collections;

import java.util.*;
import java.util.concurrent.*;

/*
 * @desc ArrayList遍历方式和效率的测试程序。
 *
 */
public class RunArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i=0; i<100000; i++)
            list.add(i);
        isRandomAccessSupported(list);
        iteratorThroughRandomAccess(list) ;
        iteratorThroughIterator(list) ;
        iteratorThroughFor2(list) ;

        // 将ArrayList转换为数组
        Integer[] a = vectorToArray(list);
        System.out.println("a.size=" + a.length);
        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
        }
    }

    private static Integer[] vectorToArray(ArrayList<Integer> a) {
        return (Integer[])a.toArray(new Integer[0]);
    }

    private static void isRandomAccessSupported(List list) {
        if (list instanceof RandomAccess) {
            System.out.println("RandomAccess implemented!");
        } else {
            System.out.println("RandomAccess not implemented!");
        }

    }

    public static void iteratorThroughRandomAccess(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i=0; i<list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughRandomAccess：" + interval+" ms");
    }

    public static void iteratorThroughIterator(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Iterator iter = list.iterator(); iter.hasNext(); ) {
            iter.next();
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughIterator：" + interval+" ms");
    }


    public static void iteratorThroughFor2(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Object obj:list)
            ;
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughFor2：" + interval+" ms");
    }
}