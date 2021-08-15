package com.suomoniu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day30 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> s = new ArrayList<>();
        while(s.size()<10){
            int num = random.nextInt(101);
            if(num>10) s.add(num);
        }

        for (int j = 0; j <s.size() ; j++) {
            System.out.println(s.get(j));
        }
    }
}
