<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍削除確認</title>
<link rel="stylesheet" href="/bootstrap.min.css">
</head>
<body>
	<h1>書籍削除確認</h1>
	<div class="col-md-12">
		<div class="form-group">
			<label for="bookId">書籍ID</label> <span><c:out
					value="${book.bookId}" /></span>

		</div>
		<div class="form-group">
			<label for="bookName">書籍名</label> <span><c:out
					value="${book.bookName}" /></span>
		</div>
		<div class="form-group">
			<label for="price">価格</label> <span><c:out
					value="${book.price}" /></span>
		</div>
		<div class="form-group">
			<label for="discount">値引き金額</label> <span><c:out
					value="${book.discount}" /></span>
		</div>
		<div class="form-group">
			<label for="categoryName">カテゴリ</label> <span><c:out
					value="${categoryName}" /></span>
		</div>
		<div class="form-group">
			<label for="publisherName">出版社名</label> <span><c:out
					value="${publisherName}" /></span>
		</div>
		<div class="form-group">
			<label for="pageCount">ページ数</label> <span><c:out
					value="${book.pageCount}" /></span>
		</div>
		<div class="form-group">
			<label for="isbn13">ISBN番号</label> <span><c:out
					value="${book.isbn13}" /></span>
		</div>
		<div class="form-group">
			<label for="onSaleDate">発売日</label> <span> <fmt:formatDate
					pattern="yyyy年MM月dd日" value="${book.onSaleDate}" /></span>
		</div>

		<form action="deleteExecute">
			<input value="${book.bookId}" name="bookId" type="hidden" /> <input
				class="btn btn-secondary" type="submit" value="削除確認" />
		</form>

		<form action="list">
			<input class="btn btn-primary" type="submit" value="戻る" />
		</form>

	</div>
</body>
</html>