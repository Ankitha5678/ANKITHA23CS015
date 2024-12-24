import java.util.Scanner;

public class CurrencyConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Conversion");
        System.out.println("1: USD to INR");
        System.out.println("2: INR to USD");
        System.out.println("3: EUR to INR");
        System.out.println("4: INR to EUR");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double Amountconverted;
        switch (choice) {
            case 1: // USD to INR
                Amountconverted= amount * 84.95;
                System.out.printf("%.2f USD = %.2f INR%n", amount, Amountconverted);
                break;

            case 2: // INR to USD
                Amountconverted = amount / 84.95; 
                System.out.printf("%.2f INR = %.2f USD%n", amount, Amountconverted);
                break;

            case 3: // EUR to INR
                Amountconverted= amount * 88.60;
                System.out.printf("%.2f EUR = %.2f INR%n", amount, Amountconverted);
                break;

            case 4: // INR to EUR
                Amountconverted = amount / 86.60; 
                System.out.printf("%.2f INR = %.2f EUR%n", amount, Amountconverted);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        scanner.close();
    }
}