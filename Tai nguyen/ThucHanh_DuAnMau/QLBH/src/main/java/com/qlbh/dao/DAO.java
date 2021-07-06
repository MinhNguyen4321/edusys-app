package com.qlbh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MinIT
 */
public class DAO {
    protected Connection conn = null;
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String dburl = "jdbc:sqlserver://localhost:1433;database=QuanLyBanHang";
    private String username = "sa";
    private String password = "123456";
    
    public DAO() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
