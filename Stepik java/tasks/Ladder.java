import java.util.Scanner;

class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
 * 1
 * 1 2
 * 1 2 3
 */