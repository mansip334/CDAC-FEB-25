// program that takes a number as input and prints the reverse of that number.

import java.util.Scanner;

class P12{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int rev = 0;
          int a = n;
            
          while(n != 0){
             int digit = n % 10;
             rev = rev * 10 + digit;
                n = n/10;
         }
     System. out.println("The reverse of "+a+" is "+rev+".");
   }
}
