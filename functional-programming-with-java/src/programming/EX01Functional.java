package programming;

import java.util.Arrays;
import java.util.List;

public class EX01Functional {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);
		
	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
//		numbers.stream()
//			.forEach(EX01Functional::print);
		
		numbers.stream()
		.forEach(System.out::println);

//		for(int number: numbers) {
//			System.out.println(number);
//		}
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
			
		numbers.stream()
//			.filter(EX01Functional::isEven)
			.filter(number -> number % 2 == 0)
			.forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
//			.filter(EX01Functional::isEven)
			.filter(number -> number % 2 == 0)
			.map(number  -> number * number)
			.forEach(System.out::println);
}

}
