package librarymanagementsystem.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import librarymanagementsystem.DTO.*;
import librarymanagementsystem.Toolkit.*;

public class QLLoaiSachDAO {
    DBConnection DBSach;
    
    public ArrayList<QLLoaiSachDTO> readDB(){
        DBSach = new DBConnection();
        ArrayList<QLLoaiSachDTO> arrSach = new ArrayList<>();
        
        try{
            String query = "SELECT * FROM library.loaisach";
            ResultSet rs = DBSach.SQLQuery(query);
            if (rs != null){
                while (rs.next()){
                    String maSach = rs.getString("maSach");
                    String tenSach = rs.getString("tenSach");
                    String tenTacGia = rs.getString("tenTacGia");
                    String tenNXB = rs.getString("tenNXB");
                    String theLoai = rs.getString("theLoai");
                    String ngonNgu = rs.getString("ngonNgu");
                    String tomTatNoiDung = rs.getString("tomTatNoiDung");
                    int namXB = rs.getInt("namXB");
                    int giaTien = rs.getInt("giaTien");
                    int soTrang = rs.getInt("soTrang");
                    String hinh = rs.getString("hinhSach");
                    arrSach.add(new QLLoaiSachDTO(maSach, tenSach, tenTacGia, tenNXB, theLoai, ngonNgu, tomTatNoiDung, namXB, giaTien, soTrang, hinh));
                }
            }

        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi!!! Lỗi đọc dữ liệu bảng Sách");
        } 
        finally{
            DBSach.closeConnection();
        }
        return arrSach;
    }
    
    public Boolean add(QLLoaiSachDTO sach){
        DBSach = new DBConnection();
        Boolean check = DBSach.SQLUpdate("INSERT INTO library.loaisach(maSach, tenSach, tenTacGia, tenNXB, namXB, theLoai, ngonNgu, tomTatNoiDung, giaTien, soTrang, hinhSach) "
                + "VALUES ('"
                + sach.getMaSach() + "', N'"
                + sach.getTenSach() + "', N'"
                + sach.getTenTacGia() + "',N'"
                + sach.getTenNXB() + "',"
                + sach.getNamXB() + ",N'"
                + sach.getTheLoai() + "',N'"
                + sach.getNgonNgu() + "',N'"
                + sach.getTomTatNoiDung() + "',"   
                + sach.getGiaTien() + ","   
                + sach.getSoTrang() + ",'"
                + sach.getHinh() + "');");
        DBSach.closeConnection();
        return check;
    }
    
    public Boolean del(String maSach){
        DBSach = new DBConnection();
        Boolean check = DBSach.SQLUpdate("DELETE FROM library.loaisach WHERE loaisach.maSach = '" + maSach + "'");
        DBSach.closeConnection();
        return check;
    }
    
    public Boolean mod(QLLoaiSachDTO sach){
        DBSach = new DBConnection();
        Boolean check = DBSach.SQLUpdate("Update library.loaisach Set "
                + " tenSach=N'" + sach.getTenSach()
                + "', tenTacGia=N'" + sach.getTenTacGia()
                + "', tenNXB=N'" + sach.getTenNXB()
                + "', namXB=" + sach.getNamXB()
                + ", theLoai=N'" + sach.getTheLoai()
                + "', ngonNgu=N'" + sach.getNgonNgu()
                + "', tomTatNoiDung=N'" + sach.getTomTatNoiDung()
                + "', giaTien=" + sach.getGiaTien()
                + ", soTrang=" + sach.getSoTrang()
                + ", hinhSach=N'" + sach.getHinh()
                + "' where maSach='" + sach.getMaSach() + "'");
        DBSach.closeConnection();
        return check;
    }
    
    // Testing
    public static void main(String[] args){
        QLLoaiSachDTO loaisach = new QLLoaiSachDTO("S000028", "1231234", "213213", "213213", "123213213", "234234", "3241", 2123, 32423432, 123213213, "C:\\Users\\NTH\\Pictures\\aaasdd.png");
        new QLLoaiSachDAO().add(loaisach);
    }
}
