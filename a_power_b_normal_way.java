
public class a_power_b_normal_way {
    static int power(int a , int b){
int c = 1;
        for (int i =1; i<=b; i++){
          c= c*a;
        }
        return c;
    }

    static int fastpow(int a , int b){
     int res =1;
     while(b>0){
         if ((b&1) !=0){          //it means it is odd
             res = res *a;
         }
         a= a*a;
         b = b>>1;     //means b/2

     }
         return res;
    }


    static long fastpowmodulo(long a , long b , int n){
    long res =1;
        while(b>0){
            if ((b&1) !=0){
                res = (res%n *a % n ) % n ;
            }
            a= (a % n * a % n )%n;
            b = b>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
        System.out.println(7 %4);
        System.out.println(fastpow(2,5) );
        System.out.println(fastpowmodulo(3978432, 5 , 1000000007));
    }
}
