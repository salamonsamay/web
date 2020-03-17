<!DOCTYPE html>
<%@page import="java.sql.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.*"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">

<title>webTest</title>

<style type="text/css">
.menus {
	font-size: 00px;
	background-color: gray;
}

.program_summary {
	float: right;
	font background-color: rebeccapurple;
	border-bottom-color: blue;
}

.math_sum {
	float: right;
}

.programing_practice {
	float: right;
}

.math_practice {
	float: right;
}

.p1 {
	color: black;
	direction: rtl;
	text-align: right;
	border-style: inset;
	border-left:
}

.titles {
	direction: rtl;
}

.question {
	direction: rtl;
}

body {
	
}
</style>
</head>

<body>
	<br>
	<br>
	<br>

	<c:choose>
		<c:when test="${!vaild}">
			<a href="log-in.html"> התחברות</a>
		</c:when>
		<c:otherwise>
			<a href="LogOutServlet"> יציאה</a>
		</c:otherwise>
	</c:choose>

	<div class="menus">

		<!-- login form -get user name and password and verify the  data  -->



		<div class="program_summary">
			<button>
				<a href="my-web.jsp">דף הבית</a>
			</button>
		</div>
		<div class="program_summary">
			<button>סיכום בתכנות</button>
		</div>
		<div class="math_sum">
			<button>סיכומימים במתמטיקה</button>
		</div>
		<div class="programing_practice">
			<button>
				<a href="problems-page.jsp">תרגול בתיכנות</a>
			</button>
		</div>
		<div class="math_practice">
			<button>תירגול במתמטיקה</button>
		</div>

	</div>
	<br>
	<br>
	<br>

	<%
	   
		HttpSession session2 = request.getSession();
		JSP_DB.getConnection();
		session2.setAttribute("problems", ProblemDb.getProblems());
		session2.removeAttribute("problem");
		session2.removeAttribute("answer");
		int i=(int)(Math.random()*100);
		out.print(""+i);
	     
	      
	%>
	<br>
	<br>
	<br>
	<br>

	<div class="question">

		<c:forEach var="l" items="${problems}">

			<c:url var="ques" value="problem-page.jsp">
				<c:param name="id" value="${l.problem_id}"></c:param>
				<c:out value="${l.problem_id}"></c:out>
			</c:url>
			<a href="${ques}"> ${l.problem_name} </a>

			<br>
		</c:forEach>
	</div>




</body>
</html>