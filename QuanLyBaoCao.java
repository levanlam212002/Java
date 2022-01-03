

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class QuanLyBaoCao {
    private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    private List<BaoCao> dsBC = new ArrayList<>();
    private List<BaoCaoThucTapTotNghiep> dsBCTT = new ArrayList<>();
    private List<BaoCaoDoAnNganh> dsBCDA = new ArrayList<>();
    private List<BaoCaoKhoaLuanTotNghiep> dsBCKL = new ArrayList<>();
    
    public void themBaoCaoTT(BaoCaoThucTapTotNghiep bc){
        this.getDsBCTT().add(bc);
        this.getDsBC().add(bc);
    }
    
    public void themBaoCaoDA(BaoCaoDoAnNganh bc){
        this.getDsBCDA().add(bc);
        this.getDsBC().add(bc);
    }
    
    public void themBaoCaoKL(BaoCaoKhoaLuanTotNghiep bc){
        this.getDsBCKL().add(bc);
        this.getDsBC().add(bc);
    }
    
    public void xoaBaoCaoTT(int id){
        getDsBCTT().remove(this.getDsBCTT().stream().filter(bc ->bc.maBC == id).findFirst().get());
        getDsBC().remove(this.getDsBC().stream().filter(bc ->bc.maBC == id).findFirst().get());
    }
    
    public void xoaBaoCaoDA(int id){
        getDsBC().remove(this.getDsBC().stream().filter(bc ->bc.maBC == id).findFirst().get());
        getDsBCDA().remove(this.getDsBCDA().stream().filter(bc ->bc.maBC == id).findFirst().get());
    }
    
    public void xoaBaoCaoKL(int id){
        getDsBC().remove(this.getDsBC().stream().filter(bc ->bc.maBC == id).findFirst().get());
        getDsBCKL().remove(this.getDsBCKL().stream().filter(bc ->bc.maBC == id).findFirst().get());
    }
    
    public void hienThi(){
        this.getDsBC().forEach(bc ->bc.hienThi());
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

    public List<BaoCao> timBaoCaoTheoTen(String tenBC){
        try{
            return this.getDsBC().stream().filter(bc -> bc.tenBaoCao == tenBC).collect(Collectors.toList());
        } catch(NoSuchElementException ex){
            return null;
        }
    }
    
    public List<BaoCao> timBaoCaoTheoNgayBC(String ngayBC,String ngayBC2) throws ParseException{
        try{
            Date ngayBaoCao = F.parse(ngayBC);
            Date ngayBaoCao1 = F.parse(ngayBC2);
            return this.getDsBC().stream().filter(bc -> (bc.ngayBaoCao.after(ngayBaoCao)) && (bc.ngayBaoCao.before(ngayBaoCao1))).collect(Collectors.toList());
        } catch(NoSuchElementException ex){
            return null;
        }
    }
    
    public void sxBaoCaoTheoten(){
        this.getDsBC().sort((bc1, bc2)-> bc1.tenBaoCao.compareTo(bc2.tenBaoCao));
    }
    
    public void sxBaoCaoTheoNgayBC(){
        this.getDsBC().sort((bc1, bc2)-> bc1.ngayBaoCao.compareTo(bc2.ngayBaoCao));
    }
    
    public void sxBaoCaoTTTheoten(){
        this.getDsBCTT().sort((bc1, bc2)-> bc1.tenBaoCao.compareTo(bc2.tenBaoCao));
    }
    
    public void sxBaoCaoTTTheoNgayBC(){
        this.getDsBCTT().sort((bc1, bc2)-> bc1.ngayBaoCao.compareTo(bc2.ngayBaoCao));
    }
    
    public void sxBaoCaoDATheoten(){
        this.getDsBCDA().sort((bc1, bc2)-> bc1.tenBaoCao.compareTo(bc2.tenBaoCao));
    }
    
    public void sxBaoCaoDATheoNgayBC(){
        this.getDsBCDA().sort((bc1, bc2)-> bc1.ngayBaoCao.compareTo(bc2.ngayBaoCao));
    }
    
    public void sxBaoCaoKLTheoten(){
        this.getDsBCKL().sort((bc1, bc2)-> bc1.tenBaoCao.compareTo(bc2.tenBaoCao));
    }
    
    public void sxBaoCaoKLTheoNgayBC(){
        this.getDsBCKL().sort((bc1, bc2)-> bc1.ngayBaoCao.compareTo(bc2.ngayBaoCao));
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

    /**
     * @return the dsBC
     */
    public List<BaoCao> getDsBC() {
        return dsBC;
    }

    /**
     * @param dsBC the dsBC to set
     */
    public void setDsBC(List<BaoCao> dsBC) {
        this.dsBC = dsBC;
    }
}
