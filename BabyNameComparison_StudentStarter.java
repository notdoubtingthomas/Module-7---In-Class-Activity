import java.util.Scanner;

public class BabyNameComparison_StudentStarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Baby Name Comparison Generator ===");

        System.out.print("Enter first name 1: ");
        String name1 = input.nextLine().trim();

        System.out.print("Enter first name 2: ");
        String name2 = input.nextLine().trim();

        System.out.print("Enter first name 3: ");
        String name3 = input.nextLine().trim();

        // TODO 1: Validate that none of the names are blank
        if (name1.isEmpty() || name2.isEmpty() || name3.isEmpty()) {
            System.out.println("One or more names are blank. Please try again.");
            input.close();
            return;
        }

        // TODO 2: Display all possible two-name combinations
        // Example: name1 + " " + name2
        int combinations = 0;
        System.out.println("\nPossible two-name combinations:");
        System.out.println(name1 + " " + name2);
        combinations++;
        System.out.println(name1 + " " + name3);
        combinations++;
        System.out.println(name2 + " " + name3);
        combinations++;
        // TODO 3: Count how many combinations are displayed
        System.out.println("\nTotal combinations: " + combinations);
        // TODO 4: Print the total number of combinations


        input.close();
    }
}
