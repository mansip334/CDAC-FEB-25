//Find the Maximum Element in a Matrix 
// Find the largest element in a given matrix.

import java.util.Scanner;

class P22{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the row: ");
		int r = sc.nextInt();
		System.out.print("Enter the column: ");
		int c = sc.nextInt();
		
		int[][] a = new int[r][c];
		
		System.out.println("Enter the element of Matrix: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		int max= Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				max = (a[i][j]>max)? a[i][j] : max;
			}
		}
		System.out.println("Largest element: " + max);
	}
}