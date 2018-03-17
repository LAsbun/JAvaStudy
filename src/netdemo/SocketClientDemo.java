/*
@author: sws
@software: IntelliJ IDEA
@file: SocketDemo.java
@time: 3/17/18 4:33 PM
@desc:
*/

package netdemo;

import java.net.*;
import java.io.*;


public class SocketClientDemo {

    public static void main(String[] args) throws IOException{

        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try{
            System.out.println("Connect to: " + serverName + " port: " + port);

            Socket client = new Socket(serverName, port);

            System.out.println("Remote server IP is: " + client.getRemoteSocketAddress() );

            OutputStream outToServer = client.getOutputStream();

            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());

            InputStream inputFromServer = client.getInputStream();

            DataInputStream in = new DataInputStream(inputFromServer);

            System.out.println("Server return : " + in.readUTF());

            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
