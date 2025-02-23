//a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6)

import java.util.Scanner;

class P7{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum = 0;
	      int rem = 0;
        while (n > 0) {
            rem =  n % 10;  
 	        sum = sum +rem;
            n = n/10;  
	}              
     System.out.println("The sum of the digits is: " + sum);
    }
}
