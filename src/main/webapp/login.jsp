<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="./js/inc.jsp"/>
<title>登录</title>
<script type="text/javascript">
$(function(){
	$("#login").click(function(){
		var account = $("#account").val();
		var password = $("#password").val();
		if(account == ""){
			alert("UserName Is Empty");
			return;
		}else if(password == ""){
			alert("Password Is Empty");
			return;
		}
		$.ajax({
			url:'${ctx}/user/login',
			type:'post',
			dateType:'json',
			async:false,
			data:{'account':account,'password':password},
			success:function(data){
				if(data.success){
					window.location = '${ctx}/user/index';
				}else{
					alert(data.msg);
				}
			},
			error:function(){
				window.location = '${ctx}/index.jsp';
			}
		});
	});
});
</script>
</head>
<body>
	<div align="center" style="margin-top: 20%">
		<form>
			<table>
				<tr>
					<td>
						UserName:
					</td>
					<td>
						<input type="text" id="account" name="account">
					</td>
				</tr>
				<tr>
					<td>
						Password:
					</td>
					<td>
						<input type="password" id="password" name="password">
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="button" id="login" value="login">
						<input type="reset" id="reset" value="reset">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>