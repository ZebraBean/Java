function load() {
    alert("正常js实现的警告");
}

$(function () {
    //jquery的方式：body加载完成后，再执行的代码
    alert("使用jquery的方式实现的警告");
    let data = {
        username:"abc",
        password:"123"
    };
    //ajax方法的参数是一个{},表示一个json对象
    $.ajax({
        type: "POST",//请求方法
        url: "data/login.json",//请求路径
        contentType:"application/json",//默认: "application/x-www-form-urlencoded"
        data: JSON.stringify(data),//请求的数据类型，如果数据类型是json,需要将json对象转换为字符串
        success: function(r){  //响应状态码200的回调方法
            alert(JSON.stringify(r));
            console.log(r.data1.name);
            if(r.success){
                alert("impossible");
            }else {
                alert(r.message);
            }
        },error:function (XMLHttpRequest, textStatus, errorThrown) {
            //4xx,5xx错误回调方法
            // 通常 textStatus 和 errorThrown 之中
            // 只有一个会包含信息
            this; // 调用本次AJAX请求时传递的options参数
        }
    });
});