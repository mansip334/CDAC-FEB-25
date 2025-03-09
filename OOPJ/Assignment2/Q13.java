


//Implement a Java program to find the  absolute value  of an integer using bitwise operators. 
//Hint  :  mask = num >> 31; abs = (num + mask) ^ mask; 

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        int mask = num >> 31;
 
        int absolute = (num + mask) ^ mask;
        
        System.out.println("The absolute value of " + num + " is: " + absolute);
  
    }
}
