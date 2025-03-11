 //Transpose of a Matrix 
//  Given a matrix, return its transpose (swap rows and columns). 

import java.util.Scanner;

class P19{
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
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < r; j++) {
                System.out.print(a[j][i] + " "); // Print each element in a row
            }
            System.out.println();
			}
		}
}