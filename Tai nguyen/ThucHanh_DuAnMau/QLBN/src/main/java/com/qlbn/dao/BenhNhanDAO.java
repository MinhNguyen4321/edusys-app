package com.qlbn.dao;

import com.qlbn.entity.BenhNhan;
import com.qlbn.utils.JdbcHelper;
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
    public BenhNhan selectById(String maND) {
        String sql = "SELECT * FROM BenhNhan WHERE MaND = ?";
        List<BenhNhan> list = selectBySql(sql, maND);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<BenhNhan> selectAll() {
        String sql = "SELECT * FROM BenhNhan";
        return selectBySql(sql);
    }

    @Override
    public List<BenhNhan> selectBySql(String sql, Object... args) {
        List<BenhNhan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    BenhNhan bn = new BenhNhan();
                    bn.setMaBN(rs.getString("MaBN"));
                    bn.setHoTen(rs.getString("TenBN"));
                    bn.setDiaChi(rs.getString("DiaChi"));
                    bn.setGioiTinh(rs.getBoolean("GioiTinh"));
                    bn.setNamSinh(rs.getDate("NgaySinh"));
                    list.add(bn);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getBenhNhanChiTiet(String maBS) {
        String sql = "{CALL sp_BenhNhanChiTiet (?)}";
        String[] cols = {"MaBN", "TenBN", "ChuanDoan", "ChiPhi"};
        return getListOfArray(sql, cols, maBS);
    }
    
    public double getTongChiPhi(String maBS) {
        String sql = "SELECT SUM(ChiPhi) FROM PhieuKham WHERE MaBS = ?";
        return (double) JdbcHelper.value(sql, maBS);
    }

}
