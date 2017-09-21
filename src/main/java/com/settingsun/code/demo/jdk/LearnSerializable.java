package com.settingsun.code.demo.jdk;

import com.dianping.squirrel.common.serialize.HessianSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LearnSerializable {

    Serializable s;

//    public static void main(String[] args) throws Exception {
//        File file = new File("p.dat");
//        Person p = new Person("xiaoming", 10);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//        oos.writeObject(p);
//        p.setAge(20);
//        oos.writeObject(p);
//        oos.close();
//
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        Person p1  = (Person) ois.readObject();
//        Person p2  = (Person) ois.readObject();
//        ois.close();
//        System.out.println(p1.toString() + "name:"+p1.getName() + "age:"+p1.getAge());
//        System.out.println(p2.toString() + "name:"+p2.getName() + "age:"+p2.getAge());
//    }

    public static void main(String[] args) throws Exception {
        File file = new File("p.dat");
        Person p = new Person("xiaoming", 10);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(p);
        p.setAge(20);
//        oos.reset();
        oos.writeUnshared(p);
//        oos.writeObject(p);
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Person p1  = (Person) ois.readObject();
        Person p2  = (Person) ois.readObject();
        ois.close();
        System.out.println(p1.toString() + "name:"+p1.getName() + "age:"+p1.getAge());
        System.out.println(p2.toString() + "name:"+p2.getName() + "age:"+p2.getAge());

        HessianSerializer h;
    }

    public static class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }
    }
}
