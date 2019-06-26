<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Triple Panel Image Slider with jQuery and CSS3</title>
<meta name="description"
	content="Triple Panel Image Slider with jQuery and CSS3 and a 3D look" />
<meta name="keywords"
	content="css3, image slider, jquery, 3d, 3dtransform, triple, transition, translate" />
<meta name="author" content="Codrops" />
<script type="text/javascript"
	src="resources/jsM/modernizr.custom.26887.js"></script>

<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700'
	rel='stylesheet' type='text/css'>
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
<link href="resources/css/flexslider.css" rel="stylesheet">
<link href="resources/css/templatemo-style.css" rel="stylesheet">

</head>
<body>


	<!-- 회원 로그인 -->

	<div class="container">
		<%
			String memId = (String) session.getAttribute("memId");
			if (memId == null) { //세션 없을 경우
		%>

		<div class="codrops-top">
			<span class="right"><a href="member/memLogin.jsp"><strong>&laquo;
						로그인</strong></a> <a href="member/memInsert.jsp">회원가입</a> </span>
		</div>

		<%
			} else if (memId != null) {
		%>
		<div class="codrops-top">
			<span class="right"><a href="member/memMyPage.jsp"><strong>&laquo;
						마이페이지</strong></a><span class="right"> <a href="memLogout.do">로그아웃</a></span> <a
				href="strSelectAll.do">스토리</a> <%
 	}
 %>
		</div>
</body>
</html>