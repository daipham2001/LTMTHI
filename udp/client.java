/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author ADMIN
 */
public class client {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket client = new DatagramSocket();
        String strReq = "101-xin chao ban 123";
        // gui du lieu
        DatagramPacket dpReq = new DatagramPacket(strReq.getBytes(), 
                strReq.length(), 
                InetAddress.getByName("localhost"), 2207);
        
        
        client.send(dpReq);
        
        System.out.println("okkkk");
        //nhan ket qua
        byte[] buf = new byte[1024];
        DatagramPacket dpRes = new DatagramPacket(buf, buf.length);
        client.receive(dpRes);
        System.out.println(new String(dpRes.getData()).trim());
        
        client.close();
    }
}
