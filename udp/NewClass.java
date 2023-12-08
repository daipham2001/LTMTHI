/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp;

/**
 *
 * @author ADMIN
 */
public class NewClass {
    
    public static void main(String[] args) {
        // Chuỗi có format: code|thông tin
        String chuoi = "123-Thông tin mã số 123";

        // Tách chuỗi bằng dấu "|"
        String[] parts = chuoi.split("-");

        // Phần đầu tiên là mã code
        String maCode = parts[0];

        // Phần thứ hai là thông tin
        String thongTin = parts[1];

        // In ra kết quả
        System.out.println("Mã code: " + maCode);
        System.out.println("Thông tin: " + thongTin);
    }


}
