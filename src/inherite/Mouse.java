/*
@author: sws
@software: IntelliJ IDEA
@file: Mouse.java
@time: 3/15/18 3:43 PM
@desc:
*/

package inherite;

public class Mouse extends Animal {

    public Mouse(String name, int id){
        super(name, id);
    }

    public static void main(String[] args) {
        Mouse m = new Mouse("老鼠", 3);
        m.introduction();
    }
}
