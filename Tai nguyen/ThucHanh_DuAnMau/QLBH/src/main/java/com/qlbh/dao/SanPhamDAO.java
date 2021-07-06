package com.qlbh.dao;

import com.qlbh.modal.SanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MinIT
 */
public class SanPhamDAO extends DAO {

    public ArrayList<SanPham> docSPTheoDM(String maDM) {
        ArrayList<SanPham> list = new ArrayList();
        try {
            String sql = "SELECT * FROM SanPham WHERE MaDM = ? AND isDelete = 0";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maDM);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setDonGia(rs.getInt("DonGia"));
                sp.setMaDM(rs.getString("MaDM"));
                sp.setIsDelete(rs.getBoolean("isDelete"));
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<SanPham> timTheoTen(String tenSP) {
        ArrayList<SanPham> list = new ArrayList();
        try {
            String sql = "SELECT * FROM SanPham WHERE TenSP LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + tenSP + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setDonGia(rs.getInt("DonGia"));
                sp.setMaDM(rs.getString("MaDM"));
                sp.setIsDelete(rs.getBoolean("isDelete"));
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean luuSanPham(SanPham sp) {
        try {
            String sql = "INSERT INTO SanPham VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setInt(3, sp.getSoLuong());
            ps.setInt(4, sp.getDonGia());
            ps.setString(5, sp.getMaDM());
            ps.setBoolean(6, sp.isIsDelete());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean capNhatSanPham(SanPham sp) {
        try {
            String sql = "UPDATE SanPham SET TenSP=?, SoLuong=?, DongGia=?, MaDM=?,"
                    + "isDelete=? WHERE MaSP=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setInt(2, sp.getSoLuong());
            ps.setInt(3, sp.getDonGia());
            ps.setString(4, sp.getMaDM());
            ps.setBoolean(5, sp.isIsDelete());
            ps.setString(6, sp.getMaSP());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean xoaSanPham(String maSP){
        try {
            String sql = "UPDATE SanPham SET isDELETE = ? WHERE MaSP = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setString(2, maSP);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
