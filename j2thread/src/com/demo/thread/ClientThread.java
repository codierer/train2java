package com.demo.thread;

import sun.net.www.http.PosterOutputStream;

import java.io.*;
import java.net.Socket;

public class ClientThread {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 2233);

        System.out.println("hello world client");
        OutputStream os = s.getOutputStream();

        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(os)
        );
        pw.flush();
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is)
        );
        String str = br.readLine();
        System.out.println(str);

    }
}
