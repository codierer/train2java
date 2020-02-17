package com.demo.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {

    public void action() throws IOException {
        ServerSocket ss = new ServerSocket(2233);
        System.out.println("Server Port");

        while (true){
            Socket s = ss.accept();
            RThread rt = new RThread(s);
            Thread t = new Thread(rt);
            t.start();

        }
    }

    public static void main(String[] args) throws IOException{
        ServerThread st = new ServerThread();
        st.action();
    }
}
