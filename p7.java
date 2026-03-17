import java.util.Scanner;

class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int n = sc.nextInt();
        int r2 = sc.nextInt();
        int x = sc.nextInt();
        int result = 0;
        if (x % 60 == 0) {
            x = x / 60;

        } else {
            x = x / 60 + 1;
        }
        if (x - n <= 0) {
            result = x * r1;
        } else {
            result = n * r1 + r2 * (x - n);
        }
        System.out.println(result);
        sc.close();
    }
}