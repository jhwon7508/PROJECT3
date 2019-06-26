package com.itbank.food;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class BbsRowMapper implements RowMapper<BbsDTO> {

	@Autowired
	BbsDTO bbsDTO;

	@Override
	public BbsDTO mapRow(ResultSet arg0, int arg1) throws SQLException {

		return bbsDTO;
	}

}
