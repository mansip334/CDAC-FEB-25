// Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
//Hint  : Use bitwise left shift (  <<  )

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
      
        int result = n << 3;
    
        System.out.println("The number " + n + " multiplied by 8 is: " + result);
		
    }
}
