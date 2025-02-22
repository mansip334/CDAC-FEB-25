//program to print the factorial of a number.

import java.util.Scanner;

class P15{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
 
          int i,fact=1;  
          int n= sc.nextInt();    
         
         for(i=1;i<=n;i++){    
         fact=fact*i;    
        }    
      System.out.println("Factorial of "+n+" is "+fact+".");    
   }  
} 