/*3. Check Odd or Even Number:
 Task: Create a flowchart to determine whether a number is odd or even. 
 Next Step: Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not. */

import java.util.Scanner;

class P3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("Even number");
		}else{
			System.out.println("Odd number");
		}		
	}
}