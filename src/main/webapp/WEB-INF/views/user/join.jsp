<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 페이지</title>
</head>
<body>

<h3>#연습문제</h3>
<ul>
	<li>다양한 회원정보를 입력받는다(생일포함)</li>
	<li>POST방식으로 회원정보와 함께 요청하면 
		전달된 회원정보를/data/user에 파일형태로 저장한다</li>
	<li>파일이름은 중복이 생기지 않도록 조심해야한다</li>
	<li>누락된 정보가있는경우 회원가입 실패 페이지로 넘어가야한다</li>
	<li>회원가입에 성공하면 회원가입 성공페이지를 5초간 보여준후 다시 홈으로이동한다</li>
	
</ul>

<hr>
<form action="<c:url value="/hello/join"/>"method=post> 
	아이디 : <input type="text" name="id"><br /> 
	패스워드 : <input type="password" name="password"><br /> 
	이름 : <input type="text" name="name"><br /> 
	나이 : <input type="number" name="age"><br />
	생일 : <input type="date" name="birth"><br /> 
	<input type="submit" value="회원가입">
</form>



</body>
</html>