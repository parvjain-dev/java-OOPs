import java.util.Arrays;

public class array_partition {

    static int partitioning(int[] nums){
  int length =0;
  for (int i =0; i<=nums.length; i++){
      if (i+1 <=i){
                length++;
      }
  }
return length;
    }

    public static void main(String[] args) {
        int[] a =  {1,1,1,0,6,12};
        System.out.println(partitioning(a));
    }
}
