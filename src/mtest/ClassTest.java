package mtest;

public class ClassTest {

    static int a;
    String bb;

    public ClassTest(){
        this.a = 5;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        ClassTest.a = a;
    }

    public ClassTest(String name){
        this.bb = name;
    }

    public static void main(String []args){
        ClassTest ct = new ClassTest();
        System.out.println(ct.getA());
    }

}
