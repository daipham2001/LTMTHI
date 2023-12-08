/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RMIdemo;

import java.rmi.Remote;
import java.rmi.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface Interface extends Remote{
    int sum(int a, int b) throws RemoteException;
    List<User> findAll() throws RemoteException;
    void addUser(User user) throws RemoteException;
}
