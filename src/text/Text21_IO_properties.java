package text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Text21_IO_properties {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("f");
        Properties pp = new Properties();
        pp.load(fis);
        System.out.println(pp.getProperty("sulan"));

    }
}
