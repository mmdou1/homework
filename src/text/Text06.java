package text;

import java.io.FileWriter;
import java.io.IOException;

public class Text06 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("f",true);
            char[] chars = {'a','中','索'};
            fw.write(chars);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
