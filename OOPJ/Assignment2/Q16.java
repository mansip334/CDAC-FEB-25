//Write a program that determines whether a given number is  positive, negative, or 
//zero  using only the  ternary operator.

import java.util.Scanner;
 class Q16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		String res = (a==0)? "zero" : (a>0)? "positive" : "negative";
		System.out.println(res);
	}
}	

