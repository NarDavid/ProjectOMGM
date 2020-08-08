<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YongSun Jang
  Date: 2020-07-30
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <title>toy-sales</title>
    <link type="text/css" rel="stylesheet" href="resources/style/sales/toySales.css">
    <!-- <script src="//code.jquery.com/jquery-3.3.1.min.js" defer></script> -->

</head>
<body>
<div id="toy-sales-div">
    <div id="toy-img-section">
        <img src="resources/img/product/${toyList.toy_img}" class="toy-img-01" >
    </div>
    <div id="toy-sales-section">
        <div class="toy-sales-section00">
            ${toyList.toy_name}
        </div>
        <div class="toy-sales-section01" id="toy-sales-section01" value="${toyList.toy_discount}">
            ${toyList.toy_discount}
        </div>
        <div class="toy-sales-section02">
            <p class="toy-delieve-price-text">
                배송비 : 2,500원 (50,000원 이상 구매 시 무료)
            </p>
        </div>
        <div class="toy-sales-section03">
            <p class="toy-type-text">타입을 선택하세요</p>
            <select id="toy-sales-option" name="toy-sales-option" onchange="changeToySelect()">
                <option value="selected disabled">상품을 고르세요</option>
                <option value="${toyList.toy_name}">${toyList.toy_name}</option>

            </select>
        </div>
        <div class="toy-sales-section04">
            <p class="toy-sales-infoText">최소주문수량 1개 이상</p>
            <p id="toy-sales-color"></p>
        </div>
        <div class="toy-sales-section05">
            <p>수량 : </p>
            <p id="number-of-toy" class="number-of-toy" value="0">0</p>
            <button id="add-of-toy" class="add-of-toy" onclick="addToys()">추가</button>
            <button id="abs-of-toy" class="abs-of-toy" onclick="absToys()">제거</button>
        </div>
        <div class="toy-sales-section06">
            총 상품 금액 :

            <p id="total-toy-prices" class="total-toy-prices">0</p>
        </div>
        <div class="toy-sales-section07">
            <c:if test="${member != null}">
                <a href="buyImmediately.do" class="byt-immediately00">즉시 구매하기</a>
            </c:if>
            <c:if test="${member == null}">
                <a href="" class="byt-immediately00" onclick="javascript: alert('로그인을 먼저 해주시기 바랍니다')">즉시 구매하기</a>
            </c:if>
            <a href="#" class="byt-immediately01">장바구니 담기</a>
        </div>
        <div class="toy-sales-section08">
            <a class="toy-sales-coupon">
                행복한 하루 보내세요
            </a>
        </div>
<%--        <div class="toy-sales-section09">--%>
<%--            <script src="https://nsp.pay.naver.com/sdk/js/naverpay.min.js" data-client-id="u86j4ripEt8LRfPGzQ8" data-mode="production" data-merchant-user-key="가맹점 사용자 식별키" data-merchant-pay-key="가맹점 주문 번호" data-product-name="상품명을 입력하세요" data-total-pay-amount="1000"--%>
<%--                    data-tax-scope-amount="1000" data-tax-ex-scope-amount="0" data-return-url="사용자 결제 완료 후 결제 결과를 받을 URL">--%>
<%--            </script>--%>
<%--        </div>--%>
    </div>
    <img src="resources/img/product/결제페이지하단01.jpg" style="width: 55%; margin-top: 5%;">
    <img src="resources/img/product/결제페이지하단02.jpg" style="width: 55%">
    <script type="text/javascript" src="resources/js/sales/toySales.js" defer></script>
    <script src="resources/js/header.js" defer></script>
</div>
</body>
</html>
