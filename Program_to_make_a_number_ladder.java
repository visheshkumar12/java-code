import java.util.Scanner;

public class Letter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();
        
        // Generate the ladder
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}