package com.itbank.food;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SellerController {

	@Autowired
	SellerDAO selDAO;

	@RequestMapping("selInsert.do")
	public String selInsert(SellerDTO selDTO) {
		selDAO.selInsert(selDTO);
		return "seller/selInsertOK";
	}

	@RequestMapping("selDelete.do")
	public String selDelete(SellerDTO selDTO) {
		selDAO.selDelete(selDTO);
		return "seller/selDeleteOK";
	}

	@RequestMapping("selSelect.do")
	public String selSelect(SellerDTO selDTO, Model model) {
		SellerDTO selDTO2 = selDAO.selSelect(selDTO);
		model.addAttribute("sellerDTO2", selDTO2);
		return "seller/selUpdate";
	}

	@RequestMapping("selUpdate.do")
	public String selUpdate(SellerDTO selDTO) throws ClassNotFoundException, SQLException {
		selDAO.selUpdate(selDTO);
		return "seller/selUpdateOK";
	}

	@RequestMapping("mapSelect.do")
	public String mapSelect(SellerDTO mapDTO, Model model) throws ClassNotFoundException, SQLException {
		SellerDTO mapDTO2 = selDAO.selSelect(mapDTO);
		model.addAttribute("mapDTO2", mapDTO2);
		return "seller/showMap";
	}
	// 지도 검색에 사용되는 것은 selAddr2만!
	
	@RequestMapping("selSelectAll.do")
	public String selSelectAll(SellerDTO sellerDTO, Model model) {
		List<SellerDTO> list = selDAO.selSelectAll();
		list = selDAO.selSelectAll();
		model.addAttribute("list", list);
		return "seller/selSelectAll";
	}

	@RequestMapping("selLogin.do")
	public String selLogin(HttpServletRequest request, HttpSession session, SellerDTO selDTO) {

		String selId = request.getParameter("selId");
		String selPw = request.getParameter("selPw");

		SellerDTO selDTO2 = selDAO.selLogin(selId, selPw);

		if (selDTO2 != null) {
			session.setAttribute("selId", selDTO2.getSelId());
			return "seller/selLoginOK";
		} else {
			return "seller/selLogin";
		}
	}

	@RequestMapping("selLogout.do")
	public String selLogout(HttpSession session) {
		session.removeAttribute("selId");

		return "seller/selLogoutOK";
	}

}
