package asd;
import java.util.Scanner;
public class trycatch {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 char choice= 'y';
		 while (choice=='y') {
			 try {
				 System.out.println("Enter the first number:");
				 int number1=sc.nextInt();
				 System.out.println("Enter the second number:");
				 int number2=sc.nextInt();
				int result=number1/number2;
				System.out.println("Result is:"+result);
			 }
			 catch(ArithmeticException s) {
				 System.out.println("Division by zero is not possible");
			 }
			 finally {
				 System.out.println("End of operation");
			 }
			 System.out.println("Do you want to continue Y or N");
			 choice=sc.next().charAt(0);
		 }
	 }

}