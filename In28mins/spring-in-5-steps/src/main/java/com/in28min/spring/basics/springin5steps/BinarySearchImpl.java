package com.in28min.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgorithm;// telling its a dependency for this class
	public int binarySearch(int[] numbers , int numberToSearch) {
		// implementing sort algo
		// bubble sort
		// search array
		
//		BubbleSort bs=new BubbleSort();//tight coupling
		int [] sortednumbers =this.sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm.getClass());
		return 3;
	}
	
	BinarySearchImpl(SortAlgo sl){
		super();
		this.sortAlgorithm=sl;
	}
	
}
