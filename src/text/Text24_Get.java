package text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class Text24_Get {
    public static void main(String[] args) throws IOException {
        String path = Thread.currentThread().getContextClassLoader().getResource
                ("com/suomoniu/day23_1/Day23_1.class").getPath();
        System.out.println(path);
        InputStream ism = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("suomomo.properties");
        Properties p = new Properties();
        p.load(ism);
        ism.close();
        System.out.println(p.getProperty("suomoniu"));
        ResourceBundle bundle = ResourceBundle.getBundle("suomomo");
        String s = bundle.getString("suomoniu");
        System.out.println(s);
    }
}
