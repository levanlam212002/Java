/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class TVHoiDongBVKL {
    private String hoTen,hocHam,hocVi,nhiemVu,nhanXet;
    private double diem;

    TVHoiDongBVKL(String hoTen,String hocHam,String hocVi,String nhiemVu,double diem,String nhanXet){
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
        this.diem = diem;
        this.nhanXet = nhanXet;
    }
    public void hienThi(){
         System.out.printf("Ten thanh vien hoi dong: %s\n", this.hoTen);
         System.out.printf("Hoc ham: %s\n", this.hocHam);
         System.out.printf("Hoc vi: %s\n", this.hocVi);
         System.out.printf("Nhiem vu: %s\n", this.nhiemVu);
         System.out.printf("Nhan xet: %s\n", this.nhanXet);
         System.out.printf("Diem cham: %s\n", this.diem);
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
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the nhiemVu
     */
    public String getNhiemVu() {
        return nhiemVu;
    }

    /**
     * @param nhiemVu the nhiemVu to set
     */
    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    /**
     * @return the nhanXet
     */
    public String getNhanXet() {
        return nhanXet;
    }

    /**
     * @param nhanXet the nhanXet to set
     */
    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }
    
}
