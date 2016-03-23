<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<div align="center">
		<form action="${ctx }/admin/login">
			<table>
				<tr>
					<td>
						用户名:
					</td>
					<td>
						<input type="text" name="loginName">
					</td>
				</tr>
				<tr>
					<td>
						密码:
					</td>
					<td>
						<input type="password" name="password">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="登录">
					</td>
					<td>
						<input type="reset" value="取消">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>