import java.io.*;

public class FileTest {


    public static void main(String[] args) throws IOException {
        /*
        try{
            byte bWrite [] = {11, 23, 45, 6};
            OutputStream os = new FileOutputStream("test.txt");
            for(byte x: bWrite){
                os.write(x);
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; ++ i){
                System.out.println((char)is.read() + " ");
            }
            is.close();
        }catch (IOException e){
            System.out.println("exception");
        }
        */
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        writer.write("中文\n");

        writer.write("english\n");
        writer.close();

        fop.close();

        FileInputStream fip = new FileInputStream(f);

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

        StringBuffer sb = new StringBuffer();

        while (reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();

        fip.close();

    }

}
