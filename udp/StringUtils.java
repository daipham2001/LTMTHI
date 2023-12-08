/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp;

/**
 *
 * @author ADMIN
 */
public class StringUtils {

    public static String Reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String Tach(String s) {
        String[] p = s.split("-");

        if (p[0] == "101") {
            return new StringBuilder(p[1]).reverse().toString();

        } else {
            return p[1];
        }
//        return p;
    }
    //...Upper
    /// Lower

}
