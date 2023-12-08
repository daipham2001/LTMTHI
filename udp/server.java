/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author ADMIN
 */
public class server {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket server = new DatagramSocket(2207);
        System.out.println("server running");
        while(true){
            byte[] buf = new byte[1024];
            //tiep nhan
            DatagramPacket dpReq = new DatagramPacket(buf, buf.length);
            server.receive(dpReq);
            String strReq = new String(dpReq.getData()).trim();
            System.out.println(strReq);
            //xu ly
            String strRes = StringUtils.Tach(strReq);
            
            //gui
            DatagramPacket dpRes = new  DatagramPacket(strRes.getBytes(), 
                    strRes.length(), 
                    dpReq.getAddress(), dpReq.getPort());
            server.send(dpRes);
            
            //dong
        }
    }
}
