/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyloaisach;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SACHTHAMKHAO extends SACH {
    private double Thue;

  

    public double getThue() {
        return Thue;
    }

    public void setThue(double Thue) {
        this.Thue = Thue;
    }
    public SACHTHAMKHAO(){
        
    }

    public SACHTHAMKHAO(double Thue, String Masach, String Nhaxuatban, Date Ngaynhap, double  Dongia, double  Soluong) {
        super(Masach, Nhaxuatban, Ngaynhap, Dongia, Soluong);
        this.Thue = Thue;
    }
    public  void Nhap(){
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap thue");
        this.Thue=sc.nextDouble();
    }
    public void Xuat(){
        super.Xuat();
        System.out.print("thue:"+this.Thue);
        
    }
    @Override
    String ToString() {
        String st="thue"+this.Thue;
        return st;
    }

    @Override
    public double tinhthanhtien() {
        double thanhtien;
        return thanhtien=Soluong*Dongia+Thue-Tiengiam();
    }

    @Override
    public double Tiengiam() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 0;
    }
    
}
