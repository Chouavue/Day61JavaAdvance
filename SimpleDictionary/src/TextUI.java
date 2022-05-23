import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        ArrayList<String> added = new ArrayList<>();
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                if (this.dictionary.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: "+this.dictionary.translate(word));
                }
                continue;
            }

            if (input.equals("add")) {

                System.out.print("Word: ");
                String word = this.scanner.nextLine();

                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                this.dictionary.add(word, translation);
                continue;
            }
            if ((!input.equals("add")) || (!input.equals("search"))) {
                System.out.println("Unknown command");
            }

        }
    }

}