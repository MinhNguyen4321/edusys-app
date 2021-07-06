/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.modal;

/**
 *
 * @author LE ANH TU
 */
public class NguoiDung {
    private String mand;
    private String tennd;
    private String matkhau;
    private int vaitro;

    public NguoiDung(String mand, String tennd, String matkhau, int vaitro) {
        this.mand = mand;
        this.tennd = tennd;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "mand=" + mand + ", tennd=" + tennd + ", matkhau=" + matkhau + ", vaitro=" + vaitro + '}';
    }

    public NguoiDung() {
    }

    public String getMand() {
        return mand;
    }

    public void setMand(String mand) {
        this.mand = mand;
    }

    public String getTennd() {
        return tennd;
    }

    public void setTennd(String tennd) {
        this.tennd = tennd;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getVaitro() {
        return vaitro;
    }

    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }


}
