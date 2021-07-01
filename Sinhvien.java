/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsof301;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Sinhvien implements Serializable{
    private String masv,name,address,email,sdt,gender,img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Sinhvien() {
    }

    public String getMasv() {
        return masv;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getGender() {
        return gender;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
