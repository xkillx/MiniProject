package com.xsis.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xsis.training.model.Test;

@Repository
public class TestDaoImpl implements TestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SAVE = "insert into test (test) values (?)";
	private static final String UPDATE = "update test set test = ? where id = ?";
	private static final String DELETE = "delete from test where id = ?";
	private static final String GET_BY_ID = "select * from test where id = ?";
	private static final String GET_ALL = "select * from test";

	@Override
	public void save(Test t) {
		jdbcTemplate.update(SAVE, t.getTest());
	}

	@Override
	public void update(Test t) {
		jdbcTemplate.update(UPDATE, t.getTest(), t.getId());
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update(DELETE, id);
	}

	@Override
	public Test getById(int id) {
		return jdbcTemplate.queryForObject(GET_BY_ID, new TestRowMapper(), id);
	}

	@Override
	public List<Test> getAll() {
		return jdbcTemplate.query(GET_ALL, new TestRowMapper());
	}
	
	private class TestRowMapper implements RowMapper<Test> {

		@Override
		public Test mapRow(ResultSet rs, int n) throws SQLException {
			Test t = new Test();
			t.setId(rs.getInt("id"));
			t.setTest(rs.getString("test"));
			return t;
		}
		
	}
}
