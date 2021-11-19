public class palindrome_of_String {
    static void simple(String str ){
        char[] rev = str.toCharArray();
        for (int i = rev.length-1 ; i >=0 ; i--){
            System.out.print(rev[i]);
        }
    }

    static boolean ispalin(String s , int l , int r){
        if (l>=r)   //when l cross r             and            r cross l
            return true;

        //char[] rev = s.toCharArray();
        if (s.charAt(l) != s.charAt(r))
             return false;


             return ispalin(s , l+1 , r-1);


    }
    public static void main(String[] args) {
      //simple("Parv");
        System.out.println(ispalin("abcba",0,3 ));
    }
}