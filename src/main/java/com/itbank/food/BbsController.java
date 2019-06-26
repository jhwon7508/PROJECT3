package com.itbank.food;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO bbsDAO;

	@RequestMapping("bbsInsert.do")
	public String bbsInsert(BbsDTO bbsDTO) throws ClassNotFoundException, SQLException {
		bbsDAO.bbsInsert(bbsDTO);
		return "bbs/bbsInsertOK";
	}

	@RequestMapping("bbsDelete.do")
	public String bbsDelete(BbsDTO bbsDTO) throws ClassNotFoundException, SQLException {
		bbsDAO.bbsDelete(bbsDTO);
		return "bbs/bbsDeleteOK";
	}

	@RequestMapping("bbsSelect.do")
	public String bbsSelect(Model model, BbsDTO bbsDTO) throws ClassNotFoundException, SQLException {
		BbsDTO bbsDTO2 = bbsDAO.bbsSelect(bbsDTO);
		model.addAttribute("bbsDTO2", bbsDTO2);
		return "bbs/bbsUpdate";
	}

	@RequestMapping("bbsUpdate.do")
	public String memUpdate(BbsDTO bbsDTO) throws ClassNotFoundException, SQLException {
		bbsDAO.bbsUpdate(bbsDTO);
		return "bbs/bbsUpdateOK";
	}

	@RequestMapping("bbsProSelect.do")
	public String bbsProSelect(Model model, BbsDTO bbsDTO) throws ClassNotFoundException, SQLException {
		BbsDTO bbsDTO2 = bbsDAO.bbsSelect(bbsDTO);
		model.addAttribute("bbsDTO2", bbsDTO2);
		return "bbs/bbsProSelect";
	}// 특정상품에 대한 상품평 모아보기

	@RequestMapping("bbsMemSelect.do")
	public String bbsMemSelect(Model model, BbsDTO bbsDTO) throws ClassNotFoundException, SQLException {
		BbsDTO bbsDTO2 = bbsDAO.bbsSelect(bbsDTO);
		model.addAttribute("bbsDTO2", bbsDTO2);
		return "bbs/bbsMemSelect";
	}// 내가 쓴 상품평 모아보기

	@RequestMapping("bbsSelectAll.do")
	public String memSelectAll(Model model) throws ClassNotFoundException, SQLException {

		List<BbsDTO> list = bbsDAO.bbsSelectAll();
		model.addAttribute("list", list);
		return "bbs/bbsSelectAll";
	}// 아마 필요 없을듯합니다...?
}
