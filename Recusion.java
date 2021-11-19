

public class Recusion {
 //Sum of N natural number
    /*
  static    int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1) + n ;
    }
  */


    //Power(a,b)
    static   int pow(int a,int b){
        if (b==0){
            return 1;
        }
        return a * pow(a , b-1);
    }

    public static void main(String[] args) {
      // int  A=  sum(4);
        //System.out.println(A);


      int a =  pow(2,3);
        System.out.println(a);

    }
}
