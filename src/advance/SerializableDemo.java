/*
@author: sws
@software: IntelliJ IDEA
@file: SerializableDemo.java
@time: 3/16/18 5:34 PM
@desc:
*/

package advance;

import java.io.*;

class Employee implements java.io.Serializable {

    public String name;
    public int number;
    public transient int SNN;
    public String address;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

}


public class SerializableDemo {

    public static void main(String[] args) {


        // 反序列化

        Employee e = null;

        try {

            FileInputStream fileiinput = new FileInputStream("/tmp/employer.ser");

            ObjectInputStream in = new ObjectInputStream(fileiinput);

            e = (Employee) in.readObject();
            in.close();
            fileiinput.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException i) {
            i.printStackTrace();
        }
        System.out.println(e.SNN);
        e.mailCheck();

        /*

        // 序列化

        Employee e = new Employee();

        e.address = "dsasd";
        e.SNN = 45465456;
        e.number = 123443254;
        e.name = "sws";

        try{
            FileOutputStream fileout = new FileOutputStream("/tmp/employer.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialize end.");
        }catch (IOException i){
            i.printStackTrace();
        }

        */

    }
}
