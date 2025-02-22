/*5. Print Area of a Square:
 Task: Create a flowchart to calculate and print the area of a square. 
 Next Step: Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length.
*/

import java.util.Scanner;

class P5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		int area = side * side;
	System.out.println("Area of square: "+ area);
}
}