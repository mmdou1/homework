package text;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000*5*200);
            } catch (InterruptedException e) {
               // e.printStackTrace();
                System.out.println("ss------"+i);
            }

        }
    }

/*        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("ss------"+i);
                }
            }
        });
        t.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("q------"+i);
        }*/

}
