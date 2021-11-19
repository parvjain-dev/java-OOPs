public class insertioninarray {
    static void display(int arr[] , int n){
        for (int i = 0; i <=n; i++) {
                System.out.println(arr[i]);
        }
    }
    static void insert(int arr[], int n , int index ){
        arr[index]=n;
          
    }
     public static void main(String[] args) {
          int n =50; 
        int[] arr ={1,3,4,5,6};
        display(arr, 3);

           

     }
}
