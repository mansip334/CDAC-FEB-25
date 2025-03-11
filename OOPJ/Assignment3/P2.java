/* 2.  Reverse an Array 
  Reverse the given array in place. */

import java.util.Scanner;

class P2{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size: ");
			int size = sc.nextInt();
			int a[] = new int[size];
			
			System.out.println("Enter the element: ");
			
			for(int i = 0; i <a.length; i++){
					a[i] = sc.nextInt();
			}

			for (int i = 0; i < a.length; i++) {
				int rev = 0;
				int num = a[i];
			
			while(num != 0){
				int digit = num % 10;
				rev = rev * 10 + digit;
				num = num / 10;
			}
				a[i] = rev;
			}
				
			//System.out.println(rev + " ");
			for(int i = 0; i < a.length; i++){
				System.out.println(a[i] + " ");
			}
		}
}