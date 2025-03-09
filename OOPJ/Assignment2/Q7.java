// Implement a Java program that checks whether a given year is a  leap year or not  using 
//logical (  &&  ,  ||  ) operators 

import java.util.Scanner;
public class Q7{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int year = sc.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year."); 
	}
}