


package com.suomoniu.day23_1;


public class MyStack {
    private  Object[] elements;
    private int index;

    public MyStack() {
        this.elements=new Object[10];
        this.index=-1;
    }

    public MyStack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

/*    public void push( Object x){
        for (int i = 0; i <10 ; i++) {
            if(this.index==i-1){
                this.elements[i]=x;
                this.index++;
                return;
            }
            if(this.index>=elements.length-1){
                System.out.println("栈已满");
                return;
            }
            }
        }*/


    public void push(Object obj) throws MyException {
        if(this.index>=this.elements.length-1){
            throw  new MyException("压栈失败，栈已满");
        }
        index++;
        elements[index]=obj;
        System.out.println("压栈"+obj+"成功"+"栈帧指向"+index);
    }

/*    public void pop(){
        this.elements[this.index]=null;
        index--;
    }*/

    public void pop() throws MyException {
        if(index<0) {
            throw  new MyException("弹栈失败，栈已空");
        }
        System.out.print("弹出"+elements[index]);
        index--;
        System.out.println("栈帧指向"+index);
    }
}
