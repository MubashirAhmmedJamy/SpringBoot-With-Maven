package spring_boot_application.SpringBoot;

import interfaces.SortingAlgorithm;

public class BinarySearchImplementaion {
	
	SortingAlgorithm sortAlgorithm;
	
	public BinarySearchImplementaion(SortingAlgorithm sortAlgorithm){
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int [] a, int b){
		
		int sortedNUmbers [] = sortAlgorithm.sort(a);
		
		//Binary search algorithm
		
		return 0;
	}
}
