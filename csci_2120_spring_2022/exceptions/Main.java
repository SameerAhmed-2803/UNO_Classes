public class Main {

	public static void main(String[] args) throws  ImGonnaBiteOffYourFaceException{

		Dog fifi = new Dog("Fifi", 10.4, 14.0);

		fifi.speak();

		System.out.println("I'm going to pet the dog now!");

		fifi.getPet();

		fifi.speak();

		System.out.println("finished properly without issues");
	}
}
