
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class BaoCaoDoAnNganh extends BaoCao{
    private double tyLeKiemTraDaoVan;

    public BaoCaoDoAnNganh(String tenBC, String linkBC,String ngayBC,String tenGV,double diem,double tyLe) throws IOException{
        super.BaoCao(tenBC,linkBC,ngayBC,tenGV,diem);
        this.tyLeKiemTraDaoVan = tyLe;
    }
    
    public void hienThi(){
         super.hienThi();
         System.out.printf("Ty le kiem tra dao van: %s\n", this.tyLeKiemTraDaoVan);
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
    
}
