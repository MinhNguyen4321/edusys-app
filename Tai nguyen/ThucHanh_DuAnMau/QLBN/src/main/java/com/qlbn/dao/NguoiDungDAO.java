package com.qlbn.dao;

import com.qlbn.entity.NguoiDung;
import com.qlbn.utils.JdbcHelper;
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
        List<NguoiDung> list = selectBySql(sql, maND);
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
                    NguoiDung nd = new NguoiDung();
                    nd.setMaND(rs.getString("MaND"));
                    nd.setMatKhau(rs.getString("MatKhau"));
                    nd.setHoTen(rs.getString("TenND"));
                    nd.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(nd);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
