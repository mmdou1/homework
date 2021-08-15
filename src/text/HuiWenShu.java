package text;

public class HuiWenShu {
    public static void main(String[] args) {
        System.out.println(sbsss.huwen(100));
    }
}
class sbsss{
    public static boolean huwen(int x ){
        if(x==0) return true;
        String x1 = String.valueOf(x);
        int x2 =x1.length();
        int x3 =0;
        if(x2==1) return true;
        if(x2/2==0|| x<0) return false;
        char[] chars = x1.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }
        for(int i =0 ; (x2-1)/2>i;i++){
            if(chars[i]== chars[x2-1]) System.out.println(chars[i]);
            else return false;
        }
        return true;
    }
}