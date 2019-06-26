<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	ale
</script>
</head>
<body>
	<center>
		<form action="memLogin.do" method="post">
			<br>
			<h1>회원 LOGIN</h1>
			<hr>
			<table align="left">
				<tr>
					<th>아이디</th>
				</tr>
				<tr>
					<td><input class="logintext" type="text" name="memId"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
				</tr>
				<tr>
					<td><input class="logintext" type="password" name="memPw"></td>
				</tr>
				<tr>
					<td><input id="loginbutton" type="submit" value="로그인"></td>
				</tr>
			</table>
			<br> <br> <a href="../member/memInsert.jsp">회원가입</a>
		</form>
	</center>
</body>
</html>