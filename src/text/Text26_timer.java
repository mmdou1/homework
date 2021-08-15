package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Text26_timer {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2021-08-09 10:07:00");
        Timer timer = new Timer();

        timer.schedule(new domesome(),date,3*1000);


    }
}

class domesome extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String now  = sdf.format(date);
        System.out.println(now+"备份成功");

    }
}
