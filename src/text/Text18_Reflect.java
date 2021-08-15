package text;

import java.util.Date;

public class Text18_Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class s = Class.forName("java.lang.String");
        System.out.println(s.getSimpleName());
        Class s2 =  "d".getClass();
        System.out.println(s2==s);
        Class s3 = Class.forName("java.util.Date");
        Date sb = new Date();
        Class s4 = sb.getClass();
        Class s5 = String.class;
        System.out.println(s4==s3);
        System.out.println(s5==s);
    }
}
