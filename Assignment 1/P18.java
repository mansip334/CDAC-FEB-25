// program to convert a temperature from Celsius to Fahrenheit.

import java.util.Scanner;

class P18{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        
          float Fahrenheit;
          int Celsius = sc.nextInt();  
          Fahrenheit = (Celsius*9/5)+32;  
          System.out.println(Celsius +"°C is equal to "+ Fahrenheit + "°F");        

    }
}