package com.qlbn.entity;

import java.sql.Date;

/**
 *
 * @author MinIT
 */
public class BenhNhan {
    private String maBN;
    private String hoTen;
    private String diaChi;
    private boolean gioiTinh;
    private Date namSinh;

    public BenhNhan() {
    }

    public BenhNhan(String maBN, String hoTen, String diaChi, boolean gioiTinh, Date namSinh) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
