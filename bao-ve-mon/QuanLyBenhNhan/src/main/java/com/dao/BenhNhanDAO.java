package com.dao;

import com.modal.BenhNhan;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class BenhNhanDAO implements DAO<BenhNhan, String> {

    @Override
    public List<BenhNhan> selectAll() {
        String sql = "SELECT * FROM BenhNhan";
        return this.selectBySql(sql);
    }

    @Override
    public BenhNhan selectById(String id) {
        String sql = "SELECT * FROM BenhNhan WHERE MaND = ?";
        List<BenhNhan> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<BenhNhan> selectBySql(String sql, Object... args) {
        List<BenhNhan> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.query(sql, args);
            try {
                while (rs.next()) {
                    BenhNhan entity = new BenhNhan();
                    entity.setMaBN(rs.getString("MaBN"));
                    entity.setTenBN(rs.getString("TenBN"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
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

    public List<Object[]> getArrayOfList(String sql, String[] cols, Object... args) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Object[] vals = new Object[cols.length];
                    for (int i = 0; i < cols.length; i++) {
                        vals[i] = rs.getObject(cols[i]);
                    }
                    list.add(vals);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Object[]> getBenhNhan(String maBS) {
        String sql = "{CALL sp_BenhNhanChiTiet (?)}";
        String[] cols = {"MaBN", "TenBN", "ChuanDoan", "ChiPhi"};
        return this.getArrayOfList(sql, cols, maBS);
    }
    
    public double getTongChiPhi(String maBS) {
        String sql = "SELECT SUM(ChiPhi) FROM PhieuKham WHERE maBS = ?";
        return (double) XJdbc.value(sql, maBS);
    }

}
