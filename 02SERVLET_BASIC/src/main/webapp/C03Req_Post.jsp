<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${requestScope.contextPath }/login.do" method="post">
	<input type="text" name="email" placeholder="이메일을 입력하세요." /><br/>
	<input type="password" name="pwd" placeholder="비밀번호를 입력하세요." /><br/>
	<input type="submit" value="전송" /><br/> 
</form>

</body>
</html>