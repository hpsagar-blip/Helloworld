package java8.com;

import java.util.function.Function;

public class MethodReference {

	public static void main(String[] args) {

  Function<Integer, Double> function = (input) -> Math.sqrt(input);
  System.out.println(function.apply(4));
  
  
  Function<Integer, Double> functionMethodReference = Math::sqrt;
  System.out.println(functionMethodReference.apply(4));
	}

}
