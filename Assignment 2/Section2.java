/*import java.util.Scanner;

class Section2{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int score = sc.nextInt();

	if(score>=90){
		System.out.println("A");
	}
	else if(score>=80){
		System.out.println("B");
	}
	else if(score>=70){
		System.out.println("C");
	}
	else if(score>=60){
		System.out.println("D");
	}
	else{
		System.out.println("F");
	}
    }
}*/
/*
import java.util.Scanner;

public class Section2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
              
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}*/

/*import java.util.Scanner;

public class Section2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        double totalAmount = sc.nextDouble();

        System.out.print("membership (1/2): ");
        int membership = sc.nextInt();

        double discountper = 0;

        if (totalAmount >= 1000) {
            discountper = 20;
        } else if (totalAmount >= 500) {
            discountper = 10;
        } else {
            discountper = 5;
        }
               if (membership==1) {
            discountper = discountper + 5;
        }
        double discountAmount = (discountper / 100) * totalAmount;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("Total Purchase " + totalAmount);
        System.out.println("Discount Applied: " + discountper + "%");
        System.out.println("Discount Amount " + discountAmount);
        System.out.println("Final Amount " + finalAmount);

    }
}*/

/*import java.util.Scanner;

public class Section2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("marks1: ");
        int mark1 = sc.nextInt();

        System.out.print("marks2: ");
        int mark2 = sc.nextInt();

        System.out.print("marks3: ");
        int mark3 = sc.nextInt();

        int fail = 0;
        for (int i = 1; i <= 3; i++) {
            int mark = 0;
            switch (i) {
                case 1:
                    mark = mark1;
                    break;
                case 2:
                    mark = mark2;
                    break;
                case 3:
                    mark = mark3;
                    break;
            }
        switch (mark >= 40 ? 1 : 2) {
                case 1:
                    break;
                case 2:
                    fail++;
                    break;
            }
        }
        if (fail == 0) {
            System.out.println("Congratulations.. you are pass.");
        } else {
            System.out.println("You have fail in " + fail + " subject(s).");
        }
    }
}*/

import java.util.Scanner;

public class Section2 {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        System.out.print("Day of the week: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday - Weekday");
                break;
            case 2:
                System.out.println("Tuesday - Weekday");
                break;
            case 3:
                System.out.println("Wednesday - Weekday");
                break;
            case 4:
                System.out.println("Thursday - Weekday");
                break;
            case 5:
                System.out.println("Friday - Weekday");
                break;
            case 6:
                System.out.println("Saturday - Weekend");
                break;
            case 7:
                System.out.println("Sunday - Weekend");
                break;
            default:
                System.out.println("Please enter a number");
                break;
        }
    }
}


