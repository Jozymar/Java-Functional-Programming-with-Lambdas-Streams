package programming;

import java.util.Arrays;
import java.util.List;

public class EX01Exercises {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
//		printEvenNumbersInListFunctional(numbers);
//		printOddNumbersInListFunctional(numbers);
		printCubesOfOddNumbersInListFunctional(numbers);
		
		List<String> courses = Arrays.asList(
				"Spring", "Spring Boot", "API" , "Microservices",
				"AWS", "PCF","Azure", "Docker", "Kubernetes");

//		courses.stream()
//			.forEach(System.out::println);
//		
//		courses.stream()
//		.filter(course -> course.contains("Spring"))
//		.forEach(System.out::println);
		
//		courses.stream()
//		.filter(course -> course.length() >= 4)
//		.forEach(System.out::println);
		
		courses.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);

	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
			
		numbers.stream()
			.filter(number -> number % 2 != 0)
			.forEach(System.out::println);
	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			.filter(number -> number % 2 != 0)
			.map(number -> number * number * number)
			.forEach(System.out::println);
	}

}
