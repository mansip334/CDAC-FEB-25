// Find the Second Largest Element 
//  Find the second-largest element in the given array. 

import java.util.Scanner;

class P3{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = sc.nextInt();
	
	int a[] = new int[size];
	int temp;
	
	System.out.println("Enter the elements: ");
	for(int i = 0; i<a.length; i++){
		  a[i] = sc.nextInt();	
	}

	for(int i = 0; i < a.length; i++){
		for(int j = i+1; j < a.length ; j++){
				if(a[i] < a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
	}
		for(int i = 0; i < a.length; i++){
		System.out.print(a[i] + " ");	
	}
	System.out.println("Second Largest element: "+ a[1]);
	}
}