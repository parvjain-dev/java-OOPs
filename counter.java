import java.util.*;
import java.lang.*;
public class counter {
    public static void main(String[] args) {

        //creating new object
        Countercls ob1 = new Countercls(); 

        //printing count
ob1.showCount(); 
Countercls ob2 = new Countercls();
ob2.showCount();
Countercls ob3 = new Countercls();
ob3.showCount();
Countercls ob4 = new Countercls();
ob4.showCount();

    }
}
class Countercls
{
static int count = 0; 
public Countercls()
{
 //updating count on creation of object
count++;
}
public static void showCount()
{
System.out.println("The count is : " + count);
}
}