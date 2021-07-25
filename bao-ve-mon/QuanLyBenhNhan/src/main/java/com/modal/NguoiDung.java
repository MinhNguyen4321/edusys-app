package com.modal;

/**
 *
 * @author MinIT
 */
public class NguoiDung {
    
    private String maND;
    private String tenND;
    private String matKhau;
    private boolean vaiTro;

    public NguoiDung() {
    }

    public NguoiDung(String maND, String tenND, String matKhau, boolean vaiTro) {
        this.maND = maND;
        this.tenND = tenND;
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

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
}
