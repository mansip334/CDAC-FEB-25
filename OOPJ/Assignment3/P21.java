//Row-wise and Column-wise Sum 
//Find the sum of each row and each column of a given matrix.

import java.util.Scanner;
class P21{
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
		int rowsum = 0, colsum = 0;
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};	
		for(int i=0; i<a.length; i++){
			rowsum = 0; 
			colsum = 0;
			for(int j=0; j<a[i].length; j++){
				rowsum += a[i][j];
				colsum += a[j][i];
			}
			System.out.println("Row Sum: " + rowsum + "\tColumn Sum: " + colsum);
		}	
	}
}