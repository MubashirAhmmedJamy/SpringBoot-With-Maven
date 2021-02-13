package spring_boot_application.SpringBoot;

import interfaces.SortingAlgorithm;

public class QuickSort implements SortingAlgorithm{
	
	@Override
	public int [] sort(int [] a){
		
		System.out.println("Using Quick Sort Algorithm");
		
		//some sorting logic
		return a;
	}
}
