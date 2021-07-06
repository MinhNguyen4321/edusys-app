package com.dao;

import com.modal.BacSi;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class BacSiDAO implements DAO <BacSi, String> {

    @Override
    public List<BacSi> selectAll() {
        String sql = "SELECT * FROM BacSi";
        return this.selectBySql(sql);
    }

    @Override
    public BacSi selectById(String id) {
        String sql = "SELECT * FROM BacSi WHERE MaND = ?";
        List<BacSi> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<BacSi> selectBySql(String sql, Object... args) {
        List<BacSi> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.query(sql, args);
            try {
                while (rs.next()) {                    
                    BacSi entity = new BacSi();
                    entity.setMaBS(rs.getString("MaBS"));
                    entity.setTenBS(rs.getString("TenBS"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
