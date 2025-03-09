// Implement a program to swap  odd and even bits  of a number using bitwise operators. 
//Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 


import java.util.Scanner;
class Q15{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
	    int evenBits = (x & 0xAAAAAAAA) >> 1; 
        int oddBits = (x & 0x55555555) << 1;   
        int res = (evenBits | oddBits);   
		System.out.println(res);
	} 
}