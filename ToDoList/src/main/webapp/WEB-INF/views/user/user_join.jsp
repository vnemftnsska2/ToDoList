<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do List...</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery.min.js"></script>
</head>
<body>
    <div class="container">
       <h1>회원가입</h1>
        <form id="regForm" method="post">
            <div class="form-group">
                <label for="user_id">아이디 </label>
                <input type="text" id="user_id" name="user_id" required>
            </div>
            <div class="form-group">
                <label for="user_pw">비밀번호 </label>
                <input type="password" id="user_pw" name="user_pw" required>
            </div>
            <div class="form-group">
                <label for="user_pw">비밀번호 확인 </label>
                <input type="password" id="user_pw2" required>
            </div>
            <div class="form-group">
                <label for="user_name">이름 </label>
                <input type="text" id="user_name" name="user_name" required>
            </div>
            <div class="form-group">
                <label for="user_email">이메일 </label>
                <input type="text" id="user_email" name="user_email" required>
            </div>
            <div class="form-group">
            	<a href="/" type="button" class="btn btn-success">Cancel</a>
            	<button type="submit" class="btn btn-warning">Submit</button>
            </div>
        </form>
    </div>
</body>
<script>

	$(document).ready("onclick", function(){
		
		// 2019.03.07 다른 유효성 검사는 하지 않았지만 로그인 기능부터 구현
		$('#regForm').submit(function(e){
			// 페이지 다시 불러오는 거 방지
			e.preventDefault();
		});
		
	});

</script>
</html>