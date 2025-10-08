import java.util.Scanner;

class LadderList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int counter;

        for (int i = 1; i <= n; i++) {
            counter = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    counter++;
                    if (counter == i) {
                        System.out.print(j + "\n");
                    } else if (counter < i) {
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
}
