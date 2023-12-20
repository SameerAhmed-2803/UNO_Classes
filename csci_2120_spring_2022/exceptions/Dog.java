public class Dog {

	// instance variable ALWAYS private UNLESS there's a good reason
	//  for doing it another way
	//  a protected instance variable allows access to subtypes BUT it also
	//  allows access to any class that's defined in the same package as this
	//  one - as long as we don't use it this second way, we don't break
	//  encapsulation
	protected String name;
	protected double height;
	protected double weight;
	protected boolean isCrabby;

	// methods
	
	// constructor - to initialize instance variables and builds an object
	public Dog(String name, double height, double weight) {
	//	instanceVariable = parameter
	//      more permanent = more temporary
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.isCrabby = true;
	}

	// accessor methods
	
	// getters or queries - answers a question (i.e. returns something) but
	// DOES NOT CHANGE THE STATE OF THE OBJECT
	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	@Override
	public boolean equals(Object other) {

		if (other instanceof Dog) {
			Dog otherAsADog = (Dog)other;
			if (this.getName().equals(((Dog)other).getName()) &&
			    Math.abs(this.height - ((Dog)other).getHeight()) < 0.001 &&
		            Math.abs(this.weight - ((Dog)other).getWeight()) < 0.001 )
			   return true;

		}
		return false;

	}

	@Override
	public String toString() {
		String returnval = "";
		returnval += "A Dog named " + name + " who is " + height + " tall ";
		returnval += "and weighs " + weight;
		return returnval;
	}

	// setters or commands - does tell the object to change its state, and
	// also shouldn't return anything
	
	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("woof");
	}

	public void getPet() throws RuntimeException {

		if (isCrabby) {
			try {
				throw new ImGonnaBiteOffYourFaceException("I'm crabby and don't want the pets!!!");
			}  catch (Exception e) {
				throw new RuntimeException(e);
			}

		}

		System.out.println("OOOH I LOOOVES the PETS!!!");

	}

} // end class Poodle
