public class PowerN {
    public static int PowerN(int base, int n){
        if(n==0){
            return 1;
        }
        int fn = base*PowerN(base,n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(PowerN(3,4));
    }
}
