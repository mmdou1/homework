package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text17_Date {
    public static void main(String[] args) throws ParseException {
        long sb = System.currentTimeMillis();

        Date nowTime = new Date(1627632243229L);
        System.out.println(nowTime);
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(nowTime);
        System.out.println(s);
        String time = "2020-3-2 22:21:21";
        SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date sss = sdff.parse(time);
        System.out.println(sss);
        long sb1 = System.currentTimeMillis();
        System.out.println(sb1-sb);
    }
}
