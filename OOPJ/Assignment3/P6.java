// Remove Duplicates from a Sorted Array 
//  Remove duplicate elements from a sorted array without using extra space. 

import java.util.*;

class P6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i = 0; i<a.length; i++){
				a[i] = sc.nextInt();
		}
		
		//Arrays.sort(a);
		if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }
		
		for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
                int temp = 0;
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
		}

		int j = 1;
		for(int i = 1; i < a.length; i++){	
				if(a[i] != a[i-1]){
				a[j] = a[i];
				j++;	
			}
		}
		System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
	}
}