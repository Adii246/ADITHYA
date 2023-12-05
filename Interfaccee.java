package asd;

public class Interfaccee {

}
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
		
	}
	public abstract void eat();
	public void walk() {
		System.out.println("this animal walks on " +legs+" legs");
	}
}
class Spider extends Animal{
	public Spider(){
		super(8);
	}
	
	public void eat() {
		System.out.println("the spider eats insect");
	}
}
interface Pet{
	String getName();
	void setName(String Name);
	void play();
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat() {
		super(4);
	}
	
	public void eat() {
		System.out.println("The cat is eating");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("the cat is playing");
	}
}
class Fish extends Animal implements Pet{
	String name;
	public Fish() {
		super(0);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("the fish is playing");
	}
	public void walk() {
		System.out.println("the fish cannot walk but it swims");
	}
	public void eat() {
		System.out.println("the fish eats plants");
	}
}
public class Interface {
          public static void main(String[] args) {
        	 Fish fish=new Fish();
        	 fish.setName("Mimi");
        	 System.out.println("This fish's name is "+fish.getName());
        	 fish.eat();
        	 fish.walk();
        	 fish.setName("Momo");
        	 System.out.println("This fish's name is "+fish.getName());
        	 Cat cat=new Cat();
        	 cat.setName("Fluffy");
        	 System.out.println("This cat's name is "+cat.getName());
        	 cat.eat();
        	 cat.walk();
        	 cat.setName("Moose");
        	 System.out.println("This cat's name is "+cat.getName());
        	 Spider spider=new Spider();
        	 spider.eat();
        	 spider.walk();        	 
          }
}