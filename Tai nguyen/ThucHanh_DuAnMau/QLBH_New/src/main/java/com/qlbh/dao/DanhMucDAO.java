package com.qlbh.dao;

import com.qlbh.modal.DanhMuc;
import com.qlbh.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class DanhMucDAO implements DAO<DanhMuc, String> {

    @Override
    public DanhMuc selectById(String maDM) {
        String sql = "SELECT * FROM DanhMuc WHERE MaND = ?";
        List<DanhMuc> list = this.selectBySql(sql, maDM);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<DanhMuc> selectAll() {
        String sql = "SELECT * FROM DanhMuc";
        return selectBySql(sql);
    }

    @Override
    public List<DanhMuc> selectBySql(String sql, Object... args) {
        List<DanhMuc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    DanhMuc modal = new DanhMuc();
                    modal.setMaDM(rs.getString("MaDM"));
                    modal.setTenDM(rs.getString("TenDM"));
                    modal.setIsDelete(rs.getBoolean("isDelete"));
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
