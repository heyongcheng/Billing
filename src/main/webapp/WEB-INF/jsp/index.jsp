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
    $(function () {
        $('#tree').tree({
            url:'${ctx}/resource/load',
            method:'post',
            animate:true
        });
    });
</script>
</head>
<body class="easyui-layout">
    <div region="west" split="true" title="Navigator" style="width:15%;">
        <ul id="tree"></ul>
    </div>
    <div id="content" region="center" title=" "  style="width:85%;">
        <div class="easyui-layout" data-options="fit:true">
            <div data-options="region:'north',split:true,border:false" style="height:15%"></div>
            <div data-options="region:'center',border:false"></div>
        </div>
    </div>
</body>
</html>