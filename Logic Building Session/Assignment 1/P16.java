// program to check whether a number is prime or not.

import java.util.Scanner;

class P16{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
 
          int number = sc.nextInt();
           boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number " + number + " is Prime");
        } else {
            System.out.println("The number " + number + " is not Prime");
        }
    }
}