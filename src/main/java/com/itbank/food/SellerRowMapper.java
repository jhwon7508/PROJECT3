package com.itbank.food;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class SellerRowMapper implements RowMapper<SellerDTO> {

	@Autowired
	SellerDTO selDTO;
	/*
	 * @Override public SellerDTO mapRow(ResultSet rs, int rowNum) throws
	 * SQLException { selDTO.setSelId(rs.getString(1));
	 * selDTO.setSelPw(rs.getString(2)); selDTO.setSelName(rs.getString(3));
	 * 
	 * String[] SelAddr = rs.getString(4).split("/");
	 * selDTO.setSelAddr1(SelAddr[0]); selDTO.setSelAddr2(SelAddr[1]);
	 * selDTO.setSelAddr3(SelAddr[2]);
	 * 
	 * String[] SelTel = rs.getString(5).split("-"); selDTO.setSelTel1(SelTel[0]);
	 * selDTO.setSelTel2(SelTel[1]); selDTO.setSelTel3(SelTel[2]);
	 * 
	 * return selDTO; }
	 */

	@Override
	public SellerDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		SellerDTO selDTO = new SellerDTO();

		selDTO.setSelId(rs.getString(1));
		selDTO.setSelPw(rs.getString(2));
		selDTO.setSelName(rs.getString(3));
		selDTO.setSelAddr(rs.getString(4));
		selDTO.setSelTel(rs.getString(5));

		return selDTO;
	}
}
