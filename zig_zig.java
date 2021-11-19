public class zig_zig {
    public static void zz(int n ){
        if (n==0){
            return;
        }
        System.out.println("pre" +n);
        zz(n-1);
        System.out.println("in" + n);
        zz(n-1);
        System.out.println("post" + n);
    }
    public static void main(String[] args) {
        int n =3;
        zz(n);
    }
}
