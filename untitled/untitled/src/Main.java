import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number: ");
        number = Scanner.nextInt();
        if (number == 0) {
            System.out.println("the value equals 0");
        } else if (number > 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }

    }
}
