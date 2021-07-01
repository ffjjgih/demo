/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsof301;
import java.util.ArrayList;

public class QlDAO implements DAOinterface{

    private ArrayList<Sinhvien> danhsach;
    private ArrayList<Student> lst;
    private Sqlsever sql=new Sqlsever();
    public QlDAO() {
        this.danhsach=new ArrayList<>();
        this.lst=new ArrayList<>();
    }

    @Override
    public void themsv(Sinhvien sv) {
        this.danhsach.add(sv);
    }

    @Override
    public void themst(Student sv) {
        this.lst.add(sv);
    }

    @Override
    public ArrayList<Sinhvien> xuatdssv() {
        return this.danhsach;
    }

    @Override
    public ArrayList<Student> xuatdsdiem() {
        return this.lst;
    }

    @Override
    public void deleteđiem(int i, String ma) throws Exception{
        this.danhsach.remove(i);
        try {
            sql.deletediem(ma);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void updatesv(String Ma,String ten,String gmail,String dchi,String phone,String phai,String img,int i) throws Exception{
        try {
            sql.updatesql(this, Ma,ten,gmail,dchi,phone,phai,img, i);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void updatediem(int i)throws Exception{
        try {
            sql.updatediem(this, i);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void luusv() throws Exception{
        try {
            sql.createdatabase(this);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void luudiem() throws Exception{
        try {
            sql.displaydata(this);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void deletesv(int i, String ma) throws Exception{

        this.danhsach.remove(i);
        try {
            sql.deleteqlsv(ma);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public ArrayList<Sinhvien> xuatdatadssv() throws Exception{
        try {
            this.danhsach=sql.readdatabase();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        return this.danhsach;
    }

    @Override
    public ArrayList<Student> xuatdatadsdiem() throws Exception{
        try {
            this.lst=sql.hienthidulieu();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        return this.lst;
    }

    @Override
    public ArrayList<Sinhvien> search(String a) throws Exception {
        this.danhsach=sql.ghidata(a);
        return this.danhsach;
    }
    

    
}
