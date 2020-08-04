<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jury
  Date: 2020-08-03
  Time: 오후 6:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <style>
        #order_table input {
            width: 100%;
            border: none;
        }
        .del_btn {
            display: flex;
            flex-direction: row;
        }
        .del_btn_schedule_button a {
            margin: 5px;
            width:50%;
        }
    </style>
</head>
<body>
<!-- DataTales Example -->
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">주문현황</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="order_table" width="100%" cellspacing="0">
                <thead>
                <tr>
                    <th>주문번호</th>
                    <th>ID</th>
                    <th>주문날짜</th>
                    <th>주문상태</th>
                    <th>전화번호</th>
                    <th>메모</th>
                    <th>삭제</th>
                </tr>
                </thead>
                <tbody>
                <form action="productStatusDelete.mdo">
                    <c:forEach var="pro_status" items="${pro_status}">
                        <input type="hidden" name="order_status_no" value="${pro_status.order_status_no}">
                        <tr>
                            <th>${pro_status.order_status_no}</th>
                            <th>${pro_status.order_status_id}</th>
                            <th>${pro_status.order_status_date}</th>
                            <th>${pro_status.order_status_state}</th>
                            <th>${pro_status.order_status_phone}</th>
                            <th>${pro_status.order_status_memo}</th>
                            <th><button  type="submit" class="btn btn-primary btn-delete">삭제</button></th>
                        </tr>
                    </c:forEach>
                </form>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>