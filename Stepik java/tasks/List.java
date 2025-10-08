import java.util.Scanner;

class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                if (counter > n) {
                    break;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

/*
 * 5
 * 
 * 1, 2, 2, 3, 3
 * 
 * 7
 * 
 * 1, 2, 2, 3, 3, 3, 4
 */
