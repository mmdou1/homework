package text;

public class Text12_Thread {
    public static void main(String[] args) {
        MyRunnable t = new MyRunnable();
        Thread tt = new Thread(t);
        tt.setName("tt");
        tt.start();
        tt.interrupt();
        System.out.println("over");
    }
}
