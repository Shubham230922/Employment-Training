import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int result = 0;
        int result1 = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            result = result + a[i] - r;
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            result1 = result1 + b[i] - r;
        }
        if (result == result1) {
            System.out.print("BALANCED");

        }

        if (result > result1) {

            System.out.println(((result - result1) + r) * -1);
        } else {
            System.out.println((result1 - result1) + r);
        }
        sc.close();
    }

}
