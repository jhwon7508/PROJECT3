<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>전체상품 목록입니다.</h1><br>
		<table width="600px">
			<tr>
				<th>상품ID</th>
				<th>상품명</th>
				<th>상품가격</th>
				<th>상품사진</th>
				<th>상품내용</th>
			</tr>
			<c:forEach items="${list}" var="proDTO2">
				<tr>
					<td>${proDTO2.proId}</td>
					<td>${proDTO2.proName}</td>
					<td>${proDTO2.proPrice}</td>
					<td><img src="${proDTO2.proImg}" width="200px" height="200px"></td>
					<td>${proDTO2.proExp}</td>
				</tr>
			</c:forEach>
		</table>

	</center>
</body>
</html>