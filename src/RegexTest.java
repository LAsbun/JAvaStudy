import java.util.regex.*;

public class RegexTest {

    public static void main(String [] args){
        String s = "I am a noob from runoob.com.";

        System.out.println(Pattern.matches(".*ruoob.*", s));


        String line = "This order was placed for QT3000! OK?";

        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
//        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
//        Matcher m = r.matcher(line);


        Pattern p = Pattern.compile("(\\d{2})([a-z]{2,3})");
        Matcher m =p.matcher("33aa-32sdy-29ssc");

        if(m.find()){
            System.out.println(m.groupCount());
        }
    }

}
