package text;

import java.math.BigDecimal;

public class Text13_leecode2 {
    public static void main(String[] args) {
        int x = -123456789;
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        System.out.println((int)n==n? (int)n:0);

    }
}
