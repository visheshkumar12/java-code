import java.util.Scanner;

public class MonthlyBudgetSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Monthly Budget System");
        System.out.println("---------------------");
        
        System.out.print("Enter your monthly income: $");
        double income = scanner.nextDouble();
        
        System.out.print("Enter the number of expense categories: ");
        int numCategories = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        double totalExpenses = 0.0;
        
        for (int i = 1; i <= numCategories; i++) {
            System.out.print("Enter the name of expense category " + i + ": ");
            String categoryName = scanner.nextLine();
            
            System.out.print("Enter the budgeted amount for " + categoryName + ": $");
            double budgetedAmount = scanner.nextDouble();
            
            System.out.print("Enter the actual amount spent for " + categoryName + ": $");
            double actualAmount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            
            double difference = budgetedAmount - actualAmount;
            totalExpenses += actualAmount;
            
            System.out.println("Category: " + categoryName);
            System.out.println("Budgeted Amount: $" + budgetedAmount);
            System.out.println("Actual Amount Spent: $" + actualAmount);
            System.out.println("Difference: $" + difference);
            System.out.println("---------------------");
        }
        
        double remainingBalance = income - totalExpenses;
        
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
        
        scanner.close();
    }
}