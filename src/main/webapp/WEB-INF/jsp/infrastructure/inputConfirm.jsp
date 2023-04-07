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
					value="${infraForm.id}" /></span>
		</div>
		<div class="form-group">
			<label for="name">インフラ名</label> <span><c:out
					value="${infraForm.name}" /></span>
		</div>
		<div class="form-group">
			<label for="name">登録日</label> <span><c:out
					value="${infraForm.registDate}" /></span>
		</div>

		<form:form modelAttribute="infraForm" action="input">
			<form:hidden path="id" />
			<form:hidden path="name" />
			<form:hidden path="registDate" />
			<input type="submit" value="戻る" />
		</form:form>

	</div>
</body>
</html>