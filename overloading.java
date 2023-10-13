/**********
 * File         : Multiplication
 * Description  : Java program to do method overloading
 * Author       : Adithya Raj
 * Version      : 1.0
 * Date         : 13/09/2023
 *********/


package asd;
import java.util.Scanner;

public class overloading {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Shape shape=new Shape();
	System.out.println("Enter the breadth of triangle");
	float breadth=sc.nextInt();
	System.out.println("Enter the height of triangle");
	float height=sc.nextInt();
	System.out.println("Enter the length of rectangle");
	int length=sc.nextInt();
	System.out.println("Enter the breadth of rectangle");
	int breadth2=sc.nextInt();
	System.out.println("Enter the radius of circle");
	float radius=sc.nextInt();
	Shape.area(breadth,height);
	Shape.area(length,breadth2);
	Shape.area(radius);
	
	
	}
}
class Shape{
	public static void area(float breadth,float height) {
		System.out.println("Area of triangle of breadth "+breadth+" and height "+height+" = "+(0.5*breadth*height));
	}
	public static void area(int length,int breadth2) {
		System.out.println("Area of rectangle of length "+length+" and breadth "+breadth2+" = "+(length*breadth2));
	}
	public static void area(float radius) {
		System.out.println("Area of circle of radius "+radius+" = "+(3.14*radius*radius));
	}	
}
			
		
				
				
		

