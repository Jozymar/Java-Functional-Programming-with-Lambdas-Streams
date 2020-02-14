package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class EX03MethodReferences {
	
	private static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", 
				"Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");
		
		courses.stream()
//			.map(str -> str.toUpperCase())
			.map(String::toUpperCase)
			.forEach(EX03MethodReferences::print);
		
		Supplier<String> supplier = String::new;

	}
}
