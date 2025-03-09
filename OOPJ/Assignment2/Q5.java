// Write a Java program to  swap two numbers  using the  +=  and  -=  operators only

class Q5{
	public static void main(String args[]){
		int a = 4;
		int b = 6;
		
		System.out.println("Before Swapping a: "+ a);
		System.out.println("Before Swapping b: "+ b);
			
		a += b;
		b -= a;
		b  = -b;
		a -= b;
		System.out.println("After Swapping a: " + a);
		System.out.println("After Swapping b: " + b);
	}
}