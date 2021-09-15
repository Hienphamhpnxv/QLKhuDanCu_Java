
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

public class HoDanCuBLL {
    private HoDanCuBLL(){}
    
     public static boolean checkEmpty(){
        return HoDanCuDLL.show().isEmpty();
        
    }
      public static TableModel show(){
        ArrayList<HoDan> list = HoDanCuDLL.show();
        
        String[] columnNames = {"STT","Mã ho dan","Dia chi","Dien tich","So thanh vien","Ma khu"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i = 0;
        
        for(HoDan ho : list){
            data[i][0] = i + 1;
            data[i][1] = ho.getMahodan();
            data[i][2] = ho.getDiachi();
            data[i][3] = ho.getDientich();
            data[i][4] = ho.getSotv();
            data[i][5] = ho.getMakhu();
            i++;
        }
        
        return  new DefaultTableModel(data,columnNames);
    }
       public static ComboBoxModel cbb_show(){  
        StringBuilder items = new StringBuilder();
        for(int i = 0;i<KhuDanCuDLL.show().size();i++){  
            items.append(KhuDanCuDLL.show().get(i).getMakhu());
            items.append("");
        }
        
        return new DefaultComboBoxModel(items.toString().split(""));
}
       public static TableModel showControlWithCombobox(int cbValue){
        ArrayList<HoDan> list =HoDanCuDLL.show();
         String[] columnNames = {"STT","Mã hộ dân","Địa chỉ","Diện tích","Số thành viên","Mã khu"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i =0;
        
        for(HoDan ho : list){
            if(cbValue == ho.getMakhu()){     
            data[i][0] = i + 1;
            data[i][1] = ho.getMahodan();
            data[i][2] = ho.getDiachi();
            data[i][3] = ho.getDientich();
            data[i][4] = ho.getSotv();
            data[i][5] = ho.getMakhu();
            i++;
            }
        }
       // TableModel
        return new DefaultTableModel(data, columnNames);
    }
        public static boolean insert(int Mahodan,String Diachi,float Dientich,int Sotv,int Makhu){
        return HoDanCuDLL.insert(new HoDan(Mahodan,Diachi,Dientich,Sotv,Makhu)) ;
	}
        public static boolean update(int Mahodan,String Diachi,float Dientich,int Sotv,int Makhu){
        return HoDanCuDLL.update(Mahodan,Diachi,Dientich,Sotv,Makhu);
    }
    
     public static boolean delete(int maHodan){
        return HoDanCuDLL.delete(maHodan);
    }   
     public static boolean checkNotDuplicateAreaName(String Diachi){
        ArrayList<HoDan> list = HoDanCuDLL.show();
        if(list.isEmpty()) return false;
        for(HoDan ho : list){
            if(Diachi.trim().equalsIgnoreCase(ho.getDiachi().trim()))
            {
                return true;
            }
        }
        return false;  
    }
  
      public static TableModel search(String text) throws SQLException{
        
        ArrayList<HoDan> list = HoDanCuDLL.search(text);
        
        String[] columnNames = {"STT","Mã ho dan","Dia chi","Dien tich","So thanh vien","Ma khu"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i =0;
        
        for(HoDan ho : list){
            data[i][0] = i + 1;
            data[i][1] = ho.getMahodan();
            data[i][2] = ho.getDiachi();
            data[i][3] = ho.getDientich();
            data[i][4] = ho.getSotv();
            data[i][5] = ho.getMakhu();
            i++;
        }
       // TableModel
        return new DefaultTableModel(data, columnNames);
}
}
