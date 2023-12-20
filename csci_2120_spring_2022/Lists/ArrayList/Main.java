import java.util.Scanner; // this is ONLY HERE for the example shown at end

public class Main {

	public static void main(String[] args) {


		MyArrayList<String> names = new MyArrayList<String>();

		names.add("Rick");
		names.add("Morty");

		for (int i=0; i<10; i++) {
			names.add("Mr. Meeseeks #" + (i+1));
		}
		names.add(2,"Jerry");

		names.add("Summer");

		// now let's check that all that worked
		
		for (int i=0; i< names.size(); i++) {
			System.out.println( names.get(i) );
		}
		
		try {

			names.get(100000);

		} catch (IndexOutOfBoundsException e) {

			System.err.println("out of bounds exception handling works");
		}


		System.out.println("Getting rid of " + names.remove(2));
		System.out.println("State of list after removal");

		MyArrayList.MyIterator it = names.iterator();
		while (it.hasNext())
			System.out.println(it.next());

        // the following line will cause a compiler error
        // because the compiler is checking that we are adding
        // ONLY Strings (or things that can be easily converted
        // to Strings) to our names List, since we declared it as
        // List<String>

        //  names.add(new Scanner(System.in));

	}


} // end class Main
