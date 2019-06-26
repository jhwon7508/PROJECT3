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
public class MemberController {

	@Autowired
	MemberDAO memDAO;

	@RequestMapping("memInsert.do")
	public String memInsert(MemberDTO memDTO) throws ClassNotFoundException, SQLException {
		memDAO.memInsert(memDTO);
		return "member/memLogin";
	}

	@RequestMapping("memDelete.do")
	public String memDelete(MemberDTO memDTO) throws ClassNotFoundException, SQLException {
		memDAO.memDelete(memDTO);
		return "member/memDeleteOK";
	}

	@RequestMapping("memSelect.do")
	public String memSelect(Model model, MemberDTO memDTO) throws ClassNotFoundException, SQLException {
		MemberDTO memDTO2 = memDAO.memSelect(memDTO);
		
		 
		model.addAttribute("memDTO2", memDTO2);
		return "member/memUpdate";
	}

	@RequestMapping("memUpdate.do")
	public String memUpdate(MemberDTO memDTO) throws ClassNotFoundException, SQLException {
		memDAO.memUpdate(memDTO);
		return "member/memUpdateOK";
	}

	@RequestMapping("memSelectAll.do")
	public String memSelectAll(Model model) throws ClassNotFoundException, SQLException {

		List<MemberDTO> list = memDAO.memSelectAll();
		model.addAttribute("list", list);
		return "member/memSelectAll";
	}

	@RequestMapping("memLogin.do")
	public String memLogin(HttpServletRequest request, HttpSession session, MemberDTO memDTO) {

		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");

		MemberDTO memDTO2 = memDAO.memLogin(memId, memPw);

		if (memDTO2 != null) {
			session.setAttribute("memId",memDTO2.getMemId());
			return "member/memLoginOK";
		} else {
			return "member/memLogin";
		}
	}

	@RequestMapping("memLogout.do")
	public String memLogout(HttpSession session) {
		session.removeAttribute("memId");

		return "member/memLogoutOK";
	}

}
