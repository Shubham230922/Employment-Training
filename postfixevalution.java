import java.util.Scanner;
import java.util.Stack;

public class postfixevalution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(Character.isDigit(c)){
                st.push(c - '0');
            }
            else{

                int b = st.pop();
                int a = st.pop();

                switch(c){

                    case '+':
                        st.push(a + b);
                        break;

                    case '-':
                        st.push(a - b);
                        break;

                    case '*':
                        st.push(a * b);
                        break;

                    case '/':
                        st.push(a / b);
                        break;
                }
            }
        }

        System.out.println(st.pop());

        sc.close();
    }
}