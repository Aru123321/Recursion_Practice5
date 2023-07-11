public class Triangle {
    public static int triangle(int rows){
        if(rows==0){
            return 0;
        }
        int fn = rows + triangle(rows-1);
        return fn;
    }
    public static void main(String[] args) {
        int rows = 4;
        System.out.println(triangle(rows));
    }
}
