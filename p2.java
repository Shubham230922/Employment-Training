import java.util.Scanner;

/*print Array with complexcity of O(n) for user input it only exception (n^2) */
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr[0][i] + " ");
        }
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }
        for (int i = m - 2; i > 0; i--) {
            System.out.print(arr[n - 1][i] + " ");
        }
        for (int i = n - 1; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
        for (int i = 1; i < m - 1; i++) {
            if (m - 1 > 1) {
                System.out.print(arr[1][i] + " ");
            } else {
                System.out.print(arr[1][i] + " ");
            }
        }
        sc.close();
    }
}
