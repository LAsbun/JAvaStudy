/*
@author: sws
@software: IntelliJ IDEA
@file: Animal.java
@time: 3/15/18 3:38 PM
@desc:
*/

package inherite;

public class Animal {

    private String name;
    private int id;

    public Animal(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("this is " + id + "号" + name);
    }

    public static void main(String[] args) {

    }
}
