package com.demo.thread;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class RThread implements Runnable{

    private Socket socket;
    public RThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(
                    new OutputStreamWriter(os)
            );
            pw.println("hello world client");
            pw.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
