package javapractices;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		Animal a1=new Cat();
		a.makesound();
		a1.makesound();

	}

}

class Animal {
	public void makesound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal {
	public void makesound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal {
	public void makesound() {
		System.out.println("cat Meows");
	}
}