public class GCD_Euclids {
    static  int gcd(int a , int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = gcd(15,27);
        System.out.println(a);
        System.out.println(27%15);
    }
}
