package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EX02Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squareNumbers = squareList(numbers);
		
		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x%2==0)
				.collect(Collectors.toList());
		
		System.out.println(squareNumbers);
		System.out.println(evenNumbersOnly);
		
//		int sum = addListFunctional(numbers);
//		
//		System.out.println(sum);

	}
	
	private static List<Integer> squareList(List<Integer> numbers) {
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()
//				.reduce(0, EX02Functional::sum);
//				.reduce(0, (x, y) -> x + y);
				.reduce(0, Integer::sum);

	}

}
