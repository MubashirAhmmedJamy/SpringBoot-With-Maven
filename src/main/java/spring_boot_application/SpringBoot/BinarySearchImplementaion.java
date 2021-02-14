package spring_boot_application.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import interfaces.SortingAlgorithm;


@Component
public class BinarySearchImplementaion {
	
	@Autowired
	SortingAlgorithm sortAlgorithm;
	
	public BinarySearchImplementaion(SortingAlgorithm sortAlgorithm){
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int [] a, int b){
		
		sortAlgorithm.sort(a);
		
		//Binary search algorithm
		
		return 0;
	}
}
