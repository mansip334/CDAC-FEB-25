// Write a program to find the  largest of three numbers  using only the  ternary operator 
//(  ? :  )  . 

class Q6{
	public static void main(String[] args){
		int x=4, y=5, z=1;
		int res = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(res + " is the largest number.");
	}
}	