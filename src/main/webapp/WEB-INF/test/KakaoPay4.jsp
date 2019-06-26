<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>카카오페이 - 승인</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" media="screen"
	href="/assets/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" media="screen"
	href="/vassets/stylesheets/payment.css" />
<script src="/assets/libs/jquery-1.10.2.min.js"></script>
<div id="payment">
	<div class="header">
		<strong> <kakaopay></kakaopay>
		</strong>
	</div>
	<div class="body">
		<div class="content"></div>
		<p>카카오페이 결제가 정상적으로 완료되었습니다.</p>
		<p>결제일시: 2018-08-02T16:47:40</p>
		<p>상품명: 커피</p>
		<p>결제금액: 1100원</p>
		<div class="alert alert-warning">해당 페이지는 카카오페이에서 제공하는 페이지가 아닙니다.
		</div>
	</div>
	<div class="footer">
		<button class="btn-wrap">
			<span id="closeBtn"></span>
		</button>
	</div>
</div>
<script type='text/javascript'>
	//<![CDATA[
	$(document).ready(function() {
		$(".btn-wrap").click(function() {
			self.close();
		});
	});
	//]]>
</script>
</body>
</html>