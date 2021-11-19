public class Not_reapting {




    public static void main(String[] args) {
        int[] a = {5,4,1,4,3,5,1,3,6};
        int res =0;
        int i;
        for (i=0; i<a.length; i++){
            res = res^a[i];

        }
        System.out.println(res);
    }
}
