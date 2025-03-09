//Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input and prints the result using only  switch-case .

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
		System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
       
	    System.out.print("Enter +, -, *, /: ");
        char ch = sc.next().charAt(0); 
        
        double result = 0.0;
        
        switch (ch) {
            case '+':
						result = num1 + num2;
						break;
            case '-':
						result = num1 - num2;
						break;
            case '*':
						result = num1 * num2;
						break;
            case '/':
	
						if (num2 != 0) {
							result = num1 / num2;
						} else {
							System.out.println("Division by zero is not allowed.");
							return;
						}
						break;
            default:
						System.out.println("Invalid operator");
						return; 
		}
        System.out.println("The result is: " + result);
       
    }
}
