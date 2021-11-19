public class palindrome_num {

    static void palin(int n){
        int c , sum =0 , temp =n;
   while (n>0){
      c = n%10;
      sum = (sum*10) +c;
      n=n/10;

   }
        if (temp == sum){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
          palin(404);
    }
}
