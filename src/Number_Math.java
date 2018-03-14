import java.util.ArrayList;

public class Number_Math {

    public static void main(String[] args) {

        Character a = '\u0056';

        System.out.println(Math.min(5.5, 6));
        System.out.println(a);

        String w = "中国人民";

        for (Character aa : w.toCharArray()) {
            System.out.println(aa);
        }

        System.out.println(w.compareTo("中国"));

        StringBuffer s = new StringBuffer("dsads");
        s.append("的撒多撒");
        System.out.println(s);

    }
}
