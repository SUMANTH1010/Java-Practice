import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int input = sc.nextInt();
        String binary = "";
        int remainder, quotient = input;
        while(quotient > 0){
            remainder = quotient % 2;
            binary = Integer.toString(remainder) + binary;
            quotient = quotient / 2;
        }
        System.out.println(binary);
        sc.close();
    }
}
