package com.spring.core.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        we will not use new keyword to drectly make objects
//        if one .xml pass it asa string for multipasss it as a string aray
        	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        	if stored in package use full path for .xml file
        	Student s1 = (Student) context.getBean("student1");
        	System.out.println(s1);
        	Student s2 = (Student)context.getBean("student2");
        	System.out.println(s2);
        	Student s3 = (Student)context.getBean("student");
        	System.out.println(s3);
    }
}
