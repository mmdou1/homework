package text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text04 {
    public static void main(String[] args) {
        FileOutputStream fos =  null;
        try {
            fos =new FileOutputStream("f",true);
            byte[] bytes ={92,32,4,51,6};
            fos.write(bytes);
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
