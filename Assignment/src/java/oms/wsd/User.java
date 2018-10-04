/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms.wsd;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

/**
 *
 * @author yasminzaidi
 */
@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable{
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;

    /**
     *
     */
    public User() {
    }


    public User(String name, String email, String password, String phoneNumber, String address) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    /**
     *
     * @param email
     * @return
     */
    public boolean matchEmail(String email){
        return this.email.equalsIgnoreCase(email.toLowerCase().trim());
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param gender
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @param favouriteColour
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}