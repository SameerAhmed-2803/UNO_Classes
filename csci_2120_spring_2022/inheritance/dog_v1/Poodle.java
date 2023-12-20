public class Poodle extends Dog{

	// methods
	
	// constructor - to initialize instance variables and builds an object
	public Poodle(String name, double height, double weight) {
		super(name, height, weight);
	}

        // method overriding - replacing the behavior of a method in a subtype
        //     with a new implementation.  The method signature needs to be
        //     EXACTLY THE SAME in order for overriding to happen

	@Override 
        public void speak() {
                System.out.println("baaaaaahk baby!!");
        }

	public void lookPretty() {
		System.out.println("I got my hair done, check my NAILS!!");
	}



} // end class Poodle
