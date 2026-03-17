import java.util.Scanner;

/*check no is strong or not for example n=145 the 1!+4!+5!=145 
logic is take an input fron user as n
get an reminder by r=n%10 it gives and seprate digit 5 ,4 and 1
then take an factorial by using fact() of each digit add into sum =5!+4!+1!
compare with original no print strong or not 

*/
public class strongno {

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int r = temp % 10;
            sum = sum + fact(r);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("strong number");
        } else {
            System.out.println("not a strong number");
        }
        sc.close();

    }
}
