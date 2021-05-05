package com.in28min.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication /* it will scan all the package and the sub packages
 for beans, Component Scanning*/
public class SpringIn5StepsApplication {
//	what are the beans spring has to manage?
//	what are the dependencies of a bean?
//	where to search for beans? => no need |> if in the same package no need to specify where to scan
	
	public static void main(String[] args) {

//		BinarySearchImpl bs = new BinarySearchImpl(new QuickSort());
//		int result = bs.binarySearch(new int[] {12,4,6}, 3);
		
		// Application Context is where all the beans are managed
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,6,4}, 3);
		System.out.println(binarySearch);
		System.out.println(result);
		
	}

	
	
}
