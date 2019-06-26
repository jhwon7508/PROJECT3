<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../productSelect">
	<table border="2" bgcolor="aqua">
		<tr>
			<td>이름</td>
			<td><input type="text" name="proName"> </td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="상품 검색"> </td>
		</tr>
			<tr>
			<td colspan="2"><button type="button" onclick="location.href = '../productSelectAll'">전체 상품 검색</button></td>
		</tr>
	</table>
</form>
</body>
</html>