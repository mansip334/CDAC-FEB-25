//10:  Write a program to determine if a  character is a vowel  or a consonant using the ternary operator. 
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
		
		String res = (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"Vowel":"Consonant";
		
		 System.out.println(ch + " is a " + res);

	}
}