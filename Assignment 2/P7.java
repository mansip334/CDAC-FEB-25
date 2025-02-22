/*7. Find the Largest of Three Numbers:
 Task: Create a flowchart to find the largest of three numbers. 
 Next Step: Write a Java program that finds and prints the largest of three predefined numbers using if-else statements. 
*/

import java.util.Scanner;

class P7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	if(a>b && a>c){
		System.out.println("number first is largest: "+ a);
	}else if(b>a && b>c){
		System.out.println("number second is largest: "+ b);
	}else{
		System.out.println("number third is largest: "+ c);
	}
}
}




