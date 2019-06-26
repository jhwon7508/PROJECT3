package com.itbank.food;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("memDAO")
public class MemberDAO {

	@Autowired
	JdbcTemplate jdbc;

	public void memInsert(MemberDTO dto) throws SQLException, ClassNotFoundException {
		String sql = "insert into member(memId, memPw, memName, memAddr, memTel) values (?,?,?,?,?)";
		jdbc.update(sql, dto.getMemId(), dto.getMemPw(), dto.getMemName(),
				dto.getMemAddr1() + "/" + dto.getMemAddr2() + "/" + dto.getMemAddr3(),
				dto.getMemTel1() + "-" + dto.getMemTel2() + "-" + dto.getMemTel3());
	}
	//memAddr1은 우편번호, memAddr2는 주소, memAddr3는 상세주소.

	public void memDelete(MemberDTO dto) throws SQLException, ClassNotFoundException {
		String sql = "delete from member where memId =?";
		jdbc.update(sql, dto.getMemId());
	}

	public MemberDTO memSelect(MemberDTO memDTO) {
		String sql = "select * from member where memId = ?";
		Object[] arg = { memDTO.getMemId() };
		return jdbc.queryForObject(sql, arg, new MemberRowMapper());
	}

	public void memUpdate(MemberDTO dto) throws SQLException, ClassNotFoundException {
		String sql = "update member set memPw=?, memName=?, memAddr=?, memTel=? where memId=?)";
		jdbc.update(sql, dto.getMemPw(), dto.getMemName(),
				dto.getMemAddr1() + "/" + dto.getMemAddr2() + "/" + dto.getMemAddr3(),
				dto.getMemTel1() + "-" + dto.getMemTel2() + "-" + dto.getMemTel3(), dto.getMemId());
	}

	public List<MemberDTO> memSelectAll() {
		String sql = "select * from member";
		return jdbc.query(sql, new MemberRowMapper());
	}

	public MemberDTO memLogin(String memId, String memPw) {
		String sql = "select * from member where memId = ? and memPw = ?";
		Object[] args = { memId, memPw };
		return jdbc.queryForObject(sql, args, new MemberRowMapper());
	}
}