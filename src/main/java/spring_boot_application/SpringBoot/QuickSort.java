package spring_boot_application.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import interfaces.SortingAlgorithm;


@Component
public class QuickSort implements SortingAlgorithm{
	
	@Override
	public int [] sort(int [] a){
		
		System.out.println("\n\nUsing Quick Sort Algorithm");
		
		//some sorting logic
		return a;
	}
}
