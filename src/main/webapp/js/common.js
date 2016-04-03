/**
 * 将时间戳转换为本地时间格式
 * @param timestamp
 * @returns {string}
 */
function getLocalTime(timestamp){
    return new Date(parseInt(timestamp)).toLocaleDateString();
}
/**
 * 初始化数据字典
 * @param s
 */
function initDictionary(s){
    var id = $(s).attr("id");
    $.ajax({
        url:'${ctx}/dictionary/values',
        data:{'type':id.substring(0,id.length - 4)},
        method:'post',
        async:true,
        dataType:'json',
        success:function(data){
            if(data){
                var options = "";
                for(var i in data)
                    options += "<option value=" + data[i].code + " >" + data[i].name + "</option>";
                if(options != "")
                    $(s).append(options);
            }
        },
        error: function(){
            alert("加载数据字典 " + id + " 错误");
        }
    });
}

/**
 * 自动加载
 */
$(function () {
    $("select[id$=_dic]").each(function(index){
        initDictionary(this);
    });
});
