/*
@author: sws
@software: IntelliJ IDEA
@file: SocketServerDemo.java
@time: 3/17/18 4:45 PM
@desc:
*/

package netdemo;

import java.net.*;
import java.io.*;

public class SocketServerDemo extends Thread {

    private ServerSocket serverSocket;

    public SocketServerDemo(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Waiting connnecting... port is " + serverSocket.getLocalPort());
                Socket server = serverSocket.accept();

                System.out.println("Remote Server address: " + server.getRemoteSocketAddress());

                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println(" Time Out");
                s.printStackTrace();
                break;
            } catch (IOException i) {
                i.printStackTrace();
                break;
            }
        }
    }


    public static void main(String[] args) {

        int port = Integer.parseInt(args[0]);
        try {
            Thread t = new SocketServerDemo(port);
            t.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
