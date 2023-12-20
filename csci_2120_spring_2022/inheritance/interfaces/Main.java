public class Main {

	public static void main(String[] args) {

		Animal[] myAnimals = new Animal[3];

		myAnimals[0] = new Snake();
		myAnimals[1] = new Bird();
		myAnimals[2] = new Fish();

		for (Animal george : myAnimals)
			george.move();


	}
}
