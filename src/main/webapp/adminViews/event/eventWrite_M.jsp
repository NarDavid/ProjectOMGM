<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="resources/style/summernote/summernote-lite.css">
<style type="text/css">
#eventWrite_wrap {
	display: flex;
	flex-direction: column;
	width: 60%;
	margin: auto;
}

#eventWrite_head {
	min-width: 60%;
	margin-top: 2%;
	margin-bottom: 2%;
	font-size: 20px;
	padding-bottom: 1%;
	border-bottom: 2px solid #FFABB9;
}

#eventWrite_body {
	display: flex;
	flex-direction: column;
	margin-bottom: 2%;
}

#eventWrite_setting {
	display: flex;
	flex-direction: column;
}

.eventWrite_settings {
	display: flex;
	flex-direction: row;
	margin-bottom: 1.5%;
}

.eventWrite_leftsettings {
	display: flex;
	flex-direction: row;
	width: 40%;
}

.eventWrite_rightsettings {
	display: flex;
	flex-direction: row;
	width: 40%;
}

.eventWrite_centersettings {
	display: flex;
	flex-direction: row;
	width: 80%;
}

#eventWrite_title_key {
	width: 8%;
}

.eventWrite_keys {
	margin-right: 5%;
}

.eventWrite_values {
	margin-right: 5%;
}

#eventWrite_title_value {
	width: 100%;
}

#eventWrite_title_input {
	width: 87%;
}

#eventWrite_leg {
	display: flex;
	flex-direction: row;
	margin-bottom: 2%;
	margin-left: 87%;
	width: 100%;
}

.eventWrite_buttons {
	margin-right: 1.5%;
}
</style>


<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="resources/js/summernote/summernote-lite.js"></script>
<script src="resources/js/summernote/lang/summernote-ko-KR.js"></script>
<script>
var jqadmin = jQuery.noConflict();
jqadmin(document).ready(function() {
	jqadmin('#summernote').summernote({
			height : 350, // 에디터 높이
			minHeight : null, // 최소 높이
			maxHeight : null, // 최대 높이
			focus : true, // 에디터 로딩후 포커스를 맞출지여부
			lang : "ko-KR" // 한글 설정
		});
	});
</script>
</head>
<body>
<<<<<<< HEAD:src/main/webapp/adminViews/event/eventWrite_M.jsp
	<form method="post" action="eventWrite_M.mdo">
=======
	<form method="post" action="writeCatCareLog.do">
		<input type="hidden" name="CATCARELOG_WRITER"
			value="${careInfo.CATCARELOG_WRITER}">
>>>>>>> 9aa0e7d462240c01c13265b8547014802c3857b9:src/main/webapp/adminViews/event/eventWrite.jsp
		<div id="eventWrite_wrap">
			<div id="eventWrite_head">
				<h1>공지사항 N 이벤트 작성</h1>
			</div>
			<div id="eventWrite_body">
				<div id="eventWrite_setting">
					<div id="setting1" class="eventWrite_settings">
						<div class="eventWrite_leftsettings">
							<div class="eventWrite_keys">글 번호</div>
							<div class="eventWrite_values">
<<<<<<< HEAD:src/main/webapp/adminViews/event/eventWrite_M.jsp
							<input type="text" readonly="readonly" name="EVENT_NO" value="${eventInfo.EVENT_NO}"/>
=======
								<input type="text" value="" name="CATCARELOG_USERNUM" />
>>>>>>> 9aa0e7d462240c01c13265b8547014802c3857b9:src/main/webapp/adminViews/event/eventWrite.jsp
							</div>
						</div>
						<div class="eventWrite_rightsettings">
							<div class="eventWrite_keys">진행중or마감</div>
							<div class="eventWrite_values">
<<<<<<< HEAD:src/main/webapp/adminViews/event/eventWrite_M.jsp
							<input type="text"  value="" name="EVENT_STATUS"/>
=======
								<input type="text" value="" name="CATCARELOG_SERVICENUM" />
>>>>>>> 9aa0e7d462240c01c13265b8547014802c3857b9:src/main/webapp/adminViews/event/eventWrite.jsp
							</div>
						</div>
					</div>
					<div id="setting2" class="eventWrite_settings">
						<div class="eventWrite_leftsettings">
							<div class="eventWrite_keys">기간 시작</div>
							<div class="eventWrite_values">
							<input type="text" name="EVENT_START"/>
							</div>
						</div>
						<div class="eventWrite_rightsettings">
							<div class="eventWrite_keys">기간 종료</div>
							<div class="eventWrite_values">
							<input type="text" name="EVENT_END"/>
							</div>
						</div>								
					</div>
					<div id="setting3" class="eventWrite_settings">
						<div class="eventWrite_centersettings">
							<div class="eventWrite_keys" id="eventWrite_title_key">제 목</div>
							<div class="eventWrite_values" id="eventWrite_title_value">
<<<<<<< HEAD:src/main/webapp/adminViews/event/eventWrite_M.jsp
								<input type="text" id="eventWrite_title_input" name="EVENT_TITLE"/>								
=======
								<input type="text" id="eventWrite_title_input"
									name="CATCARELOG_TITLE" />
>>>>>>> 9aa0e7d462240c01c13265b8547014802c3857b9:src/main/webapp/adminViews/event/eventWrite.jsp
							</div>
						</div>
					</div>
				</div>
<<<<<<< HEAD:src/main/webapp/adminViews/event/eventWrite_M.jsp
				<div id="eventWrite_content">내용	
					<textarea id="summernote" name="EVENT_CONTENT">
=======
				<div id="eventWrite_content">
					내용
					<textarea id="summernote" name="CATCARELOG_CONTNET">
>>>>>>> 9aa0e7d462240c01c13265b8547014802c3857b9:src/main/webapp/adminViews/event/eventWrite.jsp
					</textarea>
				</div>
				<!-- end content -->
			</div>
			<!-- end body -->
			<div id="eventWrite_leg">
				<input type="submit" value="글 작성" class="eventWrite_buttons" /> <input
					type="reset" value="리셋" class="eventWrite_buttons" />
			</div>
			<!-- end foot -->
		</div>
		<!-- end wrap -->
	</form>
</body>
</html>