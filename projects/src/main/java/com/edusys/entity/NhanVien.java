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
    private byte [] muoi;

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, byte[] muoi) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.muoi = muoi;
    }
    
    @Override
    public String toString(){
        return this.getHoTen();
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

    public byte[] getMuoi() {
        return muoi;
    }

    public void setMuoi(byte[] muoi) {
        this.muoi = muoi;
    }
}
