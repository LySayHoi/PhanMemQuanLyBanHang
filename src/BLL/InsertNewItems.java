/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.Connect;
/**
 *
 * @author minhh
 */
public class InsertNewItems {
    //
    String TenHang,ThongSoKyThuat,IDNPP,IDLoaiHang, Giabanle, SoLuong,gianhap;
    byte[] Image;
    Connect conn=new Connect();
    private String[] Params;
    private int[] TypeParam;
    //
   public InsertNewItems(String TenHang, String ThongSoKyThuat, String IDNPP, String IDLoaiHang, String Giabanle,String SoLuong,byte[] Image,String gianhap) {
        this.TenHang = TenHang;
        this.ThongSoKyThuat = ThongSoKyThuat;
        this.IDNPP = IDNPP;
        this.IDLoaiHang = IDLoaiHang;
        this.Giabanle = Giabanle;
        this.SoLuong = SoLuong;
        this.Image=Image;
        this.gianhap=gianhap;
    }
    //
    public int CallProcedure_ToInsert()
    {
        Params=new String[]{TenHang,Giabanle,ThongSoKyThuat,SoLuong,IDNPP,IDLoaiHang,gianhap};
        TypeParam = new int[]{3,2,3,1,3,3,2};
        return conn.Execute_ReturnValue("{? = call dbo.InsertItem(?,?,?,?,?,?,?,?)}", Params, TypeParam,Image);
    
    }
   
}
