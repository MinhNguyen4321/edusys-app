package com.qlbh.dao;

import com.qlbh.modal.NguoiDung;
import com.qlbh.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class NguoiDungDAO implements DAO<NguoiDung, String> {

    @Override
    public NguoiDung selectById(String maND) {
        String sql = "SELECT * FROM NguoiDung WHERE MaND = ?";
        List<NguoiDung> list = this.selectBySql(sql, maND);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NguoiDung> selectAll() {
        String sql = "SELECT * FROM NguoiDung";
        return selectBySql(sql);
    }

    @Override
    public List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    NguoiDung modal = new NguoiDung();
                    modal.setMaND(rs.getString("MaND"));
                    modal.setTenND(rs.getString("TenND"));
                    modal.setMatKhau(rs.getString("MatKhau"));
                    modal.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(modal);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return list;
    }

}
