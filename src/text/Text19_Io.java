package text;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text19_Io {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream("sb.txt"),true);
            System.setOut(ps );
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date nowTime = new Date();
            String s = sdf.format(nowTime);
            System.out.println(s);
            System.out.println(s);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        }


    }
