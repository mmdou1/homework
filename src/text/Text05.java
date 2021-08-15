package text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text05 {
    public static void main(String[] args) {
        FileReader fr= null;
        try {
            fr = new FileReader("sb.java");
            char[] chars = new char[2];
            int read =0;
            while((read=fr.read(chars)) != -1 ){
                System.out.print(new String(chars,0,read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fr != null ){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
