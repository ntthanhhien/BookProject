<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍更新</title>
<link rel="stylesheet" href="/bootstrap.min.css">
</head>
<body>
	<div class="col-md-12">
		<form:form modelAttribute="bookForm" action="editConfirm">
			<form:errors path="*" element="p" cssClass="text-danger"></form:errors>
			<div class="form-group">
				<label for="bookId">書籍ID</label>
				<form:input path="bookId" cssClass="form-control" />
				<form:errors path="bookId" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label for="bookId">書籍名</label>
				<form:input path="bookName" cssClass="form-control" />
				<form:errors path="bookName" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label for="bookId">価額</label>
				<form:input path="price" cssClass="form-control" />
				<form:errors path="price" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label for="bookId">値引き金額</label>
				<form:input path="discount" cssClass="form-control" />
				<form:errors path="discount" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label>カテゴリ</label>
				<form:select path="categoryName" cssClass="form-control">
					<form:option value="なし" />
					<form:options items="${categoryList}" itemValue="categoryName"
						itemLabel="categoryName" />
				</form:select>
			</div>
			<div class="form-group">
				<label>出版社</label>
				<form:select path="publisherName" cssClass="form-control">
					<form:option value="なし" />
					<form:options items="${publisherList}" itemValue="publisherName"
						itemLabel="publisherName" />
				</form:select>
			</div>
			<div class="form-group">
				<label for="bookId">ページ数</label>
				<form:input path="pageCount" cssClass="form-control" />
				<form:errors path="pageCount" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label for="bookId">ISBN番号</label>
				<form:input path="isbn13" cssClass="form-control" />
				<form:errors path="isbn13" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<label for="bookId">発売日</label>
				<form:input path="onSaleDate" cssClass="form-control" />
				<form:errors path="onSaleDate" element="p" cssClass="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<input type="submit" value="更新" />
			</div>
		</form:form>
	</div>
</body>
</html>