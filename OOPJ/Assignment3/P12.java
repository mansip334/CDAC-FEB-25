//Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
//Display the following: 
//○  Number of even numbers. 
//○  Number of odd numbers. 
//○  Number of multiples of 3 

import java.util.Scanner;
public class P12{
	public static void main(String args[]){
		int n[] = new int[20];
		input(n);
		System.out.println("Even count: " + even(n));
		System.out.println("Odd count: " + odd(n));
		multipleOfThree(n);	
	}
	
	
	public static void input(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an input: ");
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}	
	}
	
	public static int even(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==0){
				count++;
			}
		}
		return count;
	}
	
	public static int odd(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==1){
				count++;
			}
		}
		return count;
	}
	
	public static void multipleOfThree(int[] nums){
		for(int i=0; i<nums.length; i++){
			if(nums[i]%3==0 && nums[i] !=0)
				System.out.print(nums[i] + " ");	
		}
	}	
}