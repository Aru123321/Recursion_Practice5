public class pairstar {
    public static String pairstar(String str){
        if(str.length()<2){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+"*"+pairstar(str.substring(1));
        }
        //if the first index does not have a repeating pair
        return str.charAt(0) + pairstar(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "bbb";
        System.out.println(pairstar(str));
    }
}
