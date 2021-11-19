public class Array_print_recursion {
    static void arrprint(int arr[] , int ind){
        if (ind == arr.length){
            return;
        }
        System.out.println(arr[ind]);
        arrprint(arr,ind+1);
    }
    public static void main(String[] args) {

        int[] arr = {12,12,32,343,13,12};
        int ind = 0;
         arrprint(arr,ind);
    }
}
