//package kr.or.ddit.post.web;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import kr.or.ddit.post.service.IPostService;
//import kr.or.ddit.post.service.PostServiceImpl;
//
//@WebServlet("/deleteCmt")
//public class DeleteCmt extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private IPostService serv;
//       
//	@Override
//	public void init() throws ServletException {
//		serv = PostServiceImpl.getInstance();
//	}
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		
//		String boardNum = request.getParameter("boardNum");
//		String postNum = request.getParameter("postNum");
//		String cmtNum = request.getParameter("cmtNum");
//		
//		int cnt = serv.deleteCmt(Integer.parseInt(cmtNum));
//		
//		request.setAttribute("postNum", postNum);
//		request.setAttribute("boardNum", request.getAttribute("boardNum"));
//		
//		request.getRequestDispatcher("/selectPost").forward(request, response);
//	}
//
//}
