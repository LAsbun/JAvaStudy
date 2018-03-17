package mtest;

abstract class Tbase {

    protected int ii;

    public abstract void setIi(int a);

    public abstract int getIi();
}


public class Test extends Tbase {
    /*
     * final 测试
     * */
    static int a = 12;

    public final static int b = 5;

    static final String TITLE = "Manager";

    public void changeValue() {
        a = 12;
    }

    @Override
    public void setIi(int b) {
        ii = b;
    }

    @Override
    public int getIi() {
        return ii;

    }

    public static void main(String args[]) {

        int a[] = {1, 2};

        for(String o: args){
            System.out.println(o);
        }

        Test A = new Test();
        A.setIi(12);
        System.out.println(A.getIi());
        System.out.println((int) (5.3 / 6));
        System.out.println((5 == 5) ? 20 : 30);
        System.out.println(A instanceof Tbase);
    }

}
