/* Given a student percentage, print Pass if the percentage is 40 or above; 
otherwise, print Fail , using only the ternary operator.*/

import java.util.Scanner;
class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		String result = (a>=40)? "Pass" : "Fail";
		System.out.println(result);
	}
}