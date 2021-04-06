package m2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m2.model2.GuguService;
import java.util.*;
@WebServlet("/mvc/gugu2")
public class GuguServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청처리
		int dan = java.lang.Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan+"<--dan GuguServlet.doGet()");
		
		//2. 요청 처리 요구 (요청처리 + 요청처리요구 = 요청 전처리 (요청처리 제외))
		GuguService service = new GuguService();
		ArrayList<String> list = service.getGugudanList(dan); //요청처리
		
		//3. 출력을 위임 ((요청 & 응답=포워딩 request, response) + 모델값(list)를 넘겨야함)
		request.setAttribute("list" , list); //setAttribute(String, Object) 꺼낼때는 ArrayList로 형변환 후 꺼내야함.
		RequestDispatcher rd = request.getRequestDispatcher("/mvc/gugu2.jsp");//연속된 행위, sendredirect는 새로운것을 요청. 헷갈리지 말것. 
		//사용자에게 보여주는것은 /mvc/gugu2.jsp이지만 사용자가 아는 것은 mvc/gugu2가 실행한 줄 안다. 
		rd.forward(request, response);
	}
}
