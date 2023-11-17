import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the number of integers:");
        int n = kb.nextInt();
        System.out.println("Enter the number:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted numbers:");
        for (int number : arr) {
            System.out.println(number);
        }
    }
}
