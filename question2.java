import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 int h,m,sec;
 

 //Creating first time object
 System.out.println("\nEnter time 1."); 
 System.out.print("Enter hours : ");
 h = s.nextInt();
 System.out.print("Enter minutes : ");
 m = s.nextInt();
 System.out.print("Enter seconds : ");
 sec = s.nextInt();
 Time t1 = new Time(h,m,sec);
 

 //Creating second time object
 System.out.println("\nEnter time 2."); 
 System.out.print("Enter hours : ");
 h = s.nextInt();
 System.out.print("Enter minutes : ");
 m = s.nextInt();
 System.out.print("Enter seconds : ");
 sec = s.nextInt();
 Time t2 = new Time(h,m,sec);
 
 Time sum = new Time(); 

 //Adding the two time objects
 sum = sum.addTime(t1, t2); 
 Time diff = new Time(); 

 //Subtracting the two time objects
 diff = diff.subtractTime(t1, t2); 

 //Comparing the two time objects
 int cmp = t1.compareTime(t1, t2); 
 
 //Printing results
 System.out.print("\nTime 1 : "); 
 t1.displayTime(t1);
 System.out.print("Time 2 : ");
 t2.displayTime(t2);
 System.out.print("Sum : ");
 sum.displayTime(sum);
 System.out.print("Difference : ");
 diff.displayTime(diff);
 if(cmp == 1) System.out.println("Time 1 is greater than Time 2.");
 else if(cmp == -1) System.out.println("Time 2 is greater than Time 1.");
 else System.out.println("Time 1 is equal to Time 2.");
    }
}
class Time
{
int hour;
int minute;
int second;
 public Time()
 {
 this.hour = 0;
this.minute = 0;
this.second = 0;
 }
public Time(int hour,int minute, int second)
{
this.hour = hour;
this.minute = minute;
this.second = second;
}
public Time addTime(Time t1, Time t2)
{
Time t = new Time();
t.hour = t1.hour + t2.hour;
t.minute = t1.minute + t2.minute;
t.second = t1.second + t2.second;
if(t.second >= 60)
{
t.minute += 1;
t.second -= 60;
}
if(t.minute >= 60)
{
t.hour += 1;
t.minute -= 60;
}
if(t.hour >= 24)
{
t.hour -= 24;
}
 return t;
}
public Time subtractTime(Time t1,Time t2) 
{
Time t = new Time();
t.hour = t1.hour - t2.hour;
t.minute = t1.minute - t2.minute;
t.second = t1.second - t2.second;
 return t;
}
 public int compareTime(Time t1, Time t2)
 {
 if(t1.hour > t2.hour) return 1;
 else if(t1.hour < t2.hour) return -1;
 if(t1.minute > t2.minute) return 1;
 else if(t1.minute < t2.minute) return -1;
 if(t1.second > t2.second) return 1;
 else if(t1.second < t2.second) return -1;
 return 0;
 }
public void displayTime(Time t)
{
System.out.println(t.hour+ ":" + t.minute + ":" + t.second);
}
}