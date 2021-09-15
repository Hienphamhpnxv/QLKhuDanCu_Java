/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enities;

/**
 *
 * @author ADM
 */
public class CuDan {
    
   private int Macudan;
   private String Hovaten;
   private int Tuoi;
   private String Gioitinh;
   private String Nghenghiep;
   private String SoCMT;
   private int Mahodan;

    public int getMacudan() {
        return Macudan;
    }

    public void setMacudan(int Macudan) {
        this.Macudan = Macudan;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    

    public String getNghenghiep() {
        return Nghenghiep;
    }

    public void setNghenghiep(String Nghenghiep) {
        this.Nghenghiep = Nghenghiep;
    }

   

    public int getMahodan() {
        return Mahodan;
    }

    public void setMahodan(int Mahodan) {
        this.Mahodan = Mahodan;
    }
    public CuDan(){}

    public CuDan(int Macudan, String Hovaten, int Tuoi, String Gioitinh, String Nghenghiep, String SoCMT, int Mahodan) {
        this.Macudan = Macudan;
        this.Hovaten = Hovaten;
        this.Tuoi = Tuoi;
        this.Gioitinh = Gioitinh;
        this.Nghenghiep = Nghenghiep;
        this.SoCMT = SoCMT;
        this.Mahodan = Mahodan;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getSoCMT() {
        return SoCMT;
    }

    public void setSoCMT(String SoCMT) {
        this.SoCMT = SoCMT;
    }
    
    public CuDan(int Macudan, int Mahodan) {
        this.Macudan = Macudan;
        this.Mahodan = Mahodan;
    }
    
   
}
