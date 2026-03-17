 public class Stack {
    private int t;
    private int[] a;
    private int size;

    public int Stack1(int size) {
        this.size = size;
        a = new int[size];
        t = -1;
        return 0;
    }
    int push (int x){
        if (t==size-1){
            System.out.println("Stack is full");
            return -1;
        }
        else{
            t++;
            a[t]=x;
            return a[t];
        }

    }
    int pop(){
        if(t==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            System.out.println(a[t]);
            t--;
            }
            return 0;
        }

        int display(){
            if(t==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            else{
                for(int i=t;i>=0;i--){
                    System.out.println(a[i]);
                }
                return 0;
            }
        }
public static void main(String[] args) {
            
            Stack s=new Stack();
            s.Stack1(5);
            s.push(10);
            s.push(20);
            s.push(30);
            s.display();        
            s.pop();
            s.display();
            s.pop();
            s.display();
        }

    }




    

