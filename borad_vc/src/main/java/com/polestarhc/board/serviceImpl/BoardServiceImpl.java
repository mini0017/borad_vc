package com.polestarhc.board.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.polestarhc.board.dao.BoardDAO;
import com.polestarhc.board.service.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	/*
	 * board List
	 */
	@Override
	public List<Map<String, Object>> selectBordList(Map<String, Object> map) throws Exception {
		return boardDAO.selectBoardList(map);
	}

}
