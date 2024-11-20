import java.util.Scanner;

public class IT24103815Lab3Q4 {
       
       public static void main(String[] args) { 
       //Create a scanner object
       Scanner scanner = new Scanner(System.in);
       
       // Ask the user to enter a five-digit number
       System.out.println("Enter a five-difit number:");
       int number = scanner.nextInt();

       int digit1 = number / 10000;
       number = number % 10000;

       int digit2 = number / 1000;
       number = number % 1000;

       int digit3 = number / 100;
       number = number % 100;

       int digit4 = number / 10;
       number = number % 10;

       int digit5 = number % 10;
       System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5); 
         
}

}