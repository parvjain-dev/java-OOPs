public class break_array {
    public static void main(String[] args) {
        int[] arr = {12,3,24,3,5,45,7};
        int odd = 0;
        int even = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] % 2 ==0){
               even = i;
                System.out.println(even);
            }
            else{
                odd =i;
                System.out.println(odd);
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
