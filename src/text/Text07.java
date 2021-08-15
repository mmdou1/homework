package text;

import java.io.*;

public class Text07 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\java\\Java进阶视频\\002--IDEA设置字体[更多精品资源www.cx1314.cn].avi");
            fos = new FileOutputStream("D:\\java\\002--IDEA设置字体[更多精品资源www.cx1314.cn].avi");
            byte[] bytes = new byte[1024*1024];
            int readCount=0;
            while((readCount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
