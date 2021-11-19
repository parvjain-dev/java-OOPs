
public class factorial {

    static long fac(long n){
        long res = 1;
        if (n==0 || n==1){
            return 1;
        }
        for (long i =res ; i<=n ; i++){
            res = res *i ;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fac(0));

    }
}
