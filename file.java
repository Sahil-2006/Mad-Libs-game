import java.util.Scanner;
public class file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        scanner.close();
        System.out.println("One day, a " + adjective1 + " " + noun1 + " decided to " + verb1 + " in the middle of the street.");
        System.out.println("It was so " + adjective2 + " that people couldn't stop staring, and it looked " + adjective3 + " while doing it.");
        System.out.println("Eventually, it got tired and sat down, asking for a snack of " + adjective1 + " pizza. The end.");
    }
}