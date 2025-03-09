// Write a program that  increments a number without using  +  or  ++  operators. 
//Hint  : Use bitwise  - (~x) 

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("The increase value is: " + -(~x));
        
    }
}
