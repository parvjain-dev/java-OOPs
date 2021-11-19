public class Not_Repting_two {
    public static void main(String[] args) {
        int[] arr = {5,4,1,4,5,1,2,3};
        int res =0;
        int i;
        int sum1=0;
        int sum2 =0;
        for (i=0; i<arr.length; i++){
            res = res^arr[i];
        }
        System.out.println(res);
        res = (res & -res);
        System.out.println(res);
                for (int j =0 ; j<arr.length; j++) {
            if ((arr[j] & res)>0){
                sum1 = (sum1 ^ arr[j]);
                /*
                System.out.println(sum1);
                System.out.println("*******");

                 */
            }else{
                sum2=(sum2 ^ arr[j]);
                //System.out.println(sum2);
            }
        }
        System.out.println("The non-repeating elements are " + sum1 + " and " + sum2);
    }
}
