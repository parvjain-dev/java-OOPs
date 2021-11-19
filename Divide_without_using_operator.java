public class Divide_without_using_operator {
    static int divide(int dividend , int divisor){
   //dividend --> jo andar ata hai ya uppar
     int sign = ((dividend<0) || (divisor<0) ? -1 : 1);
     dividend = Math.abs(dividend);
     divisor= Math.abs(divisor);
     int quotient =0;
     while (dividend>divisor){
         if (divisor ==1){
             return dividend;
         }else if (divisor ==-1){
             return -dividend;
         }
         dividend = dividend-divisor;
         ++quotient;
     }
      return sign*quotient;
    }
    public static void main(String[] args) {
       int a =5;
       int b =2;
        System.out.println(divide(a,b));
        int c = 43;
        int d = -5;
        System.out.println(divide(c,d));
        int e= 2147483647;
        int f = 1;
        System.out.println(divide(e,f));
        int p =-1;
        int q = 1;
        System.out.println(divide(p,q));
    }
}