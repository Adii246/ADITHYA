package java_lab;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numbers,sum=0;
		System.out.println("Enter the line of integers");
		String digits= sc.nextLine();
		StringTokenizer string= new StringTokenizer(digits);
		while(string.hasMoreTokens()) {
			 numbers=Integer.parseInt(string.nextToken());
			 System.out.println(numbers);
			 sum=sum+numbers;
		}
		System.out.println("Sum of the integers=" +sum);
	}
}

