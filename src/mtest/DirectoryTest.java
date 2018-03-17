package mtest;/*
@author: sws
@software: IntelliJ IDEA
@file: DirectoryTest.java
@time: 3/14/18 3:34 PM
@desc:
*/

import java.io.File;

public class DirectoryTest {

    public static void main(String[] args) {

//        String dir = "/tmp/user/java/bin";
//        File d = new File(dir);
//        d.mkdirs();

//        String dir = "/tmp";
//
//        File f1 = new File(dir);
//        if (f1.isDirectory()){
//            String s[] = f1.list();
//
//            for(int i = 0; i < s.length; ++i){
//                File f = new File(dir + "/" + s[i]);
//                if (f.isDirectory()){
//                    System.out.println(dir + "/" + s[i] + "是一个目录");
//                }
//                else {
//                    System.out.println(dir + "/" + s[i] + "不是一个目录");
//                }
//            }
//        }
//        else{
//            System.out.println(dir + "不是一个目录");
//        }

        String delete_dir = "/tmp/user";

        File folder = new File(delete_dir);

        deleteDir(folder);

    }

    public static void deleteDir(File folder) {
        File files[] = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteDir(f);
                } else {
                    System.out.println(f.getName());
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
