/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsof301;

import java.util.ArrayList;

/**
 *
 * @author PC
 * @param <T>
 */
public interface DAOinterface {
    public void themsv(Sinhvien sv);
    public void themst(Student sv);
    public void deletesv(int i,String ma) throws Exception;
    public void deleteđiem(int i,String ma) throws Exception;
    public void updatesv(String Ma,String ten,String gmail,String dchi,String phone,String phai,String img,int i) throws Exception;
    public void updatediem(int i) throws Exception;
    public ArrayList<Sinhvien> xuatdssv();
    public ArrayList<Student> xuatdsdiem();
    public void luusv() throws Exception;
    public void luudiem() throws Exception;
    public ArrayList<Sinhvien> xuatdatadssv() throws Exception;
    public ArrayList<Student> xuatdatadsdiem() throws Exception;
    public ArrayList<Sinhvien> search(String a) throws Exception;
}
