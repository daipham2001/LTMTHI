/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 2007);
        System.out.println(clientSocket);
        
        // gửi
        
        DataOutputStream dos =new DataOutputStream(clientSocket.getOutputStream());
        
        dos.writeUTF("xin chao, minh ket noi nhe");
        
        dos.close();
        
        clientSocket.close();
        
    }
}
