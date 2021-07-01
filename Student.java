/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsof301;

/**
 *
 * @author PC
 */
public class Student {

    private String masv,name;
    private float markE,markT,markP;
    private int id;

    public Student() {
    }
    

    public String getMasv() {
        return masv;
    }

    public String getName() {
        return name;
    }

    public float getMarkE() {
        return markE;
    }

    public float getMarkT() {
        return markT;
    }

    public float getMarkP() {
        return markP;
    }

    public int getId() {
        return id;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarkE(float markE) {
        this.markE = markE;
    }

    public void setMarkT(float markT) {
        this.markT = markT;
    }

    public void setMarkP(float markP) {
        this.markP = markP;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float dtb(){
        return (this.markE+this.markP+this.markT)/3;
    }
}
