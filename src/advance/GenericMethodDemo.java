/*
@author: sws
@software: IntelliJ IDEA
@file: GenericMethodDemo.java
@time: 3/16/18 4:37 PM
@desc:
*/

package advance;


import java.util.ArrayList;
import java.util.List;

class GenericClassDemo<T> {

    private T a;

    public void add(T t) {
        this.a = t;
    }

    public T get() {
        return a;
    }

}

public class GenericMethodDemo {

    public static <E> void printArray(E[] inputArray) {

        for (E elem : inputArray) {
            System.out.printf("%s ", elem);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximun(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;

    }

    // 类型通配符
    public static List<?> getData(List<?> a){

        return a;

    }

    public static void main(String[] args) {

        Integer intArray[] = {1, 2, 3, 4, 56};

        Double doubleArray[] = {1.0, 3.2, 4.2, 5.9};

        Character charArray[] = {'a', 'b', 'f', 'k', 'l'};// new String("abdsdjaidusi").toCharArray();

        printArray(intArray);

        printArray(doubleArray);

        printArray(charArray);

        System.out.println(maximun(1, 5, 3));
        System.out.println(maximun('a', 't', '9'));

        GenericClassDemo<Integer> intger = new GenericClassDemo<Integer>();
        GenericClassDemo<String> strger = new GenericClassDemo<String>();

        intger.add(6);
        strger.add("dsads");
        System.out.println(intger.get());
        System.out.println(strger.get());


        List<String> a = new ArrayList<String>();
        List<Integer> b = new ArrayList<Integer>();
        List<Double> c = new ArrayList<Double>();

        a.add("dsas");
        b.add(1);
        c.add(5.6);

        System.out.println(getData(a).get(0));
        System.out.println(getData(b).get(0));
        System.out.println(getData(c).get(0));

    }
}
