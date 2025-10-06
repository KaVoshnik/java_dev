import java.util.Scanner;

class Crat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b = 0;
        int result = 0;
        do {
            a = sc.nextInt();
            b++;
            if (a % 3 == 0) {
                result += a;
            }
        } while (a % 11 == 0);
        sc.close();
        System.out.println(b - 1);
        System.out.println(result - 15);
    }
}