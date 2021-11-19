import java.util.Arrays;

public class seive_of_eratoSthenes {
    static boolean[] primenumbers(int n ){

        //yeh ,method batayega ki suppose n =1000 toh 1 se 1000 tak kitne prime number hai or kn kn se hai
        boolean isprime[] = new boolean[n+1];
        //Iss niche vale method ka mtlb hai ki agar jha jha pe isprime hai vha vha pe true mark kardo.
        Arrays.fill(isprime , true);
        isprime[0] = false;
        isprime[1] = false;
        for (int i =2 ; i * i <=n ; i++){
            for (int j =2*i ; j<=n; j+=i){
                isprime[j] = false;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        //Approach --> we just create an array then assign all value as true then further we make false the element
        // according to the multiple and remember always take one number for both loops
        boolean str[] = primenumbers(12);
        for (int i = 0 ; i<=12 ; i++){
            System.out.println(i+" "+str[i]);
        }
    }
}
