package com.itbank.food;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StoryRowMapper implements RowMapper<StoryDTO> {

	@Override
	public StoryDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StoryDTO dto = new StoryDTO();
		dto.setStrNo(rs.getInt("strNo"));
		dto.setStrTitle(rs.getString("strTitle"));
		dto.setStrContent(rs.getString("strContent"));
		dto.setStrDate(rs.getDate("strDate"));
		dto.setStrHit(rs.getInt("strHit"));
		dto.setStrMaterial(rs.getString("strMaterial"));
		return dto;
	}
}
