<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果</title>
<link rel="stylesheet" href="/bootstrap.min.css">
<style>
	.bigcity{color:red}
</style>
</head>
<body>
	<div class="col-md-8">	 
	<h1>検索結果</h1>
	<table border="1" class="table table-striped">
		<tr>
			<th>No</th>
			<th>都道府県名</th>
			<th>人口</th>
			<th>３地方区分</th>
			<th>８地方区</th>
			<th></th>
		</tr>
		
		<c:forEach items="${preList}" var="pre"  varStatus="st">
			<tr>
				<td class="'e'+${st.count}"><c:out value="${st.count}"/></td>
				<td><c:out value="${pre.name}"/></td>
				<td <c:if test="${pre.population>2000000}">class="bigcity"</c:if>>
					<fmt:formatNumber pattern="#,###" value="${pre.population}"/>
				</td>
				<td><c:out value="${pre.section3Id}"/></td>
				<td><c:out value="${pre.section8Id}"/></td>
				<td><a href="update?id=<c:out value="${pre.id}"/>" class="btn btn-success">更新</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
	
	<div class="col-md-4">
	<h1>注文</h1>
	<table border="1" class="table">
		<tr>
			<th>No</th>
			<th>orderDatetime</th>
		</tr>
		
		<c:forEach items="${orderHeader}" var="oh"  varStatus="st">
			<fmt:formatDate pattern="EEEE" value="${oh.orderDatetime}" var="day"/>
			<tr>
				<td><c:out value="${oh.orderNo}"/></td>
				<td>
					<c:choose>
						<c:when test="${day=='日曜日'}">
							<span class="text-danger"><c:out value="${day}"/></span>
						</c:when>
						<c:otherwise>
							<span class=""><c:out value="${day}"/></span>
						</c:otherwise>
					</c:choose>
					
					
					<%-- <c:if test="${day=='日曜日'}">
						<span class="text-danger"><c:out value="${day}"/></span>
					</c:if>
					<c:if test="${day!='日曜日'}">
						<span class=""><c:out value="${day}"/></span>
					</c:if> --%>
					
					
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	
</body>
</html>