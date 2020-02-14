package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class EX03FunctionalInterfaces2 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		Function<Integer, Integer> squareFunction = x -> x * x;
		
		Function<Integer, String> stringOutputFunction = x -> x + " ";
		
		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
		
		BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
		
		Supplier<Integer> randomIntegerSupplier = () ->  {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		
		System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number<10 && str.length()>5;
		}; 
		
		System.out.println(biPredicate.test(5, "Java Functional"));
		
		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + " " + str;
		};
		
		System.out.println(biFunction.apply(5, "Java Functional"));
		
		BiConsumer<Integer, String> biConsumer = (s1,s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		
		biConsumer.accept(5, "Java Functional");
		
		BinaryOperator<Integer> sumBinaryOperator2 = (x, y) -> x + y;
		
		IntBinaryOperator intBinaryOperator = (x, y) -> x + y;

		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer x) {
				return x%2 == 0;
			}
		};
		
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
				
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
//		numbers.stream()
//		.filter(isEvenPredicate2)
//		.map(squareFunction2)
//		.forEach(sysoutConsumer2);
				
//		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer a, Integer b) {
//				return a + b;
//			}
//		};
		
//		int sum = numbers.stream()
//				.reduce(0, sumBinaryOperator);
	}
}
