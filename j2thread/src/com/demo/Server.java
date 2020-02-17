package com.demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] Args) throws IOException {
        ServerSocket ss = new ServerSocket(2233);

        Socket socket = ss.accept();
        System.out.println(socket);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(is)
        );
        String str = br.readLine();
        System.out.println(str);
        socket.close();
        //ss.close();
    }
}
