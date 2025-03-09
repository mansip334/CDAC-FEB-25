//Write a program to check if a given number is a  power of 2  using bitwise operators. 
//Hint  :  n & (n - 1) == 0  for positive numbers. 

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
}