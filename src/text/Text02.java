package text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text02 {
    public static void main(String[] args) {
        FileInputStream fs =null;


        try {
            fs =new FileInputStream("D:\\java\\003-JavaSE课堂源码\\001-环境搭建\\HelloWorld");

            byte[] bytes = new byte[4];
            int read=0;
            while((read=fs.read(bytes))!=-1){
                System.out.print(new String(bytes,0,read));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fs!=null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
