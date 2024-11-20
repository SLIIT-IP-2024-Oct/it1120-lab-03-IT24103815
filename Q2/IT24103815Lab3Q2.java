import java.util.Scanner;

public class IT24103815Lab3Q2 {
       public static void main (String[] args) {

       // Create a scanner object to read input
       Scanner scanner = new Scanner(System.in);
      
       //Ask user to enter the number of OT hours
       System.out.println("Enter the number of OT hours:");
       double otHours = scanner.nextDouble();

       //Ask user to enter the monthly salary
       System.out.println("Enter the monthly salary:");
       double monthlySalary = scanner.nextDouble();

       //Ask user to  enter the OT hourly rate
       System.out.println("Enter the OT hourly rate:");
       double otHourlyRate = scanner.nextDouble();

       // Calculate the OT amount
       double otAmount = otHours * otHourlyRate;

       // Calculate the total salary
       double totalSalary = monthlySalary + otAmount;
 
       // Print the total salary
       System.out.println("The total salary, includingOT, is:Rs" +totalSalary);
       
  }

}