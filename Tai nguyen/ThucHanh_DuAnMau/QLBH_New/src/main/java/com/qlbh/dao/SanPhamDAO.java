package com.qlbh.dao;

import com.qlbh.modal.SanPham;
import com.qlbh.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class SanPhamDAO implements DAO<SanPham, String> {

    @Override
    public SanPham selectById(String maSP) {
        String sql = "SELECT * FROM SanPham WHERE MaSP = ? AND isDelete = 0";
        List<SanPham> list = this.selectBySql(sql, maSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM SanPham WHERE isDelete = 0";
        return selectBySql(sql);
    }

    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    SanPham modal = new SanPham();
                    modal.setMaSP(rs.getString("MaSP"));
                    modal.setTenSP(rs.getString("TenSP"));
                    modal.setSoLuong(rs.getInt("SoLuong"));
                    modal.setDonGia(rs.getInt("DonGia"));
                    modal.setMaDM(rs.getString("MaDM"));
                    modal.setDelete(rs.getBoolean("isDelete"));
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
    
    public List<SanPham> selectByKeyword(String keyword, String maDM){
        String sql = "SELECT * FROM SanPham WHERE TenSP LIKE ? AND MaDM = ? AND isDelete = 0";
        return selectBySql(sql, "%" + keyword + "%", maDM);
    }
    
    public void insert(SanPham sp) {
        String sql = "INSERT INTO SanPham VALUES (?,?,?,?,?,?)";
        JdbcHelper.update(sql, 
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getSoLuong(),
                sp.getDonGia(),
                sp.getMaDM(),
                sp.isDelete()
        );
    }
    
    public void update(SanPham sp){
        String sql = "UPDATE SanPham SET TenSP=?, SoLuong=?, DongGia=?, MaDM=?,"
                    + "isDelete=? WHERE MaSP=?";
        JdbcHelper.update(sql, 
                sp.getTenSP(),
                sp.getSoLuong(),
                sp.getDonGia(),
                sp.getMaDM(),
                sp.isDelete(),
                sp.getMaSP()
        );
    }
    
    public void delete(String maSP){
        String sql = "UPDATE SanPham SET isDELETE = ? WHERE MaSP = ?";
        JdbcHelper.update(sql, true, maSP);
    }

}
