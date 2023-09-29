/***************************
 * File       : FreqCount.java
 * Description: Java program to find the frequency of a character in a sentence
 * Author     : Adithya Raj
 * Date       :29-09-2023
 ***************************/
import java.util.Scanner;
public class FreqCount {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input=sc.nextLine();
		System.out.println("Enter a character to count:");
		char checkMe=sc.next().charAt(0);
		int characterCount=charCount(input,checkMe);
		System.out.println("Frequency of "+checkMe+" is:"+characterCount);
		
	}
static int charCount(String input,char checkMe)
{
	int count=0;
	char[] charArray=input.toCharArray();
	for(int i=0;i<input.length();i++)
	{
		if(charArray[i]==checkMe)
		{
			count++;
		}
	}
	return count;
}
}
