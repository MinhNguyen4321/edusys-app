package com.qlbn.entity;

/**
 *
 * @author MinIT
 */
public class BacSi {
    private String maBS;
    private String hoTen;

    public BacSi() {
    }

    public BacSi(String maBS, String hoTen) {
        this.maBS = maBS;
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaBS() {
        return maBS;
    }

    public void setMaBS(String maBS) {
        this.maBS = maBS;
    }
    
    @Override
    public String toString(){
       return getHoTen();
    }
    
    //public boolean equals(Object obj){
    //    BacSi other = (BacSi) obj;
    //    return other.getMaBS().equals(this.getMaBS());
    //}
    
}
