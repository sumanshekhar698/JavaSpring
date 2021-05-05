package com.in28min.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgo{
	public int[] sort(int[] num) {
		System.out.println("bubble sort used");
		return num;
	}
}
