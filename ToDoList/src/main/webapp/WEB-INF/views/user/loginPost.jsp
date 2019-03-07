<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interceptor 거쳐가는 장소</title>
</head>
<body>

<script>
// 인터셉터 때문인지 form 형식 때문인지 모르겠지만
// Exception이 계속해서 loginPost.jsp 페이지를 찾는다.
 self.location = "/main/todoList";
</script>

</body>
</html>