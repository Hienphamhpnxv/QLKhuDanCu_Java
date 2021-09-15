/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class CuDanBLL {
    private CuDanBLL(){}
    
    public static boolean checkEmpty(){
        return CuDanDLL.show().isEmpty();
    }
    public static TableModel show(){
        ArrayList<CuDan> list = CuDanDLL.show();
        
        String[] columnNames = {"STT","Mã cư dân","Họ và tên","Tuổi","Giới tính","Nghề nghiệp","Số CMT","Ma hộ dân"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i = 0;
        
        for(CuDan c : list){
            data[i][0] = i + 1;
            data[i][1] = c.getMacudan();
            data[i][2] = c.getHovaten();
            data[i][3] = c.getTuoi();
            data[i][4] = c.getGioitinh();
            data[i][5] = c.getNghenghiep();
            data[i][6] = c.getSoCMT();
            data[i][7] = c.getMahodan();
            i++;
        }
        
        return  new DefaultTableModel(data,columnNames);
    }
    public static ComboBoxModel cbb_show(){ 
        StringBuilder items = new StringBuilder(); 
        for(int i = 0;i<HoDanCuDLL.show().size();i++){  
            items.append(HoDanCuDLL.show().get(i).getMahodan());
            items.append("");
        }
        return new DefaultComboBoxModel(items.toString().split(""));
}
     public static TableModel showControlWithCombobox(int cbValue){
        ArrayList<CuDan> list =CuDanDLL.show();
         String[] columnNames = {"STT","Mã cư dân","Họ và tên","Tuổi","Giới tính","Nghề nghiệp","Số CMT","Ma hộ dân"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i = 0;
        
        for(CuDan c : list){
            if(cbValue == c.getMahodan())
            {
            data[i][0] = i + 1;
            data[i][1] = c.getMacudan();
            data[i][2] = c.getHovaten();
            data[i][3] = c.getTuoi();
            data[i][4] = c.getGioitinh();
            data[i][5] = c.getNghenghiep();
            data[i][6] = c.getSoCMT();
            data[i][7] = c.getMahodan();
            i++;
            }
        }
        
       // TableModel
        return new DefaultTableModel(data, columnNames);
    }
        public static boolean insert(int Macudan,String Hovaten,int Tuoi,String Gioitinh,String Nghenghiep,String SoCMT,int Mahodan){
        return CuDanDLL.insert(new CuDan(Macudan,Hovaten,Tuoi,Gioitinh,Nghenghiep,SoCMT,Mahodan)) ;
	}
        public static boolean update(int Macudan,String Hovaten,int Tuoi,String Gioitinh,String Nghenghiep,String SoCMT,int Mahodan){
        return CuDanDLL.update(Macudan,Hovaten,Tuoi,Gioitinh,Nghenghiep,SoCMT,Mahodan);
    }
          public static boolean delete(int Macudan){
        return CuDanDLL.delete(Macudan);
    } 
        public static boolean checkNotDuplicateAreaName(String SoCMT){
        ArrayList<CuDan> list = CuDanDLL.show();
        if(list.isEmpty()) return false;
        for(CuDan c : list){
            if(SoCMT.trim().equalsIgnoreCase(c.getSoCMT().trim()))
            {
                return true;
            }
        }
        return false;  
    }
        public static TableModel search(String text) throws SQLException{
        
        ArrayList<CuDan> list = CuDanDLL.search(text);
        
        String[] columnNames = {"STT","Mã cư dân","Họ và tên","Tuổi","Giới tính","Nghề nghiệp","Số CMT","Ma hộ dân"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i =0;
        
        for(CuDan c : list){
            data[i][0] = i + 1;  
            data[i][1] = c.getMacudan();
            data[i][2] = c.getHovaten();
            data[i][3] = c.getTuoi();
            data[i][4] = c.getGioitinh();
            data[i][5] = c.getNghenghiep();
            data[i][6] = c.getSoCMT();
            data[i][7] = c.getMahodan();
            i++;
        }
       // TableModel
        return new DefaultTableModel(data, columnNames);
}
}
