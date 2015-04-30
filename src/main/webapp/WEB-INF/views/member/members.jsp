<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Member Register</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/bootstrap-table.css">
	<script src="/resources/js/jquery-2.1.3.min.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
	<script src="/resources/js/bootstrap-table.js"></script>
</head>

<body>
	<script type="text/javascript">
	$(document).ready(function(){
		
	});
	
	</script>
	
		<div class="hero-unit">
			<h1>Member List</h1>
		</div>
		
		<div class="row-fluid">
			<div class="span8">
				<table data-toggle="table" data-url="/rest/member/list" data-height="300" data-search="true">
				    <thead>
				    <tr>
				        <!-- <th data-field="state" data-checkbox="true"></th> -->
				        <th data-field="memberUid" data-align="center" data-sortable="true">Member UID</th>
				        <th data-field="nickName" data-align="center" data-sortable="true">NickName</th>
				        <th data-field="passwd" data-align="center" data-sortable="true">Password</th>
				        <th data-field="email" data-align="center" data-sortable="true">Email</th>
				    </tr>
				    </thead>
				</table>
				<div style="text-align:right;">
				<p><a class="btn btn-primary btn-large" style="margin:10;" href="/member/register">Member Register </a></p>
				</div>
 			</div>
		</div>
		
</body>
</html>