package assignmentsof301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Sqlsever {

    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Assignmentsof203";
    String account = "sa";
    String password = "123456";

    public void createdatabase(QlDAO danhsach) throws Exception {
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            Statement ps = con.createStatement();
            for (Sinhvien x : danhsach.xuatdssv()) {
                String SQL = "Insert into QLSV values ('" + x.getMasv() + "',N'"
                        + x.getName() + "','" + x.getEmail() + "','" + x.getSdt() + "',N'"
                        + x.getGender() + "',N'" + x.getAddress() + "','" + x.getImg() + "');";
                ps.addBatch(SQL);
            }
            con.commit();
            ps.executeBatch();
            con.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public ArrayList<Sinhvien> readdatabase() throws Exception {
        ArrayList<Sinhvien> listsv = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM QLsv";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Sinhvien sv = new Sinhvien();
                sv.setAddress(rs.getString("diachi"));
                sv.setEmail(rs.getString("Email"));
                sv.setGender(rs.getString("Gender"));
                sv.setMasv(rs.getString("Masv"));
                sv.setName(rs.getString("hoten"));
                sv.setSdt(rs.getString("sDT"));
                sv.setImg(rs.getString("img"));
                listsv.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return listsv;
    }

    public void updatesql(QlDAO listsv, String Ma,String ten,String gmail,String dchi,String phone,String phai,String img,int row) throws Exception {
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            String SQL = "update qldiem set masv=? where masv=?;Update QLSV set masv=?,hoten=?,email=?,sdt=?,Gender=?,diachi=?,img=? where masv=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(2, listsv.xuatdssv().get(row).getMasv());
            ps.setString(1, Ma);
            ps.setString(3, Ma);
            ps.setString(4, ten);
            ps.setString(5, gmail);
            ps.setString(6, phone);
            ps.setString(8, dchi);
            ps.setString(7, phai);
            ps.setString(9, img);
            ps.setString(10, listsv.xuatdssv().get(row).getMasv());
            System.out.println(listsv.xuatdssv().get(row).getMasv());
            System.out.println(Ma);
            System.out.println(listsv.xuatdssv().get(row).getMasv());
            System.out.println(ten);
            System.out.println(gmail);
            System.out.println(phone);
            System.out.println(phai);
            System.out.println(dchi);
            System.out.println(img);
            System.out.println(Ma);
            ps.executeUpdate();
            con.commit();
            con.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void deleteqlsv(String a) throws Exception {
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            PreparedStatement ps = con.prepareStatement("Delete from QLDiem where masv=?;DELETE from QLSV where masv=?");
            ps.setString(1, a);
            ps.setString(2, a);
            ps.executeUpdate();
            con.commit();
            con.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public String admindata(String user, String pass) throws Exception {
        Admin v = new Admin();
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password);
                Statement stmt = con.createStatement();) {
            String SQL = "SELECT rolefpt FROM loginfpt where accountfpt='" + user + "' and passwordfpt='" + pass + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                v.setRole(rs.getString("rolefpt"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return v.getRole();
    }

    public ArrayList<Sinhvien> ghidata(String masv) throws Exception {
        ArrayList<Sinhvien> listsv = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            String SQL = "Select hoten,qlsv.masv,English,Tinhoc,gdtc from QLDiem full join qlsv on qlsv.masv=qldiem.masv where qlsv.masv='" + masv + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Sinhvien sv = new Sinhvien();
                sv.setName(rs.getString("hoten"));
                sv.setMasv(rs.getString("MAsv"));
                listsv.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return listsv;
    }

    public void displaydata(QlDAO listsv) throws Exception {
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            Statement s = con.createStatement();
            for (Student x : listsv.xuatdsdiem()) {
                String filesql = "Insert into QLDiem values ('" + x.getId() + "','"
                        + x.getMasv() + "','" + x.getMarkE() + "','"
                        + x.getMarkT() + "','" + x.getMarkP() + "')";
                s.addBatch(filesql);
            }
            con.commit();
            s.executeBatch();
            s.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public ArrayList<Student> hienthidulieu() throws Exception {
        ArrayList<Student> listdiem = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password); Statement stmt = con.createStatement()) {
            String SQL = "Select ID,hoten,qlsv.masv,ENGLISH,TINHOC,GDTC from QLDiem join qlsv on qlsv.masv=qldiem.masv";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Student sv = new Student();
                sv.setName(rs.getString("hoten"));
                sv.setId(Integer.parseInt(rs.getString("ID")));
                sv.setMasv(rs.getString("masv"));
                sv.setMarkE(Float.parseFloat(rs.getString("ENGLISH")));
                sv.setMarkT(Float.parseFloat(rs.getString("TINHOC")));
                sv.setMarkP(Float.parseFloat(rs.getString("GDTC")));
                listdiem.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return listdiem;
    }

    public void deletediem(String ma) throws Exception {
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            Statement ps = con.createStatement();
            ps.executeUpdate("DELETE from QLDiem where masv='" + ma + "'");
            con.commit();
            con.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void updatediem(QlDAO lst, int row) throws Exception {
        try (Connection con = DriverManager.getConnection(connectionUrl, account, password)) {
            String SQL = "update qldiem set masv=?,English=?,TINHOC =?,GDTC=? where ID=?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, lst.xuatdsdiem().get(row).getMasv());
            ps.setString(2, lst.xuatdsdiem().get(row).getMarkE() + "");
            ps.setString(3, lst.xuatdsdiem().get(row).getMarkT() + "");
            ps.setString(4, lst.xuatdsdiem().get(row).getMarkP() + "");
            ps.setString(5, lst.xuatdsdiem().get(row).getId() + "");
            ps.executeUpdate();
            con.commit();
            con.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
