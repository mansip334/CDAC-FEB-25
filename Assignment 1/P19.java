// program that calculates the power of a number. Take two numbers as input: the
base and the exponent, and compute the result of base raised to the power of exponent.

import java.util.Scanner;

class P19{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int base = sc.nextInt();  
          int exponent = sc.nextInt();  
          int result = 1;  
          for (int i = 0; i < exponent; i++) {  
            result *= base;  
        }  
        System.out.println(base + " raised to the power " + exponent +" is " + result);
   }
}