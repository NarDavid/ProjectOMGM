<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<style>
#wrap {
	display: flex;
	flex-direction: column;
}
#head {
	min-width: 60%;
	margin-right: 15%;
	margin-top: 2%;
	margin-left: 28%;
	margin-bottom: 2%;
	font-size: 20px;
	padding-bottom: 1%;
	border-bottom: 2px solid #FFABB9;
}
#body {
	display: flex;
	flex-direction: row;
	height: 100%;
}
#banner {
	display: flex;
	width: 15%;
	height: 30%;
	flex-direction: column;
	margin-left: 7%;
	border-radius: 10px;
}
#content {
	display : flex;
	flex-direction :column;
	margin-left: 6%;
	width: 43%;
	height: 100%;
}
#fieldsetstyle {
	margin-top: 5%;
	display: block;
	border: 1px solid #FFABB9;
	border-radius: 10px;
	background-color: #FFABB9;
	color: white;
	padding: 10px;
}
ul { /*순서 없는 목록에 적용할 스타일*/
	list-style-type: none; /*불릿 없앰*/
}
.centred { /*class=centred인 div에 적용할 스타일*/
	text-align: right; /*가운데 정렬*/
	margin-top: 2%;
	margin-right: 1%;
	margin-bottom: 2%;
}
.fset { /*필드셋에 적용할 스타일*/
	border-radius: 20px 5px 20px 5px;
	display: block;
	margin-inline-start: 2px;
	margin-inline-end: 2px;
	padding-block-start: 0.35em;
	padding-inline-start: 0.75em;
	padding-inline-end: 0.75em;
	padding-block-end: 0.625em;
	min-inline-size: min-content;
	border-width: 2px;
	border-style: groove;
	border-color: #FFABB9;
	border-image: initial;
	margin-top: 3%;
}
.flgnd { /*필드셋의 제목 스타일*/
	font-weight: bold; /*폰트 굵음*/
	font-size: 18px; /*글자크기 18px*/
	color: purple; /*자주색 글자*/
}
#reservationset {
	display: flex;
	flex-direction: row;
}
.set {
	display: flex;
	flex-direction: row;
}
.set-key {
	width: 30%
}
.reservationsets {
	width: 50%;
}
.supple1 {
	width: 25%
}
.suppleWrap {
	display: flex;
	flex-direction: row;
}
.suppleInput {
	width: 55%;
}
.cost_wrap {
	display: flex;
	flex-direction: row;
}
.cost-1 {
	margin-left: 3%;
	margin-right: 1%;
	width: 25%;
}
.cost-input {
	width: 70%;
}
#service_kind {
	margin-left: 27%;
	color: #347F77;
}
.buttons {
	border: 1px solid #ffffff;
	background-color: white;
	cursor: pointer;
	border: 1px solid #e2e2e2;
	color: gray;
	font-size: 12px;
	font: 정선동강;
	padding-left: 1%;
	padding-right: 1%;
	color: purple;
}
.alink:link {
	color: white;
}
.alink:visited {
	color: white;
}
</style>
<script type="text/javascript">
	function goServiceList() {
		window.location.href = "myServiceList.do";
	}
</script>
</head>
<body>
	<div id="wrap">
		<div id="head">
			<h1>MY PAGE</h1>
		</div>
		<div id="body">
			<div id="banner">
				<fieldset id="fieldsetstyle">
					<a href="myPage.do" class="alink">내 정보</a>
				</fieldset>
				<fieldset id="fieldsetstyle">
					<a href="#" class="alink">내 고양이 정보</a>
				</fieldset>
				<fieldset id="fieldsetstyle">
					<a href="myServiceList.do" class="alink">서비스</a>
				</fieldset>
				<fieldset id="fieldsetstyle">
					<a href="myBuyListLog.do" class="alink">구매내역</a>
				</fieldset>
				<fieldset id="fieldsetstyle">
					<a href="#" class="alink">반려묘 일지</a>
				</fieldset>
				<fieldset id="fieldsetstyle">
					<a href="#" class="alink">내가 작성한 후기</a>
				</fieldset>
			</div>
			<div id="content">
				<fieldset class="fset">
					<legend class="flgnd">예약 정보</legend>
					<div id="reservationset">
						<div class="reservationsets">
							<ul>
								<li>
									<div class="set">
										<div class="set-key">예약번호</div>
										<div class="set-value">1234</div>
									</div>
								</li>
								<li>
									<div class="set">
										<div class="set-key">입실시간</div>
										<div class="set-value">10시</div>
									</div>
								</li>
								<li>
									<div class="set">
										<div class="set-key">예약일자</div>
										<div class="set-value">어제</div>
									</div>
								</li>
							</ul>
						</div>
						<div class="reservationsets">
							<ul>
								<li>
									<div class="set">
										<div class="set-key">방번호</div>
										<div class="set-value">402호</div>
									</div>
								</li>
								<li>
									<div class="set">
										<div class="set-key">퇴실시간</div>
										<div class="set-value">18시</div>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</fieldset>
				<fieldset class="fset">
					<legend class="flgnd">부가서비스 정보</legend>
					<ul>
						<li>
							<div class="suppleWrap">
								<div>
									<input type="checkbox" checked="checked" disabled="disabled">
								</div>
								<div class="supple1">픽업서비스</div>
								<div class="supple2">
									<input type="text" value="신청" readonly="readonly"
										class="suppleInput">
								</div>
							</div>
						</li>
						<li>
							<div class="suppleWrap">
								<div>
									<input type="checkbox" disabled="disabled">
								</div>
								<div class="supple1">냥박일지 서비스</div>
								<div class="supple2">
									<input type="text" value="미신청" readonly="readonly"
										class="suppleInput">
								</div>
							</div>
						</li>
					</ul>
				</fieldset>
				<fieldset class="fset">
					<legend class="flgnd">가격 정보</legend>
					<ul>
						<li>
							<div class="cost_wrap">
								<div class="cost-1">예약요금</div>
								<div>
									<input type="text" value="0" class="cost-input">
								</div>
							</div>
						</li>
						<li>
							<div class="cost_wrap">
								<div class="cost-1">부가서비스 요금</div>
								<div>
									<input type="text" value="0" class="cost-input">
								</div>
							</div>
						</li>
					</ul>
				</fieldset>
				<div class="centred">
					<input type="button" value="서비스 리스트로" onclick="goServiceList()"
						class="buttons">
				</div>
			</div>
		</div>
	</div>
</body>
</html>