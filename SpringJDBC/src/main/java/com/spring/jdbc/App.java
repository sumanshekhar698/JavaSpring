package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("START of main()");
		
		
//		via XML
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		 */
		
//		via JAVA config
		ApplicationContext context =
		new AnnotationConfigApplicationContext(AutowiredSpringJDBCJavaConfig.class);

		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

//    	Student student = new Student();
//    	student.setId(52);
//    	student.setName("Ritika Saha");
//    	student.setCity("Imphal");

//    	int rowsInserted = studentDAO.insert(student);
//    	int rowsUpdated = studentDAO.change(student);
//    	int rowsDeleted = studentDAO.delete(59);
//    	System.out.println("RECORD CHANGED -> " + rowsDeleted);

//    	Student singleStudent = studentDAO.getSingleStudent(54);
//    	System.out.println(singleStudent);

		List<Student> students = studentDAO.getMultipleStudent();
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("END of main()");

	}
}
