//program to find and print the largest digit in the number 4825. 

import java.util.Scanner;

class P9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	int large = 0;
	while(n!=0){
	int digit = n%10;
 	if(digit>large){
	large = digit;
     }
	n = n/10;
}
	System.out.println(large); 
}
}
