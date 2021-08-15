package com.suomoniu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Day30_2 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        List<String> list = new LinkedList<>();
        for (int i = 0; i <strs.length ; i++) {
            list.add(strs[i]);
        }
        list.remove("67891");
        list.remove("12347809933");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
/*        for(String data : list){
            System.out.println(data);
        }*/
    }
}
