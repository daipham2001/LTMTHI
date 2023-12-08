/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIdemo;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class User implements Serializable{
    private int id;
    private String name;
    private String pot;

    public User() {
    }

    public User(int id, String name, String pot) {
        this.id = id;
        this.name = name;
        this.pot = pot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPot() {
        return pot;
    }

    public void setPot(String pot) {
        this.pot = pot;
    }
    
           
}
