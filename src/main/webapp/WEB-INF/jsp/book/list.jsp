<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍一覧</title>
<link rel="stylesheet" href="/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css">

</head>
<body>
	<p>書籍一覧</p>
	<div class="col-md-8">
		<h1>検索結果</h1>
		<table border="1" class="table table-striped" id="books-table">
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
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="book" begin="0" end="2">
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
						<td><div class="btn-group" role="group">
								<a href="show?bookId=${book.bookId}" class="btn btn-primary">詳細</a> 
									<a href="edit?bookId=${book.bookId}" class="btn btn-success">編集</a>
								<a href="delete?bookId=${book.bookId}" class="btn btn-danger">削除</a></td>
						</div>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="row">

			<div class="col-sm-12 col-md-7">
				<div class="dataTables_paginate paging_simple_numbers">
					<ul class="pagination">
						<li class="paginate_button page-item previous"
							id="books-table_previous"><a href="#"
							aria-controls="books-table" data-dt-idx="0" tabindex="0"
							class="page-link">前</a></li>
						<li class="paginate_button page-item active"><a href="#"
							aria-controls="books-table" data-dt-idx="1" tabindex="0"
							class="page-link">1</a></li>
						<li class="paginate_button page-item "><a href="#"
							aria-controls="books-table" data-dt-idx="2" tabindex="0"
							class="page-link">2</a></li>
						<li class="paginate_button page-item "><a href="#"
							aria-controls="books-table" data-dt-idx="3" tabindex="0"
							class="page-link">3</a></li>
						<li class="paginate_button page-item next" id="books-table_next">
							<a href="#" aria-controls="books-table" data-dt-idx="4"
							tabindex="0" class="page-link">次</a>
						</li>
					</ul>
				</div>
			</div>
		</div>

		<a href="http://localhost:8080/book/input" class="btn btn-primary">新規登録</a>
	</div>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
	<script>
	$('#books-table').DataTable({
		   "pagingType": "simple_numbers",
		   "pageLength": 3,
		});
	
	</script>

</body>

</html>
