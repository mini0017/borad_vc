package com.polestarhc.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	
	/*
	 * board List
	 */
	List<Map<String, Object>> selectBordList(Map<String, Object> commandMap) throws Exception;

}
