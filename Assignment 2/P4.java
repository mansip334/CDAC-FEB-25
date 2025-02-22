/*4. Display Good Morning Message Based on Time:
 Task: Create a flowchart to display a "Good Morning" message based on a given time. 
 Next Step: Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic. 
*/

import java.util.Scanner;

class P4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	if(n > 5 && n < 12){
		System.out.println("Good Morning");	
	}else{
		System.out.println("not yet Morning");
	}
	}
}