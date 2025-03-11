//Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
//students in a single Dimensional Array. Find and display the following: 
//○  Number of students securing 75% and above in aggregate. 
//○  Number of students securing 40% and below in aggregate.


import java.util.Scanner;
public class P13{
	public static void main(String[] args){
		int n = 20;
		Scanner sc = new Scanner(System.in);
		int Physics[] = new int[n];
		int Chemistry[] = new int[n];
		int Maths[] = new int[n];
		
		for(int i=0; i<n; i++){
		
			System.out.print("Physics marks of student " + (i+1) + ": ");
			Physics[i] = sc.nextInt();
			
			System.out.print("Chemistry marks of student " + (i+1) + ": ");
			Chemistry[i] = sc.nextInt();
		
			System.out.print("Maths marks of student " + (i+1) + ": ");
			Maths[i] = sc.nextInt();
		} 
		
		int count1=0, count2=0;
		for(int i=0; i<n; i++){
			double avg=((Chemistry[i]+Physics[i]+Maths[i])/300.0)*100;
			if(avg>=75){
				count1++;
			} else if(avg<=40){
				count2++;
			}
		}
		System.out.println(" Number of students securing 75% and above in aggregate: " + count1);
		System.out.println(" Number of students securing 40% and below in aggregate: " + count2);
	}
}	