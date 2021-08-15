package text;

public class Text16String {
    public static void main(String[] args) {
        byte[] bytes = {100,67,89};
        String s = new String(bytes);
        System.out.println(s);
        String s1 = new String(bytes,1,2);
        System.out.println(s1);

        System.out.println("索磨牛".charAt(0));
        System.out.println("索磨牛".contains("牛"));
        System.out.println("锁模牛再度发动发动".contains("发动"));
        System.out.println("adb".equalsIgnoreCase("ADb"));
        byte[] bytes1 = "asdlfjasdf".getBytes();
        for (int i = 0; i <bytes1.length ; i++) {
            System.out.println(bytes1[i]);
        }

        System.out.println("alsdkfj;sldfja.suomoniu".indexOf("suomoniu"));
        System.out.println("12345678".substring(3,6));
        System.out.println("          adsf     sadf          ".trim());
        Object obj = new Object();
        String sss = String.valueOf(obj);
        System.out.println(sss);
    }
}
