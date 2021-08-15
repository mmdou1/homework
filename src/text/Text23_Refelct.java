package text;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Text23_Refelct {
    public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
        Class cl  = Class.forName("text.Dp");
        Properties pp = new Properties();
        FileInputStream fis =new FileInputStream("D:\\java\\homework\\课后作业\\sdf.properties");
        pp.load(fis);
        fis.close();
        String admin = pp.getProperty("admin");
        Class c2 = Class.forName(admin);
        Object obj = c2.newInstance();
        System.out.println(obj);
        Class c = Class.forName("text.MyThread");
        Object objs = c.newInstance();
        System.out.println(objs);

    }
}

class Dp{
 static{
     System.out.println("sb");
 }

}
