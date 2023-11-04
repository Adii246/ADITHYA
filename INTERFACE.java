abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walk on "+legs+"legs");
	}
}
class Spider extends Animal{
	Spider(){
		super(8);
	}
	public void eat() {
		System.out.println("The spider eats insects");
	}

}
interface Pet{
	String getName();
	void setName(String name);
	void play();
	
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name =name;
		
	}
	Cat() {
		this(" ");
	}
	
	public void eat() {
		System.out.println("The cat eats fish");
		
	}
	public void setName(String name) {
		this .name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
	System.out.println("The cat is playing");
	}
}
class Fish extends Animal implements Pet{
	String name;
	public Fish() {
		 super(0);
	 }
	
	public void eat() {
		System.out.println("The fish eats plants");
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
	System.out.println("The fish is playing");
	}
	public void walk() {
		System.out.println("The fish has no legs");
	}
	
}

public class Interface1 {
public static void main(String[] args) {
	Fish fish=new Fish();
	System.out.println("FISH");
	fish.setName("Mimi");
	System.out.println("This fish's name is"+name);
	fish.eat();
	fish.walk();
	Cat cat=new Cat();
	cat.setName("Fluffy");
	String name1=cat.getName();
	System.out.println("CAT");
	System.out.println("This cat's name is"+name1);
	cat.eat();
	cat.walk();
    Spider spider=new Spider();
    System.out.println("SPIDER");
    spider.eat();
    spider.walk();
   
}
}
