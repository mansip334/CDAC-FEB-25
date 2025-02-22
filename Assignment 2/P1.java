/*1.	Check Positive Number: 
  • Task: Create a flowchart to check whether a number is positive. 
  • Next Step: Write a Java program that checks if a predefined number is positive   using an if-else statement and prints the appropriate message.
*/

import java.util.Scanner;
class P1{
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0){
			System.out.println("It is a positive number");
		}else if(n < 0){
	 		System.out.println("It is a negative number");
		}else{
			System.out.println("It is neither positive nor negative");
		}
	}
}
