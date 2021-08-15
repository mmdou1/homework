package text;

import java.util.*;

public class text {
    public static void main(String[] args) {
        List f = new ArrayList();
        f.add(1);
        f.add (2);
        Iterator it = f.iterator();
        while (it.hasNext()){
            Object x = it.next();
            System.out.println(x);
        }
        f.set(1,1443242);
        System.out.println(f.isEmpty());
        System.out.println(f.contains(2));
        for (int i = 0; i <f.size() ; i++) {
            System.out.println(f.get(i));
        }
        List<String> sb =new ArrayList<>();
        sb.add("sd");
        sb.add("sadfasdf");
        sb.add("dfadf");
        for(String data: sb){
            System.out.println(data);
        }


        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey()+node.getValue());
        }
        map.put(5,"郭靖");
        map.remove(1);
        map.replace(2, "周林");
        for(Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey()+node.getValue());
        }
    }


}
