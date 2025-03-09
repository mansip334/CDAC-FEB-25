// Implement a Java program that  returns the absolute value  of a given number using 
//the ternary operator (without using  Math.abs() 

import java.util.Scanner;
class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int result = (a>0)? a : -a;
		System.out.println("absolute value: " + result);
	}
}