package com.modal;

/**
 *
 * @author MinIT
 */
public class BacSi {

    private String maBS;
    private String tenBS;

    public BacSi() {
    }

    public BacSi(String maBS, String tenBS) {
        this.maBS = maBS;
        this.tenBS = tenBS;
    }

    public String getMaBS() {
        return maBS;
    }

    public void setMaBS(String maBS) {
        this.maBS = maBS;
    }

    public String getTenBS() {
        return tenBS;
    }

    public void setTenBS(String tenBS) {
        this.tenBS = tenBS;
    }
    
    @Override
    public String toString() {
        return getTenBS();
    }
    
}
