package com.suomoniu;

import java.util.*;
/*
liusan			20				90.0F
        lisi			22				90.0F
        wangwu			20				99.0F
        sunliu			22				100.0F
*/

public class Day30_3 {
    public static void main(String[] args) {
        student stu1 = new student(20,"liusan",90F);
//       ArrayList<student> arr = new ArrayList();
        TreeSet<student> arr = new TreeSet<>();
        student stu2 = new student(22,"lisi",90F);
        student stu3 = new student(20,"wangwu",99F);
        student stu4 = new student(22,"sunliu",100F);
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        for(student data :arr){
            System.out.println(data);
        }

    }
}
class student implements Comparable<student> {
    int no ;
    String name;
    float exam;

    public student() {
    }

    public student(int no, String name, float exam) {
        this.no = no;
        this.name = name;
        this.exam = exam;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getExam() {
        return exam;
    }

    public void setExam(float exam) {
        this.exam = exam;
    }

    public String toString() {
        return "student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", exam=" + exam +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return no == student.no &&
                Float.compare(student.exam, exam) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, exam);
    }

    public int compareTo(student stu) {
        if(this.exam==stu.exam) return this.no-stu.no;
        else {
         double s2= this.exam-stu.exam;
         int s3 =(int)s2;
         return s3;
        }

    }
}


/*class studentComparator implements Comparator<student>{
    public int compare(student o1, student o2) {
        if(o1.exam==o2.exam) return o1.no-o2.no;
        else {
            float s2 = o1.exam- o2.exam;
            int s3 =(int)s2;
            return s3;
        }
    }
}*/
