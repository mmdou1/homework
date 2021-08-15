package text;

import com.suomoniu.day23_1.MyException;

public class Text09_exception {
    public static void main(String[] args) {
       MyException exception = new MyException("suomoniu");
        System.out.println(exception.getMessage());
    }
}
