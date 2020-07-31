<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Title</title>
</head>
<style>
<%
--
 
유치원 소개    -- %> .kinderGarden {
	text-align: center;
	margin: 100px 0;
	font-family: 'noto-sans';
	line-height: 30px;
	font-weight: 300;
	color: #777;
	letter-spacing: -1px;
}

.kinderGarden_title {
	margin: 20px;
}

.kinderGarden_title h1 {
	font-size: 26px;
	font-weight: 600;
	color: #555;
	letter-spacing: -1px;
}

.kinderGarden_title p {
	margin-top: 20px;
	font-size: 20px;
}

.kinderGarden_info {
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
	justify-content: space-around;
	height: 30%;
	padding: 0 2%;
	margin: 0 auto;
}

.kinderGarden_info li {
	width: 400px;
	margin: 2%;
	font-size: 16px;
}

.kinderGarden_info li img {
	width: 400px;
}

.kinderGarden_info h3 {
	font-size: 19px;
	margin: 30px;
	font-weight: 500;
	color: #555;
	letter-spacing: -1px;
}

<%
--

   

교육 시간표    -- %>.education_schedule {
	margin: 100px 0;
	font-family: 'noto-sans';
	line-height: 30px;
	text-align: center;
	display: flex;
	flex-direction: column;
	font-weight: 600;
	color: #555;
	letter-spacing: -1px;
}

.education_schedule_title {
	margin: 50px;
	font-size: 26px;
}

.education_schedule table {
	margin: 30px auto;
	width: 80%;
	text-align: center;
	/*font-size: 12px;*/
	font-weight: 600;
	color: #444;
	letter-spacing: -1px;
}

.education_schedule th {
	border-top: 1px solid gray;
	padding: 10px;
	background-color: #F28888;
}

.education_schedule tr {
	border-bottom: 1px solid gray;
}

.education_schedule tr td {
	padding: 10px;
}

<%
--

   

월간 스케쥴    -- %>.education_schedule_month_subTitle {
	background-color: pink;
}

@media all and (max-width:768px) { <% --    
	
	유치원 소개    -- %>.kinderGarden_info {
		display: flex;
		flex-wrap: wrap;
		justify-content: space-around;
		height: 30%;
		padding: 2%;
		margin: 0 auto;
	}
	<%
	--
	
	   
	
	교육
	
	 
	
	시간표
	
	    
	
	--
	
	
	%
	>
}

</
style> <body> <%-- 유치원 소개 -- %> <div class ="kinderGarden "> <div class
	="kinderGarden_title "> <h1> "즐거운 교육 공간, 유치원 "</h1> <p>반려견이 매일 정해진 교육 프로그램에 따라 운영되는 프리미엄 유치원입니다
	.</p> </div> <ul class ="kinderGarden_info "> <li> <img src ="resources
	/img /main_image.jpg " alt =""> <h3>체계적인 학습 커리큘럼 </h3> <p>행동 전문 수의사와 교육 전문가가 설계한 학습 커리큘럼을 통해 반려견의 사회성 향상과 행동 발달을 목표로 합니다
	.</p> </li> <li> <img src ="resources /img /main_image.jpg " alt =""> <h3>반려견 교육 전문가
	</h3> <p>국제공인자격증을 갖춘 전문가들이 교육과 케어 서비스를 제공하는 프리미엄 유치원 입니다 .</p> </li> <li>
	<img src ="resources /img /main_image.jpg " alt =""> <h3>긍정강화 교육 진행 </h3>
	<p>체벌은 일체 하지 않으며, 간식이나 장난감 등을 활용한 동기 부여 교육으로 올바른 행동을 가르칩니다 .</p> </li>
	</ul> </div> <%-- 유치원 일일 스케쥴 -- %> <div class ="education_schedule "> <div class
	="education_schedule_title "> <h3>교육 스케쥴 </h3> </div> <table> <thead> <tr>
	<th>시간 </th> <th>교육 내용 </th> </tr> </thead> <tr> <td>08:00 ~ 10:00 </td>
	<td>출석체크 및 등원(배변교육) </td> </tr> <tr> <td>10:00 ~ 12:00 </td> <td>오전교육
	</td> </tr> <tr> <td>12:00 ~ 13:00 </td> <td>점심식사 &휴식(배변교육) </td> </tr>
	<tr> <td>13:00 ~ 15:00 </td> <td>오후교육 </td> </tr> <tr> <td>15:00 ~ 17:00
	</td> <td>휴식 &음악감상 </td> </tr> <tr> <td>17:00 ~ 18:00 </td> <td>그루밍 하원준비(배변교육)
	</td> </tr> <tr> <td>18:00 ~ 19:00 </td> <td>케어 일지 전송 </td> </tr> <tr>
	<td>19:00 ~ 20:00 </td> <td>유치원 소독 및 청소 </td> </tr> </table> </div> <%-- 유치원 월간 스케쥴 --
	%> <div class ="education_schedule "> <div class ="education_schedule_title
	"> <h3>월간 교육 스케쥴 </h3> </div> <table> <thead class ="education_schedule_title_month
	"> <tr> <th>요일 </th> <th>월 </th> <th>화 </th> <th>수 </th> <th>목 </th> <th>금
	</th> </tr> </thead> <tbody class ="education_schedule_month_tbody ">
	</tbody> </table> </div> <script>document.addEventListener( "DOMContentLoaded
	", function() {for (let i=1;i <=4;i ++) {
	document.querySelector('.education_schedule_month_tbody').innerHTML +=
	'<tr class="education_schedule_month_subTitle">\n' + ' <td>구분</td>\n' +
	' <td></td>\n' + ' <td></td>\n' + ' <td>'+i+'주차</td>\n' + '
	<td></td>\n' + ' <td></td>\n' + ' </tr>\n' + ' <tr>\n' + '
	<td>오전수업</td>\n' + ' <td>맞춤교육</td>\n' + ' <td>하우스</td>\n' + '
	<td>목줄/하네스</td>\n' + ' <td>장난감 놀이</td>\n' + ' <td>타겟</td>\n' + '
	</tr>\n' + ' <tr>\n' + ' <td>오후교육</td>\n' + ' <td>맞춤교육</td>\n' + '
	<td>바디터치</td>\n' + ' <td>기다려</td>\n' + ' <td>스킨쉽</td>\n' + '
	<td>산책매너</td>\n' + ' </tr> ';
	
}
;
}
)
;

    
</
script
>
</
body
>
</
html
>
