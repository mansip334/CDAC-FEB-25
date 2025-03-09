// Write a program to check whether a given number is  even or odd  using only  bitwise operators  . 
//Hint  : Use  n & 1  to check.

import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if((n&1) == 0){
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}
}
