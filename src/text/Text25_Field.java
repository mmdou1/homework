package text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

public class Text25_Field {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException, NoSuchFieldException {
        Class studentClass = Class.forName("text.Student");
        Object obj = studentClass.newInstance();
        System.out.println(obj);
        Field noField = studentClass.getDeclaredField("no");
        System.out.println(noField.get(obj));
        Field stringField = studentClass.getDeclaredField("name");
        stringField.setAccessible(true);
        stringField.set(obj,"sddff");
        System.out.println(stringField.get(obj));
    }
}
