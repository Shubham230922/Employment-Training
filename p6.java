
//magic no proble in the above program x be the no seprated by the no digit which is add to n give the over all digit no by adding the no n in each digit 
// for example 328 and 3 it give 651
import java.util.Scanner;

public class p6 {
    public static int magic(int x, int n) {
        int temp1 = 0;
        int temp = 0;
        int result = 0;
        int i = 1;
        while (x != 0) {
            temp = x % 10;
            temp1 = (temp + n) % 10;
            result = result + temp1 * i;
            i = i * 10;
            x = x / 10;

        }
        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = magic(a, b);
        System.out.println(result);
        sc.close();

    }

}
