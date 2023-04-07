<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOOK一覧</title>
<link rel="stylesheet" href="/bootstrap.min.css">

</head>
<body>
	<p>
		書籍名：
		<c:out value="${param.bookName}" />
		の検索結果
	</p>
	<table border="1" class="table table-striped">
		<tr>
			<th>書籍ID</th>
			<th>書籍名</th>
			<th>価額</th>
			<th>値引き金額</th>
			<th>ページ数</th>
			<th>ISBN番号</th>
			<th>発売日</th>
			<th>カテゴリ</th>
			<th>出版社</th>
		</tr>

		<c:forEach items="${bookList}" var="book">
			<tr>
				<td><c:out value="${book.bookId}" /></td>
				<td><c:out value="${book.bookName}" /></td>
				<td><c:out value="${book.price}" /></td>
				<td><c:out value="${book.discount}" /></td>
				<td><c:out value="${book.pageCount}" /></td>
				<td><c:out value="${book.isbn13}" /></td>
				<td><c:out value="${book.onSaleDate}" /></td>
				<td><c:out value="${book.categoryName}" /></td>
				<td><c:out value="${book.publisherName}" /></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>