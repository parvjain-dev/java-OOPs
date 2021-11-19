public class Last_index_occurence {
    static int last(int arr[] , int index , int x){
        if (index ==arr.length){
            return -1;
        }
        //liisa = last index in smaller array
        int liisa = last(arr, index+1 ,x);

        if (liisa == -1){
            if (arr[index] ==x){
                return index;
            }else{
                return -1;
            }
        } else{
            return liisa;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,1,3,2,4,10};
      int a=  last(arr, 0, 2);
        System.out.println(a);
    }
}
