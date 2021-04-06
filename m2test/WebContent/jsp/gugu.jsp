<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- datatbase를 요청해서 만드는 것을 dao, database없이 진행하는 것이 business(service) object -->
	<h1>jsp방식 구구단</h1>
	<%
		//Integer=class, parseInt=method(클래스 이름으로 바로 호출할 수 있기 때문에 static method), request=? ,getParameter=?
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan+"<-dan");//디버깅
		for(int i=1; i<10; i++) {
	%>
		<div><%=dan%>*<%=i%>=<%=dan*i%></div>
	<%
		}
	%>
</body>
</html>