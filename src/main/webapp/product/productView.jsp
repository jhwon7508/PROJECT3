<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function basket(){ //로그인 안되있을때 
		var selId = document.getElementById("selId").value;
		if(selId == "null" || selId ==""){
			alert("상품을 구매하시려면 로그인을 해주세요.");
			location.href = "../Seller/loginSeller.jsp";
		}else{
			document.myForm.action = "../cart/process.jsp";
			document.myForm.submit();
		}
	}
	function basketMove(){
		var selId = document.getElementById("selId").value;
		if(selId == "null" || selId ==""){
			alert("장바구니에 넣을려면 로그인을 해주세요.");
			location.href = "../Seller/loginSeller.jsp";
		}else {
			location.href = "../cart/cartList.jsp";
		}
	}
	
</script>
</head>
<body>

</body>
</html>