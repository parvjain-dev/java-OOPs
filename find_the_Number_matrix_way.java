public class find_the_Number_matrix_way {

    static int ways(int r , int c ){
        if (r== 1 || c==1){
            return 1 ;
        }
        return  ways(r-1 , c )+ ways(r , c-1);
    }
    public static void main(String[] args) {
         int a =   ways(2,2 );
        System.out.println(a);
    }
}