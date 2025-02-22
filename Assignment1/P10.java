// program to check number is even or odd

import java.util.Scanner;

class P10{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a % 2 == 0){
          System.out.println("The number "+a+" is even.");
     }else{
          System.out.println("The number "+a+" is odd.");
      } 
   }
}
