package com.edusys.entity;

/**
 *
 * @author MinIT
 */
public class NhanVien {
    private String maNV;
    private String matKhau;
    private String hoTen;
    private boolean vaiTro = false;
    private String muoi;

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, boolean vaiTro, String muoi) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
        this.muoi = muoi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    @Override
    public String toString(){
        return this.getHoTen();
    }

    public String getMuoi() {
        return muoi;
    }

    public void setMuoi(String muoi) {
        this.muoi = muoi;
    }
}
