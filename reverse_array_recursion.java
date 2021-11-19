public class reverse_array_recursion {
    static void disarray(int arr[] , int ind){
        if (ind ==arr.length){
            return;
        }
      disarray(arr,ind+1);
        System.out.println(arr[ind]);
    }
    public static void main(String[] args) {
        int arr[] ={12,32,45,23,123};
        int ind = 0;
        disarray(arr,ind);
       // System.out.println(arr.length);
        //System.out.println(arr[arr.length-1]);
    }
}
