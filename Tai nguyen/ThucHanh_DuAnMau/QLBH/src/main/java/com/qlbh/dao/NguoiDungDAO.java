package com.qlbh.dao;

import com.qlbh.modal.NguoiDung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MinIT
 */
public class NguoiDungDAO extends DAO {

    public NguoiDung dangNhap(String username, String password) {
        NguoiDung nd = null;
        try {
            String sql = "SELECT * FROM NguoiDung WHERE MaND = ? AND MatKhau = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nd = new NguoiDung();
                nd.setMaND(rs.getString("MaND"));
                nd.setTenND(rs.getString("TenND"));
                nd.setMatKhau(rs.getString("MatKhau"));
                nd.setVaiTro(rs.getBoolean("VaiTro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nd;
    }
}
