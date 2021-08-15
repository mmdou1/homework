package text;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Text14_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask f = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("begin");
                Thread.sleep(1000*3);
                System.out.println("over");
                return 300;
            }
        }) ;
        Thread a = new Thread(f);
        a.start();
        Object obj = f.get();
        System.out.println("suomoniu");
    }
}
