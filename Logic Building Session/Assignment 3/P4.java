// program to reverse the digits of the number 1234. The output should be 4321. 

import java.util.Scanner;

class P4{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
	  int rev =0;
	while (n != 0) {
            int digit = n % 10;              
	          rev = rev * 10 + digit;  
            n = n / 10;   
       }
      
   System.out.println("Reverse number: " + rev);
}
}