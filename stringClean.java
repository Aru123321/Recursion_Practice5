public class stringClean {
    public static String stringClean(String str){
        if(str.length()<2){
            return str;
        }
        //yyzzza--->yza
        if(str.charAt(0)==str.charAt(1)){//if repetition starts from index 0
            return stringClean(str.substring(1)) ;// yy just return the y on index 1
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "abbbcdd";
        System.out.println(stringClean(str));
        
    }
}
