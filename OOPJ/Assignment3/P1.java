/*			Array coding question : 
1.  Find the Largest and Smallest Element 
 Given an array, find the smallest and largest elements in it.   */ 
 
 import java.util.Scanner;
 
 class P1{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the size: ");
			int size = sc.nextInt();
			int[] a = new int[size];
			
			System.out.println("Enter the elements: ");
			for(int i = 0; i < a.length; i++){
				a[i] = sc.nextInt();
			}
			
			if(a.length == 0){
				System.out.println("Array Empty");
				return;
			}
			
			int large = a[0];
			int small = a[0];
			
			for(int i = 1;i < a.length; i++){
				if(a[i] > large){
					large = a[i];
				}
				if(a[i]<small){
					small = a[i];
				}
			}
			
			System.out.println("Largest element: "+large);
			System.out.println("Smallest element: "+small);
			
		}
 }