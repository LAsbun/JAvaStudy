/*
@author: sws
@software: IntelliJ IDEA
@file: SuperClass.java
@time: 3/15/18 3:55 PM
@desc:
*/

package inherite;

class BaseClass{

    private int n;

    public BaseClass(){
        System.out.println("basetask..");
    }

    public BaseClass(int n){
        System.out.println("basetask.." + n);
        this.n = n;
    }

}

public class SuperClass extends BaseClass {


    private int n;

    public int getN() {
        return n;
    }

    public SuperClass(int n){
        super(n);
    }


    public static void main(String[] args) {
        SuperClass s = new SuperClass(200);
        s.getN();
    }
}
