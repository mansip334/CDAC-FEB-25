// Find Missing Number in an Array 
//  Given an array of size n-1 containing numbers from 1 to n, find the missing number.


import java.util.Scanner;

class P9{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the Size: ");
			int n = sc.nextInt();
			int a[] = new int[n-1];
			
			for(int  i = 0 ; i < a.length; i++){
				a[i] = sc.nextInt();
			}
			
			int ExpectedSum = n * ( n + 1 ) / 2;
			int TotalSum = 0;
			for(int i = 0; i < a.length; i++){
				TotalSum = TotalSum + a[i];
			}
			
			System.out.println("Missing number in an array: "+ (ExpectedSum - TotalSum));	
		}
}