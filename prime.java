public class prime {
    public static void main(String[] args) {
        int n = 5;
       double r = Math.sqrt(n);
        //System.out.println(r);
        int i ;
        if (n <=1){
            System.out.println("not prime");
        }
        for (i =2; i<=r; i++){
            if (n%i ==0){
                System.out.println("isprime");
            }else {
                System.out.println("not prime");
            }
        }

    }
}
