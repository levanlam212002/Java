/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SinhVien {
    private int maSo,khoaHoc,namSinh;
    private String hoTen,gioiTinh,chuyenNganh;

    SinhVien(int maSo, String hoTen, int khoaHoc, String gioiTinh, int namSinh,String chuyenNganh){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.khoaHoc = khoaHoc;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
    }
    
    public void hienThi(){
        System.out.printf("Ma sinh vien: %s\n", this.getMaSo());
        System.out.printf("Ten sinh vien: %s\n", this.hoTen);
        System.out.printf("Khoa hoc: %s\n", this.khoaHoc);
        System.out.printf("Nam sinh: %s\n", this.namSinh);
        System.out.printf("Gioi tinh: %s\n", this.gioiTinh);
        System.out.printf("Chuyen Nganh: %s\n", this.chuyenNganh);
    } 
    
    /**
     * @return the khoaHoc
     */
    public int getKhoaHoc() {
        return khoaHoc;
    }

    /**
     * @param khoaHoc the khoaHoc to set
     */
    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    /**
     * @return the namSinh
     */
    public int getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the chuyenNganh
     */
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    /**
     * @param chuyenNganh the chuyenNganh to set
     */
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    /**
     * @return the maSo
     */
    public int getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
}
