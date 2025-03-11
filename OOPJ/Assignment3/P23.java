 //Matrix Multiplication 
// Multiply two matrices and return the resultant matrix.

import java.util.Scanner;

class P23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the row: ");
		int r = sc.nextInt();
		System.out.print("Enter the column: ");
		int c = sc.nextInt();
		
		int[][] a = new int[r][c];
		
		System.out.println("Enter the element of Matrix 1: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		int [][]b = new int[r][c];
		
		System.out.println("Enter the element of Matrix 2: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Multiplication of two Matrix is: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				System.out.print(((a[i][j]) * (b[i][j])) +" ");
			}
			System.out.println();
		}
	}
}