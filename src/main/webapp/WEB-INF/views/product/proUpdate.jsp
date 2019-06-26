<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품정보수정</h1>
	<br>
	<form action="proUpdate">
		<table>
			<tr>
				<td>상품ID</td>
				<td><input type="text" name="proId" value="${proDTO2.proId}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="proName" value="${proDTO2.proName}"></td>
			</tr>
			<tr>
				<td>상품가격</td>
				<td><input type="text" name="proPrice" value="${proDTO2.proPrice}"></td>
			</tr>
			<tr>
				<td>상품사진</td>
				<td><input type="text" name="proImg" value="${proDTO2.proImg}"></td>
			</tr>
			<tr>
				<td>상품내용</td>
				<td><input type="text" name="proExp" value="${proDTO2.proExp}"></td>
			</tr>
		</table>
		<br> <input type="submit" value="수정">
	</form>
</body>
</html>