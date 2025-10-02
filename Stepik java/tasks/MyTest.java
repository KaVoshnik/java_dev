import java.util.Scanner;

class MyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a > 99 && a < 1000) ? "YES" : "NO");
        sc.close();
    }
}