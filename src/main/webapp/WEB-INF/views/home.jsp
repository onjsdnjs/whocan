<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
		<div class="hero-unit">
			<h1>Hello Whocan !!</h1>			
			
		</div>

		<div class="hero-unit">
			<p><a class="btn btn-primary btn-large" href="/member">Member Register </a></p>
		</div>
		
		<div class="row-fluid">
			<div class="span8">
			
				<form:form id="form" method="post" modelAttribute="formDTO">
			
				  	<form:input cssClass="input-block-level" path="messageFromUser" placeholder="${typeMessage}" autocomplete="off" />
			 		
					<form:errors path="messageFromUser" cssClass="alert alert-error" element="div"  />
					
		  			<c:if test="${not empty message}">
						<div id="message" class="alert alert-success">
							<spring:message code="message.youWrote" arguments="${message}" htmlEscape="true" />
						</div>	
					</c:if>
					
				  	<button type="submit" class="btn">Submit</button>
					
				</form:form>
			</div>
		</div>
</body>
</html>