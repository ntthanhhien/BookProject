<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>search result</title>
</head>
<body>
	<h1>ID: <c:out value="${param.bookId}"/>の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd><c:out value="${book.bookId}"/></dd>
		<dt>BOOK NAME</dt>
		<dd><c:out value="${book.bookName}"/></dd>
		<dt>BOOK PRICE</dt>
		<dd><fmt:formatNumber pattern="#,###" value="${book.price}"/></dd>
		<dt>ORDER HEADER SHOW</dt>
		<dd><fmt:formatDate pattern="yyyy年MM月dd日 EEEE" value="${orderHeader.orderDatetime}" /></dd>
		
		
	</dl>
</body>
</html>