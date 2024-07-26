import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String input = sc.nextLine();
        System.out.println(input);

        // Method 1 - Using StringBuilder Class
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);

        // Method 2 - Using StringBuffer Class
        StringBuffer input2 = new StringBuffer(input);
        input2.reverse();
        System.out.println(input2);
        sc.close();
    }
}