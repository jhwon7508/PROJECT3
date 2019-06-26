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
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300|Prata'
	rel='stylesheet' type='text/css' />
<script type="text/javascript"
	src="resources/js/modernizr.custom.26887.js"></script>
</head>
<body>
	<div class="container">

		<%
			String memId = (String) session.getAttribute("memId");
			if (memId == null || memId.equals("")) { //세션 없을 경우
		%>

		<!-- Codrops top bar -->
		<div class="codrops-top">
			<span class="right"><a href="member/memLogin.jsp"><strong>&laquo;
						로그인</strong></a> <a href="member/memInsert.jsp">회원가입</a> </span>
		</div>

		<%
			} else {
		%>

		<!-- Codrops top bar -->
		<div class="codrops-top">
			<span class="right"><a href="member/memMyPage.jsp"><strong>&laquo;
						마이페이지</strong></a><span class="right"> <a href="memLogout.do">로그아웃</a></span>
		</div>

		<%
			}
		%>

		<header>
		<h1>
			<strong>오늘의 레시피 </strong> FoodMall
		</h1>
		<h2>매일 업데이트 되는 신선식품의 물가를 확인하고 구매하세요</h2>
		<h3>오늘의 레시피로 맛있는 식탁을 꾸며보세요!</h3>

		<div class="support-note">
			<span class="no-cssanimations">CSS animations are not
				supported in your browser</span> <span class="no-csstransforms">CSS
				transforms are not supported in your browser</span> <span
				class="no-csstransforms3d">CSS 3D transforms are not
				supported in your browser</span> <span class="no-csstransitions">CSS
				transitions are not supported in your browser</span> <span
				class="no-generatedcontent">CSS Generated Content is not
				supported in your browser</span> <span class="note-ie">Sorry, only
				modern browsers.</span>
		</div>
		</header>

		<div class="main">

			<div class="fs-slider" id="fs-slider">

				<figure> <img src="resources/images/1.jpg" alt="image01" />
				<figcaption>
				<h3>Eloquence</h3>
				<p>American apparel flexitarian put a bird on it, mixtape
					typewriter irony aesthetic.</p>
				</figcaption> </figure>

				<figure> <img src="resources/images/2.jpg" alt="image02" />
				<figcaption>
				<h3>Quintessential</h3>
				<p>Cardigan craft beer mixtape, skateboard forage fixie truffaut
					messenger bag.</p>
				</figcaption> </figure>

				<figure> <img src="resources/images/3.jpg" alt="image03" />
				<figcaption>
				<h3>Surreptitious</h3>
				<p>Truffaut iphone flexitarian, banh mi thundercats cliche wolf
					biodiesel gastropub.</p>
				</figcaption> </figure>

				<figure> <img src="resources/images/4.jpg" alt="image04" />
				<figcaption>
				<h3>Imbroglio</h3>
				<p>Scenester fixie pickled, shoreditch fugiat enim craft beer
					retro mustache.</p>
				</figcaption> </figure>

				<figure> <img src="resources/images/5.jpg" alt="image05" />
				<figcaption>
				<h3>Lissome</h3>
				<p>Aute sunt aliqua do sapiente. Food truck ut sustainable
					thundercats four loko.</p>
				</figcaption> </figure>

			</div>
		</div>

	</div>
	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
	<script type="text/javascript" src="resources/js/jquery.imgslider.js"></script>
	<script type="text/javascript">
		$(function() {

			$('#fs-slider').imgslider();

		});
	</script>
</body>
</html>