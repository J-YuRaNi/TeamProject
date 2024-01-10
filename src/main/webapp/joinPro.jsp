<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입처리여부</title>
</head>
<body>
	<c:set var="root" value="${pageContext.request.contextPath }" />
	<c:if test="${check > 0 }">
		<script>
			alert("회원가입이 완료되었습니다.");
			 location.href="/Zspace/login.jsp";
		</script>
	</c:if>
	
	<c:if test="${check == 0 }">
		<script>
			alert("회원가입이 완료되지 않았습니다.");
			 location.href="/Zspace/mem_join.jsp";
		</script>
	</c:if>
</body>
</html>