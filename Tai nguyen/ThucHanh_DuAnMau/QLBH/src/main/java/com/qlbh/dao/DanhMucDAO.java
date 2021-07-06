package com.qlbh.dao;

import com.qlbh.modal.DanhMuc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author MinIT
 */
public class DanhMucDAO extends DAO {

    public Vector<DanhMuc> docDanhMuc() {
        Vector<DanhMuc> vector = new Vector();
        try {
            String sql = "SELECT * FROM DanhMuc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMaDM(rs.getString("MaDM"));
                dm.setTenDM(rs.getString("TenDM"));
                dm.setIsDelete(rs.getBoolean("isDelete"));
                vector.add(dm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vector;
    }
    
}
