<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ ������</title>
</head>
<body>

<h3>#��������</h3>
<ul>
	<li>�پ��� ȸ�������� �Է¹޴´�(��������)</li>
	<li>POST������� ȸ�������� �Բ� ��û�ϸ� 
		���޵� ȸ��������/data/user�� �������·� �����Ѵ�</li>
	<li>�����̸��� �ߺ��� ������ �ʵ��� �����ؾ��Ѵ�</li>
	<li>������ �������ִ°�� ȸ������ ���� �������� �Ѿ���Ѵ�</li>
	<li>ȸ�����Կ� �����ϸ� ȸ������ ������������ 5�ʰ� �������� �ٽ� Ȩ�����̵��Ѵ�</li>
	
</ul>

<hr>
<form action="<c:url value="/hello/join"/>"method=post> 
	���̵� : <input type="text" name="id"><br /> 
	�н����� : <input type="password" name="password"><br /> 
	�̸� : <input type="text" name="name"><br /> 
	���� : <input type="number" name="age"><br />
	���� : <input type="date" name="birth"><br /> 
	<input type="submit" value="ȸ������">
</form>



</body>
</html>