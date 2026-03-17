
// problem Statement Unique path in a grid
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < m; i++) {
            a[0][i] = 1;

        }
        for (int i = 0; i < n; i++) {
            a[i][0] = 1;

        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1];

            }

        }
        System.out.println(a[n - 1][m - 1]);
        sc.close();

    }

}
