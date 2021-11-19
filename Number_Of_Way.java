public class Number_Of_Way {
    static int way(int r , int c ){
        if (r==1 || c==1){
            return 1;
        }
        return way(r,c-1) + way(r-1,c);
    }
    public static void main(String[] args) {
        System.out.println(way(2,2));
    }
}
