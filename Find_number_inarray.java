import java.util.Arrays;

public class Find_number_inarray {
/*
    static int search(int arr[] , int size){
        int a =0 , b= size -1;
        int mid=0;
        while((b-a)>1){
            mid = (a+b)/2;
            if ((arr[a] -a)!=(arr[mid] -mid)){
                b=mid;
            }
            else if ((arr[b]-b) !=(arr[mid]-mid)) {
                a = mid;
            }
        }
        return (arr[a] +1);
    }
 */
    /*
     static int addingsearch(int arr[] ){
         int expno = arr.length+1;
         int totalsum = (expno * (expno +1))/2;
         int inarrsum =0;
         for (int i =0; i<arr.length; i++){
             inarrsum = inarrsum+arr[i];
         }
         //System.out.println(inarrsum);
         return totalsum-inarrsum;
     }

     */
 static int xorsearch(int arr[]){
     int xor1 = arr[0];
     for (int i =1; i<arr.length; i++){
         xor1= xor1^arr[i];
     }
     //System.out.println(xor1);
     int xor2= arr[0];
     for (int i = 2 ; i<=arr.length+1; i++){
         xor2= xor2^i;
     }
     return xor1^xor2;
 }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20,21,22,23,24,25};
     //Arrays.sort(arr);
        int size = ar.length;
      //  System.out.println(size);
      //  System.out.println(search(ar,size));
        //System.out.println(addingsearch(ar));
        System.out.println(xorsearch(ar));
    }
}
