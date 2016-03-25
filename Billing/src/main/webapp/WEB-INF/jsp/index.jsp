<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../../js/inc.jsp"/>
<title>index</title>
</head>
<body>
	<table>
		<tr>
			<td>账号：</td>
			<td>${loginUser.account }</td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td>${loginUser.name }</td>
		</tr>
		<tr>
			<td>组织id：</td>
			<td>${loginUser.orgId }</td>
		</tr>
		<tr>
			<td>当前组织：</td>
			<td>${loginUser.currentOrg.code } " " ${loginUser.currentOrg.name }</td>
		</tr>
		<tr>
			<td>角色列表：</td>
			<td>
				<c:forEach items="${loginUser.roles }" var="role">
					${role.name }<br>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>权限列表：</td>
			<td>
				<c:forEach items="${loginUser.roles }" var="role">
					<c:forEach items="${role.resources }" var="resource">
						${resource.name } : ${resource.path }<br>
					</c:forEach>
				</c:forEach>
			</td>
		</tr>
	</table>
</body>
</html>