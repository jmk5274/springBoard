package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.config.test.RootTestConfig;
import kr.or.ddit.user.model.UserVo;

public class UserDaoTest extends RootTestConfig{
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	@Resource(name = "userDaoImpl")
	private IUserDao dao;
	private String userId = "brown";
	
	/**
	* Method : getUserTest
	* 작성자 : JEON MIN GYU
	* 변경이력 :
	* Method 설명 : 사용자 정보 조회
	*/
	@Test
	public void getUserTest() {
		/***Given***/

		/***When***/
		UserVo uvo = dao.getUser(userId);
		
		/***Then***/
		assertEquals("brown", uvo.getUserId());
	}

}
