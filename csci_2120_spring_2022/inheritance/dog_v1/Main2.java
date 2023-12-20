public class Main2 {

	public static void main(String[] args) {

		Chihuahua jaime = new Chihuahua("Jaime", 8.5, 3.0);

		// what's going on on the following line
		Chihuahua manuel = jaime;
		Chihuahua jaimeClone = new Chihuahua("Jaime", 8.5, 3.0);

		if (jaime == jaimeClone)
			System.out.println("Jaime and JaimeClone are == ");

		if (jaime.equals(jaimeClone))
			System.out.println("Jaime and JaimeClone are equals() equal");

	}

} // end class
