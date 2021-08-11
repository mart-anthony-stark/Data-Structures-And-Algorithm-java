package back2java;

public class Cardio {
	public static void main(String[] args) {
		
	}
	
	static String reverseString(String str) {
		String reversedString="";
		String strArray[] = str.split("");
		for(String x:strArray) {
			reversedString = x + reversedString;
		}
		return reversedString;
	}
	
	static boolean isPalindrome(String str) {
		String reversedStr = "";
		String strArray[] = str.split("");
		for(String x:strArray) {
			reversedStr = x + reversedStr;
		}
		return reversedStr.equalsIgnoreCase(str);
	}
	
	static void fizzBuzz(int num) {
		for(int i = 1; i <= num; i++) {
			if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
			else if(i%3==0) System.out.println("Fizz");
			else if (i%5==0) System.out.println("Buzz");
			else System.out.println(i);
		}
	}
	
	
}
