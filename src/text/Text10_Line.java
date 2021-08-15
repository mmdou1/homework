package text;

public class Text10_Line {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i <1000 ; i++) {
            System.out.println("ss"+i);
        }
    }
}


