import java.util.Scanner;

public class tower_of_hanoi {
    public static void TOH(int n , int a , int b , int c){
         if (n==0){
             return;
         }
        TOH(n-1,a,c,b);  //will print the instruction to move n-1 disk from a to c using t2 (*)
        System.out.println(n + "[" +a +"-->"+b+"]");
        TOH(n-1,c,b,a);
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();   //Number of Plates
int t1d = sc.nextInt();  // Name of tower 1
int  t2d = sc.nextInt();//Name of tower 2
int t3d = sc.nextInt();//Name of tower 3
TOH(a,t1d,t2d,t3d);
    }
}
