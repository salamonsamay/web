
<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@page
	import="com.sun.org.glassfish.external.probe.provider.annotations.Probe"%>
<%@page import="db.ProblemDb"%>
<%@page import="my_class.Problem"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="css/build.css">
<style type="text/css">
.all_div {
	border-color: gray;
	border-style: solid;
	border-right-height: thin;
}

form {
	text-align: center;
}

.des {
	text-align: center;
}

#true_ans {
	text-align: center;
	color: green;
}

#wrog_ans {
	text-align: center;
	color: red;
}

.img {
	text-align: center;
}
</style>

<body>



	</br>


	<%
		HttpSession session2 = request.getSession();

		if (session2.getAttribute("problem") == null) {
			int id = Integer.parseInt(request.getParameter("id"));
            
			Problem problem = ProblemDb.getProblem(id);
			session2.setAttribute("problem", problem);
		
		}
	%>


	</br>
	<div class="all_div">
		<div class="des">
			<h3>${problem.description}</h3>
		</div>

		<%-- 
         form to check the If the answer you entered is correct
         the form call CheckServlet class 
         that returns a reply and according to the answer we present the appropriate information
         --%>
		<form action="CheckServlet" method="get" accept-charset="UTF-8">

			<input type="text" name="ans">

			<%--if the user logged on --%>
			<c:if test="${vaild}">
				<input type="submit" value="תשובה">
			</c:if>

			<%--if the user not logged on --%>
			<c:if test="${!vaild}">
				<h2>על מנת לראות פתרון צריך להתחבר למערכת</h2>
			</c:if>

			</br>

			<c:if test="${answer==0}">
				<h3 id="wrog_ans">תשובה לא נכונה</h3>
			</c:if>
			<c:if test="${answer==1}">
				<h3 id="true_ans">תשובה נכונה</h3>
			</c:if>
		</form>

	</div>
	<c:if test="${answer==0}">
		<div class="img">
			<img alt="d" src="a.jpg" height="300" width="300">
		</div>
	</c:if>

	<c:if test="${answer==1}">
		<div class="img">
			<img alt="dd" src="c.jpg" height="300" width="300">
		</div>
	</c:if>



</body>
</html>