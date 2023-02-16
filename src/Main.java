import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // A) - Call the method 10 times by using a loop
        for (int i = 0; i < 10; i++) {
            int randomNumber = GetRandomNumber();
            System.out.println(randomNumber);

        }
        // B) Write a method that returns if a user has input a valid CPR number.
        Scanner scanCpr = new Scanner(System.in);
        System.out.print("Enter your CPR number: ");
        String cprNumber = scanCpr.nextLine();

        boolean isValidCPR = ValidCprNumber(cprNumber);
        if (isValidCPR) {
            System.out.println("The CPR number is valid.");
        } else {
            System.out.println("The CPR number is not valid.");
        }
    }

    // A) - Write a method that returns a random number between 1-10.
    public static int GetRandomNumber() {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        return x;
    }

    // B) Write a method that returns if a user has input a valid CPR number.
    public static boolean ValidCprNumber(String cpr) {
        if (cpr.length() == 10) {    // 10 Digits.
            return false;
        }

        int day = Integer.parseInt(cpr.substring(0, 2));
        int month = Integer.parseInt(cpr.substring(2, 4));

        if (day <= 31) {
            return true;    // The first 2 digits are not above 31.
        }

        if (month <= 12) {
            return true;   // The middle 2 digits are not above 12.

        } else {
            return false;
        }


    }
}

