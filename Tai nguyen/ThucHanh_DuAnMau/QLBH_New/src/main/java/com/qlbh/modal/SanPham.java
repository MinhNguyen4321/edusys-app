package com.qlbh.modal;

/**
 *
 * @author MinIT
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private int donGia;
    private String maDM;
    private boolean isDelete = false;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, int donGia, String maDM) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maDM = maDM;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }
    
    @Override
    public String toString() {
        return this.getTenSP();
    }
}
