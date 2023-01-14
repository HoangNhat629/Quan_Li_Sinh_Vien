/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentInf  {
     // Thuoc tinh
    private String NamHoc;
    private String ten;
    private String MSSV;
    private int tinChi;
    private int soHocPhan;
    private String HinhThucDangKi;

    // Phuong thuc
    //CONSTRUCTOR
    public StudentInf() {
        System.out.println("Khong co thong tin");
    }

    // OVERLOADING CONSTRUCTOR
    public StudentInf(String ten, String MSSV, int tinChi, int soHocPhan, String NamHoc,String HinhThucDangKi) {
        this.ten = ten;
        this.MSSV = MSSV;
        this.tinChi = tinChi;
        this.soHocPhan=soHocPhan;
        this.NamHoc = NamHoc;
        this.HinhThucDangKi=HinhThucDangKi;
    }

    // Ham nhap vao thong tin sinh vien
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ten: ");
        sc.next();
        ten = sc.nextLine();
        System.out.print("\tNhap MSSV: ");
        MSSV = sc.nextLine();
        System.out.println("\tNhap Hinh Thuc Dang Ki");
        HinhThucDangKi = sc.nextLine();
        System.out.println("\tNhap Tin Chi:");
        tinChi = sc.nextInt();
        System.out.println("\tNhap so hoc phan:");
        soHocPhan = sc.nextInt();
        System.out.println("\tNhap Nam Hoc");
        sc.nextLine();
        NamHoc = sc.nextLine();
    }

    // Ham hien thi thong tin sinh vien
    public void hienThiThongTin() {
        System.out.println("\tTen: " + ten);
        System.out.println("\tMSSV: " + MSSV);
        System.out.println("\tTin Chi: "+tinChi);
        System.out.println("\tSo Hoc Phan: "+soHocPhan);
        System.out.println("\tNam Hoc: "+NamHoc);
        System.out.println("\tHinh Thuc Dang Ki: "+ HinhThucDangKi);
    }

    // Ham lay thong tin diem trung binh
    public String getMSSV() {
        return MSSV;
    }

    // Ham lay thong tin ten sinh vien
    public String getTen() {
        return ten;
    }
    //Ham lay thong tin Nam hoc
    public String getNamHoc(){
        return NamHoc;
    }
    
    //Ham lay thong tin tin chi
    public int getTinChi(){
        return tinChi;
    }
    
    //Ham lay thong tin so hoc phan
    public int getSoHocPhan(){
        return soHocPhan;
    }
     //Ham lay thong tin hinh thuc dang ki
    public String getHinhThucDangKi(){
        return HinhThucDangKi;
    }
}
