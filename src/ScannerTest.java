/*
@author: sws
@software: IntelliJ IDEA
@file: ScannerTest.java
@time: 3/14/18 4:14 PM
@desc:
*/

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("a.txt"));

        while (scan.hasNext()){
            System.out.println(scan.next());
        }

        // next 函数以有效字符之后的第一个空格作为结束
//        if (scan.hasNext()) {
//            String str1 = scan.next();
//            System.out.println("输入的数据为" + str1);
//        }

        // nextLine 函数以回车作为结束
//        if (scan.hasNextLine()){
//            String str1 = scan.nextLine();
//            System.out.println("输入的数据为" + str1);
//        }

//        double sum = 0.0;

//        while (scan.hasNextDouble()){
//            double x = scan.nextDouble();
//
//            sum  += x;
//        }
//        System.out.println(sum);

//        Console cons = System.console();
//        String username = cons.readLine("u");
//        char [] pwd = cons.readPassword("p");
    }
}
