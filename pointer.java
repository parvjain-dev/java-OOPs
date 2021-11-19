import java.util.*;

public class pointer {
    public boolean twoSum(int a[] , int x ,int i){
        int  j= a.length -1 ;
        while (i<j){
            if (a[i] + a[j] <x){
                j--;
            }else if (a[i] +a[j] >x){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

    public boolean triplet(int arr[] , int n){
        Arrays.sort(arr);
        for (int i =0; i <n-2 ; i++){
            if (twoSum(arr, -arr[i] , i+1))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
         pointer p = new pointer();
         int[] c = {1,4,12,56,45,90,1,3,23};
         Arrays.sort(c);
        boolean b =  p.twoSum( c, 5 , c[0]);
        System.out.println(b);
    }
}
