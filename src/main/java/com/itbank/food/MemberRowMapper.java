package com.itbank.food;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberDTO> {

	@Autowired
	MemberDTO memDTO;
/*
	@Override
	public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		memDTO.setMemId(rs.getString(1));
		memDTO.setMemPw(rs.getString(2));
		memDTO.setMemName(rs.getString(3));

		memDTO.setMemAddr1(rs.getString(4).split("/")[0]);
		memDTO.setMemAddr2(rs.getString(4).split("/")[1]);
		memDTO.setMemAddr3(rs.getString(4).split("/")[2]);
		=> 안됨1

		String[] MemTel = rs.getString(5).split("-");
		memDTO.setMemTel1(MemTel[0]);
		memDTO.setMemTel2(MemTel[1]);
		memDTO.setMemTel3(MemTel[2]);
		=> 안됨2

		return memDTO;
	}
*/
	@Override
	public MemberDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		MemberDTO memDTO = new MemberDTO();

		memDTO.setMemId(rs.getString(1));
		memDTO.setMemPw(rs.getString(2));
		memDTO.setMemName(rs.getString(3));
		
		memDTO.setMemAddr(rs.getString(4));
		String[] addr = memDTO.getMemAddr().split("/");
		memDTO.setMemAddr1(addr[0]);
		memDTO.setMemAddr2(addr[1]);
		memDTO.setMemAddr3(addr[2]);

		
		memDTO.setMemTel(rs.getString(5));
		String[] tel = memDTO.getMemTel().split("-");
		memDTO.setMemTel1(tel[0]);
		memDTO.setMemTel2(tel[1]);
		memDTO.setMemTel3(tel[2]);

		return memDTO;
	}
}