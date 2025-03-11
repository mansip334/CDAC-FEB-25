// Sum of Two Matrices 
// Given two matrices of the same size, compute their sum.

import java.util.Scanner;

class P20{
		public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int r = sc.nextInt();
		System.out.println("Enter the column: ");
		int c = sc.nextInt();
		
		int [][]a = new int[r][c];
		
		System.out.println("Enter the array element Matrix 1: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				a[i][j] = sc.nextInt();
			}
		}
	
		int [][]b = new int[r][c];
		
		System.out.println("Enter the array element Matrix 2: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Sum of two Matrix : ");
		for(int i = 0;i<r;i++){
			for(int j = 0;j<c;j++){
			 System.out.print(((a[i][j]) + (b[i][j]))+" ");
			}
			System.out.println();
		}
	}	
}