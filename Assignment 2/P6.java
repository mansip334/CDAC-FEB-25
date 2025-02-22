/*6. Print Area of a Rectangle:
 Task: Create a flowchart to calculate and print the area of a rectangle. 
 Next Step: Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width.
*/

import java.util.Scanner;

class P6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
 		int area = length*width;
	System.out.println("area of a rectangle: "+ area);
}
}
	