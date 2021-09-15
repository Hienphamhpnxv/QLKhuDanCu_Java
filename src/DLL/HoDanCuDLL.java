
package DLL;
import Enities.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class HoDanCuDLL {
    private HoDanCuDLL(){}
    public static ArrayList<HoDan> show(){
        
        ArrayList<HoDan> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT * FROM HODAN");
        
            while (r.next()){
                 HoDan k= new HoDan();
                k.setMahodan(r.getInt("Mahodan"));
                k.setDiachi(r.getString("Diachi"));
                k.setDientich(r.getFloat("Dientich"));
                k.setSotv(r.getInt("Sotv"));
                k.setMakhu(r.getInt("Makhu"));
                list.add(k);
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        return list;
      }
   
     public static boolean insert(HoDan h){  
         try {
            PreparedStatement ps = ConnectSQL.connect().prepareStatement
            ("exec ThemHo ?,?,?,?,?");
             ps.setInt(1, h.getMahodan());
             ps.setString(2,h.getDiachi());
             ps.setFloat(3,h.getDientich());
             ps.setInt(4, h.getSotv());
             ps.setInt(5,h.getMakhu());
             ps.executeUpdate();
              
              return true;
              
        } catch (SQLException e) {
            return false;
        }
    }
      public static boolean update(int Mahodan,String Diachi,float Dientich,int Sotv,int Makhu){
           try {
               
               PreparedStatement pre = ConnectSQL.connect().prepareStatement
                    ("UPDATE HODAN SET Diachi = ? ,Dientich = ? ,Sotv = ?, Makhu = ? WHERE Mahodan= ?");
                pre.setString(1, Diachi);
                pre.setFloat(2, Dientich);
                pre.setInt(3,Sotv);
                pre.setInt(4, Makhu);
                pre.setInt(5, Mahodan);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
     
        

       public static boolean delete(int Mahodan){
           try {
               
            PreparedStatement pre = ConnectSQL.connect().prepareStatement
                ("DELETE HODAN WHERE Mahodan = ?");
                pre.setInt(1, Mahodan);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }   
       public static ArrayList<HoDan> search(String text) throws SQLException{
        
        Statement s  = ConnectSQL.connect().createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM HODAN WHERE "
        + "Mahodan LIKE '%"+text+"%' OR Diachi LIKE N'%"+text+"%' OR Dientich LIKE '%"+text+"%' OR Sotv LIKE '%"+text+"%' OR Makhu LIKE '%"+text+"%'");
        ArrayList<HoDan> list = new ArrayList<>();
        while(r.next()){
               HoDan k= new HoDan();
                k.setMahodan(r.getInt("Mahodan"));
                k.setDiachi(r.getString("Diachi"));
                k.setDientich(r.getFloat("Dientich"));
                k.setSotv(r.getInt("Sotv"));
                k.setMakhu(r.getInt("Makhu"));
                list.add(k);
        }
        return list;
    }
        
}
