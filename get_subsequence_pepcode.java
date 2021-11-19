import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence_pepcode {
    static ArrayList<String> getss(String str){
        if (str.length() ==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getss(ros);
        ArrayList<String> mres = new ArrayList<>();
        /*
        for (String rstr:rres) {
            mres.add(""+rstr);
            mres.add(ch + rstr);
         */
        for (String rstr:rres) {
            mres.add("" + rstr);
        }
        for (String rstr:rres){
            mres.add(ch + rstr);
        }
        return mres;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        ArrayList<String> res = getss(str);
        System.out.println(res);
    }
}
