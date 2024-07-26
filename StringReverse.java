import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String input = sc.nextLine();
        System.out.println(input);
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
        sc.close();
    }
}