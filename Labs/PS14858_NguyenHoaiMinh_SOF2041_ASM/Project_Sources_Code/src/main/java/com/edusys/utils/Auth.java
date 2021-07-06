package com.edusys.utils;

import com.edusys.entity.NhanVien;

/**
 *
 * @author MinIT
 */
public class Auth {
    
    /*
     * Duy trì user đăng nhập vào hệ thống
     */
    public static NhanVien user = null;
    

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return isLogin() && user.isVaiTro();
    }

}
