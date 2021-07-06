package com.qlbh.modal;

/**
 *
 * @author MinIT
 */
public class DanhMuc {
    private String maDM;
    private String tenDM;
    private boolean isDelete;

    public DanhMuc() {
    }

    public DanhMuc(String maDM, String tenDM, boolean isDelete) {
        this.maDM = maDM;
        this.tenDM = tenDM;
        this.isDelete = isDelete;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }
    
    @Override
    public String toString(){
        return this.getTenDM();
    }
}
