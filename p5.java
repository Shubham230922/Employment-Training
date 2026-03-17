
//palendrom of string  
import java.util.Scanner;

public class p5 {
    public static int ispalindrome(int len, char arr[]) {

        int l = 0;
        int r = len - 1;
        while (l < r) {
            if (arr[l] == arr[r]) {
                l++;
                r--;
            } else {
                return 0;
            }

        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String s = sc.next();
        char arr[] = s.toCharArray();
        int result = ispalindrome(length, arr);

        System.out.println(result);

    }
}