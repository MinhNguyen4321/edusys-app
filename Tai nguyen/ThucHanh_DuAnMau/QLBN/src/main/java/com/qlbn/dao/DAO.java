package com.qlbn.dao;

import java.util.List;

/**
 *
 * @author MinIT
 */
public interface DAO<E, K> {

    E selectById(K id);

    List<E> selectAll();

    List<E> selectBySql(String sql, Object... args);
    
}
