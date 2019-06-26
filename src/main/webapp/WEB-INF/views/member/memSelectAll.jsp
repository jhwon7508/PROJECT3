<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>판매자 ID</th>
			<th>판매자 PW</th>
			<th>판매자 이름</th>
			<th>판매자 주소</th>
			<th>판매자 연락처</th>
		</tr>
		<c:forEach items="${list}" var="sellerDTO">
			<tr>
				<td>${sellerDTO.selId}</td>
				<td>${sellerDTO.selPw}</td>
				<td>${sellerDTO.selName}</td>
				<td>${sellerDTO.selAddr1}/${sellerDTO.selAddr2}/${sellerDTO.selAddr3}</td>
				<td>${sellerDTO.selTel1}-${sellerDTO.selTel2}-${sellerDTO.selTel3}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>