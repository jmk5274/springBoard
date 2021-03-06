package kr.or.ddit.board.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.config.test.RootTestConfig;

public class BoardDaoTest extends RootTestConfig{
	private static final Logger logger = LoggerFactory.getLogger(BoardDaoTest.class);
	@Resource(name = "boardDaoImpl")
	private IBoardDao dao;
	
	/**
	* Method : getBoardListTest
	* 작성자 : JEON MIN GYU
	* 변경이력 :
	* Method 설명 : 게시판 리스트 조회
	*/
	@Test
	public void getBoardListTest() {
		/***Given***/

		/***When***/
		List<BoardVo> list = dao.getBoardList();
		
		/***Then***/
		assertTrue(list.size()>2);
	}
	
	/**
	* Method : insertBoardTest
	* 작성자 : JEON MIN GYU
	* 변경이력 :
	* @throws ParseException
	* Method 설명 : 게시판 생성
	*/
	@Test
	public void insertBoardTest() throws ParseException {
		/***Given***/
		Date date = new SimpleDateFormat("yyyyMMdd").parse("20190603");
		
		BoardVo bvo = new BoardVo(1000, "테스트", "N", date, "cony");
		
		/***When***/
		int cnt = dao.insertBoard(bvo);
		
		/***Then***/
		assertEquals(1, cnt);
	}
	
	/**
	* Method : updateBoardTest
	* 작성자 : JEON MIN GYU
	* 변경이력 :
	* Method 설명 : 게시판 정보 수정
	*/
	@Test
	public void updateBoardTest() {
		/***Given***/
		BoardVo bvo = new BoardVo(1, "자유게시판", "Y", null, null);

		/***When***/
		int cnt = dao.updateBoard(bvo);
		
		/***Then***/
		assertEquals(1, cnt);
	}

	/**
	* Method : getBoardTest
	* 작성자 : JEON MIN GYU
	* 변경이력 :
	* Method 설명 : 특정 게시글 조회
	*/
	@Test
	public void getBoardTest() {
		/***Given***/
		int boardnum = 1;
		/***When***/
		BoardVo bvo = dao.getBoard(boardnum);
	
		/***Then***/
		assertEquals(1, bvo.getBoardNum());
	}
}
