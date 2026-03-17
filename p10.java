//check convert the string ino uppercase or lovercase is depending on the user input and count of uppercase and lowercase letters in the string
import java.util.Scanner;


public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                u++;
            }
            else {
                l++;
            }

    }
    if(u>l){
        System.out.println(s.toUpperCase());
    }
    else {
        System.out.println(s.toLowerCase());
    }

sc.close();
}

    
}
