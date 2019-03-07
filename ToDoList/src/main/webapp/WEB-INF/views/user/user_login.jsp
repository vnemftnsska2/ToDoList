<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>순남이의 To Do List...</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>ToDoList</h1>
		<div class="container">
			<form action="MainPage" method="post">
				<div class="form-group">
					<label for="user_id">아이디</label> <input type="text" id="user_id" name="user_id" required>
				</div>
				<div class="form-group">
					<label for="user_pw">비밀번호</label> <input type="password" id="user_pw" name="user_pw" required>
				</div>
				<div class="form-group">
					<input type="checkbox" name="idCheck"> Remember ID
				</div>
				<div class="form-group">
					<button type="button" class="btn btn-success" id="user_join">JOIN</button>
					<button type="submit" id="loginBtn" class="btn btn-warning">LOGIN</button>
				</div>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		
		// 2019.03.04 가입하기 버튼 : 회원가입 페이지로 이동
		$('#user_join').on("click", function(){
			location.href='/joinUS';
		});
		
		// 2019.03.07 로그인 버튼
		$('#loginBtn').on("submit", function(e){
			// form 으로 다시 돌아오지 않도록 기능 막음
			e.preventDefualt();
			
			// 로그인에 실패했을 경우
			
			
			
			
			// 로그인에 성공했을 경우
			
			
		});
		
		
	
		
	});


</script>
</html>