import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// mint in 1st place boy
        int len = sc.nextInt();// length of the queue
        int sum = n;// sum of all mints
        int pr = 0;// total mints of previous boy in queue
        for (int i = 0; i < len - 1; i++) {
            // take len-1 we have the count of mint 1st boy
            pr = sum - 1;
            sum = sum + pr;
        }
        System.out.println("total mints:" + sum);
        sc.close();
    }
}
