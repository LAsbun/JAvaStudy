package mtest;

class A{
    static int a = 5;
}

public class Main {

    public static void main(String []args) {

//        int a = 0xf6;

        A a = new A();

//        a.a = 15;

        A b = new A();

        System.out.println(A.a);
        System.out.println(b.a);

//        System.out.println((byte)a);
//        System.out.println((int)23.3 == 23);

//        System.out.println(args[0]);
//
//        System.out.println("的撒娇的刷卡机都是来看");
//        System.out.println("Hello World!");

    }
}
