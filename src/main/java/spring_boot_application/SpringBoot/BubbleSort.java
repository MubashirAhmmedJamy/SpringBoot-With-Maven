package spring_boot_application.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import interfaces.SortingAlgorithm;

@Primary
@Component
public class BubbleSort implements SortingAlgorithm{
	
	@Override
	public int[] sort(int[] a) {
		System.out.println("\n\nUsing Bubble Sort Algorithm");
		
		
		// some sorting logic
		
		return a;
	}
}
