package arraysDemo;

import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {
//		int [] nums = new int[10];
		int nums[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "]:" + nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.println("nums[" + i + "]:" + nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 10;
			System.out.println("nums[" + i + "]:" + nums[i]);

		}
		for (int i = 10; i < 100; i++) {
			System.out.println("Sum of the digits" + i + ":" + addDigits(i));
		}

		int[] numbers = new int[30];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] =i+ 1;
		System.out.println(fizzBuzz(numbers[i]));
		}	

	}

	public static int addDigits(int num) {
//		int num =  25;
		int tens = num / 10;
		int units = num % 10;
		return tens + units;

	}

	

	public static String fizzBuzz(int number) {
		

		
//		
//			if (number % 5 == 0 && number% 3 == 0) {
//				return("fizzbuzz");
//			} else if (number % 5 == 0) {
//				return ("fizz");
//			} else if (number% 3 == 0) {
//				return( "buzz");
//			} else
//				return " " + number;

		String output=" ";
		if (number%3==0) output += "Fizz";
		if (number%5==0) output += "Buzz";
		if(output==" ") output+=number;
		return output;
		
	}

}
