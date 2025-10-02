import java.util.Scanner;

class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        switch (x) {
            case 1, 2, 12:
                System.out.print("Зима");
                break;
            case 3, 4, 5:
                System.out.print("Весна");
                break;
            case 6, 7, 8:
                System.out.print("Лето");
                break;
            case 9, 10, 11:
                System.out.print("Осень");
                break;
            default:
                System.out.print("error");
        }
    }
}