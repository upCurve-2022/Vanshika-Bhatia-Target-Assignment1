import java.util.Scanner;

public class Q23_Sequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number N:");
        int N=sc.nextInt();
        int x=1;
        int y=2;
        System.out.print(x+" ");
        System.out.print(-y+" ");
        int count=3;
        while(count<=N){
            if(count%2!=0){
                x=x+3;
                System.out.print(x+" ");
                count++;
            }
            else{
                y=y+4;
                System.out.print(-y+" ");
                count++;

            }
        }
    }
}
