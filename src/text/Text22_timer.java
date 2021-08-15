package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Text22_timer {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2021-07-31 11:17:00");
        Timer  timer = new Timer();
        timer.schedule(new dos(),date,1000*3);

    }
}


class dos extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(new Date());
        System.out.println(s+"备份成功");
    }
}