/*  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  - */

class Q1{
	public static void main(String args[]){
		int a = 4;
		int b = 6;
		
		System.out.println("Before Swapping a: "+ a);
		System.out.println("Before Swapping b: "+ b);
			
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After Swapping a: " + a);
		System.out.println("After Swapping b: " + b);
	}
}