<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍一覧</title>
<link rel="stylesheet" href="/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

</head>
<body>
	<div class="container">
	<p>書籍一覧</p>
	<div class="col-md-12">
		<h1>検索結果</h1>
		<table class="table table-striped" id="books-table">
			<thead>
				<tr>
					<th>書籍ID</th>
					<th>書籍名</th>
					<th>価額</th>
					<th>値引き金額</th>
					<th>カテゴリ</th>
					<th>出版社</th>
					<th>ページ数</th>
					<th>ISBN番号</th>
					<th>発売日</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="book">
					<tr>
						<td><c:out value="${book.bookId}" /></td>
						<td><c:out value="${book.bookName}" /></td>
						<td><c:out value="${book.price}" /></td>
						<td><c:out value="${book.discount}" /></td>
						<td><c:out value="${book.categoryName}" /></td>
						<td><c:out value="${book.publisherName}" /></td>
						<td><c:out value="${book.pageCount}" /></td>
						<td><c:out value="${book.isbn13}" /></td>
						<td><c:out value="${book.onSaleDate}" /></td>
						<td>
							<a href="show?bookId=${book.bookId}" class="btn btn-primary">詳細</a> 
							<a href="edit?bookId=${book.bookId}" class="btn btn-success">編集</a>
							<a href="delete?bookId=${book.bookId}" class="btn btn-danger">削除</a>
						</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="http://localhost:8080/book/input" class="btn btn-primary">新規登録</a>
	</div>
	
	</div>
	<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
	<script>
		$(document).ready(function(){
			$('#books-table').DataTable({
				language:{
					"info": " _TOTAL_ 件中 _START_ から _END_ まで表示",
				    "paginate": {
				        "first": "先頭",
				        "last": "最終",
				        "next": "次",
				        "previous": "前"
				    },
				}
			});
		});
	</script>

</body>

</html>
