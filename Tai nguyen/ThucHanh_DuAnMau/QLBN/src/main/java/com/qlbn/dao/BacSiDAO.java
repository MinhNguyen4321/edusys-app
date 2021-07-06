package com.qlbn.dao;

import com.qlbn.entity.BacSi;
import com.qlbn.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinIT
 */
public class BacSiDAO implements DAO <BacSi, String>{

    @Override
    public BacSi selectById(String maBS) {
        String sql = "SELECT * FROM BacSi WHERE MaBS = ?";
        List<BacSi> list = selectBySql(sql, maBS);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<BacSi> selectAll() {
        String sql = "SELECT * FROM BacSi";
        return selectBySql(sql);
    }

    @Override
    public List<BacSi> selectBySql(String sql, Object... args) {
        List<BacSi> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    BacSi bs = new BacSi();
                    bs.setMaBS(rs.getString("MaBS"));
                    bs.setHoTen(rs.getString("TenBS"));
                    list.add(bs);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
}
