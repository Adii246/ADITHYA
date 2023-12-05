/***************************
 * File       : Interface.java
 * Description: Java program to do interface
 * Author     : Adithya Raj
 * Date       :03-11-2023
 ***************************/
package asd;
import java.util.Scanner;
public class Interface {
	public static void main(String [] args) {
Rectangle rectangle =new Rectangle();
rectangle.getArea(10,7);
Triangle 



}
}
public interface Shape{
	double getArea();
	}
public class Rectangle implements Shape{
	 public void getArea(double length, double breadth) {
		    System.out.println("The area of the rectangle is " + (length * breadth));
	 }
}
public class Triangle implements Shape{
	 public void getArea(double radius) {
		    System.out.println("The area of the rectangle is " + (3.14 * radius*radius));
	 }
}


