package text;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Text08_PrintStream {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("f",true));
        System.setOut(ps);
        System.out.println("soumoniu");
        System.out.println("sulan");

    }
}
