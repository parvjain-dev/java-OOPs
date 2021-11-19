public class trailing_Zero {
    static int zero(int n){
        //int a =5;
        int res =0 ;
        /*
        for (int i =5 ; i<=n ; i++){
           res = (int) Math.floor( res +(n/i));
        }
         */
        int i =5;
       do {
           res = res +(n/i);
           i = i*5;
       }while (i<=n);
        return res;
    }

    public static void main(String[] args) {
         System.out.println(zero(15));
    }
}
