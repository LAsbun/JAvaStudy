/*
@author: sws
@software: IntelliJ IDEA
@file: EnumerationTest.java
@time: 3/16/18 10:47 AM
@desc:
*/

package data_struct;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo {

    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> daysname = new Vector<String>();

        daysname.add("Sunday");
        daysname.add("Saturday");
        daysname.add("Friday");
        daysname.add("Tuesday");
        daysname.add("Wednesday");
        daysname.add("Thursday");
        daysname.add("Monday");
        days = daysname.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
