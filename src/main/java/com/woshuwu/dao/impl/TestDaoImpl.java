package com.woshuwu.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.woshuwu.dao.TestDao;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * Author: ljj
 * Date: 12-8-29
 * Time: 上午12:06
 */
@Repository
public class TestDaoImpl extends JdbcDaoSupport implements TestDao {

    @Autowired
    TestDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    @Override
    public void test() {
        this.getJdbcTemplate().execute("INSERT INTO user (name, age) VALUES('aa',12)");

    }
}
