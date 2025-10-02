import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Calculator!");
        System.out.println("Input number 1:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input number 2:");
        int b = sc.nextInt();
        System.out.println("Input operator:");
        char ch = sc.next().charAt(0);

        sc.close();

        switch (ch) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: devide by zero");
                } else
                    System.out.println("Result: " + (a / b));
        }
    }
}
