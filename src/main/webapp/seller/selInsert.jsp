<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>판매자 가입 페이지</title>

<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	function sample6_execDaumPostcode() { //주소 찾기 버튼
		new daum.Postcode(
			{
				oncomplete : function(data) {
					// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

					// 각 주소의 노출 규칙에 따라 주소를 조합한다.
					// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
					var fullAddr = ''; // 최종 주소 변수
					var extraAddr = ''; // 조합형 주소 변수

					// 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
					if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
						fullAddr = data.roadAddress;

					} else { // 사용자가 지번 주소를 선택했을 경우(J)
						fullAddr = data.jibunAddress;
					}

					// 사용자가 선택한 주소가 도로명 타입일때 조합한다.
					if (data.userSelectedType === 'R') {
						//법정동명이 있을 경우 추가한다.
						if (data.bname !== '') {
							extraAddr += data.bname;
						}
						// 건물명이 있을 경우 추가한다.
						if (data.buildingName !== '') {
							extraAddr += (extraAddr !== '' ? ', '
							+ data.buildingName : data.buildingName);
						}
						// 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
						fullAddr += (extraAddr !== '' ? ' (' + extraAddr
						+ ')' : '');
					}

					// 우편번호와 주소 정보를 해당 필드에 넣는다.
					document.getElementById('selAddr1').value = data.zonecode; //5자리 새우편번호 사용
					document.getElementById('selAddr2').value = fullAddr;

					// 커서를 상세주소 필드로 이동한다.
					document.getElementById('selAddr3').focus();
				}
			}).open();
	}

	function cancel() { // 취소 버튼
		history.back();
	}

	function pwCheck() { //비밀번호 확인
		var pw = document.getElementById("selPw").value;
		var pws = document.getElementById("selPws").value;

		if (pw.length >= 8) {
			if (pw == pws) {
				document.getElementById("same").innerHTML = "비밀번호가 일치합니다.";
				document.getElementById("same").style.color = "green";
				document.getElementById("pwsame").value = "1";
			} else {
				document.getElementById("same").innerHTML = "비밀번호가 일치하지 않습니다.";
				document.getElementById("same").style.color = "red";
				document.getElementById("pwsame").value = "0";
			}
		} else {
			document.getElementById("same").innerHTML = "비밀번호는 8글자 이상이어야 합니다.";
			document.getElementById("same").style.color = "red";
			document.getElementById("pwsame").value = "0";
		}

	}

	function checkInput() { //빈 칸 체크
		var id = document.getElementById("selId").value;
		var ids = document.getElementById("c").value;
		var pw = document.getElementById("selPw").value;
		var name = document.getElementById("selName").value;
		var addr1 = document.getElementById("selAddr1").value;
		var addr2 = document.getElementById("selAddr2").value;
		var addr3 = document.getElementById("selAddr3").value;
		var tel2 = document.getElementById("selTel2").value;
		var tel3 = document.getElementById("selTel3").value;

		if (pw == "" || pw == null) {
			alert("비밀번호를 입력하시오!");
		} else if (name == "" || name == null) {
			alert("이름을 입력하시오!");
		} else if (addr1 == "" || addr == null) {
			alert("주소를 입력하시오!");
		} else if (addr2 == "" || addr == null) {
			alert("주소를 입력하시오!");
		} else if (addr3 == "" || addr == null) {
			alert("주소를 입력하시오!");
		} else if (tel2 == "" || tel2 == null) {
			alert("연락처를 입력하시오!");
		} else if (tel3 == "" || tel3 == null) {
			alert("연락처를 입력하시오!");
		} else if (ids == 0) {
			alert("아이디 중복확인을 하시오!");
		} else if (id != ids) {
			alert("아이디 중복확인을 하시오!");
		} else {
			document.myForm.submit();
		}
	}
</script>
</head>
<body>
	<center>
		<div>
			<h1>판매자 가입</h1>
			<br> <br> <input type="hidden" id="c" value="0">
			<form action="../selInsert.do" method="post" name="myForm">
				<table width="600px">
					<tr>
						<td class="td1">아이디</td>
						<td class="td2"><input type="text" id="selId" name="selId">
					</tr>
					<tr>
						<td class="td1">비밀번호</td>
						<td class="td2"><input type="password" id="selPw"
							name="selPw" onkeyup="pwCheck()"><input type="hidden"
							id="pwsame"></td>
					</tr>
					<tr>
						<td class="td1">비밀번호확인</td>
						<td class="td2"><input type="password" id="selPws"
							name="selPws" onkeyup="pwCheck()"><span id="same"></span></td>
					</tr>
					<tr>
						<td class="td1">이름</td>
						<td class="td2"><input type="text" name="selName"
							id="selName"></td>
					</tr>
					<tr>
						<td class="td1">주소</td>
						<td class="td2"><input type="text" name="selAddr1"
							id="selAddr1" placeholder="우편번호"> <input type="button"
							onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
							<input type="text" name="selAddr2" id="selAddr2" placeholder="주소">
							<input type="text" name="selAddr3" id="selAddr3"
							placeholder="상세주소"></td>
					</tr>
					<tr>
						<td class="td1">연락처</td>
						<td class="td2"><select name="selTel1" id="selTel1">
								<option value="010">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
								<option value="018">018</option>
								<option value="019">019</option>
						</select>-<input type="text" name="selTel2" id="selTel2">- <input
							type="text" name="selTel3" id="selTel3"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"></td>
					</tr>
				</table>
				<br> <input type="submit" value="판매자가입">
				<button id="b3" type="button" onclick="cancel()">취 소</button>
			</form>
		</div>
	</center>
</body>
</html>