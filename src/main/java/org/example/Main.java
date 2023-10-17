package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Dang 1: Khoi tao 1 bean
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teo.xml");
//        Student t1 = ctx.getBean("t1", Student.class);
//        System.out.println(t1);

//        Dang 2: Khởi tạo 1 beans có mối quan hệ
//        ApplicationContext context = new ClassPathXmlApplicationContext("teo.xml");
//        Student student1 = context.getBean("st2", Student.class);
//        System.out.println(student1);
//        Student student2 = context.getBean("st3", Student.class);
//        System.out.println(student2);

//        Dạng 3: có danh sách
        ApplicationContext context = new ClassPathXmlApplicationContext("teo.xml");
        Person p1 = context.getBean("person", Person.class);
        System.out.println("Name: "+ p1.getName());
        System.out.println("Age: "+ p1.getAge());
        for (Address a : p1.getAddresses()){
            System.out.println("Address: "+a);
        }
        for (String em : p1.getEmails()){
            System.out.println("Email: "+em);
        }

//        Dạng 4: dùng properties
//        ApplicationContext context = new ClassPathXmlApplicationContext("teo.xml");
//        Person person = context.getBean("myProperties", Person.class);
//        System.out.println("Name: "+ person.getName());
//        System.out.println("Age: "+ person.getAge());
//        for (Address a : person.getAddresses()){
//            System.out.println("Address: "+a);
//        }
//        for (String em : person.getEmails()){
//            System.out.println("Email: "+em);
//        }
    }
}