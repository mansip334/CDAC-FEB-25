// Find the Diagonal Sum 
// Compute the sum of both diagonals in a square matrix. 

import java.util.Scanner;

class P25{
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
		
		int diagonalsum=0;
		for(int i=0; i<a.length; i++){
			diagonalsum += a[i][i];
		}
		System.out.println("Diagonal Sum: " + diagonalsum);
	}
}