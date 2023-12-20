import java.util.Scanner;

public class Autocorrect {
    public static void main(String[] args) {
        Scanner sc_object = new Scanner(System.in);
        int cases = sc_object.nextInt();
        sc_object.nextLine();

        while (cases-- > 0) {
            String message = sc_object.nextLine();
            String dictionary = sc_object.nextLine();
            translate(message, dictionary); // Method call
        }

    }

    public static void translate(String text, String replacement) {
        Scanner reader = new Scanner(replacement);
        while (reader.hasNext()) {
            // Get incorrect word from dictionary
            String incorrectWord = reader.next();
            String correctWord = reader.next();

            // Keep on replacing incorrect word with the correct word
            text = text.replace(incorrectWord, correctWord);
        }

        System.out.println(text);
    }
}
