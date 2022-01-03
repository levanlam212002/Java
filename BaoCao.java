
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public abstract class BaoCao{
    protected static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    protected int maBC;
    protected String tenBaoCao;
    protected String linkBaoCao;
    protected Date ngayBaoCao;
    protected List<SinhVien> danhSachSV;
    protected String tenGVHD;
    protected double diemBaoCao;


    public void BaoCao(String tenBC, String linkBC,Date ngayBC,String tenGV,double diem) throws FileNotFoundException, IOException{
        this.maBC = ++dem;
        this.tenBaoCao = tenBC;
        this.linkBaoCao = linkBC;
        this.ngayBaoCao = ngayBC;
        this.tenGVHD = tenGV;
        this.diemBaoCao = diem;
        this.danhSachSV = new ArrayList<>();
    }
    public void BaoCao(String tenBC, String linkBC,String ngayBC,String tenGV,double diem) throws FileNotFoundException, IOException, ParseException {
        this.ngayBaoCao = F.parse(ngayBC);
        this.maBC = ++dem;
        this.tenBaoCao = tenBC;
        this.linkBaoCao = linkBC;
        this.tenGVHD = tenGV;
        this.diemBaoCao = diem;
        this.danhSachSV = new ArrayList<>();
    }

    public void themSV(SinhVien sv){
        this.danhSachSV.add(sv);
    }

    public void hienThi(){
        System.out.printf("Ma bao cao: %03d\n", this.maBC);
        System.out.printf("Ten bao cao: %s\n", this.tenBaoCao);
        System.out.printf("Link bao cao: %s\n", this.linkBaoCao);
        System.out.printf("Ngay bao cao: %s\n", F.format(this.ngayBaoCao));
        System.out.printf("Ten giang vien huong dan: %s\n", this.tenGVHD);
        System.out.printf("Diem bao : %s\n", this.diemBaoCao);
        this.danhSachSV.forEach(sv -> sv.hienThi());
    }
    /**
     * @return the maBC
     */
    public int getMaBC() {
        return maBC;
    }

    /**
     * @param maBC the maBC to set
     */
    public void setMaBC(int maBC) {
        this.maBC = maBC;
    }

    /**
     * @return the tenBaoCao
     */
    public String getTenBaoCao() {
        return tenBaoCao;
    }

    /**
     * @param tenBaoCao the tenBaoCao to set
     */
    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    /**
     * @return the linkBaoCao
     */
    public String getLinkBaoCao() {
        return linkBaoCao;
    }

    /**
     * @param linkBaoCao the linkBaoCao to set
     */
    public void setLinkBaoCao(String linkBaoCao) {
        this.linkBaoCao = linkBaoCao;
    }

    /**
     * @return the tenGVHD
     */
    public String getTenGVHD() {
        return tenGVHD;
    }

    /**
     * @param tenGVHD the tenGVHD to set
     */
    public void setTenGVHD(String tenGVHD) {
        this.tenGVHD = tenGVHD;
    }

    /**
     * @return the diemBaoCao
     */
    public double getDiemBaoCao() {
        return diemBaoCao;
    }

    /**
     * @param diemBaoCao the diemBaoCao to set
     */
    public void setDiemBaoCao(double diemBaoCao) {
        this.diemBaoCao = diemBaoCao;
    }

    /**
     * @return the ngayBaoCao
     */
    public Date getNgayBaoCao() {
        return ngayBaoCao;
    }

    /**
     * @param ngayBaoCao the ngayBaoCao to set
     */
    public void setNgayBaoCao(Date ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    /**
     * @param danhSachSV the danhSachSV to set
     */
    public void setDanhSachSV(List<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }

}

