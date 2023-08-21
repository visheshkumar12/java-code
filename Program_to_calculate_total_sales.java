import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        int[][] sales = new int[5][4]; // 5 products and 4 salespeople
        Scanner scanner = new Scanner(System.in);
        // Read in the sales data for last week
        System.out.print("Enter the number of sales slips: ");
        int numSlips = scanner.nextInt();
        for (int i = 0; i < numSlips; i++) {
            System.out.print("Enter salesperson number (1-4): ");
            int salesperson = scanner.nextInt() - 1; // adjust for 0-based indexing
            System.out.print("Enter product number (1-5): ");
            int product = scanner.nextInt() - 1; // adjust for 0-based indexing
            System.out.print("Enter total dollar value: ");
            int total = scanner.nextInt();
            sales[product][salesperson] += total; // add the sale to the corresponding cell
        }
        scanner.close();
        // Print the sales report
        System.out.println("\tSalesperson 1\tSalesperson 2\tSalesperson 3\tSalesperson 4\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Product " + (i+1) + "\t");
            int rowTotal = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print(sales[i][j] + "\t\t");
                rowTotal += sales[i][j];
            }
            System.out.print(rowTotal + "\n");
        }
        System.out.print("Total\t\t");
        int colTotal = 0;
        for (int j = 0; j < 4; j++) {
            int salespersonTotal = 0;
            for (int i = 0; i < 5; i++) {
                salespersonTotal += sales[i][j];
            }
            System.out.print(salespersonTotal + "\t\t");
            colTotal += salespersonTotal;
        }
        System.out.print(colTotal + "\n");
    }
}
