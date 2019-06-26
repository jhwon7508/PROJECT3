<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="../selLogin.do" method="post">
			<br>
			<h1>판매자 LOGIN</h1>
			<hr>
			<table height="200px">
				<tr>
					<th>아이디</th>
				</tr>
				<tr>
					<td><input type="text" name="selId"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
				</tr>
				<tr>
					<td><input type="password" name="selPw"></td>
				</tr>
				<tr>
					<td><input type="submit" value="로그인"></td>
				</tr>
			</table>
			<br> <br> <a href="selInsert.jsp">판매자가입</a>
		</form>
	</center>
</body>
</html>