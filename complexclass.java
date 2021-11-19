import java.util.*;
import java.lang.*;
public class complexclass {
    public static void main(String[] args) {
        double r, i;
 Scanner sc = new Scanner(System.in);
 Complex a = new Complex();
 Complex b = new Complex();
 //Creating a complex number
 System.out.println("\nEnter first complex number."); 
 System.out.print("Real part : ");
 r = sc.nextDouble();
 System.out.print("Imaginary part : ");
 i = sc.nextDouble();
 a.initialiseComplex(r,i);
 //Creating a second complex number
 System.out.println("\nEnter second complex number."); 
 System.out.print("Real part : ");
 r = sc.nextDouble();
 System.out.print("Imaginary part : ");
 i = sc.nextDouble();
 b.initialiseComplex(r,i);
 
 Complex sum = new Complex(); 
 Complex diff = new Complex();
 //Performing operations on Complex Numbers
 sum = sum.addComplex(a, b); 
 diff = diff.subtractComplex(a, b);
 
 System.out.println("");
 //Displaying Complex Numbers
 a.displayComplex(a, "1"); 
 b.displayComplex(b, "2");
 sum.displayComplex(sum, "Sum");
 diff.displayComplex(diff, "Difference");

    }
}
//complex class for all operartions
class Complex 
{
 double real;
 double imaginary;
 
 public void initialiseComplex(double r, double i)
 {
 this.real = r;
 this.imaginary = i;
 }
 //to display 
 public void displayComplex(Complex c, String s)
 {
 System.out.println("Complex Number " + s + " : " + c.real + " + i" + c.imaginary);
 }
 //for addition
 public Complex addComplex(Complex a, Complex b)
 {
 Complex sum = new Complex();
 sum.real = a.real + b.real;
 sum.imaginary = a.imaginary + b.imaginary;
 return sum;
 }
 //for subtraction
 public Complex subtractComplex(Complex a, Complex b)
 {
 Complex diff = new Complex();
 diff.real = a.real - b.real;
 diff.imaginary = a.imaginary - b.imaginary;
 return diff;
 }
}
