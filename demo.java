
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class demo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        QuanLyBaoCao qlbc = new QuanLyBaoCao();
       BaoCaoThucTapTotNghiep bc = new BaoCaoThucTapTotNghiep("AI","http://","20/11/2020","Duong Huu Thanh",9.0,"tot");
       qlbc.themBaoCaoTT(bc);
       bc.themSV(new SinhVien(2051052072,"Le Van Lam",2020,"Nam",2002,"CNTT"));
       bc.themSV(new SinhVien(2051052075,"Huynh Minh Hoang",2020,"Nam",2002,"CNTT"));
       qlbc.hienThiTT();
    } 
}
