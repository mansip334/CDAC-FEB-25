//Write a program to count the  number of 1s (set bits)  in a binary representation of a number using bitwise operations. 
//Hint  : Use  n & (n - 1) 

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
     
        int count = 0;
       
        while (n != 0) {
            n = n & (n - 1); 
            count++; 
        }
        
        System.out.println("The number of 1s (set bits) in the binary representation is: " + count);
    
    }
}
