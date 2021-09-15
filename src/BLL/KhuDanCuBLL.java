
package BLL;
import DLL.*;
import Enities.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class KhuDanCuBLL {
    private KhuDanCuBLL(){}
    
     public static boolean checkEmpty(){
        return KhuDanCuDLL.show().isEmpty();
    }
      public static TableModel show(){
        ArrayList<KhuDanCu> list = KhuDanCuDLL.show();
        
        String[] columnNames = {"STT","Mã Khu","Ten Khu","Dia chi","So Ho"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i = 0;
        
        for(KhuDanCu khu : list){
            data[i][0] = i + 1;
            data[i][1] = khu.getMakhu();
            data[i][2] = khu.getTenkhu();
            data[i][3] = khu.getDiachi();
            data[i][4] = khu.getSohodan();
            i++;
        }
        
        return  new DefaultTableModel(data,columnNames);
    }
    /*  public static Object[] showControlWithCombobox(String cbbValue){
        ArrayList<KhuDanCu> list = KhuDanCuDLL.show();
        Object[] obj = new Object[3];
        for(KhuDanCu k :list){
            if(cbbValue.equals(k.getMakhu())){
                  obj[0]  = k.getTenkhu();
                  obj[1]  = k.getDiachi();
                  obj[2]  = k.getSohodan();
          
            }
        }
        return obj;
    }
      
     /* public static ComboBoxModel cbb_show(){
        
        StringBuilder items = new StringBuilder();
 
        for(int i = 0;i<KhuDanCuDLL.show().size();i++){
            items.append(KhuDanCuDLL.show().get(i).getMakhu());
            items.append("");
        }
        
        return new DefaultComboBoxModel(items.toString().split(""));
    }*/
     public static boolean insert(int Makhu,String tenKhu,String Diachi,int Soho){

        return KhuDanCuDLL.insert(new KhuDanCu(Makhu,tenKhu,Diachi,Soho)) ;
      
	}



        public static TableModel search(String text) throws SQLException{
        
        ArrayList<KhuDanCu> list = KhuDanCuDLL.search(text);
        
        String[] columnNames = {"STT","Mã Khu","Khu","Địa chỉ","So Ho"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i =0;
        
        for(KhuDanCu khu : list){
            data[i][0] = i + 1;
            data[i][1] = khu.getMakhu();
            data[i][2] = khu.getTenkhu();
            data[i][3] = khu.getDiachi();
            data[i][4] = khu.getSohodan();
            i++;
        }
       // TableModel
        return new DefaultTableModel(data, columnNames);
    }
    
    public static boolean checkNotDuplicateAreaName(String tenKhu){
        ArrayList<KhuDanCu> list = KhuDanCuDLL.show();
        if(list.isEmpty()) return false;
        for(KhuDanCu khu : list){
            if(tenKhu.trim().equalsIgnoreCase(khu.getTenkhu().trim()))
            {
                return true;
            }
        }
        return false;  
    }
    
    public static boolean update(int maKhu,String tenKhu,String diaChi,int Soho){
        return KhuDanCuDLL.update(maKhu, tenKhu, diaChi,Soho);
    }
    
    public static boolean delete(int maKhu){
        return KhuDanCuDLL.delete(maKhu);
    }      
    

}
