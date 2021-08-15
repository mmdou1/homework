package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test01 {
    public static void main(String[] args)  {
        Collection c = new ArrayList();
        c.add(12);
        c.add(13);
        Iterator it = c.iterator();
        Map<Integer,String> sb = new HashMap<>();
        sb.put(1,"sb");
        sb.put(2,"shi");
        sb.put(3,"suo");
        sb.put(4,"lian");
        sb.put(5,"zheng");

        Set<Integer> ss = sb.keySet();
        Iterator<Integer> its = ss.iterator();
        while(its.hasNext()){
            Integer s = its.next();
            System.out.println(sb.get(s));
        }

        for (Integer s : ss){
            System.out.println(sb.get(s));
        }


        System.out.println("=======================================");
        Set<Map.Entry<Integer,String>> s1 = sb.entrySet();
        for(Map.Entry<Integer,String > s : s1){
            System.out.println(s.getKey()+s.getValue());
        }

        Iterator<Map.Entry<Integer,String>> i = s1.iterator();
        while(i.hasNext()){
            Map.Entry<Integer,String> map = i.next();
            System.out.println(map.getKey()+map.getValue());
        }



    }
}
