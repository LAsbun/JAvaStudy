/*
@author: sws
@software: IntelliJ IDEA
@file: StackDemo.java
@time: 3/16/18 11:26 AM
@desc:
*/

package data_struct;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        s.push(new Integer(1));
        s.push(new Integer(4));
        s.push(new Integer(3));
        s.push(new Integer(5));
        s.push(new Integer(2));

        while (!s.empty()){
            System.out.println(s.pop());
        }

    }
}
