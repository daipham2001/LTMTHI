/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class test {

    public static void main(String[] args) {
        String chuoi = "apple,banana,orangexxxxa";
        String[] fruits = chuoi.split(",");
        String moi = "";

        for (char fruit : chuoi.toCharArray()) {
            
            if(fruit == 'x'){
                moi += "";
                
            }
            else moi += fruit;
//            System.out.println(fruit);
        }
        System.out.println("Chuỗi mới "+moi);


    }

}
