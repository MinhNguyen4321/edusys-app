/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import poly.com.modal.NguoiDung;

/**
 *
 * @author LE ANH TU
 */
public class NguoiDungDao extends KetNoicsdl{
    public NguoiDung dangnhap(String username, String password)
    {
        NguoiDung nd = null;
        try
        {
            String sql="select * from nguoidung where tennd=? and matkhau=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs= pre.executeQuery();
            if(rs.next())
            {
                nd= new NguoiDung();
                nd.setMand(rs.getString(1));
                nd.setTennd(rs.getString(2));
                nd.setMatkhau(rs.getString(3));
                nd.setVaitro(rs.getInt(4));
                
             }
        }
            catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }            
        return nd;
    }
}
