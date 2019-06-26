package com.itbank.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FileDAO {
	@Autowired
	JdbcTemplate jdbc;

	public List<FileDTO> selectAll() {
		String sql = "select * from File";
		return jdbc.query(sql, new FileRowMapper());
	}

	public void insert(FileDTO file) {
		String sql = "insert into File values(?,?,?,?)";
		jdbc.update(sql, file.getFileNo(),file.getFileName(), file.getFileExtenstion(), file.getFilePath());
	}

	public StoryDTO select(int strNo) {
		String sql = "select * from story where strNo = ?";
		Object[] arg = {strNo};
		return jdbc.queryForObject(sql, arg, new StoryRowMapper());
	}
	
	public Integer nextStrNo() {
		String sql = "select auto_increment from information_schema.tables where table_name = 'story' AND table_schema = DATABASE()";
		return jdbc.queryForObject(sql,Integer.class);
	}
}