/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import Enities.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author ADM
 */
public class TaiKhoanDAO {
    public TaiKhoanDAO(){}

  public static  Connection conn = ConnectSQL.connect();
     public static ArrayList<TaiKhoan> show(){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT Tentaikhoan,Matkhau FROM TAIKHOAN ");
       
            while (r.next()){
                list.add(new TaiKhoan(r.getString("Tentaikhoan"), r.getString("Matkhau")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
     public static TaiKhoan dangNhap(String userName,String passWord) {
	
		TaiKhoan tk=null;
		try {
                    String sql="select * from TAIKHOAN where Tentaikhoan=? and Matkhau=?";			
                    PreparedStatement pre;
                    pre = conn.prepareStatement(sql);
                    pre.setString(1,userName);
                    pre.setString(2, passWord);
                    ResultSet result=pre.executeQuery();
                    if (result.next()) {
                            tk=new TaiKhoan();
                            tk.setTenTaiKhoan(result.getString("TenTaiKhoan"));
                            tk.setMatKhau(result.getString("MatKhau"));
                    }
                          
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return tk;
	}

   
     
}


