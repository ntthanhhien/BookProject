<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="/bootstrap.min.css">

</head>
<body>
	<p>
		<c:out value="${param.memberName}" />
		の検索結果
	</p>
	
	<table border="1" class="table table-striped">
		<tr>
			<th>会員ID</th>
			<th>氏名</th>
			<th>誕生日</th>
			<th>職種</th>
		</tr>

		<c:forEach items="${memberList}" var="member">
			<tr>
				<td><c:out value="${member.memberId}" /></td>
				<td><c:out value="${member.memberName}" /></td>
				<td><fmt:formatDate pattern="yyyy/MM/dd" 
				value="${member.birthday}" /></td>
				<td><c:out value="${member.jobTypeName}" /></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>