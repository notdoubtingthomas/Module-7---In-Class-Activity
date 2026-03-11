import java.util.Scanner;

public class CountSpaces2_StudentStarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a quote: ");
        String quote = input.nextLine();

        // TODO 1: Create a counter variable for spaces

        int spaces = 0;

        // TODO 2: Loop through the entered quote

        for (int i = 0; i < quote.length(); i++) {
            char current = quote.charAt(i);

            // TODO 3: Count how many times ' ' appears
            if (current == ' ') {
                spaces++;
            }
        }

        // TODO 4: Display the entered quote
        System.out.println("Quote: " + quote);
        // TODO 5: Display the total number of spaces
        System.out.println("Spaces: " + spaces);

        input.close();
    }
}
