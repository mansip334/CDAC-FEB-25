// program to swap values of 2 variable without using third variable

import java.util.Scanner;

class P8{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
    
      System.out.println("Before Swapping: ");
      System.out.println("First number:"+a);
      System.out.println("Second number:"+b);
      
      System.out.println("                     ");
      a = a+b;
      b = a-b;
      a = a-b;
     
      System.out.println("After Swapping: ");
      System.out.println("First number:"+a);
      System.out.println("Second number:"+b);

   }
}
