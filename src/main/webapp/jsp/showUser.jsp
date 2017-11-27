   <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
  </head>
  <script src="js/jquery-1.11.1.js" type="text/javascript"></script>
  <body>
    <button onclick="go()">sssss</button>
  </body>
  <script type="text/javascript">
  function go(){
	  
  $.ajax({
      type: "POST",     //提交方式
     // contentType: "application/json; charset=utf-8",   //内容类型
   //       //类型
      url: "http://localhost:8080/hnust/creattoken/makeid.do",    //提交的页面，方法名
      data:{"logintype":1},    //参数，如果没有，可以为null
      dataType: "json", 
      success: function (data) { //如果执行成功，那么执行此方法
       //   alert(data);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
         
          alert(data.status);
      },
      error: function (err) { //如果执行不成功，那么执行此方法
          alert("err:" + err);
      }
  });
  }
  </script>
</html>
