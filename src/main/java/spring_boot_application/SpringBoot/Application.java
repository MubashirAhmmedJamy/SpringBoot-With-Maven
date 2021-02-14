package spring_boot_application.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		//Below 3 are the basic things that a spring application should know.

		//------------********************-----------
		//What are the beans 
		//What are the dependencies of a bean
		//Where to search for a bean
		//------------********************-----------		
		
		
		int a [] = {1,4,2};
		
		ApplicationContext appContext = SpringApplication.run(Application.class, args);
		
		BinarySearchImplementaion bs = appContext.getBean(BinarySearchImplementaion.class);
		
		int result = bs.binarySearch(a, 3);
		
		System.out.println("Found 3 at index = "+ result);
	}

}
