package com.example.i;

import sun.nio.cs.ext.GBK;

import java.io.*;

public class Idemo {


    public static void main(String[] args) throws IOException {
        Idemo i = new Idemo();
        //i.t01();
        i.t02();
        //i.t03();
    }
    public void t01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input a char then press the enter button");
        char c = '\r';

        while (c == '\r'){
                c = (char) br.read();
                System.out.println("the input char is: "+c);
        };
    }


    public void t02() throws IOException {
        // for bytes flow to print
        byte[] bytes = {12,23,34,45};
        FileOutputStream fos = new FileOutputStream(new File("").getAbsolutePath()+"/io/test.txt");
        fos.write(bytes);
        fos.close();

        // for chart flow to print
        FileWriter fw = new FileWriter(new File("").getAbsolutePath()+"/io/char.txt");
        System.out.println(fw.getEncoding());
        String str= "This is file for char.txt";
        fw.write(str);
        fw.close();            
    }

    public void t03() throws IOException {
        // read the file byte stream for console to print
        FileInputStream fis = new FileInputStream(new File("").getAbsolutePath()+"/io/test.txt");
        int c;
        while ((c=fis.read()) != -1){
            //System.out.println(c);
            System.out.println(fis.read()+"fff");
        };
        fis.close();
        // read the file chart stream for comsole to print

        FileReader fr = new FileReader(new File("").getAbsolutePath()+"/io/char.txt");
        System.out.println(fr.read());
    }
}
