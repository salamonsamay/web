<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

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
</style>
</head>

<body>

	<br>
	<br>
	<br>
	<c:choose>
		<c:when test="${!vaild}">
		    <a href="register.html"> �����</a>
		    <br>
			<a href="log-in.html"> �������</a>
		</c:when>
		<c:otherwise>
			<a href="LogOutServlet"> �����</a>
		</c:otherwise>
	</c:choose>

	<div class="menus">

		<!-- login form -get user name and password and verify the  data  -->



		<div class="program_summary">
			<button>
				<a href="my-web.jsp">�� ����</a>
			</button>
		</div>
		<div class="program_summary">
			<button>����� ������</button>
		</div>
		<div class="math_sum">
			<button>��������� ��������</button>
		</div>
		<div class="programing_practice">
			<button>
				<a href="problems-page.jsp">����� �������</a>
			</button>
		</div>
		<div class="math_practice">
			<button>������ ��������</button>
		</div>

	</div>
	<br>
	<br>
	<br>
	<div class="titles">


		<h1>���� �� ����� ������ ������ �����</h1>
		<h2>1 ����� ������</h2>
		<h2>2 �������</h2>
		<h2>3 ������� ��������/������</h2>
	</div>

	<div class="p1">
		<h3>
			<p>
				<em>�� ������ ���� ����� ����� �����. �� �����! <br> ���
					�� ����� �����? ����� �������? ��� �� �� �� ���� ��� ����� ������
					��� �� ���� ������ ��������. <br> �� �� ������� �� �� ������
					��-���� (����� �����-���), <br> ��������� ����� ���� �������
					��� ����� ��� ����� ��� ������ �� ���. <br> �� ������ ��� ����
					���� ���� ����, �������� ����� ����� ���, <br> �� ����� �� ���
					�� ���� ��� ����� ���� ����� ���� ����� ��� ��� �� ������ �������.
					<br> ����� ��� �� ��� ����� ���� ��� ���� ��� ����� ��� �� ��
					���� ����� ������ ����� �����, <br> ����� ����� ������ ��� ��
					�� ���, ��� ������ �� ����� �������� �� ������. <br> ��� �����
					��� ���� ������ ���, ��� ���� ������� ��� ��� �� �� �� ������, <br>
					����� ����� ���� ����� ��� ����� �� ������� ������� ��������. ���
					�� - ��� ��� ���� ����� �����?<br> ����� ���� ������� �����
					����� �� ��� ���� ����� ����� �����, <br> <br>�� ������
					������ ���� ��� ����, ���� ��� ��� �� ������� ���� ��������. ���
					���� ������ ����� ����� ������ ������ ����� ������ ����� ������.
					���, ���� ������ ������ ����� ��� <br> ����� �� ��� ���� �����
					����� �������? ��� ��� ���� ������ ������ �� �� ���� ������ �����?<br>
					�� ����� ��� ���� ����� ��� ����� ����� �� ���� ��� �����. ��� ���
					<br> <br>�� ����� ���� �����, ��� ���� ����� ������
					������ �� �����. ������ ��� ��� ��� ����� HTML ������ ������ ���
					���� ����� ��� ����� ������. �� ����� ������ ����� ��� ����.<br>
					������ ����� ��� ���� ����� ���� ��� ������� �� ����� �����. ���
					������ ����� ���, ��� <br> <br>����� ������ ���� ���
					����, ����, ���� ������ ����� ����� ���� �� ����� ���� �������� <br>�������
					���� �� ���� ���. ����, ��� �� ������ �� �� ����� ����� ����� ��
					��� ������ ������ �� ��. ����� ������ ������� �� <br> ������
					����� �������� ��� �����. ����� �� ����� ����� ���� �� ����� �����
					�����.<br> ���
				</em>
			</p>
		</h3>
	</div>




</body>
</html>