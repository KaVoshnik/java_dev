import java.util.Scanner;

class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String str2 = sc.next().toLowerCase();
        System.out.println(str.contains(str2));

        sc.close();
    }
}