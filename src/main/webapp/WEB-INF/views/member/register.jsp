<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Member Register</title>
    
</head>

<body>
	<script type="text/javascript">
	$(document).ready(function(){
		
	});
	
	</script>
	
		<div class="hero-unit">
			<h1>Member Register</h1>
		
		</div>
		
			<div class="row-fluid">
				<div class="span8">
				
					<form name="memberForm" method="post" action="/member/register">
						Nickname : <input type="text" name="nickName" id="nickName" /><br/>
						Password : <input type="password" name="passwd" id="passwd" /><br/>
						email : <input type="text" name="email" id="email" /><br/>
						<input type="submit" value="Register" />					
					</form>
	 			</div>
			</div>
		<div id="result" style="width:100%; height:400px; overflow-y:scroll;"></div>
</body>
</html>