/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.dao;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.com.modal.SanPham;
/**
 *
 * @author LE ANH TU
 */
public class SanPhamDao extends KetNoicsdl
{
  
 
    /**
     *
    
     * @return
     */
    public int tongsp(String masp)
    {/////
      /*  if OBJECT_ID('demsosanpham') is not null
drop proc demsosanpham
go
create Proc demsosanpham
@madm nchar(10),@sosanpham int output 
as
select @sosanpham=count(masp) from sanpham,danhmuc
where sanpham.madm=danhmuc.madm and sanpham.madm=@madm

declare @sosanpham int
exec demsosanpham 'dmgd', @sosanpham output 
select @sosanpham as cot
     //////   
 */       
        
        int tongsp1=0;
        String sql="{call demsosanpham(?,?)}";
        try {
            CallableStatement stml =con.prepareCall(sql);
        stml.setString(1,masp);
        stml.registerOutParameter(2,java.sql.Types.INTEGER);
        stml.execute();
        tongsp1=stml.getInt(2);
        stml.close();
        con.close();
        
        } 
        catch (SQLException ex) {
            Logger.getLogger(SanPhamDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tongsp1;
    }
    public ArrayList<SanPham> docdanhsachsptheodm(String madm)
    {
        ArrayList<SanPham> dssp = new ArrayList<SanPham>();
        try
        {
            String sql="SELECT * FROM sanpham where madm=? and isdelete=0";
          PreparedStatement pstm=con.prepareStatement(sql);
          pstm.setString(1,madm);
          ResultSet rs= pstm.executeQuery();
          while(rs.next())
          {
              SanPham sp= new SanPham();
              sp.setMasp(rs.getString(1));
              sp.setTensp(rs.getString(2));
              sp.setSoluong(rs.getInt(3));
              sp.setDongia(rs.getInt(4));
              sp.setMadm(rs.getString(5));
              sp.setIsdelete(0);
              dssp.add(sp);
                    
                           
          }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return dssp;
    }
    
    
  
     public ArrayList<SanPham> timtheoten(String tensp)
    {
        ArrayList<SanPham> dssp = new ArrayList<SanPham>();
        try
        {
            String sql="SELECT * FROM sanpham where tensp like N'" + tensp +  "%'" ;// có chữ N ĐẰNG TRƯỚC LÀ TÌM UNICODE
         
         Statement statement= con.createStatement();
           ResultSet rs =statement.executeQuery(sql);
       
         
          while(rs.next())
          {
              SanPham sp= new SanPham();
              sp.setMasp(rs.getString(1));
              sp.setTensp(rs.getString(2));
              sp.setSoluong(rs.getInt(3));
              sp.setDongia(rs.getInt(4));
              sp.setMadm(rs.getString(5));
              sp.setIsdelete(0);
              dssp.add(sp);
                    
                           
          }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return dssp;
    }
    
    public int luusanpham(SanPham sp)
    {
        try
        {
            String sql="insert into sanpham values(?,?,?,?,?,?)";
            PreparedStatement preStatement =con.prepareStatement(sql);
             preStatement.setString(1, sp.getMasp());
              preStatement.setString(2, sp.getTensp());
               preStatement.setInt(3, sp.getSoluong());
               preStatement.setInt(4, sp.getDongia());
                 preStatement.setString(5, sp.getMadm());
                   preStatement.setInt(6, 0);
             return preStatement.executeUpdate();
                    
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return -1;
    }    
    public int capnhatsanpham(SanPham sp)    
    {
        
    try
    {
        String sql="update SanPham set tensp=?, soluong=?,dongia=?, madm=?, isdelete=? where masp=?";
     PreparedStatement preStatement=con.prepareStatement(sql);
   
              preStatement.setString(1, sp.getTensp());
               preStatement.setInt(2, sp.getSoluong());
               preStatement.setInt(3, sp.getDongia());
                 preStatement.setString(4, sp.getMadm());
                   preStatement.setInt(5, 0);
                   preStatement.setString(6, sp.getMasp());
             return preStatement.executeUpdate();
                
        
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
        
    }
        return -1;
    }
    
     public boolean XoaSanPham(String maSP) {
        try {
            String sql = "UPDATE SanPham SET isdelete = ? WHERE masp = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setBoolean(1, true);
            pstm.setString(2, maSP);

            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
}
