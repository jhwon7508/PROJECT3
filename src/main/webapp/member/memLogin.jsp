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
		<form action="../memLogin.do" method="post">
			<br>
			<h1>LOGIN</h1>
			<hr>
			<table height="200px" align="center">
				<tr>
					<td>아이디</td>
				</tr>
				<tr>
					<td><input class="logintext" type="text" name="memId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
				</tr>
				<tr>
					<td><input class="logintext" type="password" name="memPw"></td>
				</tr>
			</table>
			<br> <br> <input id="loginbutton" type="submit" value="로그인">
			<br> <br> <a href="../member/memInsert.jsp">회원가입</a>
		</form>
	</center>
</body>
</html>