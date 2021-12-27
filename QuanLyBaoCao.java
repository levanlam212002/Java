
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class QuanLyBaoCao {
    private List<BaoCaoThucTapTotNghiep> dsBCTT = new ArrayList<>();
    private List<BaoCaoDoAnNganh> dsBCDA = new ArrayList<>();
    private List<BaoCaoKhoaLuanTotNghiep> dsBCKL = new ArrayList<>();
    
    public void themBaoCaoTT(BaoCaoThucTapTotNghiep bc){
        this.getDsBCTT().add(bc);
    }
    
    public void themBaoCaoDA(BaoCaoDoAnNganh bc){
        this.getDsBCDA().add(bc);
    }
    
    public void themBaoCaoKL(BaoCaoKhoaLuanTotNghiep bc){
        this.getDsBCKL().add(bc);
    }
    
    public void xoaBaoCaoTT(int id){
       
        getDsBCTT().remove(this.getDsBCTT().stream().filter(bc ->bc.maBC == id).findFirst().get());
    }
    
    public void xoaBaoCaoDA(int id){
       
        getDsBCDA().remove(this.getDsBCDA().stream().filter(bc ->bc.maBC == id).findFirst().get());
    }
    
    public void xoaBaoCaoKL(int id){
       
        getDsBCKL().remove(this.getDsBCKL().stream().filter(bc ->bc.maBC == id).findFirst().get());
    }
    
    public void suaBaoCao(int id){
        
    }
    
    public void hienThiTT(){
        this.getDsBCTT().forEach(bc ->bc.hienThi());
     }
    public void hienThiDA(){
        this.getDsBCDA().forEach(bc ->bc.hienThi());
     }
    public void hienThiKL(){
        this.getDsBCKL().forEach(bc ->bc.hienThi());
     }

    /**
     * @return the dsBCTT
     */
    public List<BaoCaoThucTapTotNghiep> getDsBCTT() {
        return dsBCTT;
    }

    /**
     * @param dsBCTT the dsBCTT to set
     */
    public void setDsBCTT(List<BaoCaoThucTapTotNghiep> dsBCTT) {
        this.dsBCTT = dsBCTT;
    }

    /**
     * @return the dsBCDA
     */
    public List<BaoCaoDoAnNganh> getDsBCDA() {
        return dsBCDA;
    }

    /**
     * @param dsBCDA the dsBCDA to set
     */
    public void setDsBCDA(List<BaoCaoDoAnNganh> dsBCDA) {
        this.dsBCDA = dsBCDA;
    }

    /**
     * @return the dsBCKL
     */
    public List<BaoCaoKhoaLuanTotNghiep> getDsBCKL() {
        return dsBCKL;
    }

    /**
     * @param dsBCKL the dsBCKL to set
     */
    public void setDsBCKL(List<BaoCaoKhoaLuanTotNghiep> dsBCKL) {
        this.dsBCKL = dsBCKL;
    }
}
