<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript">
	alert("${pageContext.request.contextPath}")
</script>
</head>
<body>
	<div align="center" style="margin-top: 20%">
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
					<td align="center" colspan="2">
						<input type="submit" value="登录">
						<input type="reset" value="取消">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>