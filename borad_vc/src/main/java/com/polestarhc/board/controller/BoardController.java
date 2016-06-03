package com.polestarhc.board.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.polestarhc.board.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	/*
	 *  boardList Controller
	 */
	@RequestMapping(value="/board/boardList.do")
	public ModelAndView boardList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/boardList");
		
		List<Map<String,Object>> list = boardService.selectBordList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}

}
