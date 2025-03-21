/*Q5. BMI Calculator 
Design a Java program to implement a BMI (Body Mass Index) calculator. The program should 
consist of a class named BMICalculator with the following specifications: 
CDAC Mumbai 
Class: BMICalculator 
Fields 
  height (double): To store the height of the person in meters. 
  weight (double): To store the weight of the person in kilograms. 
Constructors 
  A parameterized constructor to initialize the height and weight fields. 
Methods 
  Getter and Setter methods for both height and weight. 
  double calculateBMI(): This method calculates and returns the BMI using the formula: 
BMI=weight(height×height)\text{BMI} = \frac{\text{weight}}{(\text{height} \times 
\text{height})}BMI=(height×height)weight 
Main Program : Write a separate class containing the main() method to 
1.  Create an object of the BMICalculator class. 
2.  Prompt the user to enter their height and weight. 
3.  Use setter methods to assign these values to the object. 
4.  Call the calculateBMI() method to compute the BMI. 
5.  Print the calculated BMI to the console. */

import java.util.Scanner;
 class BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		BMICalculator b = new BMICalculator(height, weight);
		System.out.println(b.calculateBMI());	
	}
}
class BMICalculator{
	private double height;
	private double weight;
	
	BMICalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public  double calculateBMI() {
		 return (weight/(height*height));
	 }
}