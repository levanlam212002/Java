
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class BaoCaoKhoaLuanTotNghiep extends BaoCao {
    private double tyLeKiemTraDaoVan;
    private List<TVHoiDongBVKL> ds;

    public BaoCaoKhoaLuanTotNghiep(String tenBC, String linkBC,Date ngayBC,String tenGV,double diem,double tyLe) throws IOException{
        super.BaoCao(tenBC,linkBC,ngayBC,tenGV,diem);
        this.tyLeKiemTraDaoVan = tyLe;
    }
    
    public BaoCaoKhoaLuanTotNghiep(String tenBC, String linkBC,String ngayBC,String tenGV,double diem,double tyLe) throws IOException, FileNotFoundException, ParseException{
        super.BaoCao(tenBC,linkBC,ngayBC,tenGV,diem);
        this.tyLeKiemTraDaoVan = tyLe;
    }

    public void themTVHD(TVHoiDongBVKL tv){
        this.ds.add(tv);
    }

    public void hienThi(){
        super.hienThi();
        System.out.printf("Danh gia cua doanh nghiep: %s\n", this.tyLeKiemTraDaoVan);
        this.ds.forEach(tv -> tv.hienThi());
        System.out.println("=========================================================");
    }

    public void hienThiDiemTungTVHD(){
        this.ds.forEach(tv ->tv.quanLiDiem());
        System.out.println("=========================================================");
    }
    
    /**
     * @return the tyLeKiemTraDaoVan
     */
    public double getTyLeKiemTraDaoVan() {
        return tyLeKiemTraDaoVan;
    }

    /**
     * @param tyLeKiemTraDaoVan the tyLeKiemTraDaoVan to set
     */
    public void setTyLeKiemTraDaoVan(double tyLeKiemTraDaoVan) {
        this.tyLeKiemTraDaoVan = tyLeKiemTraDaoVan;
    }

    /**
     * @return the ds
     */
    public List<TVHoiDongBVKL> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TVHoiDongBVKL> ds) {
        this.ds = ds;
    }

}

