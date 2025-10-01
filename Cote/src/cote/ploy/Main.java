package cote.ploy;

public class Main {

	public static void main(String[] args) {
		Animal[] myAnimals = new Animal[5];
		myAnimals[0] = new Cat();
		myAnimals[1] = new Dog();
		myAnimals[2] = new Cow();
		myAnimals[3] = new Cat();
		myAnimals[4] = new Cow();
		
		for(int i = 0; i < myAnimals.length; i++) {
			Animal a = myAnimals[i];
			System.out.println(a.hello());
		}
	}

}
