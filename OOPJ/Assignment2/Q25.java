//  Implement a program that reverses an  integer number  without using string conversion (  StringBuilder  or  toCharArray  ). 
//Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();		
		int reverse = 0;
		int temp = n;
		
		while(n!=0){
			reverse = reverse * 10 + n % 10;
			n = n/10;
		}
		System.out.println("Reverse of " + temp + " is " + reverse);
	}
}