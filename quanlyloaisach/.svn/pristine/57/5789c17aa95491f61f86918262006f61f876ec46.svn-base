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
public class SACHGIAOKHOA extends SACH{
    private String Tinhtrang;

    

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }


  
    public SACHGIAOKHOA(){
        
    }

    public SACHGIAOKHOA(String Tinhtrangmoi, String Masach, String Nhaxuatban, Date Ngaynhap, double  Dongia,double  Soluong) {
        super(Masach, Nhaxuatban, Ngaynhap, Dongia, Soluong);
        this.Tinhtrang = Tinhtrang;
       
    }
    public void Nhap(){
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap tinh trang");
        this.Tinhtrang=sc.nextLine();
    }
    public void Xuat(){
        super.Xuat();
        System.out.print("Tinh Trang"+this.Tinhtrang);
    }
    @Override
   public double Tiengiam(){
       if (Tinhtrang=="moi") {
           return Soluong*Dongia*0.1;
       } 
           return Soluong*Dongia*0.5;
       
   
   }
     @Override
    String ToString() {
        String str="Tinh trang"+this.Tinhtrang;
        return str;
    }

    @Override
    public double tinhthanhtien() {
     double thanhtien;
     return thanhtien=Soluong*Dongia-Tiengiam();
           
       }
    }
    

