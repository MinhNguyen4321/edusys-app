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
public class DanhMuc {
    private String madm;
    private String tendm;
    private int isdelete;

    public String getMadm() {
        return madm;
    }

    public void setMadm(String madm) {
        this.madm = madm;
    }

   

    public String getTendm() {
        return tendm;
    }

    public void setTendm(String tendm) {
        this.tendm = tendm;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return this.tendm;
        
    }
    
    
}
