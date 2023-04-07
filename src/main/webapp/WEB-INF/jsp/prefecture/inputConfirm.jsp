<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
<link rel="stylesheet" href="/bootstrap.min.css">
</head>
<body>
	<div class="col-md-12">
		<div class="form-group">
			<label for="id">ID</label> <span><c:out
					value="${prefectureForm.id}" /></span>
		</div>
		<div class="form-group">
			<label for="name">都道府県名</label> <span><c:out
					value="${prefectureForm.name}" /></span>
		</div>
		<div class="form-group">
			<label for="population">人口</label> <span><c:out
					value="${prefectureForm.population}" /></span>
		</div>

		<form:form modelAttribute="prefectureForm" action="input">
			<form:hidden path="id" />
			<form:hidden path="name" />
			<form:hidden path="population" />
			<input type="submit" value="戻る" />
		</form:form>

	</div>
</body>
</html>