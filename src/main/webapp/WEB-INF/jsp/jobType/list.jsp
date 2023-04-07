<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>職種一覧</title>
<link rel="stylesheet" href="/bootstrap.min.css">

</head>
<body>
	<p>職種一覧</p>
	<div class="col-md-8">
		<ul>
			<c:forEach items="${jobTypeList}" var="jt" varStatus="st">
				<li>${jt.jobTypeId}:${jt.jobTypeName}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>