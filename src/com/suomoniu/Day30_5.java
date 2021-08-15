package com.suomoniu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*[黑龙江省,浙江省,江西省,广东省,福建省]，
        第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，*/
public class Day30_5 {
    public static void main(String[] args) {
        String[] str ={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str1={"哈尔滨","杭州","南昌","广州","福州"};
       Map<String,String> hash = new HashMap<>();
        for (int i = 0; i <str.length ; i++) {
            hash.put(str[i],str1[i]);
        }
        Set<Map.Entry<String,String>> it =  hash.entrySet();
        Iterator<Map.Entry<String,String>> it2 = it.iterator();
        while(it2.hasNext()){
            /*System.out.println(it2.next());*/
            Map.Entry<String,String> node = it2.next();
            String key =node.getKey();
            String value =node.getValue();
            System.out.println(key+value);
        }

    }
}
