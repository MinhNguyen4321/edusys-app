package com.qlbn.entity;

/**
 *
 * @author MinIT
 */
public class NguoiDung {
    private String maND;
    private String hoTen;
    private String matKhau;
    private boolean vaiTro;

    public NguoiDung() {
    }

    public NguoiDung(String maND, String hoTen, String matKhau, boolean vaiTro) {
        this.maND = maND;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
}
