package com.modal;

import java.sql.Date;

/**
 *
 * @author MinIT
 */
public class BenhNhan {

    private String maBN;
    private String tenBN;
    private String diaChi;
    private boolean gioiTinh;
    private Date ngaySinh;

    public BenhNhan() {
    }

    public BenhNhan(String maBN, String tenBN, String diaChi, boolean gioiTinh, Date ngaySinh) {
        this.maBN = maBN;
        this.tenBN = tenBN;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getTenBN() {
        return tenBN;
    }

    public void setTenBN(String tenBN) {
        this.tenBN = tenBN;
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
