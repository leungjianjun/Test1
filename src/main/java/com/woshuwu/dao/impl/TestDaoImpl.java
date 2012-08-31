package com.woshuwu.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.woshuwu.dao.TestDao;

/**
 * Created with IntelliJ IDEA.
 * Author: ljj
 * Date: 12-8-29
 * Time: 上午12:06
 */
@Repository
public class TestDaoImpl extends JdbcDaoSupport implements TestDao {

    @Override
    public void test() {
        this.getJdbcTemplate().execute("");

    }
}
