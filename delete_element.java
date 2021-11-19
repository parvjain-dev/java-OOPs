public class delete_element {
    static void delele(int arr[] , int eledelete){
        for (int i =0; i<arr.length; i++){
            if (eledelete==arr[i]){
                for (int j =i ; j<arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        for (int k =0; k<arr.length-1; k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {

         int arr1[] ={11,12,13,14,15,16};

         delele(arr1,13);
    }
}
