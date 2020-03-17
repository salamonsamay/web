<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1255">
<title>Insert title here</title>
</head>
<body>
<% HttpSession session2=request.getSession();
   session.setAttribute("a", 4);
   session.setAttribute("b", 420);
   session.setAttribute("c", 400);
%>
<c:if test="${c==400}">
 <input type="text" name="trd">daaw
 s
</c:if>
     
</body>
</html>