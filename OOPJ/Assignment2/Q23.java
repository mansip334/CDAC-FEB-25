// Given a number, find whether it is  odd or even  using the  &  bitwise operator and print the result without using  if-else 

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
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