<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Member Register</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>

<body>
	<script type="text/javascript">
	$(document).ready(function(){
		
	});
	
	</script>

<div class="container">
  <h2>Member Register</h2>
	<form class="form-horizontal" role="form" action="/rest/member/register" method="post">
		<div class="form-group">
			<div class="form-group">
				<label class="control-label col-sm-2" for="nickName">NickName:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="nickName" id="nickName" placeholder="Enter nickName">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="passwd">Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="passwd" id="passwd" placeholder="Enter password">
				</div>
			</div>
			<label class="control-label col-sm-2" for="email">Email:</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" name="email" id="email" placeholder="Enter email">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form>
</div>	
</body>
</html>