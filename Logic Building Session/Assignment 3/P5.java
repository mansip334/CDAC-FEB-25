//a program to print the Fibonacci sequence up to the number 21

import java.util.Scanner;

class P5{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int a = 0;
	  int b = 1;        
    System.out.println("Fibonacci Series Upto " + n + ": ");
    
    while (a <= n) {
      System.out.print(a + " ");

      int c = a+b;
      a=b;
      b=c;

    }
  }
}