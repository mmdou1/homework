package text;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class Text01 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("sb");
        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }


        for (String data :arr){
            System.out.println(data);
        }



        Map<Integer,String> hash = new HashMap<>();
        hash.put(1,"sb");
        hash.put(2,"sba");
        Set<Map.Entry<Integer,String>> it3 = hash.entrySet();
        Iterator<Map.Entry<Integer,String>> it4 = it3.iterator();
        while(it4.hasNext()){
            Map.Entry<Integer,String> node =  it4.next();

            Integer key1 = node.getKey();
            String value = node.getValue();
            System.out.println(key1+value);
/*
            System.out.println(it4.next());
*/
        }
        for(Map.Entry<Integer,String> note: it3){
            System.out.println(note.getKey()+note.getValue());
        }

    }
}
