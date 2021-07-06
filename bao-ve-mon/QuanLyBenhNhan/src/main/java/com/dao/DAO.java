package com.dao;

import java.util.List;

/**
 *
 * @author MinIT
 */
public interface DAO<E, K> {

    List<E> selectAll();

    E selectById(K id);

    List<E> selectBySql(String sql, Object... args);
    
}
