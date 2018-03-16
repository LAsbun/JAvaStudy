/*
@author: sws
@software: IntelliJ IDEA
@file: MapDemo.java
@time: 3/16/18 11:54 AM
@desc:
*/

package data_struct;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(5, 6);
        m.put(5, 6);
        System.out.println(m);

        Hashtable ht = new Hashtable();

        Enumeration names;
        String str;
        double bd;

        ht.put("1", 5.6);
        ht.put("2", 5.62);
        ht.put("3", 5.63);
        ht.put("4", 5.64);

        names = ht.keys();

        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + " " + ht.get(str));
        }

        ht.put("1", (double) ht.get("2") + 1.0);

        System.out.println();
        names = ht.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + " " + ht.get(str));
        }
    }
}
