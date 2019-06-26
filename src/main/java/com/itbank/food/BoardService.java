package com.itbank.food;

import java.util.List;

public interface BoardService {

	void addComment(BoardVO boardVO);

	List<BoardVO> selectBoardCommentByCode(BoardVO boardVO);

}
