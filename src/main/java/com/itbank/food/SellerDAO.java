package com.itbank.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("selDAO")
public class SellerDAO {

	@Autowired
	JdbcTemplate jdbc;

	public void selInsert(SellerDTO sellerDTO) {
		String sql = "insert into seller(selId,selPw,selName,selAddr,selTel) values(?,?,?,?,?)";
		jdbc.update(sql, sellerDTO.getSelId(), sellerDTO.getSelPw(), sellerDTO.getSelName(),
				sellerDTO.getSelAddr1() + "/" + sellerDTO.getSelAddr2() + "/" + sellerDTO.getSelAddr3(),
				sellerDTO.getSelTel1() + "-" + sellerDTO.getSelTel2() + "-" + sellerDTO.getSelTel3());
	}
	//selAddr1은 우편번호, selAddr2는 주소, selAddr3는 상세주소. 지도 검색에 사용되는 것은 selAddr2만!

	public void selDelete(SellerDTO sellerDTO) {
		String sql = "delete from seller where selId = ?";
		jdbc.update(sql, sellerDTO.getSelId());
	}

	public SellerDTO selSelect(SellerDTO sellerDTO) {
		String sql = "select * from seller where selId = ?";
		Object[] args = { sellerDTO.getSelId() };
		return jdbc.queryForObject(sql, args, new SellerRowMapper());
	}

	public void selUpdate(SellerDTO sellerDTO) {
		String sql = "update seller set selPw = ?, selName =?, selAddr = ?, selTel =? where selId = ?";
		jdbc.update(sql, sellerDTO.getSelPw(), sellerDTO.getSelName(),
				sellerDTO.getSelAddr1() + "/" + sellerDTO.getSelAddr2() + "/" + sellerDTO.getSelAddr3(),
				sellerDTO.getSelTel1() + "-" + sellerDTO.getSelTel2() + "-" + sellerDTO.getSelTel3(),
				sellerDTO.getSelId());
	}

	public List<SellerDTO> selSelectAll() {
		String sql = "select * from seller";
		return jdbc.query(sql, new SellerRowMapper());
	}

	public SellerDTO selLogin(String selId, String selPw) {
		String sql = "select * from seller where selId = ? and selPw = ?";
		Object[] args = { selId, selPw };
		return jdbc.queryForObject(sql, args, new SellerRowMapper());
	}

}
