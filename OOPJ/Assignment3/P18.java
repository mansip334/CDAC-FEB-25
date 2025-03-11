// Print a Matrix 
// Given an m x n matrix, print all its elements row-wise. 

import java.util.Scanner;

class P18{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the row: ");
			int r = sc.nextInt();
			
			System.out.println("Enter the column: ");
			int c = sc.nextInt();
			
			int [][]a = new int[r][c];
			
			System.out.println("Enter the matrix elements row-wise: ");
			for(int i=0; i<r; i++){
					for(int j=0;j<c;j++){
						a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Matrix is: ");
			for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " "); // Print each element in a row
            }
            System.out.println();
			}
		}
}