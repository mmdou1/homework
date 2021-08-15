package text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Text03 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("sb.txt");
            byte[] bytes = new byte[4];
            int read1=0;
            while((read1=fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,read1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if( fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
