import java.util.Scanner;

public class IT24103815Lab3Q1A {
    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the price per kilogram of rice
        System.out.println("Enter the price of 1kg of rice:");
        double pricePerKg = scanner.nextDouble();

        // Ask user to enter the number of kilograms
        System.out.println("Enter the number of kilograms you want to buy:");
        double kilograms = scanner.nextDouble();

        // Calculate the total amount
        double totalAmount = pricePerKg * kilograms;

        // Print the total amount to be paid
        System.out.println("The total amount you have to pay is: Rs " + totalAmount);
    }
}