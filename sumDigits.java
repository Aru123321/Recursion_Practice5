public class sumDigits {
    public static int sum(int n){
        if(n==0||n==1||n==2||n==3|n==4||n==5||n==6||n==7||n==8||n==9){
            return n;
        }
        int LD = n%10;
        int rem = n/10;//ispe recursion laga denge
        int tot = LD+sum(rem);
        return tot;
    }
    public static void main(String[] args) {
        int n = 126;
        System.out.println(sum(n)) ;    
    }
}
