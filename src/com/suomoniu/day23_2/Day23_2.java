/*
*没有把酒店抽取出来一个类，抽取出来一个类比较好看，房间编号房间类型与房间状态可以在初始化就可以定义。
*对象都要重写toString 和 equals 方法，老师重写toString来输出房间信息
* */


package com.suomoniu.day23_2;

import java.util.Scanner;

public class Day23_2 {
    public static void main(String[] args) {
        Room[][] rooms = new Room[3][10];
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                rooms[i][j]= new Room();
            }
        }
        Room a =new Room();
        a.setRoomsKind(rooms);
        a.setRoomsNumber(rooms);
        a.setRoomsSituation(rooms);
        a.printAll(rooms);
        while(true){
            Scanner s =new Scanner(System.in);
            String jian= s.next();
            if(jian.equals("预定")){
                System.out.println("输入你要预定的房间号");
                Scanner b =new Scanner(System.in);
                int x1= b.nextInt();
                a.book(x1,rooms);
                continue;
            }
            if(jian.equals("退房")){
                System.out.println("输入你要退的房间号");
                Scanner c =new Scanner(System.in);
                int x2= c.nextInt();
                a.back(x2,rooms);
                continue;
            }
            if(jian.equals("查看"))   {a.printAll(rooms);continue;}
            if(jian.equals("结束"))   return;
        }




    }
}
