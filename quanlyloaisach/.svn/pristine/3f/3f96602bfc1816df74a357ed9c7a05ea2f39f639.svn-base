/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyloaisach;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DSSACH {
     ArrayList<SACH> list;

    public ArrayList<SACH> getDanhsach() {
        return list;
}
    public void setDanhsach(ArrayList<SACH> danhsach) {
        this.list = danhsach;
    }

    public DSSACH() {
        list=new ArrayList<SACH>();
}
    public void Them(SACH s){
        list.add(s);
    }
     public void Sua(SACH s) {
        for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getMasach().equalsIgnoreCase(s.getMasach()))
                    list.set(i,s);
        }
}
    public void Xoa(String Masach)
    {
        for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getMasach().equalsIgnoreCase(Masach))
                    list.remove(i);
        }
}
    public SACH timSachtheoMAsach(String Masach){
       SACH s=list.get(0);
        for (SACH sach : list) {
             if(sach.getMasach().equalsIgnoreCase(Masach))
                 return sach;
}
         return null;
    }
    public  double tinhTongtiensach()
    {
        double tong=0;
       for (SACH sach : list) {
             tong +=sach.tinhthanhtien();
        }
        return  tong;
    }
}