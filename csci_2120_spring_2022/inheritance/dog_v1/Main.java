public class Main {

	public static void main(String[] args) {

		// Left hand side: declaration of a variable with a type
		// Right hand side: it must be an expression "of the type" of
		// 			the variable the left hand side
		//
		// The type on the left - written in the code -> "static type"
		// 	(static in the sense that it doesn't change)
		// The type on the right - that happens at runtime - subtype
		// 	of the "static type" or the same -> "dynamic type"

		Dog jaime = new Chihuahua("Jaime", 8.5, 3.0);


		System.out.println(jaime);

		jaime.speak();

		Dog fifi = new Poodle("Fifi", 14.5, 16.8);

		System.out.println(fifi);

		fifi.speak();

		Dog spike = new Rottweiler("Spike", 22.3, 80.9);

		System.out.println(spike);

		// Polymorphism - many forms - from a single type "Dog" variable
		//    we can get all sorts of type specific behavior

		spike.speak();


		Dog[] myDogs = new Dog[3];
		myDogs[0] = fifi;
		myDogs[1] = jaime;
		myDogs[2] = spike;

		for (Dog d : myDogs) {
			d.speak();
			if (d instanceof Poodle)
				((Poodle)d).lookPretty();
		}



	}

} // end class
