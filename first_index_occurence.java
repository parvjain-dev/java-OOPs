public class first_index_occurence {
    static int firstidx(int arr[] , int idx,int number){
        //fiisa for like index=1 se end tak ke array main check karna or yeh hamara faith hai.
        if (idx ==arr.length){
            return -1;
        }
        if (arr[idx] == number){
            return idx;
        }

        int fiisa = firstidx(arr, idx + 1, number);
        return fiisa;
    }
    public static void main(String[] args) {
            int arr[] = {1,1,4,9,7,8,7};
            int maxone = firstidx(arr,0,7);
        System.out.println(maxone);
    }
}
