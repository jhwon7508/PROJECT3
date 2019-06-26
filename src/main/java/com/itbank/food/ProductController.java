package com.itbank.food;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO proDAO;

	@RequestMapping("proInsert.do")
	public String proInsert(ProductDTO proDTO) {
		proDAO.proInsert(proDTO);
		return "product/proInsertOK";
	}

	@RequestMapping("proDelete.do")
	public String proDelete(ProductDTO proDTO) {
		proDAO.proDelete(proDTO);
		return "product/proDeleteOK";
	}

	@RequestMapping("proUpdate.do")
	public String proUpdate(ProductDTO proDTO, Model model) {
		ProductDTO proDTO2 = new ProductDTO();
		proDAO.proUpdate(proDTO);
		proDTO2 = proDAO.proSelect(proDTO);
		model.addAttribute("proDTO2", proDTO2);
		return "product/proUpdateOK";
	}

	@RequestMapping("proSelect.do")
	public String proSelect(ProductDTO proDTO, Model model) {
		ProductDTO proDTO2 = new ProductDTO();
		proDTO2 = proDAO.proSelect(proDTO);
		model.addAttribute("proDTO2", proDTO2);
		return "product/proSelectOK";
	}

	@RequestMapping("proSelectUpdate")
	public String proSelectUpdate(ProductDTO proDTO, Model model) {
		ProductDTO proDTO2 = new ProductDTO();
		proDTO2 = proDAO.proSelect(proDTO);
		model.addAttribute("proDTO2", proDTO2);
		return "product/proSelectUpdateOK";
	}

	@RequestMapping("proSelectAll")
	public String proSelectAll(ProductDTO proDTO, Model model) {
		List<ProductDTO> list = proDAO.proSelectAll();
		model.addAttribute("list", list);
		return "product/proSelectAllOK";
	}

	@RequestMapping("insertCart")
	public String insertCart(ProductDTO proDTO, Model model, HttpServletRequest request) {
		ProductDTO proDTO2 = new ProductDTO();
		proDTO2 = proDAO.proCartInsert(proDTO);
		model.addAttribute("proDTO2", proDTO2);
		return "cart/cartInsertOk";
	}

	@RequestMapping("basketCart")
	public String basketCart(ProductDTO productDTO, HttpSession session, HttpServletRequest request)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("euc-kr");
		ProductDTO productDTO2 = proDAO.proBasket(productDTO);

		@SuppressWarnings("unchecked")

		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) session.getAttribute("productDTO2");

		if (list == null) {
			list = new ArrayList<ProductDTO>();
		}
		list.add(productDTO2);
		session.setAttribute("productDTO2", list);

		return "cart/basketCart";
	}
}