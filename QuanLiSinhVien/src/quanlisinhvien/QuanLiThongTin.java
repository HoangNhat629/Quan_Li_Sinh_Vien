/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

/**
 *
 * @author admin
 */

//Interface
interface QuanLiThongTin {
     //Ham Them sv
     void themSV(StudentInf sv);
     
     //Ham Hien Thi danh sach sinh vien
     void hienThiDanhSach();
     
     //Ham tinh hoc phi theo tin chi
     double HocPhiTinChi(int tinchi);
     
     //Ham tinh hoc phi theo chuong trinh mau
     double HocPhiChuongTrinhMau(int hocphan);
     
     //Ham tim kiem thong tin
     void timKiem(String a,String b,int c); 
}
