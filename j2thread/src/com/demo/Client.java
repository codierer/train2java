package com.demo;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 2233);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(os)
        );
        pw.println("Hello, Java Console!");
        pw.close();
        socket.close();
    }
}
