
package Enities;


public class HoDan {
    private int Mahodan;
    private String Diachi;
    private float Dientich;
    private int Sotv;
    private int Makhu;

    public int getMahodan() {
        return Mahodan;
    }

    public void setMahodan(int Mahodan) {
        this.Mahodan = Mahodan;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public float getDientich() {
        return Dientich;
    }

    public void setDientich(float Dientich) {
        this.Dientich = Dientich;
    }

    public int getSotv() {
        return Sotv;
    }

    public void setSotv(int Sotv) {
        this.Sotv = Sotv;
    }

    public int getMakhu() {
        return Makhu;
    }

    public void setMakhu(int Makhu) {
        this.Makhu = Makhu;
    }
    public HoDan(){}

    public HoDan(int Mahodan, String Diachi, float Dientich, int Sotv, int Makhu) {
        this.Mahodan = Mahodan;
        this.Diachi = Diachi;
        this.Dientich = Dientich;
        this.Sotv = Sotv;
        this.Makhu = Makhu;
    }
    
    
    
}
