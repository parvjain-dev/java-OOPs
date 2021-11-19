
public class Joseph_problem {
    static int joe(int n , int k){
        if (n ==1 ){
            return 0;
        }
        return (joe(n-1,k)+k)%n;

    }
    public static void main(String[] args) {
      int c = joe(5, 3);
        System.out.println(c);
    }
}
