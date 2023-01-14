/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.List;

/**
 *
 * @author admin
 */
public class ThongKe extends ThongTinThongKe{
    // Phuong thuc
    //CONSTRUCTOR
    public ThongKe(){}
    //Overloading
    public ThongKe(String Nam, List<StudentInf> dssv){
        QuanLi quanli = new QuanLi();
        for (StudentInf sv:dssv){
            
            if(Nam.equals(sv.getNamHoc())){
                count++;
                if(sv.getHinhThucDangKi().equals("Tín Chỉ")){
                    hocphi = hocphi+ quanli.HocPhiTinChi(sv.getTinChi());
                    hocphiTinChi = hocphiTinChi+quanli.HocPhiTinChi(sv.getTinChi());
                    countTinChi++;
                }else if(sv.getHinhThucDangKi().equals("Chương Trình Mẫu")){
                    hocphi = hocphi + quanli.HocPhiChuongTrinhMau(sv.getSoHocPhan());
                    hocphiChuongTrinh = hocphiChuongTrinh +quanli.HocPhiChuongTrinhMau(sv.getSoHocPhan());
                    countChuongTrinh++;
                }
            }
        }
     }
    
    //Ham lay so luong sinh vien
    public int getCount(){
        return count;
    }
    
    //Ham lay tong hoc phi
    public double getHocPhi(){
        return hocphi;
    }
    
    //Ham lay so luong sinh vien hoc theo tin chi
    public int getCountTinChi(){
        return countTinChi;
    }
    
    //Ham lay so luong sinh vien hoc theo chuong  trinh hoc
    public int getCountChuongTrinh(){
        return countChuongTrinh;
    }
    
    //Ham lay hoc phis tinhs theo tin chi
    public double getHocPhiTinChi(){
        return hocphiTinChi;
    }
    
    //Ham lay hoc phi tinh theo chuong trinh hoc
    public double getHocPhiChuongTrinh(){
        return hocphiChuongTrinh;
    }
    
    //Ham Show err
    @Override
    public void showError(){
        System.out.println("Gap loi trong qua trinh thong ke");
    }
}
