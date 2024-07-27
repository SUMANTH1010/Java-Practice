import java.util.Scanner;

public class Complex{
    public int realNum;
    public int imagNum;

    public Complex(int realNum, int imagNum){
        this.realNum = realNum;
        this.imagNum = imagNum;
    }

    public void display(){
        System.out.println("Complex Number : (" + this.realNum + " + " + this.imagNum + "i).");
    }

    static Complex add(Complex c1, Complex c2){
        Complex result = new Complex(0, 0);
        result.realNum = c1.realNum + c2.realNum;
        result.imagNum = c1.imagNum + c2.imagNum;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(6, 8);
        c1.display();
        c2.display();
        Complex r = add(c1, c2);
        r.display();
        sc.close();
    }
}
