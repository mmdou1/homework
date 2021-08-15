package com.suomoniu.day23_2;

public class Room {
    private int number;
    private String kind;
    private String situation;

    public Room() {
    }

    public Room(int number, String kind, String situation) {
        this.number = number;
        this.kind = kind;
        this.situation = situation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public void setRoomsNumber(Room[][] rooms){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                rooms[i][j].setNumber((i+1)*100+j);
            }
        }
    }
    public void setRoomsKind(Room[][] rooms){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
               if(i==0) rooms[i][j].setKind("普通房");
               if(i==1) rooms[i][j].setKind("特殊房");
               if(i==2) rooms[i][j].setKind("总统房");
            }
        }
    }
    public void setRoomsSituation(Room[][] rooms){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
            rooms[i][j].setSituation("空闲");
            }
        }
    }
    public void printAll(Room[][] rooms){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                System.out.print(rooms[i][j].getNumber()+rooms[i][j].getKind()+rooms[i][j].getSituation()+" ");
            }
            System.out.println();
        }
    }
    public  void book(int x,Room[][] rooms){
        int a1= x/100;
        int a2=x%100;
        if(rooms[a1-1][a2].getSituation().equals("空闲")){
        System.out.println("预约"+rooms[a1-1][a2].getNumber()+"成功");
        rooms[a1-1][a2].setSituation("有人");
        }
        else {
            System.out.println("此房间已经有人");
            return;
        }
    }
    public void back(int x,Room[][] rooms){
        int a1=x/100;
        int a2=x%100;
        rooms[a1-1][a2].setSituation("空闲");
        System.out.println("退房"+rooms[a1-1][a2].getNumber()+"成功");
    }
}
