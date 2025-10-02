import java.util.Scanner;

class Leng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextLine().length();
        sc.close();

        switch (leng) {
            case 1:
                System.out.print("Одна буква");
                break;
            case 2:
                System.out.print("Две буквы");
                break;
            case 3:
                System.out.print("Три буквы");
                break;
            case 4:
                System.out.print("Четыре буквы");
                break;
            case 5:
                System.out.print("Пять букв");
                break;
            default:
                System.out.print("Длинное слово");
        }
    }
}