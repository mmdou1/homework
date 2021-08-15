package com.suomoniu;

import java.util.ArrayList;
import java.util.List;

/*6.定义一个泛型为String类型的List集合，统计该集合中每个字符
        （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
        程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/
public class Day30_6 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        char s1 = 'a';
        arr.add("abc");
        arr.add("bcd");
        for (int i = 0; i <arr.size() ; i++) {
            char[] x1 =arr.get(i).toCharArray();
            for (int j = 0; j <x1.length ; j++) {
               if(x1[j]=='a') a++;
               if(x1[j]=='b') b++;
               if(x1[j]=='c') c++;
               if(x1[j]=='d') d++;
            }
        }
        System.out.println("a="+a+","+"b="+b+","+"c="+c+","+"d="+d);

    }
}
