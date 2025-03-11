// Find Sum and Average 
// Compute the sum and average of all elements in the array.


import java.util.Scanner;

class P5{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size: ");
			int n = sc.nextInt();
			int[] a = new int[n];
			
			System.out.println("Enter the element: ");
			for(int i = 0; i < n ; i++){
				a[i] = sc.nextInt();
			}
			
			int sum = 0;
			int average;
			for(int i = 0; i<n; i++){
				sum = sum + a[i];
			}
			
			System.out.println("Sum of all elements: " + sum);
			System.out.println("Average of all elments: " + (sum / n));
		}
}