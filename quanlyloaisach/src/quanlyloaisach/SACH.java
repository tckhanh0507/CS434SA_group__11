/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyloaisach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
abstract class SACH implements ISACH{
    protected String Masach;
    protected String Nhaxuatban;
    protected Date Ngaynhap;
    protected double  Dongia;
    protected double  Soluong;

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public String getNhaxuatban() {
        return Nhaxuatban;
    }

    public void setNhaxuatban(String Nhaxuatban) {
        this.Nhaxuatban = Nhaxuatban;
    }

    public Date getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(Date Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public double  getDongia() {
        return Dongia;
    }

    public void setDongia(double  Dongia) {
        this.Dongia = Dongia;
    }

    public double  getSoluong() {
        return Soluong;
    }

    public void setSoluong(double  Soluong) {
        this.Soluong = Soluong;
    }
     public SACH(){
         
     }

    public SACH(String Masach, String Nhaxuatban, Date Ngaynhap, double  Dongia, double  Soluong) {
        this.Masach = Masach;
        this.Nhaxuatban = Nhaxuatban;
        this.Ngaynhap = Ngaynhap;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
    }
     public void Nhap(){
         try {
             Scanner sc=new Scanner(System.in);
         System.out.println("nhap Ma Sach");
         this.Masach=sc.nextLine();
         System.out.println("nhap Nha Xuat Ban");
         this.Nhaxuatban=sc.nextLine();
         SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
         System.out.println("nhap Ngay Nhap");
         this.Ngaynhap=d.parse(sc.nextLine());
         System.out.println("nhap Don gia");
         this.Dongia=Double.parseDouble(sc.nextLine());
         System.out.println("nhap So luong");
         this.Soluong=Double.parseDouble(sc.nextLine());
         } catch (Exception e) {
         }
     }
     public void Xuat(){
         System.out.println("Ma Sach:"+this.Masach);
         System.out.println("Nha Xuat Ban:"+this.Nhaxuatban);
         System.out.println("Ngay Nhap"+this.Ngaynhap);
         System.out.println("Don Gia"+this.Dongia);
         System.out.println(" So luong"+this.Soluong);
     }
     abstract String ToString();

    public abstract double Tiengiam();
     @Override
    public abstract  double tinhthanhtien() ;
    }
