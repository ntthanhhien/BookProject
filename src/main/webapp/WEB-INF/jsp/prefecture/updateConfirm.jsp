<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県を更新(確認)</title>
<link rel="stylesheet" href="/bootstrap.min.css">
</head>
<body>
	<h1>都道府県を更新(確認)</h1>
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
		<div class="form-group">
			<label>3地方区分</label> 
			<span><c:out value="${section3.name}" /></span>
		</div>
		<div class="form-group">
			<label>8地方区分</label> 
			<span><c:out value="${section8.name}" /></span>
		</div>
		<div class="form-group">
			<label>インフラ有無</label>
			<ul>
				<c:forEach items="${infrastructureList}" var="infrastructure">
					<c:out value="${infrastructure.name}" />
				</c:forEach>
			</ul>
		</div>
		<form:form modelAttribute="prefectureForm" action="update">
			<form:hidden path="id" />
			<form:hidden path="name" />
			<form:hidden path="population" />
			<form:hidden path="section3Id" />
			<form:hidden path="section8Id" />
			<form:hidden path="infrastructureList" />
			<input type="submit" value="OK" formaction="updateExecute" />
			<input type="submit" value="戻る" formation="update" />
		</form:form>

	</div>
</body>
</html>