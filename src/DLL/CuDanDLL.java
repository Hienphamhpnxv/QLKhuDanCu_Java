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
public class CuDanDLL {
    private CuDanDLL(){}
    
    public static ArrayList<CuDan> show(){
        ArrayList<CuDan> list = new ArrayList<>();
        try{
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet  r= s.executeQuery("Select * from CUDAN");
            while(r.next())
            {
                CuDan c= new CuDan();
                c.setMacudan(r.getInt("Macudan"));
                c.setHovaten(r.getString("Hovaten"));
                c.setTuoi(r.getInt("Tuoi"));
                c.setGioitinh(r.getString("Gioitinh"));
                c.setNghenghiep(r.getString("Nghenghiep"));
                c.setSoCMT(r.getString("SoCMT"));
                c.setMahodan(r.getInt("Mahodan"));
                
                list.add(c);
            }
                    
        }catch(SQLException ex)
        {
            return null;
        }
        return list;
    }
     public static boolean insert(CuDan c){  
         try {
            PreparedStatement ps = ConnectSQL.connect().prepareStatement
            ("exec ThemThanhVien ?,?,?,?,?,?,?");
             ps.setInt(1,c.getMacudan());
             ps.setString(2, c.getHovaten());
             ps.setInt(3, c.getTuoi());
             ps.setString(4, c.getGioitinh());
             ps.setString(5, c.getNghenghiep());
             ps.setString(6, c.getSoCMT());
             ps.setInt(7, c.getMahodan());     
             ps.executeUpdate();
              
              return true;
              
        } catch (SQLException e) {
            return false;
        }
    }
     public static boolean update(int Macudan,String Hovaten,int Tuoi,String Gioitinh,String Nghenghiep,String SoCMT,int Mahodan){
           try {
               
               PreparedStatement pre = ConnectSQL.connect().prepareStatement
                    ("UPDATE CUDAN SET Hovaten=?,Tuoi=?,Gioitinh=?,Nghenghiep=?,SoCMT=?,Mahodan=? WHERE Macudan =?");
                pre.setString(1, Hovaten);
                pre.setInt(2,Tuoi);
                pre.setString(3,Gioitinh);
                pre.setString(4,Nghenghiep);
                pre.setString(5,SoCMT);
                pre.setInt(6,Mahodan);
                pre.setInt(7, Macudan);
           
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
      public static boolean delete(int Macudan){
           try {
               
            PreparedStatement pre = ConnectSQL.connect().prepareStatement
                ("DELETE CUDAN WHERE Macudan = ?");
                pre.setInt(1, Macudan);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }  
       public static ArrayList<CuDan> search(String text) throws SQLException{
        
        Statement s  = ConnectSQL.connect().createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM CUDAN WHERE "
        + "Macudan LIKE '%"+text+"%' OR Hovaten LIKE N'%"+text+"%' OR Tuoi LIKE '%"+text+"%' OR Gioitinh LIKE N'%"+text+"%' OR Nghenghiep LIKE N'%"+text+"%' OR SoCMT LIKE N'%"+text+"%' OR Macudan LIKE '%"+text+"%'");
        ArrayList<CuDan> list = new ArrayList<>();
        while(r.next()){
               CuDan k= new CuDan();
                k.setMacudan(r.getInt("Macudan"));
                k.setHovaten(r.getString("Hovaten"));
                k.setTuoi(r.getInt("Tuoi"));
                k.setGioitinh(r.getString("Gioitinh"));
                k.setNghenghiep(r.getString("Nghenghiep"));
                k.setSoCMT(r.getString("SoCMT"));
                k.setMahodan(r.getInt("Mahodan"));
                list.add(k);
        }
        return list;
}
}
