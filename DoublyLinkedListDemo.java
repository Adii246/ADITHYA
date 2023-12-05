package java_lab;

import java.util.Scanner;
import java.util.LinkedList;


class DoublyLinkedList<T>{
	private LinkedList < T > list= new LinkedList<>();
	public void add(T element) 
	{
		list.addLast(element);
	}
	public void insert(int index,T element) {
		list.add(index,element);
	}
	public void remove(int index) {
		list.remove(index);
	}
	public void display() {
		for(T elements:list) {
			System.out.println(elements+" ");
		}
	}
}
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DoublyLinkedList <Integer> doublyLinkedList=new DoublyLinkedList <Integer> ();
		doublyLinkedList.add(5);
		doublyLinkedList.add(4);
		doublyLinkedList.add(9);
		doublyLinkedList.display();
		doublyLinkedList.insert(1, 10);
		doublyLinkedList.display();
		doublyLinkedList.remove(2);
		doublyLinkedList.display();
		

	}

}
