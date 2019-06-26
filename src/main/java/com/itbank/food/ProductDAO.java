package com.itbank.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository()
public class ProductDAO {

	@Autowired
	JdbcTemplate jdbc;

	public void proInsert(ProductDTO proDTO) {
		String sql = "insert into product(proName,proPrice,proSeller,proContent,proImg,proExpDate,proQuantity)	values(?,?,?,?,?,now(),?)";
		jdbc.update(sql, proDTO.getProName(), proDTO.getProPrice(), proDTO.getProSeller(), proDTO.getProContent(),
				proDTO.getProImg(), proDTO.getProQuantity());
	}

	public ProductDTO proSelect(ProductDTO proDTO) {
		String sql = "select * from product where proName = ?";
		Object[] args = { proDTO.getProName() };
		return jdbc.queryForObject(sql, args, new ProductRowMapper());
	}

	public ProductDTO proSelectUpdate(ProductDTO proDTO) {
		String sql = "select * from product where proName = ?";
		Object[] args = { proDTO.getProName() };
		return jdbc.queryForObject(sql, args, new ProductRowMapper());
	}

	public void proDelete(ProductDTO proDTO) {
		String sql = "delete from product where proId = ?";
		jdbc.update(sql, proDTO.getProId());
	}

	public void proUpdate(ProductDTO proDTO) {
		String sql = "update product set proName =?, proPrice =?, proSeller =?, proContent =?, proImg = ?, ProQuantity =? where proId = ?";
		jdbc.update(sql, proDTO.getProName(), proDTO.getProPrice(), proDTO.getProSeller(), proDTO.getProContent(),
				proDTO.getProImg(), proDTO.getProQuantity(), proDTO.getProId());
	}

	public List<ProductDTO> proSelectAll() {
		String sql = "select * from product";
		return jdbc.query(sql, new ProductRowMapper());
	}

	public ProductDTO proCartInsert(ProductDTO proDTO) {
		String sql = "select * from product where proId = ?";
		Object[] args = { proDTO.getProId() };
		return jdbc.queryForObject(sql, args, new ProductRowMapper());
	}

	public ProductDTO proBasket(ProductDTO proDTO) {
		String sql = "select * from product where proId = ?";
		Object[] args = { proDTO.proId };
		return jdbc.queryForObject(sql, args, new ProductRowMapper());
	}

}
