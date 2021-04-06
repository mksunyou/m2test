<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="m1.model.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//1. 요청 분석
		int dan = Integer.parseInt(request.getParameter("dan"));
	%>
	
	<%
		//2. 요청 처리(Model Layer 이용...)
		GuGuService service = new GuGuService();
		ArrayList<String> list = service.getGuguDan(dan); //처리결과 -> 모델
	%>	
	
	<%
		//3.출력
		for(String s : list) {
	%>
			<div><%=s%></div>
	<%
		}
	%>
</body>
</html>