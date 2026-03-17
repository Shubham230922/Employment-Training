// Matrix diagonal element addition
import java.util.Scanner;
class p4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [] [] arr=new int [n][n];
    int l=0;
    int r=0;
    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            arr [i][j]=sc.nextInt();

        }
    }
        for(int i=0;i<n;i++){
        l=l+arr[i][i];
        }
    for(int i=0;i<n;i++){
        r=r+arr[i][n-1-i];
    }
    System.out.println(Math.abs(l+r));
     
     sc.close();
    
    }
    
}