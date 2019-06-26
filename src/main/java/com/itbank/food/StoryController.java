package com.itbank.food;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class StoryController {
	@Autowired
	StoryDAO storyDAO;
	@Autowired
	FileDAO fileDAO;

	@RequestMapping("strSelectAll.do")
	public String storyList(Model model) {
		List<StoryDTO> storyList = storyDAO.selectAll();
		model.addAttribute("storyList", storyList);
		return "story/storyMain";
	}

	@RequestMapping("storyWrite")
	public String storyInsert(MultipartHttpServletRequest request, HttpSession session) throws IllegalStateException, IOException {
		String strTitle = request.getParameter("strTitle");
		String strContent = request.getParameter("strContent");
		String strMaterial = request.getParameter("strMaterial");
		MultipartFile file= request.getFile("file");
	       //파일경로
	       String file_path = "c:/temp/story/";
	       //파일실제이름(확장자포함)
	       String orgname = file.getOriginalFilename();
	       //파일이름
	       String fileName = orgname.substring(0 , orgname.lastIndexOf("."));
	       //파일확장자명
	       String extenstion = orgname.substring(orgname.lastIndexOf(".")+1, orgname.length());
	       //저장될 파일 이름
	       String saveFileName = storyDAO.nextStrNo() + "." + extenstion;
	       //파일 생성
	       File saveFile = new File(file_path + fileName + "."  + extenstion);
	       //실제 파일 생성
	       file.transferTo(saveFile);
	       
	       FileDTO fileDTO = new FileDTO();
	       fileDTO.setFileNo(storyDAO.nextStrNo());
	       fileDTO.setFileName(fileName);
	       fileDTO.setFileExtenstion(extenstion);
	       fileDTO.setFilePath(file_path);
	       fileDAO.insert(fileDTO);
	       
	       StoryDTO strDTO = new StoryDTO();
	       strDTO.setStrWriter((String)session.getAttribute("memId"));
	       strDTO.setStrTitle(strTitle);
	       strDTO.setStrContent(strContent);
	       strDTO.setStrMaterial(strMaterial);
	       strDTO.setStrImg(orgname);
	       storyDAO.insert(strDTO);
	       

		return"story/storyMain";
}

	@RequestMapping("detail")
	public String detail(@RequestParam int strNo, Model model) {
		StoryDTO dto = storyDAO.select(strNo);
		model.addAttribute("dto", dto);
		return "story/detail";
	}
}