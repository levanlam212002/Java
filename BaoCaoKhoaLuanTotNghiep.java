package com.ntt.btl;

import java.io.IOException;
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
public class BaoCaoKhoaLuanTotNghiep extends com.ntt.btl.BaoCao {
    private double tyLeKiemTraDaoVan;
    private List<TVHoiDongBVKL> ds;

    public BaoCaoKhoaLuanTotNghiep(String tenBC, String linkBC,Date ngayBC,String tenGV,double diem,double tyLe) throws IOException{
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

