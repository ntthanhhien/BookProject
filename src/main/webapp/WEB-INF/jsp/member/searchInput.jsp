<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchInput</title>
<link rel="stylesheet" href="../bootstrap.min.css">

</head>
<body>
	<h1>名前で検索</h1>
	<form action="searchResult">
		<input class="form-control" type="text" name="memberName" placeholder="入力してください"/>
		<input class="btn btn-primary" type="submit"  value="検索">
	</form>
</body>
</html>