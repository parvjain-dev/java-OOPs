public class maximum_of_array_recursion {
    static int maxofarray(int arr[] , int index){
        //misa = maximum in small array
        if (index ==arr.length-1 ){
            return arr[index];
        }
        int misa= maxofarray(arr,index+1);
        if (misa < arr[index]){
            return arr[index];
        }else {
            return misa;
        }
    }
    public static void main(String[] args) {
        int arr[] ={12,13,41,1415,134,43,1434,234,1};
      int max = maxofarray(arr,0);
        System.out.println(max);
    }
}
