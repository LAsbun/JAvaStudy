import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

    public static void main(String[] args) throws IOException{

//        char c;
//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        do {
//            c = (char)br.read();
//            System.out.println(c);
//        } while (c != 'q');

        String abc = "Awesome" ;
        String xyz =  abc;

        if(abc == xyz)
            System.out.println("Refers to same string");

        String s;
        do{
            s = br.readLine();
            System.out.println(s);
            System.out.println(s.equals("ds"));
        }while (s != new String("ds"));
    }
}
