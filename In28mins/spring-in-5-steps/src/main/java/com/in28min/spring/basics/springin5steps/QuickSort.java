package com.in28min.spring.basics.springin5steps;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("quick")
public class QuickSort implements SortAlgo{
	public int[] sort(int[] num) {
		return num;
	}
}
