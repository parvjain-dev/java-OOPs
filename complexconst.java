import java.util.*;
public class complexconst {
    public static void main(String[] args) {
        System.out.println("\nComplex Class using default and parameterized constructors.\n");
 
 Scanner s = new Scanner(System.in);
 double r, i;
 System.out.println("\nEnter first complex number."); //Creating a complex number
 System.out.print("Real part : ");
 r = s.nextDouble();
 System.out.print("Imaginary part : ");
 i = s.nextDouble();
 complex a = new complex(r,i); //Using parameterized Constructor
 
 System.out.println("\nEnter second complex number."); //Creating another complex number
 System.out.print("Real part : ");
 r = s.nextDouble();
 System.out.print("Imaginary part : ");
 i = s.nextDouble();
 complex b = new complex(r,i); //Using parameterized Constructor
 
 complex sum = new complex();
 complex diff = new complex();
 sum = sum.addComplex(a, b); //Performing operations on complex numbers
 diff = diff.subtractComplex(a, b);
 
 System.out.println("");
 a.displayComplex(a, "1"); //Displaying complex numbers
 b.displayComplex(b, "2");
 sum.displayComplex(sum, "Sum");
 diff.displayComplex(diff, "Difference");

    }
}
class complex 
{
 double real;
 double imaginary;
 
 public complex() //Unparameterized Constructor
 {
 real = 0;
 imaginary = 0;
 }
 
 public complex(double real, double imaginary) //Parameterized Constructor
 {
 this.real = real;
 this.imaginary = imaginary;
 }
 
 public void initialiseComplex(double r, double i)
 {
 this.real = r;
 this.imaginary = i;
 }
 
 public void displayComplex(complex c, String s)
 {
 System.out.println("Complex Number " + s + " : " + c.real + " + i" + c.imaginary);
 }
 
 public complex addComplex(complex a, complex b)
 {
 complex sum = new complex(); //Unparameterized Constructor invoked to Complex(0,0)
 sum.real = a.real + b.real;
 sum.imaginary = a.imaginary + b.imaginary;
 return sum;
 }
 
 public complex subtractComplex(complex a, complex b)
 {
 complex diff = new complex(); 
 diff.real = a.real - b.real;
 diff.imaginary = a.imaginary - b.imaginary;
 return diff;
 }
}
