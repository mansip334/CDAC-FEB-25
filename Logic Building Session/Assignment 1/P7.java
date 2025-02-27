// program that take number as input & print its multiplication table up to 10

import java.util.Scanner;

class P7{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      for(int i = 1; i <= 10; i++){
        System.out.println(a+" * "+i+" = "+ a * i);
    }
  }
}
