/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import poly.com.modal.DanhMuc;

/**
 *
 * @author LE ANH TU
 */
public class DanhMucDao extends KetNoicsdl{
    
     public Vector<DanhMuc> docdanhmuc()
   {
       Vector<DanhMuc> vec = new Vector<DanhMuc>();
       try
       {
           String sql="select * from danhmuc";
           Statement statement= con.createStatement();
           ResultSet result =statement.executeQuery(sql);
           while(result.next())
           {
              DanhMuc dm = new DanhMuc();
              dm.setMadm(result.getString(1));
              dm.setTendm(result.getString(2));
              dm.setIsdelete(0);
              vec.add(dm);
           }
       }
       catch(Exception ex)
       {
          ex.printStackTrace();
       }
       
       return vec;
   }
    
}
