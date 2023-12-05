package asd;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokendemo {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int numbers,sum=0;
		System.out.println("Enter the line of integers");
		String integers= sc.nextLine();
		StringTokenizer obj= new StringTokenizer(integers);
		while(obj.hasMoreTokens()) {
			 numbers=Integer.parseInt(obj.nextToken());
			 System.out.println(numbers);
			 sum=sum+numbers;
		}
		System.out.println("Sum of the integers=" +sum);
	}
}
