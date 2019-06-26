<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../productUpdate">
	<table border="2" bgcolor="aqua">
		<tr>
			<td>이름</td>
			<td><input type="text" name="proName" value="${productDTO2.proName}"> </td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input type="text" name="proPrice" value="${productDTO2.proPrice}"> </td>
		</tr>
		
		<tr>
			<td>판매자</td>
			<td><input type="text" name="proSeller" value="${productDTO2.proSeller}"> </td>
		</tr>
		
		<tr>
			<td>제품 내용</td>
			<td><input type="text" name="proContent" value="${productDTO2.proContent}"> </td>
		</tr>
		
		<tr>
			<td>이미지</td>
			<td><input type="text" name="proImg" value="${productDTO2.proImg}"> </td>
		</tr>			
		
		<tr>
			<td>제품 등록 날짜</td>
			<td><input type="text" name="proExpDate" value="${productDTO2.proExpDate}" readonly="readonly"> </td>
		</tr>
		
		<tr>
			<td>제품 수량</td>
			<td><input type="text" name="proQuantity" value="${productDTO2.proQuantity}"> </td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="상품 수정"> </td>
		</tr>
		
	</table>
	
</form>
</body>
</html>