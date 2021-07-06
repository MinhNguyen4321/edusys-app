package com.dao;

import com.modal.NguoiDung;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class NguoiDungDAO implements DAO <NguoiDung, String> {

    @Override
    public List<NguoiDung> selectAll() {
        String sql = "SELECT * FROM NguoiDung";
        return this.selectBySql(sql);
    }

    @Override
    public NguoiDung selectById(String id) {
        String sql = "SELECT * FROM NguoiDung WHERE MaND = ?";
        List<NguoiDung> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.query(sql, args);
            try {
                while (rs.next()) {                    
                    NguoiDung entity = new NguoiDung();
                    entity.setMaND(rs.getString("MaND"));
                    entity.setTenND(rs.getString("TenND"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
