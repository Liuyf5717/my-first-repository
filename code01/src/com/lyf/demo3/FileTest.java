package com.lyf.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write("hello".getBytes());
        fos.write(97);
        fos.close();
    }
}
