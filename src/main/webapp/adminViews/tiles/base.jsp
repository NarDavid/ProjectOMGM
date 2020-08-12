<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>오묘가묘 - 관리자</title>

<!-- Custom fonts for this template-->
<link rel="stylesheet" href="resources/style/reset.css">
<link href="resources/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

<!-- Custom styles for this template-->
<link href="resources/admin/css/sb-admin-2.min.css" rel="stylesheet">

<link rel="shortcut icon" href="resources/img/자산%208.png">

</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">
		<div>
			<tiles:insertAttribute name="sidebar" />
		</div>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
				<div>
					<tiles:insertAttribute name="header" />
				</div>
				<!-- Begin Page Content -->
				<div style="min-height:565px;" class="container-fluid">
					<tiles:insertAttribute name="body" />
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->

			<div>
				<tiles:insertAttribute name="footer" />
			</div>

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-info" href="logout.lo">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="resources/admin/vendor/jquery/jquery.min.js"></script>
	<script
		src="resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="resources/admin/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
<%--	<script src="resources/admin/vendor/chart.js/Chart.min.js"></script>--%>

	<!-- Page level custom scripts -->
<%--	<script src="resources/admin/js/demo/chart-area-demo.js"></script>--%>
<%--	<script src="resources/admin/js/demo/chart-pie-demo.js"></script>--%>
<%--	<script src="resources/admin/js/demo/chart-bar-demo.js"></script>--%>

</body>
</html>
