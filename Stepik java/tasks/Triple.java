import java.util.Scanner;

class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());

        sc.close();
        if (a > 99 && a < 1000) {
            System.out.println(((a % 100) / 10) == b);
        } else {
            System.out.println("error");
        }
    }
}