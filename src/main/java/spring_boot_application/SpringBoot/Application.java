package spring_boot_application.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//pringApplication.run(Application.class, args);
		
		int a [] = {1,4,2};
		
		BinarySearchImplementaion bs = new BinarySearchImplementaion(new BubbleSort());
		
		int result = bs.binarySearch(a, 3);
		
		System.out.println("Found 3 at index = "+ result);
	}

}
