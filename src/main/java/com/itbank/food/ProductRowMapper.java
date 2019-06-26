package com.itbank.food;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<ProductDTO> {

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDTO dto = new ProductDTO();
		dto.setProId(rs.getInt(1));
		dto.setProName(rs.getString(2));
		dto.setProPrice(rs.getInt(3));
		dto.setProSeller(rs.getString(4));
		dto.setProContent(rs.getString(5));
		dto.setProImg(rs.getString(6));
		dto.setProExpDate(rs.getString(7));
		dto.setProQuantity(rs.getInt(8));
		dto.setProHit(rs.getInt(9));
		return dto;
	}

}
