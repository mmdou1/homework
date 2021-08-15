/*
没有想到可以直接设置Object[] elements;，还有在初始化中设置它的长度
先判断是否超出条件在进行
//要先输出弹栈在输出栈帧指向否则会超出数组范围
*/



package com.suomoniu.day23_1;

public class Day23_1 {
    public static void main(String[] args) {
        MyStack x = new MyStack();
        for (int i = 0; i <10 ; i++) {
            try {
                x.push("fasdfa");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        try {
            x.push("fsdfsdf");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("========================");
        for (int i = 0; i <10 ; i++) {
            try {
                x.pop();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        try {
            x.pop();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
