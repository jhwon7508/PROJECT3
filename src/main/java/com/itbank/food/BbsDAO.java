package com.itbank.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("bbsDAO")
public class BbsDAO {

	@Autowired
	JdbcTemplate jdbc;

	public void bbsInsert(BbsDTO bbsDTO) {
		String sql = "insert into bbs(bbsProduct, bbsWriter, bbsRating, bbsTitle, bbsContent, bbsDate) values (?,?,?,?,?,?)";
		jdbc.update(sql, bbsDTO.getBbsProduct(), bbsDTO.getBbsWriter(), bbsDTO.getBbsRating(), bbsDTO.getBbsTitle(),
				bbsDTO.getBbsContent(), bbsDTO.getBbsDate());
	}

	public void bbsDelete(BbsDTO bbsDTO) {
		String sql = "delete from bbs where bbsNum = ?";
		jdbc.update(sql, bbsDTO.getBbsNum());
	}

	public void bbsUpdate(BbsDTO bbsDTO) {
		String sql = "update bbs set bbsRating = ?, bbsTitle=?, bbsContent=? where bbsNum = ?";
		jdbc.update(sql, bbsDTO.getBbsRating(), bbsDTO.getBbsTitle(), bbsDTO.getBbsContent(), bbsDTO.getBbsNum());
	}

	public BbsDTO bbsSelect(BbsDTO bbsDTO) {
		String sql = "select * from bbs where bbsNum = ?";
		Object[] arg = { bbsDTO.getBbsNum() };
		return jdbc.queryForObject(sql, arg, new BbsRowMapper());
	}

	public BbsDTO bbsProSelect(BbsDTO bbsDTO) {
		String sql = "select * from bbs where bbsProduct = ?";
		Object[] arg = { bbsDTO.getBbsProduct() };
		return jdbc.queryForObject(sql, arg, new BbsRowMapper());
	}

	public BbsDTO bbsMemSelect(BbsDTO bbsDTO) {
		String sql = "select * from bbs where bbsWriter = ?";
		Object[] arg = { bbsDTO.getBbsWriter() };
		return jdbc.queryForObject(sql, arg, new BbsRowMapper());
	}

	public List<BbsDTO> bbsSelectAll() {
		String sql = "select * from bbs";
		return jdbc.query(sql, new BbsRowMapper());
	}

}