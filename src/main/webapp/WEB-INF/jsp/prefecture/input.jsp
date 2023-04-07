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
		<form:form modelAttribute="prefectureForm" action="inputConfirm">
			<form:errors path="*" element="p" cssClass="text-danger"></form:errors>
			<div class="form-group">
				<label for="id">ID</label>
				<form:input path="id" cssClass="form-control" />
				<form:errors path="id" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label for="name">都道府県名</label>
				<form:input path="name" cssClass="form-control" />
				<form:errors path="name" element="p" cssClass="text-danger"></form:errors>

			</div>
			<div class="form-group">
				<label for="population">人口</label>
				<form:input path="population" cssClass="form-control" />
				<form:errors path="population" element="p" cssClass="text-danger"></form:errors>

			</div>

			<div class="form-group">
				<label for="date">DATE</label>
				<form:input path="date" cssClass="form-control" />
				<form:errors path="date" element="p" cssClass="text-danger"></form:errors>

			</div>
			<div class="form-group">
				<input type="submit" value="追加" />
			</div>
		</form:form>
	</div>
</body>
</html>