import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String input = sc.nextLine();
        System.out.println(input);

        // Using Arrays.sort() and toCharArray() Methods
        char[] input1 = input.toCharArray();
        Arrays.sort(input1);
        System.out.println(input1);
        sc.close();
    }
}
