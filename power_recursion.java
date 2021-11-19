public class power_recursion {
    public static int pow(int a , int x){
        if (x==0){
            return 1;
        }
        return pow(a,x-1) * a;
    }
    public static int fastpow(int a ,int n){

        if (n==0){
            return 1;
        }

         if(n%2 ==0){
          return fastpow(a,n/2) *fastpow(a,n/2) ;
        }
        return fastpow(a,n/2)*fastpow(a,n/2)*a ;
    }
    public static void main(String[] args) {
        System.out.println( pow(4,3));
        System.out.println(fastpow(2,14));
    }
}
