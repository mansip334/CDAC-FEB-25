// program to print the first N natural numbers, where N is provided by the user.

import java.util.Scanner;

class P17{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
 
          int n = sc.nextInt();
          for(int i=1;i<=n;i++){
          System.out.print(i+" ");     

       }
    }
}