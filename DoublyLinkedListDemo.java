package java_lab;
import java.util.Scanner;
import java.util.LinkedList;
class DoublyLinkedList<T>{
	private LinkedList < T > list= new LinkedList<>();
	public void insertAtFront(T element) {
		list.addFirst(element);
	}
	public void insertAtEnd(T element) 
	{
		list.addLast(element);
	}
	public void insertAtAnyposition(int index,T element) {
		list.add(index,element);
	}
	public void removeAtAnyPosition(int index) {
		list.remove(index);
	}
	public void display() {
		for(T elements:list) {
			System.out.print(elements+" ");
		}
		System.out.println(" ");
	}
}
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DoublyLinkedList <Integer> doublyLinkedList=new DoublyLinkedList <> ();
		
		int choice=0;
		while(choice!=6) {
			System.out.println("Enter your choice\n"+"1.Insertion At Front\n"
					+ "2.Insertion At End\n"+"3.Insertion At any position\n"
					+"4.Deletion at any Position\n"+"5. Display\n"
					+"6.Exit\n");
			 choice = sc.nextInt();
			int element,position;
			
			switch(choice) {
			case 1:
				System.out.println("Enter the element:");
				 element = sc.nextInt();
				doublyLinkedList.insertAtFront(element);
				break;
			
			case 2:
				System.out.println("Enter the element:");
				 element = sc.nextInt();
				doublyLinkedList.insertAtEnd(element);
				break;	
			
			case 3:
				System.out.println("Enter the element:");
				 element = sc.nextInt();
				System.out.println("Enter the position:");
				 position = sc.nextInt();
				doublyLinkedList.insertAtAnyposition(position, element);
				break;
			case 4:
				
				System.out.println("Enter the position:");
				 position = sc.nextInt();
				doublyLinkedList.removeAtAnyPosition(position);
				break;
				
			case 5:
				System.out.println("The elements are :");
				doublyLinkedList.display();
				break;
				
			case 6:
				System.out.println("Exit");
			
			default :
				System.out.println("Invalid choice");
				
				 
			
			
			
		}
		
	}

}
}
