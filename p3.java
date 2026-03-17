//
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no of interior walls
        int m = sc.nextInt();// no of exterior walls
        Float sum = 0.0f;// total cost
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                sum += sc.nextFloat() * 18;
            }
        }
        if (m != 0) {
            for (int j = 0; j < m; j++) {
                sum += sc.nextFloat() * 12;
            }
            System.out.printf("total estimate Cost:" + " %.1f " + "INR", sum);

         sc.close();
        }
    }

}
