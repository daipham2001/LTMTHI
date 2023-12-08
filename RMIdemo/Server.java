/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIdemo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author ADMIN
 */
public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Calculator cal = new Calculator();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://localhost/calculator", cal);
        System.out.println("Server running!");
    }
}

//<dependency>
//            <groupId>mysql</groupId>
//            <artifactId>mysql-connector-java</artifactId>
//            <version>8.0.19</version>               
//        </dependency>
//create database phd;
//CREATE TABLE User (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    username VARCHAR(255) NOT NULL,
//    password VARCHAR(255) NOT NULL,
//    email VARCHAR(255)
//
//);
//SELECT * FROM phd.user;
//INSERT INTO phd.user (id, name, pot) VALUES (1, 'John Doe', 100);
