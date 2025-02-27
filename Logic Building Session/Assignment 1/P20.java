// program that counts the number of digits in a given number.

import java.util.Scanner;

class P20{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int count = 0;
          int a = n;
            
          while(n != 0){
                count++;
                n = n/10;
}
    System.out.println("The number "+a+" has "+count+" digits.");
  }
}
       