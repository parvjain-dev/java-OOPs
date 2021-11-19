import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class String_token {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String[] res = str.split("[ \"!,?._'@\". ]",str.length());
        System.out.println(res.length-1);
        for (String resstr:
             res) {
            System.out.println(resstr);
        }
        /*
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 3);

        for (String a : arrOfStr)
            System.out.println(a);
               */

    }
    }

