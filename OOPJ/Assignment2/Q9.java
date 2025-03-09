//Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 50)  without using  if-else  . 
//Hint  : Use  logical AND (  &&  ) in a print statement 

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
	
		System.out.println((n>=20 && n<=50)? n + " lies in the range." : n + " doesn't lie within the range");
	} 
}