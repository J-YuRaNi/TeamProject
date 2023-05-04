package action;

//DB에 관련된 날짜, 시간
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;

public class COMMUNITYWriteProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		COMMUNITYDTO article = new COMMUNITYDTO();
		System.out.println("디버깅중");

		article.setPost_num(Integer.parseInt(request.getParameter("post_num"))); // 글번호
		article.setMem_id(request.getParameter("mem_id")); // 작성자
		article.setPost_title(request.getParameter("post_title")); // 글제목
		article.setPost_cnt(request.getParameter("post_cnt")); // 글내용

		article.setPost_date(new Timestamp(System.currentTimeMillis()));

		// DTO저장 끝
		COMMUNITYDAO dbPro = new COMMUNITYDAO();
		dbPro.insertArticle(article);
		System.out.println("dbpro 호출");

		return "/COMMUNITYwritePro.jsp"; //return "/Zspace/list.do";

	}
}

