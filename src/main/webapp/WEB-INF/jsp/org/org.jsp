<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../../js/inc.jsp"/>
<title>index</title>
<script type="text/javascript">

</script>
</head>
<body>
<form action="">
    <table>
        <tr>
            <td>编码:</td>
            <td><input name="code"></td>
            <td>名称:</td>
            <td><input name="name"></td>
            <td>状态:</td>
            <td>
                <select id="status_dic" name="status">
                    <option value=""></option>
                </select>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
