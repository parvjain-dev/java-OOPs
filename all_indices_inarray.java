import java.util.Scanner;

public class all_indices_inarray {
    static int[] allindices(int arr[] , int index , int x, int fsf){
        if (index ==arr.length){
            return new int[fsf];
        }
         if (arr[index] ==x){
             int [] iarr = allindices(arr,x,index+1,fsf+1);
             iarr[fsf] = index;
             return iarr;
         }else{
             int[] iarr= allindices(arr,x,index+1,fsf);
             return iarr;
         }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       /*
        System.out.println("Enter the length of an array");
       int n = sc.nextInt();
       int[] arr = new int[n];
        System.out.println("Enter the Value of array");
       for (int i = 0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }

        */
        int[] arr = {1,2,3,2,4,5,6,2};
        int[] arr1= allindices(arr,0,2,0);
        for (int i =0 ; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

    }
}
