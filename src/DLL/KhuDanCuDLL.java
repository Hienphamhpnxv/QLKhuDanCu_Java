/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import Enities.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ADM
 */
public class KhuDanCuDLL {
    private KhuDanCuDLL(){}
    
     public static ArrayList<KhuDanCu> show(){
        
        ArrayList<KhuDanCu> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT * FROM KHUDANCU");
        
            while (r.next()){
                 KhuDanCu k= new KhuDanCu();
                k.setMakhu(r.getInt("Makhu"));
                k.setTenkhu(r.getString("Tenkhu"));
                k.setDiachi(r.getString("Diachi"));
                k.setSohodan(r.getInt("Sohodan"));
                list.add(k);
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
      /* Collections.sort(list,(x,y)->{
            return x.getMakhu().compareTo(y.getMaKhu());
        });*/
        
        return list;
    }
     public static boolean insert(KhuDanCu k){  
         try {
            PreparedStatement ps = ConnectSQL.connect().prepareStatement
            ("insert into KHUDANCU(Makhu,Tenkhu,Diachi,Sohodan) VALUES(?,?,?,?)");
             ps.setInt(1, k.getMakhu());
             ps.setString(2,k.getTenkhu());
             ps.setString(3,k.getDiachi());
             ps.setInt(4, k.getSohodan());
             ps.executeUpdate();
              
              return true;
              
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static boolean update(int maKhu,String tenKhu,String diaChi,int soho){
           try {
               
               PreparedStatement pre = ConnectSQL.connect().prepareStatement
                    ("UPDATE KHUDANCU SET Tenkhu = ?,Diachi = ? ,Sohodan = ? WHERE Makhu = ?");
                pre.setString(1, tenKhu);
                pre.setString(2, diaChi);
                pre.setInt(3,soho);
                pre.setInt(4, maKhu);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
    public static boolean delete(int maKhu){
           try {
               
            PreparedStatement pre = ConnectSQL.connect().prepareStatement
                ("DELETE KHUDANCU WHERE Makhu = ?");
                pre.setInt(1, maKhu);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }   
    
    public static ArrayList<KhuDanCu> search(String text) throws SQLException{
        
        Statement s  = ConnectSQL.connect().createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM KHUDANCU WHERE "
        + "Makhu LIKE '%"+text+"%' OR Tenkhu LIKE N'%"+text+"%' OR Diachi LIKE N'%"+text+"%' OR Sohodan LIKE '%"+text+"%'");
        ArrayList<KhuDanCu> list = new ArrayList<>();
        while(r.next()){
               KhuDanCu k= new KhuDanCu();
                k.setMakhu(r.getInt("Makhu"));
                k.setTenkhu(r.getString("Tenkhu"));
                k.setDiachi(r.getString("Diachi"));
                k.setSohodan(r.getInt("Sohodan"));
                list.add(k);
        }
        return list;
    }
    
    
}
