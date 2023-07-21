<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="scoreRegist">등록화면</a>
	<a href="scoreResult">결과화면</a>
	<a href="scoreList">목록화면</a>
	
	<h3>scoreList - 점수 목록</h3>
	
	<%-- ${list } // vo객체 => name, kor, eng --%>
	
	<c:forEach var="vo" items="${list }" varStatus="num">
	${num.index+1}<br/>
	${vo.name }<br>
	${vo.kor }<br>
	${vo.eng }<br>
	
	<button onclick="location.href='scoreDelete?num=${num.index}'">삭제</button>
	<hr/>
	</c:forEach>
	
	
</body>
</html>