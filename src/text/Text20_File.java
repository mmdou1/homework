package text;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Text20_File {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\file");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        file.createNewFile();
        System.out.println(file.exists());
        file.mkdir();
        String  sb=   file.getParent();
        System.out.println(sb);
        System.out.println(file.getParentFile().getAbsolutePath());
        System.out.println(file.length());
        Long sbbb = file.lastModified();
        Date s= new Date(sbbb);
        SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd HH:hh:ss");
        System.out.println(si.format(s));
        File f = new File("D:\\");
        File[] fs = f.listFiles();
        for (File data : fs){
            System.out.println(data.getAbsolutePath());
        }
        sb sj = new sb(10,"dfad");
        sb sd = new sb(120,"d333fad");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sbb"));
        oos.writeObject(sj);
        oos.flush();
        oos.close();
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("sbb"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
        List<sb> sbs = new ArrayList<sb>();
        sbs.add(sj);
        sbs.add(sd);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ss"));
        os.writeObject(sbs);
        os.flush();
        os.close();


        ObjectInputStream iii = new ObjectInputStream(new FileInputStream("ss"));
        Object d = iii.readObject();
        System.out.println(d);

    }

}
