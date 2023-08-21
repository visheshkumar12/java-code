import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter the elements of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Count even and odd numbers in the array
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // Store even elements in evenArray[] and odd elements in oddArray[]
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenIndex] = arr[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        // Display all three arrays along with their length
        System.out.print("The original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(", length = " + n);

        System.out.print("The even array is: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println(", length = " + evenCount);

        System.out.print("The odd array is: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println(", length = " + oddCount);
    }
}
