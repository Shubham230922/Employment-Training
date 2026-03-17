import java.util.Scanner;

public class Candyjar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 10;   // Maximum candies
        int k = 5;    // Minimum candies limit
        int c = N;    // Current candies

        while (true) {

            int o = sc.nextInt();   // Take input inside loop

            if (o > 0 && o <= (c - k)) {

                c = c - o;

                System.out.println("NUMBER OF CANDIES SOLD : " + o);
                System.out.println("REMAINING CANDIES : " + c);

                if (c <= k) {
                    System.out.println("JAR REFILLING");
                    c = N;
                    System.out.println("REMAINING CANDIES : " + c);
                }

            } 
            else {
                System.out.println("INVALID INPUT");
                System.out.println("REMAINING CANDIES : " + c);
            }
        }
    }
}