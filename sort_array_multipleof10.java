import java.util.Scanner;

/*sort Array multiple of 10 for example arr=10 9 12 14 15 10 20 30 
output 9 12 14 15 10 10 20 30  */
public class sort_array_multipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int j = 0; j < n; j++) {

            if (arr[j] % 10 == 0) {
                System.out.print(arr[j] + " ");
            }
        }
        sc.close();

    }
}
