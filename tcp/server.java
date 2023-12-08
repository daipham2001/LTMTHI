/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2007);
        System.out.println("Server Running!");

        while (true) {
            Socket conn = serverSocket.accept();
            //nhan du lieu
            DataInputStream dis = new DataInputStream(conn.getInputStream());

            System.out.println(dis.readUTF());

            // gui dũ lieu
            //dong
            dis.close();
            conn.close();
//            serverSocket.close();
        }
//        serverSocket.close();

    }
}
