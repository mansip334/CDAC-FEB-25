/*Q4. Complex Number Operations 
Create a class to represent complex numbers. Include the following constructors: 
1.  A default constructor that sets both real and imaginary parts to 0 
2.  A constructor that initializes the real part only 
3.  A constructor that initializes both real and imaginary parts 
Also, write member functions to: 
  Add two complex numbers 
  Multiply two complex numbers 
In the main() method: 
  Create two complex numbers: 3 + 2i and 4 - 2i 
  Display their sum and product */


class Complex{
	private double real;
	private double imaginary;
	
	Complex(){
		this.real = 0;
		this.imaginary = 0;
	}	
	Complex(double real){
		this.real = real;
		this.imaginary = 0;
	}	
	Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}	
	Complex add(Complex other){
		double newreal = this.real + other.real;
		double newimaginary = this.imaginary + other.imaginary;
		return new Complex(newreal, newimaginary);
	}	
	Complex multiply(Complex other){
		double newreal = (this.real * other.real) - (this.imaginary * other.imaginary);
		double newimaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		return new Complex(newreal, newimaginary);
	}
	void display(){
		System.out.println(this.real + " " + (this.imaginary >= 0 ? "+" : "-") + " " + this.imaginary + "i");
	}
}
public class ComplexNumber{
	public static void main(String[] args){
		Complex num1 = new Complex(1,-2);
		Complex num2 = new Complex(1.2,-2.989);
		
		Complex sum = num1.add(num2);
		Complex product = num1.multiply(num2);
		sum.display();
		product.display();
	}
}
