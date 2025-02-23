//program to calculate the sum of the first 50 natural numbers

import java.util.Scanner;

class P1{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
	  int sum = 0;
	for(int i=1;i<=50;i++){
	    sum = sum+i;
	}
	System.out.println("sum of first 50 natural number: " +sum);
	}
}