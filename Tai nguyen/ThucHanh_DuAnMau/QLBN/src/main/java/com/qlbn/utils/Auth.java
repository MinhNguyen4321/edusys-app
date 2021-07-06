package com.qlbn.utils;

import com.qlbn.entity.NguoiDung;

/**
 *
 * @author MinIT
 */
public class Auth {
    public static NguoiDung user = null;
    

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
