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
public class KhuDanCu {
    private int Makhu;
    private String Tenkhu;
    private String Diachi;
    private int Sohodan;

    public int getMakhu() {
        return Makhu;
    }

    public void setMakhu(int Makhu) {
        this.Makhu = Makhu;
    }

    public String getTenkhu() {
        return Tenkhu;
    }

    public void setTenkhu(String Tenkhu) {
        this.Tenkhu = Tenkhu;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public int getSohodan() {
        return Sohodan;
    }

    public void setSohodan(int Sohodan) {
        this.Sohodan = Sohodan;
    }

    public KhuDanCu() {
    }

    public KhuDanCu(int Makhu, String Tenkhu, String Diachi, int Sohodan) {
        this.Makhu = Makhu;
        this.Tenkhu = Tenkhu;
        this.Diachi = Diachi;
        this.Sohodan = Sohodan;
    }
    
    
    
}
