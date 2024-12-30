import java.util.Scanner;
public class CurrencyConversion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Currency Conversion");
            System.out.println("1: USD to INR");
            System.out.println("2: INR to USD");
            System.out.println("3: EUR to INR");
            System.out.println("4: INR to EUR");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5){
                System.out.println("Exiting the program...");
                break;
            }
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            usd1=84.95;
            usd2=88.60[
            double Amountconverted;
            switch (choice){
                case 1: // USD to INR
                    Amountconverted = amount * usd1;
                    System.out.printf("%.2f USD = %.2f INR%n", amount, Amountconverted);
                    break;

                case 2: // INR to USD
                    Amountconverted = amount / usd1;
                    System.out.printf("%.2f INR = %.2f USD%n", amount, Amountconverted);
                    break;

                case 3: // EUR to INR
                    Amountconverted = amount * usd2;
                    System.out.printf("%.2f EUR = %.2f INR%n", amount, Amountconverted);
                    break;

                case 4: // INR to EUR
                    Amountconverted = amount / usd2;
                    System.out.printf("%.2f INR = %.2f EUR%n", amount, Amountconverted);
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
