public class array_ADT {
static class adts {
    int total_size;
    int used_size;
    int ptr;
    
   void get(int arr[], int a) {
        if (arr == null) {
            System.out.println(-1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == a) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
    void set(int arr[], int a, int num) {
        if (arr == null) {
            System.out.println(-1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == a) {
                arr[i] = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    public static void main(String[] args) {
        int arr[] = {11,21,31,42,53,14};
               // get(arr,4);
        adts a = new adts();
        a.set(arr, 3,100);
    }
}
