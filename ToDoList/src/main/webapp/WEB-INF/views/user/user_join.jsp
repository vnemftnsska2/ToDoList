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
        <form method="post">
            <div class="form-group">
                <label for="user_id">아이디</label>
                <input type="text" id="user_id" name="user_id">
            </div>
            <div class="form-group">
                <label for="user_pw">비밀번호</label>
                <input type="password" id="user_pw" name="user_pw">
                <input type="password" id="user_pw" name="user_pw">
            </div>
            <div class="form-group">
                <label for="user_name">이름</label>
                <input type="text" id="user_name" name="user_name">
            </div>
            <div class="form-group">
                <label for="user_age">나이</label>
                <input type="number" id="user_age" name="user_age">
            </div>
            <div class="form-group">
                <label for="user_gender">성별</label>
                <input type="text" id="user_gender" name="user_gender">
            </div>
            <div class="form-group">
                <label for="user_job">직업</label>
                <input type="text" id="user_job" name="user_job">
            </div>
            <div class="form-group">
                <label for="user_intro">간단한 자기소개</label>
                <input type="text" id="user_intro" name="user_intro">
            </div>
            <div class="form-group">
            <a href="/" type="button" class="btn btn-success">Cancel</a>
            <button type="button" class="btn btn-warning">Submit</button>
            </div>
        </form>
    </div>
</body>
<script>

	$(document).ready("onclick", function(){
		
		
		
	});

</script>
</html>