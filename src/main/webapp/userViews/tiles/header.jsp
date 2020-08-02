<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="resources/js/header.js" defer></script>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@600&display=swap" rel="stylesheet">
</head>
<body>
	<!-- header 영역 -->
	<input type="checkbox" id="sidebar">

	<nav class="navbar">
		<div class="navbar_logo">
			<td><img src="resources/img/자산%201.png" width="160px" /></td>
		</div>

		<header id="side">
			<div>
				<label for="sidebar" class="menu" id="menuBtn"> <span></span>
					<span></span> <span></span>
				</label>
			</div>
		</header>

		<div class="dropmenu">
			<ol class="navbar_menu">
				<li><a href="#"> Reservation </a>
					<ul>
						<li><a href="reservation.do"> 방 빌리기 </a></li>
						<li><a href="kinderGardenReservation.do"> 유치원 등록 </a></li>
					</ul></li>

				<li><a href="#"> Service </a>
					<ul>
						<li><a href="roomIntroduction.do"> 객실소개 </a></li>
						<li><a href="kinderGarden.do"> 유치원 </a></li>
						<li><a href="pickupService_info.do"> 픽업 </a></li>
						<li><a href="messageService.do"> 문자알림 </a></li>
					</ul></li>
				<li><a href="#"> Review </a>
					<ul>
						<li><a href="reviewListBoard.do"> 이용후기 </a></li>
					</ul></li>
				<li><a href="#">OMGMall </a>
					<ul>
						<li><a href="#"> 사료 </a></li>
						<li><a href="toySales.do"> 장난감 </a></li>
					</ul></li>
				<li><a href="#">Info </a>
					<ul>
						<li><a href="#"> 공지&이벤트 </a></li>
						<li><a href="introductionPage.do"> 이용안내 </a></li>
						<li><a href="#"> 도움(Q&A) </a></li>
					</ul></li>
			</ol>
		</div>

    <ul class="login_membership">
        <li><a href="" onclick="login(event)">login</a></li>
        <li><p>|</p></li>
        <li><a href="" onclick="signUp(event)">Join</a></li>
		<li><p>|</p></li>
		<li><a href="">myInfo</a></li>
    </ul>
</nav>

	<!-- 위는 주리 헤더 -->

	<!-- 사이드바 -->
	<div class="sidebar_content">
		<ul>
			<li><a href="#">Reservation</a>
				<ul class="sub_menu">
					<li><a href="reservation.do"> 방 빌리기 </a></li>
					<li><a href="kinderGardenReservation.do"> 유치원 등록 </a></li>
				</ul></li>
			<li><a href="#">Service</a>
				<ul class="sub_menu">
					<li><a href="roomIntroduction.do"> 객실소개 </a></li>
					<li><a href="kinderGarden.do"> 유치원 </a></li>
					<li><a href="pickupService_info.do"> 픽업 </a></li>
					<li><a href="messageService.do"> 문자알림 </a></li>
				</ul></li>
			<li><a href="#">Review</a>
				<ul class="sub_menu">
					<li><a href="reviewListBoard.do"> 이용후기 </a></li>
				</ul></li>
			<li><a href="#">OMGMall</a>
				<ul class="sub_menu">
					<li><a href="#"> 사료 </a></li>
					<li><a href="toySales.do"> 장난감 </a></li>
				</ul></li>
			<li><a href="#">Info</a>
				<ul class="sub_menu">
					<li><a href="#"> 공지&이벤트 </a></li>
					<li><a href="introductionPage.do"> 이용안내 </a></li>
					<li><a href="#"> 도움(Q&A) </a></li>
				</ul></li>
			<div id="menuLogoP">
				<img class="menuLogo" src="resources/img/자산%208.png" alt=""> <img
					class="menuLogo" src="resources/img/자산%201.png" alt="">
			</div>
		</ul>
		<label for="sidebar"></label>
	</div>
	<!-- sidebar 외 영역 -->
	<label for="sidebar" class="background"> </label>

	<%-- signUp --%>
<signUp>
	<input type="checkbox" id="popup">
	<div>
		<div>
			<label for="popup"></label>
			<form action="#" class="signup-form">
				<h1 style="font-weight: 700;">회원가입</h1>
				<div class="txtboxID"> <!-- ID-->
					<input type="text" required>
					<span data-placeholder="ID"></span>
				</div>
				<input type="button" class="checkbtn" value="check" onclick="idCheck()">

				<div class="txt"> <!-- Pw-->
					<input type="pass" required>
					<span data-placeholder="Pass"></span>
				</div>

				<div class="txt"> <!-- RePw-->
					<input type="repass" required>
					<span data-placeholder="RePass"></span>
				</div>

				<div class="txt"> <!-- name-->
					<input type="name" required>
					<span data-placeholder="Name"></span>
				</div>

				<div class="txt"> <!--e-mail-->
					<input type="email" required>
					<span data-placeholder="E-Mail"></span>
				</div>

				<div class="txtboxTEL1"> <!--Tel1-->
					<input type="tel" pattern="[0-9]{3}" required>
					<span data-placeholder="Tel"></span><a>ㅡ</a>
				</div>

				<div class="txtboxTEL2"> <!--Tel2-->
					<input type="tel" pattern="[0-9]{4}" required><a>ㅡ</a>
					<span data-placeholder="Tel2"></span>
				</div>

				<div class="txtboxTEL3"> <!--Tel3-->
					<input type="tel" pattern="[0-9]{4}" required>
					<span data-placeholder="Tel3"></span>
				</div>

				<input type="submit" class="signup" value="Sign UP"> <!-- 회원가입버튼-->
			</form>
		</div>
		<label for="popup"></label>
	</div>
</signUp>


	<%-- login --%>
	<input type="checkbox" id="login_popup">
	<div>
		<div>
			<label for="login_popup"></label>
			<form action="#" class="login-form">
				<h1 style="font-weight:700;">오묘가묘에 <br>오신것을 환영합니다!</h1>

				<div class="txtbox"> <!-- ID필드-->
					<input type="text" required>
					<span data-placeholder="ID" ></span>
				</div>

				<div class="txtbox"> <!-- PW필드-->
					<input type="pass" required>
					<span data-placeholder="Password"></span>
				</div>

				<input type="submit" class="logbtn" value="Login"> <!-- 로그인버튼-->

				<div class="bottom-text">
					Don't have account? <a href="#">Sign up</a><br> <!-- 회원가입 페이지로이동-->
					Forgot account? <a href="#">Here</a> <!--아이디/비밀번호 찾는 페이지로 이동-->
				</div>
			</form>
		</div>
		<label for="login_popup"></label>
	</div>

</body>
</html>
