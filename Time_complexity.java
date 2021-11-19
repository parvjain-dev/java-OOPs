public class Time_complexity {
    static void foo(int array[], int length){
        int sum=0;
        int product =1;
        for (int i =0; i< length ; i++){
            sum += array[i];
        }
        for (int j =0 ; j<length ; j++){
            product *= array[j];
        }
        System.out.println(sum);
        System.out.println(product);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,12,32,43};
        foo(arr , 6);

    }
}
