<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateSeller">
		1 : <input type="text" name="selId" value="${sellerDTO2.selId}"
			readonly="readonly"><br> 2 : <input type="password"
			name="selPw" value="${sellerDTO2.selPw}"><br> 3 : <input
			type="text" name="selName" value="${sellerDTO2.selName}"><br>
		4 : <input type="text" name="selAddr1" value="${sellerDTO2.selAddr1}"><br>
		<input type="text" name="selAddr2" value="${sellerDTO2.selAddr2}"><br>
		<input type="text" name="selAddr3" value="${sellerDTO2.selAddr3}"><br>
		5 : <input type="text" name="selTel1" value="${sellerDTO2.selTel1}"><br>
		<input type="text" name="selTel2" value="${sellerDTO2.selTel2}"><br>
		<input type="text" name="selTel3" value="${sellerDTO2.selTel3}"><br>
		<input type="submit" value="상품 확인 후 수정">
	</form>
</body>
</html>