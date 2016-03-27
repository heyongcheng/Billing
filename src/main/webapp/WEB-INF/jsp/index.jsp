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
            animate:false,
            onClick:function(node){
                if(node.attributes != null && node.attributes.type != 1 && node.attributes.url != null){
                    addPanel(node.text,'${ctx}' + node.attributes.url);
                }
            }
        });
        //显示当前时间
        $("#dateTimeSpan").html(getLocalTime('${dateTime}'));
    });
    /**
    *新增标签页
     */
    function addPanel(title,url){
        if ($('#easyuiTabs').tabs('exists', title)){
            $('#easyuiTabs').tabs('select', title);
        } else {
            $('#easyuiTabs').tabs('add',{
                title:title,
                href:url,
                closable:true
            });
        }
    }
</script>
</head>
<body class="easyui-layout">
    <div data-options="region:'north',split:true,border:false" style="height:10%">
        <div align="center" style="background: #acddd9;width: auto;height: 58px;">
            <div align="center" style="font-size: 9mm;width: 600px;height: 40px" >信息管理平台</div>
            <div align="right" style="width: 100%;height: 10px" id="loginInfo">
                欢迎: <font color="#2315dd">${loginUser.name}</font>&nbsp;&nbsp;当前时间:<span id="dateTimeSpan"></span>
            </div>
        </div>
    </div>
    <div region="west" split="true" title="导航菜单" style="width:15%;height: auto">
        <ul id="tree"></ul>
    </div>
    <div id="content" region="center" style="width: auto;height: auto">
        <div id="easyuiTabs" class="easyui-tabs" style="width:auto;height:auto;">
            <div title="Home">欢迎</div>
        </div>
    </div>
</body>
</html>