<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function nullCheck() { //비밀번호 체크
		var pw = document.getElementById("memPw").value;
		if (pw == "" || pw == null) {
			alert("비밀번호를 입력하세요.");
		} else if (pw != "${param.memPw}") {
			alert("비밀번호가 틀립니다.");
		} else {
			document.myForm.submit();
		}
	}
	function cancel() { //취소 버튼
		history.back();
	}
</script>
</head>
<body>
	<center>
		<h2>회원탈퇴하시겠습니까?</h2>
		<br>
		<h2>비밀번호를 입력해주세요.</h2>
		<br>
		<form action="../memDelete.do" method="post" name="myForm">
			<input type="hidden" name="memId" value="${param.memId}"> <input
				type="password" name="memPw" id="memPw"><br> <br>
			<button type="button" onclick="nullCheck()">탈 퇴</button>
			<button type="button" onclick="cancel()">취 소</button>
		</form>
	</center>
</body>
</html>