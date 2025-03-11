// Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer 
//and store all the even numbers in an array even[ ] and all the odd numbers in another array 
//odd[ ]. Finally, print the elements of the even & the odd array. 


import java.util.Scanner;

public class P14{
	public static void main(String[] args){
		int n = 20;
		Scanner sc = new Scanner(System.in);
		int[] even = new int[n];
		int[] odd = new int[n];
		int a[] = new int[n];
		int even1=0, odd1=0;
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2==0){
				even[even1++] = a[i];
			} else {
				odd[odd1++] = a[i];
			}
		}
		System.out.println("Odd Numbers: ");
		for(int i=0;i<odd1; i++){
			System.out.print(odd[i] + " ");
		}
		
		System.out.println("\nEven Numbers: ");
		for(int i=0;i<even1; i++){
			System.out.print(even[i] + " ");
		}
	}
}