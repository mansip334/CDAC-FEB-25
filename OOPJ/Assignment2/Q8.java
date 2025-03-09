//Q.8 Write a program that  takes three boolean inputs  and prints  true  if at least two of them are  true  . 
//Hint  : Use logical operators (  &&  ,  ||  ). 

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first boolean value (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter the third boolean value (true/false): ");
        boolean c = sc.nextBoolean();
		
		if((a && (b||c)) || (b && (a||c)) || (c && (a||b))){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	} 
}	