// Count Even and Odd Numbers 
// Count the number of even and odd numbers in an array. 

import java.util.Scanner;

class P4{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		} //5 6 8 9 5 
		int even = 0;
		int odd = 0;
		for(int i = 0; i<5;i++){
			if(a[i] % 2 ==0){
			    even++;
		    }else{
				odd++;
			}
		}
		System.out.println("Count of even number: " + even);
		System.out.println("Count of odd number: " + odd);
		
		
	}
}	