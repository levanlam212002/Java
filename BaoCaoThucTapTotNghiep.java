
import java.io.IOException;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class BaoCaoThucTapTotNghiep extends BaoCao{
    private String danhGiaCuaDoanhNghiep;

    
    public BaoCaoThucTapTotNghiep(String tenBC, String linkBC,String ngayBC,String tenGV,double diem,String danhGia) throws IOException{
        super.BaoCao(tenBC,linkBC,ngayBC,tenGV,diem);
        this.danhGiaCuaDoanhNghiep = danhGia;
    }
    
     public void hienThi(){
         super.hienThi();
         System.out.printf("Danh gia cua doanh nghiep: %s\n", this.danhGiaCuaDoanhNghiep);
         System.out.println("=========================================================");
     }
    
    /**
     * @return the danhGiaCuaDoanhNghiep
     */
    public String getDanhGiaCuaDoanhNghiep() {
        return danhGiaCuaDoanhNghiep;
    }

    /**
     * @param danhGiaCuaDoanhNghiep the danhGiaCuaDoanhNghiep to set
     */
    public void setDanhGiaCuaDoanhNghiep(String danhGiaCuaDoanhNghiep) {
        this.danhGiaCuaDoanhNghiep = danhGiaCuaDoanhNghiep;
    }
    
}
