/*
@author: sws
@software: IntelliJ IDEA
@file: CollectionDemo.java
@time: 3/16/18 2:55 PM
@desc:
*/

package data_struct;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("1.2");

        for (String str : list) {
            System.out.println(str);
        }

        String[] strArray = new String[list.size()];
        String[] s = list.toArray(strArray);
        System.out.println(s.equals(strArray));
        for (int i = 0; i < strArray.length; ++i) {
            System.out.println(strArray[i]);
        }
        System.out.println();

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        for(String key: map.keySet()){
            System.out.println(key + " "+ map.get(key));
        }
        System.out.println();

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value " + entry.getValue());
        }
    }
}
