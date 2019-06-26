package com.itbank.food;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FileRowMapper implements RowMapper<FileDTO> {

	@Override
	public FileDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		FileDTO dto = new FileDTO();
		dto.setFileNo(rs.getInt("fileNo"));
		dto.setFileName(rs.getString("fileName"));
		dto.setFileExtenstion(rs.getString("fileExtenstion"));
		dto.setFilePath(rs.getString("filePath"));
		return dto;
	}
}
