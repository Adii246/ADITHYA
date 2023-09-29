/***************************
 * File       : Palindrome.java
 * Description: Java program to check if a string is a palindrome or not
 * Author     : Adithya Raj
 * Date       :29-09-2023
 ***************************/
import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=sc.next();
		boolean isPalindrome=check(word);
		if(isPalindrome)
		{
			System.out.println("The string is a Palindrome!");
		}
		else
		{
			System.out.println("The string is not a Palindrome!");
		}
}
static boolean check(String word)
{
	char[] charArray=word.toCharArray();
	int length=word.length();
	for(int i=0;i<length;i++)
	{
		if(charArray[i]!=charArray[length-i-1])
		{
			return false;
		}
	}
	return true;
}
}
