import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i = 1;
        sc.close();

        while (i < a) {
            System.out.println(i--);
        }
    }
}