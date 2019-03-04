<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>순남이의 To Do List...</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1>ToDoList</h1>
		<div class="container">
			<form method="post">
				<div class="form-group">
					<label for="user_id">아이디</label> <input type="text" id="user_id" name="user_id">
				</div>
				<div class="form-group">
					<label for="user_pw">비밀번호</label> <input type="password" id="user_pw" name="user_pw">
				</div>
				<div class="form-group">
					<input type="checkbox"> Remember ID
				</div>
				<div class="form-group">
					<button type="button" class="btn btn-success">JOIN</button>
					<button type="button" class="btn btn-warning">LOGIN</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>