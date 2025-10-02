import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        if (str.contains("Джефф Безос") || str.contains("Илон Маск") || str.contains("Марк Цукерберг")
                || str.contains("Билл Гейтс")) {
            System.out.print("Добро пожаловать!");
        } else {
            System.out.print("Здесь никого нет, Вы ошиблись дверью");
        }
    } // Джефф Безос, Илон Маск, Марк Цукерберг, Билл Гейтс
}