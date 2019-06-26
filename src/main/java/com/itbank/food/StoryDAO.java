package com.itbank.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StoryDAO {
	@Autowired
	JdbcTemplate jdbc;

	public List<StoryDTO> selectAll() {
		String sql = "select * from Story";
		return jdbc.query(sql, new StoryRowMapper());
	}

	public void insert(StoryDTO story) {
		String sql = "insert into story values(null,?,?,?,sysdate(),'0',?,?)";
		jdbc.update(sql, story.getStrWriter(), story.getStrTitle(), story.getStrContent(), story.getStrImg(),
				story.getStrMaterial());
	}

	public StoryDTO select(int strNo) {
		String sql = "select * from story where strNo = ?";
		Object[] arg = { strNo };
		return jdbc.queryForObject(sql, arg, new StoryRowMapper());
	}

	public Integer nextStrNo() {
		String sql = "select auto_increment from information_schema.tables where table_name = 'story' AND table_schema = DATABASE()";
		return jdbc.queryForObject(sql, Integer.class);
	}
}